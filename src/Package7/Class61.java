package Package7;

import Package6.PaymentApiException;
import Package6.PaymentTransactionInfoPlugin;

public class Class61 {

	public Class61() {
		super();
	}

	public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	        if (paymentInfoPlugin == null) {
	            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	        }
	}

}

class Class64{
	 
	private static final String NEW_PASSWORD_PARAMETER = "new-password";
	 
	 public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	        if (paymentInfoPlugin == null) {
	            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	        }
	}
	 
}