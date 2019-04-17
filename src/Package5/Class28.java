package Package5;

public class Class28 {

	public Class28() {
		super();
	}

	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }

}