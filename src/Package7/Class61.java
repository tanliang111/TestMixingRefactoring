package Package7;

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

