package cfd.zuozhuan.period.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author
 * @date 2024/11/21 17:12
 * @desciption:
 */
@Data
@Component
@ConfigurationProperties(prefix = "auth")
public class AuthProperties {

    /**
     * 签名秘钥
     */
    private String secret;

    /**
     * 过期时间 day
     */
    private Integer timeout;

}
