package cfd.zuozhuan.period.exception;

import cfd.zuozhuan.period.result.ResponseEnum;
import lombok.Data;

/**
 * @author
 * @date 2024/11/21 18:37
 * @desciption:
 */
@Data
public class CustomException extends RuntimeException{

    private ResponseEnum responseEnum;

    public CustomException(ResponseEnum responseEnum) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
    }

    public CustomException(String msg) {
        super(msg);
    }
}
