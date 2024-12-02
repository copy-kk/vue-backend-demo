package cfd.zuozhuan.period.controller;

import cfd.zuozhuan.period.result.R;
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
    public R<String> init(@RequestParam("param") String param) {
        return R.success(param);
    }

    @PostMapping("/init")
    public R<String> init(@RequestBody Init init) {
        return R.success(init.getInit());
    }

    @Data
    static class Init {
        private String init;
    }
}
