package Package3;

import Package2.JcaPEMKeyConverter;
import Package2.KeyPair;
import Package2.PEMException;
import Package2.PEMKeyPair;
import Package45.PaymentApiException;
import Package45.PaymentTransactionInfoPlugin;

public class Class7 {
	public abc() {
	    }
	private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
	  }
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	}

}
