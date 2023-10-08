package BuilderPattern;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Phon p=new PhonBuilder().setOs("Android").setRam(32).getPhon();
   
  System.out.print(p);
 
	}
 }
