package himedia.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		// 이 과정을 통해 서비스가 등록된거고
		
		// 이제 받아올거야 
		// Spring Context로부터 ProductService Bean 획득
		ProductService ps = ac.getBean(ProductService.class);
		
		/* ProductVo vo = ps.findProduct("Camera"); */
		ProductVo vo = ps.findProduct("bomb");
		System.out.println(vo);
	}

}
