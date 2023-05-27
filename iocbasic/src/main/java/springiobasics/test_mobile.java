package springiobasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test_mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathResource r=new ClassPathResource("ioc1.xml");
//		BeanFactory bean=new XmlBeanFactory(r);
//		Mobile m=(Mobile)bean.getBean("mymobile");
//		m.musicplayer();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile m=(Mobile)context.getBean("mymobile");
		m.musicplayer();

	}

}
