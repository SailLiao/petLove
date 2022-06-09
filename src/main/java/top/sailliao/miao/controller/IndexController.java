package top.sailliao.miao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 1065500519@qq.com
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String index() {
        return "index";
    }

}
