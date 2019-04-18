package Package6;

import Package1.JcaPEMKeyConverter;
import Package1.KeyPair;
import Package1.PEMException;
import Package1.PEMKeyPair;
import Package5.PaymentApiException;
import Package5.PaymentTransactionInfoPlugin;

public class Class30 {
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
	 
}
class Class31 {
	public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
        if (paymentInfoPlugin == null) {
            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
        }
}
	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }	
}