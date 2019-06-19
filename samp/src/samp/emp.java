package samp;

import java.util.*;

public class emp{
	 
      ArrayList<employee> obj = new ArrayList<employee>();
      Scanner s=new Scanner(System.in);
     void select()
     {
    
      emp s1=new emp();
     for(int i=0;i<100;i++)
     {
    	 System.out.println("Enter your choice");
			System.out.println("1 create");
		      System.out.println("2 delete");
		      System.out.println("3 viewall");
		      System.out.println("4 update");
		      System.out.println("5 exit");
		      int op=s.nextInt();
		      if(op==5)
		      {
		    	  System.out.println("Successfully exit");
		    	  break;
		      }
      switch(op) 
      {
      case 1:
          s1.create();
      	  break;
      case 2:
    	  s1.delete();
    	  break;
      case 3:
    	  s1.show();
    	  break;
      case 4:
    	  s1.update();
    	  break;
      case 5:
    	  s1.exit();
    	  break;
      }
   }
 }
	
	public void create()
      {
		  employee emp=new employee();
    	  System.out.println("Enter your name");
    	  String name=s.next();
    	  emp.setName(name);
    	  
    	  System.out.println("Enter id");
    	  int id=s.nextInt();
    	  emp.setId(id);
    	  
    	  System.out.println("Enter address");
    	  String address=s.next();
    	  emp.setAddress(address);
    	  
    	  System.out.println("Enter email");
    	  String email=s.next();
    	  emp.setEmail(email);
    	  
    	  obj.add(emp);
    	  System.out.println("Added successfully");
      }
	public void delete()
	{
		

		System.out.println("Enter the name you want to delete");
		String name= s.next();
		
		for(int i=0; i < obj.size(); i++) {
			
			
			if (obj.get(i).getName().contains(name) ){
			
				
				
				obj.remove(i);
				
				System.out.println("Successfully deleted");
			}
		}
	}
	
	public void show()
	{
		System.out.println("All employee list");
		for (employee str : obj) {
			System.out.println(str.toString());
		}
	}
	public void update()
	{
		
		employee ob=new employee();
		System.out.println("Enter name");
		
		
		String name = s.next();
		
		for (int i = 0; i < obj.size(); i++) {
			
			if (obj.get(i).getName().contains(name)) {
				
				ob.setName(name);
			
				
				System.out.println("Enter id");
				ob.setId(s.nextInt());
				
				System.out.println("Enter address");
				ob.setAddress(s.next());
				
				System.out.println("Enter  email");
				ob.setEmail(s.next());
				
                 obj.set(i, ob);
                 System.out.println("Updated successful");
			}
		}
	}
	public void exit()
	{
		System.out.println("successfully exit");
		
	}
 
		public static void main(String margs[])
    	  {
			
    		  emp ob=new emp();
    		  ob.select();
    	  }
      }