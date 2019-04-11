package Package4;

import Package3.Class14;

public class Class10 extends Class14{
	
	public abc() {}
	
	 private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	        if (paymentInfoPlugin == null) {
	            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	        }
	 }
}
