package Package4;

public class Class16 {

	public Class16() {
		super();
	}

	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	}

}