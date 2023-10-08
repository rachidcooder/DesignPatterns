package FactoryPattern;

public class BankFactory implements IBankFactory {

	@Override
	public IBank GetBank(String bankCode) {
		// TODO Auto-generated method stub
		 switch(bankCode) {
	      case "1111" :
	    	  return new BankA() ;
		 case "2222" :
	    	  
	    	  return new BankB( );
	      }
		return null;
	}

	

}
