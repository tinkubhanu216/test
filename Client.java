package singleton_beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("helloBean.xml");
		
		Hello obj1=(Hello)context.getBean("hello");
		obj1.setMsg("This is a singleton bean");
		System.out.println("obj1: ");
		obj1.getMsg();
		
		Hello obj2=(Hello)context.getBean("hello");
		System.out.println("obj2 : ");
		obj1.setMsg("This is a singleton bean..........");
		obj2.getMsg();
		obj1.getMsg();
		
	}
}
