package com.ecom.ecom;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component("Electronic")
public class ElectronicsItem implements Products {
    
    //@Autowired
    private String pName;
    private String pType;
    
    
    public ElectronicsItem(String pName, String pType){
       this.pName = pName;
       this.pType = pType;
    }

    //@Override
    public void productDetails(){
          System.out.println("Name of Electronic product is " + this.pName);
    }
    
    //@Override
    public void productType(){
          System.out.println("Type of Electronic product is " + this.pType);
          System.out.println("******************************************");
    }

}
