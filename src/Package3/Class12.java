package Package3;

import Package4.PaymentApiException;
import Package4.PaymentTransactionInfoPlugin;

public class Class12 {
public abb() {
		
	}
private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
    if (paymentInfoPlugin == null) {
        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
    }
}
}
public class Inline {
public abt() {
	if (paymentInfoPlugin == null) {
        throw new IllegalStateException("Payment plugin returned a null result");
    }
	}

}