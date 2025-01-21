package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // meta annotation (어노테이션 안에 어노테이션이 있는 것)

public class ExApplication { // Bootstrapping Class
	
	@Bean
	public Map<?,?> myMap(){
		return Map.of("greetings", "Hello World");
	}
	
	public static void main(String[] args) {
	/*
		ConfigurableApplicationContext ac = null;
		try {
			ac = SpringApplication.run(ExApplication.class, args); // run 안에서 ExApplication.class를 configuration(설정 파일)으로 사용
			System.out.println("ExApplication runs... " + ac.getBean("myMap", Map.class).get("greetings"));
		} catch(Exception ignored) {
		} finally {
			ac.close();
		}
	*/
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){
			System.out.println("ExApplication runs... " + ac.getBean("myMap", Map.class).get("greetings"));
		}
	}

}
