package iocbasic2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathResource crp=new ClassPathResource("ioc2.xml");
//		BeanFactory bean=new XmlBeanFactory(crp);
//		Car c=(Car)bean.getBean("mycar");
//		c.carbrand();
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc2.xml");
		Car c=(Car)ac.getBean("mycar");
		c.carbrand();

	}

}
