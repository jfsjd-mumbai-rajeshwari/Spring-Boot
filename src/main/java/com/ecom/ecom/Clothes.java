package com.ecom.ecom;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;




//@Component("Clothing")
public class Clothes implements Products {
    
    private String pName;
    private String pType;

    //@Autowired
    public void setpName(String pName){
        this.pName = pName;
    }
    
    //@Autowired
    public void setpType(String pType){
        this.pType = pType;
    }

    //@Override
    public void productDetails(){
          System.out.println("Name of cloth product is " + this.pName);
    }

    //@Override
    public void productType(){
          System.out.println("Type of cloth is " + this.pType);
          System.out.println("******************************************");
    }
}
