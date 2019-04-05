package Package3;

import Package22.JcaPEMKeyConverter;
import Package22.KeyPair;
import Package22.PEMException;
import Package22.PEMKeyPair;

public class Class7 {
	public abc() {
	    }
	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }


}
