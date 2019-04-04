package Package3;

public class Class9 {
	import org.apache.sshd.common.keyprovider.AbstractKeyPairProvider;
	import org.apache.sshd.common.util.SecurityUtils;
	import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
	import org.bouncycastle.openssl.PEMException;
	import org.bouncycastle.openssl.PEMKeyPair;
	import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
	import org.crsh.ssh.util.KeyPairUtils;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import java.io.FileInputStream;
	import java.io.InputStreamReader;
	import java.security.KeyPair;
	import java.security.PublicKey;
	import java.util.ArrayList;
	import java.util.List;

	class Class9 extends AbstractKeyPairProvider {
	  /** . */
	  private static final Logger LOG = LoggerFactory.getLogger(FilePublicKeyProvider.class);
	  /** . */
	  private String[] files;
	  FilePublicKeyProvider(String[] files) {
	    this.files = files;
	  }
	  public Iterable<KeyPair> loadKeys() {
	    if (!SecurityUtils.isBouncyCastleRegistered()) {
	      throw new IllegalStateException("BouncyCastle must be registered as a JCE provider");
	    }
	    List<KeyPair> keys = new ArrayList<KeyPair>();
	    for (String file : files) {
	      try {
	          Object o = KeyPairUtils.readKey(new InputStreamReader(new FileInputStream(file)));
	          if (o instanceof KeyPair) {
	            keys.add(new KeyPair(((KeyPair)o).getPublic(), null));
	          } else if (o instanceof PublicKey) {
	            keys.add(new KeyPair((PublicKey)o, null));
	          } else if (o instanceof PEMKeyPair) {
	        	  keys.add(convertPemKeyPair(keyPair));
	          } else if (o instanceof SubjectPublicKeyInfo) {
	            PEMKeyPair keyPair = new PEMKeyPair((SubjectPublicKeyInfo) o, null);
	            JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	            keys.add(new KeyPair(converter.getPublicKey(keyPair.getPublicKeyInfo()), null));
	            
	          	          
	          }
	      }
	      catch (Exception e) {
	        LOG.info("Unable to read key {}: {}", file, e);
	      }
	    }
	    return keys;
	  }
	  
	}
