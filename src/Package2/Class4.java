package Package2;

import Package11.AbstractKeyPairProvider;
import Package11.ArrayList;
import Package11.FileInputStream;
import Package11.FilePublicKeyProvider;
import Package11.InputStreamReader;
import Package11.JcaPEMKeyConverter;
import Package11.KeyPair;
import Package11.List;
import Package11.Logger;
import Package11.PEMKeyPair;
import Package11.PublicKey;
import Package11.SubjectPublicKeyInfo;

public class Class4 {

}
class MoveClass extends AbstractKeyPairProvider {
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
	            keys.add(convertPemKeyPair(keyPair));
	          } else if (o instanceof SubjectPublicKeyInfo) {
	            PEMKeyPair keyPair = new PEMKeyPair((SubjectPublicKeyInfo) o, null);
	            keys.add(convertPemKeyPair(keyPair));
	          } else {
	            throw new UnsupportedOperationException(String.format("Key type %s not supported.", o.getClass().getName()));
	          }
	      }
	      catch (Exception e) {
	        LOG.info("Unable to read key {}: {}", file, e);
	      }
	    }
	    return keys;
	  }
	  private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
		    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
		    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
		  }
}