package cfd.zuozhuan.period.service.impl;

import cfd.zuozhuan.period.entity.LoginUserDetails;
import cfd.zuozhuan.period.entity.User;
import cfd.zuozhuan.period.entity.param.LoginParam;
import cfd.zuozhuan.period.entity.vo.LoginVo;
import cfd.zuozhuan.period.exception.CustomException;
import cfd.zuozhuan.period.mapper.UserMapper;
import cfd.zuozhuan.period.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author develop
 * @since 2024-11-21 04:49:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private AuthenticationManager authenticationManager;


    @Override
    public LoginVo auth(LoginParam loginParam) {
        String account = loginParam.getAccount();
        String password = loginParam.getPassword();
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(account, password);
        Authentication authenticate = authenticationManager.authenticate(authentication);
        LoginUserDetails userDetails = (LoginUserDetails) authenticate.getPrincipal();

        return new LoginVo();
    }
}
