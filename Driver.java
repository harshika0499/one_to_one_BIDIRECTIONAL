package mappingonetoone_CONTROLLER;

import java.util.Scanner;

import mappingonetone_DAO.DAO;
import mappingonetoone_DTO.Pancard;
import mappingonetoone_DTO.Person;

public class Driver 
{
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		    DAO d = new  DAO();
		    for(;;) 
		    {
		    	 System.out.println("1. get value 2.insert value  3.delete value 4.update value 5.exit");
		  	   switch(sc.nextInt())
		  	      {
		  	         case 1:
		  	          {
		  	           d.getvalue();
		  	          }
		  	           break;
		  	        
		  	          case 2:
		  	          {
		  	           d.insertvalue();
		  	          }
		  	           break;
		  	           case 3:
		  	          {
		  	           d.deletevalue();
		  	          }
		  	           break;
		  	         case 4 :
		  	          {
		  	           d.updatevalue();
		  	          }
		  	        break;
		  	         case 5:
		 	          {
		 	           System.exit(0);
		 	          }
		 	           break;
		  	       }
		    }
	}

}
