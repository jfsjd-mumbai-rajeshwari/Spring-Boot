package com.ecom.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Products E_Product = context.getBean("Electronic", Products.class);
        E_Product.productDetails();
		E_Product.productType();

		Products E1_Product = context.getBean("Electronic1", Products.class);
        E1_Product.productDetails();
		E1_Product.productType();

		Products E2_Product = context.getBean("Electronic2", Products.class);
        E2_Product.productDetails();
		E2_Product.productType();

		Products C_Product = context.getBean("Clothing", Products.class);
        C_Product.productDetails();
		C_Product.productType();

		Products C1_Product = context.getBean("Clothing1", Products.class);
        C1_Product.productDetails();
		C1_Product.productType();

		Products C2_Product = context.getBean("Clothing2", Products.class);
        C2_Product.productDetails();
		C2_Product.productType();


		context.close();
	}

}
