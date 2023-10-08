package ProxyPattern;


public class ConcreteSMSService extends SMSService {

	@Override
	public String SendSMS(String custId, String mobile, String sms) {
		
		 //code for send sms 
		return "CustomerId "+custId+" sms send to "+mobile;
	}
 
	 
}
