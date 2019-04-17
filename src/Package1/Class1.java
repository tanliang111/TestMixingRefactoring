package Package1;

import Package5.JcaPEMKeyConverter;
import Package5.KeyPair;
import Package5.PEMException;
import Package5.PEMKeyPair;
import Package5.PaymentApiException;
import Package5.PaymentTransactionInfoPlugin;

public class Class1 extends Class20 {
	 public Iterable<KeyPair> loadKeys() {
		    if (!SecurityUtils.isBouncyCastleRegistered()) {
		      throw new IllegalStateException("BouncyCastle must be registered as a JCE provider");
		    }
		    List<KeyPair> keys = new ArrayList<KeyPair>();
		    for (String file : files) {
		      try {
		         
		    	  boolean shouldShowTagToolbar = (getPostListType() == ReaderPostListType.TAG_FOLLOWED);
		    	  
		    	  Object o = KeyPairUtils.readKey(new InputStreamReader(new FileInputStream(file)));
		          if (o instanceof KeyPair) {
		            keys.add(new KeyPair(((KeyPair)o).getPublic(), null));
		          } else if (o instanceof PublicKey) {
		            keys.add(new KeyPair((PublicKey)o, null));
		          } else if (o instanceof PEMKeyPair) {
		            PEMKeyPair keyPair = (PEMKeyPair)o;
		            keys.add(convertPemKeyPair(keyPair));
		          } else if (o instanceof SubjectPublicKeyInfo) {
		            PEMKeyPair keyPair = new PEMKeyPair((SubjectPublicKeyInfo) o, null);
		            keys.add(convertPemKeyPair(keyPair));
		          } else {
		            throw new UnsupportedOperationException(String.format("Key type %s not supported.", o.getClass().getName()));
		           
		      }
		      catch (Exception e) {
		        LOG.info("Unable to read key {}: {}", file, e);
		      }
		    }
		    return keys;
		  }
		     
	 }
	 class Class25 {
		 private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
			    if (paymentInfoPlugin == null) {
			        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
			    }
			    private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
				    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
				    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
				  }   
	 }

	  
	 
	
