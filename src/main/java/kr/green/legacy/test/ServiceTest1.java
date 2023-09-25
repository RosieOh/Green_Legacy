package kr.green.legacy.test;

import kr.green.legacy.domain.TestVO;
import kr.green.legacy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ServiceTest1 {

    @Autowired
    private static TestService testService;

    public static void main(String[] args) throws Exception{
        testList();
    }

    public static void testList() throws Exception {
        List<TestVO> testList = testService.testList();
        for(TestVO test : testList){
            System.out.println(test.toString());
        }
    }
}
