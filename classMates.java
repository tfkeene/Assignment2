package Assignment2;

import java.util.*;

public class classMates {

	public static void main(String[] args) {
		
		
		// List classmates that are in the Java Class
			System.out.println("Listed are your classmates names: ");{
					}
		
		ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Adeonke");  
	     alist.add("Kaitlyn");  
	     alist.add("Brent");  
	     alist.add("Jennifer"); 
	     alist.add("Ariel");
	     alist.add("Jaye");  
	     alist.add("Mamadou");  
	     alist.add("Oluwadare");  
	     alist.add("Paul"); 
	     alist.add("Keyonna");
	  
	     //iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str);  
	      
		  
ArrayList<String> obj = new ArrayList<String>();

obj.add("Adeonke");  
obj.add("Kaitlyn");  
obj.add("Brent");  
obj.add("Jennifer"); 
obj.add("Ariel");
obj.add("Jaye");  
obj.add("Mamadou");  
obj.add("Oluwadare");  
obj.add("Paul"); 
obj.add("Keyonna");


/*Add elements to an ArrayList*/
obj.add("Tanisha");

//Displaying elements
System.out.println("Original ArrayList:");
for(String str:obj)
   System.out.println(str);

System.out.println("Remove instructor's name from the ArrayList");
//Remove a element from the ArrayList
alist.remove("Tanisha"); 

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

    
      // Displaying elements
      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove elements from ArrayList like this
      obj.remove("Tanisha"); 
      
      // Displaying elements
      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

   
      //Sort the list 
      String[] names = new String[10];

      names[0] = "Adeonke";
      names[1] = "Kaitlyn";
      names[2] = "Paul";
      names[3] = "Jennifer";
      names[4] = "Ariel";
      names[5] = "Jaye";
      names[6] = "Mamadou";
      names[7] = "Oluwadare";
      names[8] = "Brent";
      names[9] = "Keyonna";
 	  
       Array.Sort(names);	
      

      
      

      
      
      
      
      
   }




	}

	



