package Package5;



public class Class20 {
	private void sanityOnPaymentInfoPlugin(final PaymentTransactionInfoPlugin paymentInfoPlugin) throws PaymentApiException {
	    if (paymentInfoPlugin == null) {
	        throw new PaymentApiException(ErrorCode.PAYMENT_PLUGIN_EXCEPTION, "Payment plugin returned a null result");
	    }
	    private KeyPair convertPemKeyPair(PEMKeyPair pemKeyPair) throws PEMException {
		    JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
		    return new KeyPair(converter.getPublicKey(pemKeyPair.getPublicKeyInfo()), null);
		  }

}
