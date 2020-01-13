package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;

public class AppSpring 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Customer customer = context.getBean(Customer.class);
    	customer.setCustomerId(1990);
    	customer.setCustomerName("mohan");
    	customer.setCustomerAddress("bangalore");
    	customer.setBillAmount(9800);
    	
    	ContactDetails contactDetails = context.getBean(ContactDetails.class);
    	contactDetails.setMobileNumber("917171");
    	contactDetails.setEmailId("mohan@gmail.com");
    	
    	//customer.setContactDetails(contactDetails);
    	
        System.out.println(customer);
       
    }
}
