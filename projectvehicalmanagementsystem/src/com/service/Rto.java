package com.service;

import java.util.Scanner;

import com.model.Vehical;

public class Rto {
	 Scanner s= new Scanner (System.in);
		 public Vehical regvehical() {
		  System.out.println(" entre reg id: ");
		  int rg= s.nextInt();
		  System.out.println(" Enter owner name: ");
		  String owNm=s.next()+s.nextLine();
		  System.out.println("Enter model name:  ");
		  String mdNm=s.next()+s.nextLine();
		  System.out.println("Enter price: ");
		  int pr=s.nextInt();
		  System.out.println(" Enter colour: ");
		  String clr=s.next()+s.nextLine();
		  System.out.println(" Enter your adhar no: ");
		  long adNo= s.nextLong();
		  System.out.println(" Enter your mpb no: ");
		  long mob=s.nextLong();
		  System.out.println(" Enter city: ");
		  String  ct= s.next()+s.nextLine();
		  Vehical v1= new Vehical (rg ,owNm ,mdNm ,pr ,clr,adNo, mob, ct, owNm, mdNm);
		  return v1;
	 }
		   public void  ViewDetails( Vehical v) {
			    System.out.println(" ------------------------your details---------------------");
			    System.out.println( "Registeration id: " +v.regid);
		        System.out.println(" owner name : "+v.ownername);
		        System.out.println(" model name: "+v.modelname);
		        System.out.println("price:"+v.price);
		        System.out.println(" colour: "+v.colour);
		        System.out.println(" Adhar no: "+v.adharNo);
		        System.out.println(" mobile no: "+v.mobNo);
		        System.out.println("city: "+v.city);
	}
		   
		     public  Vehical updateDetails (Vehical v) {
		    	 System.out.println(" **************updated details***************");
			    	System.out.println(" enter  updated owner name :");
			    	v.ownername=s.next()+s.nextLine();
			    	System.out.println(" enter updated  model name: ");
			    	v.modelname=s.next()+s.nextLine();
			    	System.out.println(" enter updated  price : ");
			    	v.price=s.nextInt();
			    	System.out.println(" enter updated  colour: ");
			    	v.colour=s.next()+s.nextLine();
			    	System.out.println(" enter updated  adhar no : ");
			    	v.adharNo =s.nextLong();
			    	System.out.println(" enter updated mobile no : ");
			    	v.mobNo= s.nextLong();
			    	System.out.println(" enter updated city :  ");
			    	v.city=s.next()+s.nextLine();
			    	System.out.println(" details updated successfully..................");
			    	 return v;}
		     }
		    	 


