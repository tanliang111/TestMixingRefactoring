package Package1;

public class Class1 {

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