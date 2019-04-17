package Package5;

import Package4.JcaPEMKeyConverter;
import Package4.KeyPair;
import Package4.PEMException;
import Package4.PEMKeyPair;

public class Class20 {
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	    


}
