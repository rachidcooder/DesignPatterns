package FactoryPattern;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
  String bankCode ;
    
  BankFactory bankf= new BankFactory();
     
     Scanner scn =new Scanner(System.in);
     
      System.out.print("Enter bank code : ");
      bankCode = scn.next();
       
       
      IBank bank=bankf.GetBank(bankCode);
      
      // call withdraw 
        System.out.print(bank.Withdraw());
	scn.close();}

}
