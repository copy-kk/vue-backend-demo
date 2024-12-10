package cfd.zuozhuan.period.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author
 * @date 2024/11/25 17:11
 * @desciption:
 */
@Data
@Builder
public class LoginVo {

    private String name;

    private String token;
}
