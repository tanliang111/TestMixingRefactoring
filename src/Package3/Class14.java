package Package3;

public abstract class Class14 {
public abi() { }
private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
    if (paymentInfoPlugin == null) {
        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
    }
}
}
