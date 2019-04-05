package Package3;

import Package2.JcaPEMKeyConverter;
import Package2.KeyPair;
import Package2.PEMException;
import Package2.PEMKeyPair;

public class Class7 {
	public abc() {
	    }
	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }


}
