package Package7;

import Package11.ArrayList;
import Package11.FileInputStream;
import Package11.InputStreamReader;
import Package11.KeyPair;
import Package11.List;
import Package11.PEMKeyPair;
import Package11.PublicKey;
import Package11.SubjectPublicKeyInfo;

public class Class66 {
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
	   
}     

