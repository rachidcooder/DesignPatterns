package BuilderPattern;

public class PhonBuilder {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	//	
	public PhonBuilder setOs(String os) {
		this.os = os;
		 return this ;
	}
	public PhonBuilder setRam(int ram) {
		this.ram = ram;
		 return this ;
	}
	public PhonBuilder setProcessor(String processor) {
		this.processor = processor;
		 return this ;
	}
	public PhonBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		 return this ;
	}
	public PhonBuilder setBattery(int battery) {
		this.battery = battery;
		 return this ;
	}
	
	public Phon getPhon() {
		return new Phon(os, ram, processor, screenSize, battery);
	}
	
}
