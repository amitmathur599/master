package AdapterDesignPattern;
//"converts the interface of a class into another interface that a client wants".
//Structural Design Pattern
//https://www.javatpoint.com/adapter-pattern
//This is the client class.  
public class AdapterPatternDemo {  
 public static void main(String args[]){  
  CreditCard targetInterface=new BankCustomer();  
  targetInterface.giveBankDetails();  
  System.out.print(targetInterface.getCreditCard());  
 }   
}
