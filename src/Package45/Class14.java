package Package45;

import Package3.PaymentApiException;
import Package3.PaymentTransactionInfoPlugin;

public class Class14 extends Class16 {
public abi() { }
private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
    if (paymentInfoPlugin == null) {
        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
    }
}
}
