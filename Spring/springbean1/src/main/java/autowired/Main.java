package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbean1.Sim;

public class Main {

	public static void main(String[] args) {
		// Using ApplicationContext tom implement Spring IoC
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowired/beans.xml");
         
        // Get the bean
       EmployeeService es = applicationContext.getBean("employeeServiceConstructor",EmployeeService.class);
        System.out.println("Constructor " + es.getEmployee().getName());
	}
}