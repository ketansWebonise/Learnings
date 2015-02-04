package com.weboniselab;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

public class InsertTest {
	
	public static void main(String[] args) {  
	      
	    Resource newResource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(newResource);  
	      
	    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
	      
	    Employee e=new Employee();  
	    e.setId(220);  
	    e.setFirstName("Divya");  
	    e.setLastName("Sharma");  
	      
	    dao.saveEmployee(e);
	    
	}  

}
