package cfd.zuozhuan.period.controller;

import cfd.zuozhuan.period.base.BaseController;
import cfd.zuozhuan.period.entity.param.LoginParam;
import cfd.zuozhuan.period.entity.vo.LoginVo;
import cfd.zuozhuan.period.result.R;
import cfd.zuozhuan.period.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author
 * @date 2024/11/21 16:53
 * @desciption:
 */
@RestController
@RequestMapping
public class LoginController extends BaseController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public R<LoginVo> login(@RequestBody @Valid LoginParam loginParam) {
        return R.success(userService.auth(loginParam));
    }

}
