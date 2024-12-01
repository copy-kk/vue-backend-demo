package cfd.zuozhuan.period.service.impl;

import cfd.zuozhuan.period.entity.LoginUserDetails;
import cfd.zuozhuan.period.entity.User;
import cfd.zuozhuan.period.mapper.UserMapper;
import cfd.zuozhuan.period.service.IUserService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author
 * @date 2024/11/25 17:09
 * @desciption:
 */
@Component
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery()
                .eq(User::getUsername, username));
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return new LoginUserDetails(user);
    }

}
