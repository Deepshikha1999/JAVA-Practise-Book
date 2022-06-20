

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.ex2.Stock;

public class TestStock {

	@Test
	public void testStock()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex2ctx.xml");
		
		Stock stk=(Stock)ctx.getBean("stk");
		
		Stock stk2=(Stock)ctx.getBean("stk");
		
		System.out.println(stk==stk2);
		
	}
}
