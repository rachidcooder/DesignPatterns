package ProxyPattern;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Optional;

public class SMSServiceProxy {

	SMSService _smsService;
    Dictionary<String, Integer> sentCount = new Hashtable<>();
	
	public String SendSMS(String custId, String mobile, String sms) {
		 
		if(_smsService==null) {	_smsService=new ConcreteSMSService(); }
		 
		//first time
		if(sentCount.get(custId)==null) {
			sentCount.put(custId, 1);
			return _smsService.SendSMS(custId, mobile, sms);
		}else {
			Optional<Integer> customer = ((Hashtable<String, Integer>) sentCount).entrySet().stream()
		
		        .filter(entry -> entry.getKey().equals(custId))
		        .map(entry -> entry.getValue())
		        .findFirst();

		if (customer.isPresent() && customer.get() >= 3) {
		    return "Not sent!";
		} else {
		    customer.ifPresent(value -> sentCount.put(custId, value + 1));
		    
			return _smsService.SendSMS(custId, mobile, sms);
		}
	}
		
	}
 
}
