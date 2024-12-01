package cfd.zuozhuan.period;

import cfd.zuozhuan.period.properties.AuthProperties;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import cn.hutool.jwt.signers.JWTSigner;
import cn.hutool.jwt.signers.JWTSignerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Map;

/**
 * @author
 * @date 2024/11/28 11:27
 * @desciption:
 */
@Component
@Slf4j
public class JwtUtil {

    @Autowired
    private AuthProperties authProperties;

    public String getToken(Map<String, Object> map) {
        String token = JWTUtil.createToken(map, authProperties.getSecret().getBytes());
        return token;
    }

    public Boolean verify(String token) {
        return JWTUtil.verify(token, authProperties.getSecret().getBytes());
    }

    public JWT getTokenInfo(String token){
        JWT jwt = JWTUtil.parseToken(token);
        return jwt;
    }
}
