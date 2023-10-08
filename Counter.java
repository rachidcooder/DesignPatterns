
public class Counter {
 int counter=0 ;
 
 private static Counter instance;
 private static Object lockObj=new Object();
 private Counter() {
	 
 }
 public static Counter getInstance() {
	  
	 //synchronized for multi threading 
	 if(instance==null) {
	 synchronized (lockObj){
		 if(instance==null) {
			 instance=new Counter();
		 }
	 }}
	 
	
	 return instance ;
 }
 
	public void counte() {
		counter++;
		System.out.println("the counter is "+counter);
	}
	
}
