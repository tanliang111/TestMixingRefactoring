package Package7;

public class Class68 extends Class66 {
	public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
        if (paymentInfoPlugin == null) {
            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
        }
}
	
}
