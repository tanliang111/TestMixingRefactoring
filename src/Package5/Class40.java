package Package5;

import Package6.PaymentApiException;
import Package6.PaymentTransactionInfoPlugin;

public class Class40 {
	public void abb() {

}
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	}

}
