
package ICHDApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBeanWiring {
   public static void main(String args[]){
       ApplicationContext context= new ClassPathXmlApplicationContext("ICHDApp/SpringConfig.xml");
       Customer customer=(Customer)context.getBean("CustomerBean");
       System.out.println("The values are:");
       System.out.println(customer.getFirstName());
       System.out.println(customer.getLastName());
       System.out.println(customer.getMotherName());
       
   
   }
    
}
