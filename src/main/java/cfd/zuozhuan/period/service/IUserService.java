package cfd.zuozhuan.period.service;

import cfd.zuozhuan.period.entity.User;
import cfd.zuozhuan.period.entity.param.LoginParam;
import cfd.zuozhuan.period.entity.vo.LoginVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author develop
 * @since 2024-11-21 04:49:31
 */
public interface IUserService extends IService<User> {

    LoginVo auth(LoginParam loginParam);
}
