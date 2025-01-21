## 02. @SpringBootApplication & @SpringBootTest [springboot-myapplication]

#### @SpringBootTest
1. Spring Boot Test Integration
2. Spring Test Integration의 @ExtendWith + @ContextConfiguration(classes={...}) 대체



#### @SpringBootApplication
1. Meta Annotation
2. @SpringBootConfiguration + @ComponentScan + @EnableAutoConfiguration

#### @SpringBootConfiguration VS @Configuration - ex01
1. 자동 스캔이 가능한 설정 클래스를 지정한다.
2. 컨테이너에게 제공된 설정 클래스의 패키지 포함, 하부 패키지의 모든 @SpringBootConfiguration를 달고 있는 설정 클래스들은 자동스캔 된다.
3. @Configuration는 설정 클래스에 사용할 수 있으나 자동스캔은 되지 않는다. 따라서 Spring에서 해왔던 것 처럼 명시적 @Import 대상이 되는 설정 클래스에만 사용된다.

#### @ComponentScan - ex02
1. 적용된 설정 클래스의 패키지를 포함, 하부 패키지의 @Component, @Service 그리고 @Controller가 달려 있는 클래스들을 스캔하여 빈 생성 및 등록 작업을 한다. 

#### @EnableAutoConfiguration
1. MVC, Aspect, Security, JPA 등을 자동으로 설정한다 (Auto Configuration)
2. 발견된 Starter Dependency(Library) 기반의 자동설정 (관례를 따르는 Default 설정)
3. 자동으로 관례를 따르는 Default 설정이 되기 떄문에 application.properties(application.yml)를 사용한 미세설정이 필요하다.
4. 자동설정과 미세설정으로 하지 못하는 설정은 명시적인(Explicit) 자바 클래스 설정을 사용한다.
5. 예제: springboot-webmvc
