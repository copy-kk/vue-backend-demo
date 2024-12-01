package cfd.zuozhuan.period.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author
 * @date 2024/11/21 18:34
 * @desciption:
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum {
    NO_AUTHENTICATOIN(400, "用户未登录"),
    ;

    private Integer code;

    private String msg;


}
