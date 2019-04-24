package Package5;

import Package6.PaymentApiException;

public class Class40 {
	public void abb() {

	}
	public void bcd() {
		if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	    }
}
