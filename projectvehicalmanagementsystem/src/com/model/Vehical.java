package com.model;

public class Vehical {
	
   public int regid;
   public String ownername;
    public String modelname;
     public int price;
     public String colour;
     public long adharNo;
     public long mobNo;
     public String city;
      public Vehical (int regid,String ownerName,String modelName,int price,String colour,long adharNo, long mobNo,String city, String ownername, String modelname) 
      {
    	  
    	    this.regid= regid;
    	    this.ownername= ownername;
    	    this .modelname= modelname;
    	    this.price= price;
    	    this.colour= colour;
    	    this.adharNo= adharNo;
    	    this.mobNo= mobNo;
    	    this.city= city;
    	    
	}
}
