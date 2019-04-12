package Package2;

import Package4.Class14;

public class Class10 {
	
	public abc() {}
	
	
}
public class Class15 extends Class14{
	
	public abk() {}
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	}
	
}