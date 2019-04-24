package Package6;

public class Class38 {
	public void cde() {

	}

public void bcd() {

    }

private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
    if (paymentInfoPlugin == null) {
        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
    }
}
}
