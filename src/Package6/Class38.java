package Package6;

import Package2.Class42;

public class Class38 {
	
	private String name;
	private Integer age;
	
	public Student (String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public static void main(String[] args) {
		Bro bro = new Bro(11);
		System.out.println(bro.getAge());
	}

}

class Class41 extends Class42 {
	 public void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	        if (paymentInfoPlugin == null) {
	            throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	        }
	}
}
