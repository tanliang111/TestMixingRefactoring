package Package4;

public class Class10 {
	
	public abc() {}
	
	public abi() {}
	
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
        if (paymentInfoPlugin == null) {
            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
        }
	}

}
