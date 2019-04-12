package Package3;

import Package4.Class14;
import Package4.PaymentApiException;
import Package4.PaymentTransactionInfoPlugin;

public class Class11 extends Class10 {

public cde() {
		
	}
private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
    if (paymentInfoPlugin == null) {
        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
    }
}
}
