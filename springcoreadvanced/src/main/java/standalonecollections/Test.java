package standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections/config.xml");
		ProductList pl = (ProductList) context.getBean("product");
		System.out.println(pl);

	}
}