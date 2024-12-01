package cfd.zuozhuan.period.controller;

import lombok.Data;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @date 2024/11/29 13:45
 * @desciption:
 */
@RequestMapping("/common")
@RestController
public class CommonController {

    @GetMapping("/init")
    public String init(@RequestParam("param") String param) {
        return param;
    }

    @PostMapping("/init")
    public String init(@RequestBody Init init) {
        return init.getInit();
    }

    @Data
    static class Init {
        private String init;
    }
}
