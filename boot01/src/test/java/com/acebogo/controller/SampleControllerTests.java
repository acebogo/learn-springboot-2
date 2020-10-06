package com.acebogo.controller;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTests {

    /**
     * Controller 테스트할때 @SpringBootTest는 사용하지 않는다.
     * @Test어노테이션이 선언된 메소드를 실행하거나 클래스 JUnit으로 실행하면
     * 자동으로 스프링 부트가 시작되고 해당 테스트가 진행되는 것을 볼 수 있다.
     */

    @Autowired
    MockMvc mock;

    @Test
    public void testHello1() throws Exception {

        /**
         * MockMvc객체의 경우 perform()을 이용해 객체를 브라우저에서 서버의 URL을 호출하듯이
         * 테스트를 진행할 수 있다.
         * 결과는 andExpect()를 이용해 확인이 가능하다.
         * 결과 확인외에도 Response에 대한 정보를 체크하는 용도로 사용할 수 있다.
         */
        mock.perform(get("/hello"))
                .andExpect(content().string("Hello World"));
    }

    @Test
    public void testHello2() throws Exception {

        /**
         * [예시]
         * 정상적인 응답상태 = isOk()
         * 응답으로 전송되는 결과를 보고 싶다면 andReturn으로 값을 넘겨받을 수 있다.
         */
        MvcResult result = mock.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World")).andReturn();

        System.out.println(result.getResponse().getContentAsString());
    }

}
