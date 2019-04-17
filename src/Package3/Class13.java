package Package3;

import Package5.JcaPEMKeyConverter;
import Package5.KeyPair;
import Package5.PEMException;
import Package5.PEMKeyPair;

public class Class13 {
	public abo() {
		if (paymentInfoPlugin == null) {
            throw new IllegalStateException("Payment plugin returned a null result");
        }
	}
	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }  
	}