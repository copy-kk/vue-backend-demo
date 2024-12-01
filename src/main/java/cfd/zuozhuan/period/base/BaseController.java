package cfd.zuozhuan.period.base;

import cfd.zuozhuan.period.result.R;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 * @date 2024/11/21 18:26
 * @desciption:
 */
public class BaseController {

    @Resource
    HttpServletResponse response;

    @Resource
    HttpServletRequest request;


}
