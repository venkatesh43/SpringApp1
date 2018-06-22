package stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotations/config.xml");
		Instructor instr = (Instructor) context.getBean("obj");
		System.out.println(instr);

		/*
		 * Instructor instr1 = (Instructor) context.getBean("obj");
		 * System.out.println(instr1);
		 */

	}
}
