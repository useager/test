package work.jtao.spring_ci_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangtao
 * @date 2021/12/26 18:17
 */
@RestController
@RequestMapping("/ci")
public class CiTest {
    @GetMapping("/testA")
    public String testA(){
        return("testA已生成");
    }
}
