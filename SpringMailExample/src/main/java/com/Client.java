package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;

public class Client 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Mail mail = context.getBean(Mail.class);
    	To to = context.getBean(To.class);
    	From from = context.getBean(From.class);
    	Subject subject = context.getBean(Subject.class);
    	Body body = context.getBean(Body.class);
    	
    	to.setToName("puja");
    	to.setToEmail("puja@gmail.com");
    	
    	from.setFromName("sam");
    	from.setFromEmail("sam@gmail.com");
    	
    	subject.setCaption("say hi");
    	
    	body.setMessage("hi");
    	
        System.out.println(mail);
       
    }
}
