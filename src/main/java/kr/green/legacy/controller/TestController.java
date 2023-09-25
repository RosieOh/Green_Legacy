package kr.green.legacy.controller;

import kr.green.legacy.domain.TestVO;
import kr.green.legacy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test/")
public class TestController {
    @Autowired
    private TestService testService2;

    @GetMapping("testList")
    public String getTestList(Model model) throws Exception {
        List<TestVO> testList = testService2.testList();
        model.addAttribute("testList", testList);
        return "/test/testList";
    }

}
