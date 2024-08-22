package com.client;

import java.util.Scanner;

import com.model.Vehical;
import com.service.Rto;

public class Test {

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
	    Rto pune= new Rto();
       Vehical v=null;
       
  while (true) {
	    System.out.println(" ******************* welcome to AutoRegistry******************");
	    System.out.println("1. Register your Vehicle \n2.View details\n3.Update details\n4.Exit");
	    System.out.println(" What is your choice ? ");
	    int ch=s.nextInt();
	       
	    switch(ch) {
	    case 1:
	    	v=pune.regvehical();
	    	System.out.println("Registeration successfully.................");
	    	break;
	    case 2:
	    	pune.ViewDetails(v);
	    	break;
	    case 3 :
            v=pune.updateDetails(v);
	    	break;
	    case 4:
	    	//exit
	    	System.out.println("Logged out........!!!!!");
	    	System.exit(0);
	    	break;
	    	
	    	
	    	default:
	    		  System.out.println("wrong choice code ");
	    		  break;
	    
	          }
           }
	    }
}    
 
	


