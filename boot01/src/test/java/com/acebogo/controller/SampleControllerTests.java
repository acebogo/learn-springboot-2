package com.acebogo.controller;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTests {

    /**
     * 컨트롤러 테스트 하기 위해서는 다음과 같은 상황을 주의해서 작성해야한다.
     *
     * 1. 테스트 클래스에 @WebMvcTest 어노테이션을 추가해서 특정 컨트롤러를 지정
     * @WebMVcTest어노테이션을 사용하면 @Controller, @Component, @ControllerAdvice등이
     * 작성된 코드를 인식할 수 있다.
     *
     * 2. 컨트롤러를 테스트하려면 org.springframework.test.web.servlet.MockMvc타입의
     * 객체를 사용해야만 한다.
     * @WebMvcTest와 같이 사용하면 별도의 생성 없이 주입(@Autowired)만으로
     * 코드를 작성할 수 있기 때문에 편리하다.
     */
}
