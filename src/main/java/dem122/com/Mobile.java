package dem122.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//System.out.println("config loaded");
	 Airtel air = (Airtel) context.getBean("airtel");
	 air.calling();
	 air.data();
	}
}
