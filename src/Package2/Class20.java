package Package2;



public class Class20 extends Class28 {
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }    
	
}
