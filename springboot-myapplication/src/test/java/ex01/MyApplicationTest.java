package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testMyComponent01NotNull() {
		MyComponent myComponent = applicationContext.getBean("MyComponent01", MyComponent.class);
		assertNotNull(myComponent);
	}
	
	@Test
	public void testMyComponent02Null() {
//		MyComponent myComponent = applicationContext.getBean("MyComponent02", MyComponent.class);
//		assertNull(myComponent);
		// @SpringBootTest 에서는 @Configuration을 달고 있는 설정 클래스는 찾지 못한다.
		assertThrows(NoSuchBeanDefinitionException.class, ()->{
			applicationContext.getBean("MyComponent02", MyComponent.class);
		});
	}
}
