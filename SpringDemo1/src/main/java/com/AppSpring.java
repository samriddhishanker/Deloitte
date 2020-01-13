package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpring 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);	
        Customer customer= (Customer) factory.getBean("cust2");
        //Customer customer2= (Customer) factory.getBean("cust2");
        //customer.setCustomerName("sam");
        
        System.out.println(customer);
        //System.out.println(customer2);
    }
}
