package Package1;

public class Class18 {

	public Class18() {
		super();
	}

	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
		        if (paymentInfoPlugin == null) {
		            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
		        }
	}

}