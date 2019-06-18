package samp;
import java.util.*;
class AgeException extends Exception{  
	 AgeException(String s){  
	  super(s);  
	 }  
	}
class Test{  
	  
	   static void validate(int age)throws AgeException{  
	     if(age<18)  
	      throw new AgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
		   Scanner s=new Scanner(System.in);
		   System.out.println("Enter your age");
		   int a=s.nextInt();
		   s.close();
	      try{  
	      validate(a);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}