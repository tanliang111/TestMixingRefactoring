package Package1;

public class Class2 {

	 public abc() {
		    
		    }
	 private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
		    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
		    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
		  }
	 
}
