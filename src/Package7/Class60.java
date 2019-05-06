package Package7;

import Package6.PaymentApiException;
import Package6.PaymentTransactionInfoPlugin;

public class Class60 {
	private static final String NEW_PASSWORD_PARAMETER = "new-password";
	
	private static final Field NEW_PASSWORD = new Field(NEW_PASSWORD_PARAMETER, "New password", Field.Type.PASSWORD);
	
	private static final Field CONFIRM_NEW_PASSWORD = new Field(CONFIRM_NEW_PASSWORD_PARAMETER, "Confirm new password", Field.Type.PASSWORD);
	
	public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
        if (paymentInfoPlugin == null) {
            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
        }
}
}
