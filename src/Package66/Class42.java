package Package66;

public class Class42 {

	private static final String NEW_PASSWORD_PARAMETER = "new-password";
	
	public Class42() {
		super();
	}

	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }

}