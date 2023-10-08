package ProxyPattern;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SMSServiceProxy proxy=new SMSServiceProxy();
		
		System.out.println(proxy.SendSMS("123","01266746","message 1"));
		System.out.println(proxy.SendSMS("123","01266746","message 1"));
		System.out.println(proxy.SendSMS("123","01266746","message 1"));
		System.out.println(proxy.SendSMS("123","01266746","message 1"));
		System.out.println(proxy.SendSMS("123","01266746","message 1"));
		
	}

}
