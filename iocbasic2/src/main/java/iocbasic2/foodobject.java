package iocbasic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class foodobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc2.xml");
		Food f=(Food)context.getBean("dish");
		f.name();

	}

}
