package Package100;

public class Class3 extends Class2 {

	public abc() {
	    
	    }
	 private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
		    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
		    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
		  }
	
}

public class Class17 extends Class18 {
	
	public anm() {}
