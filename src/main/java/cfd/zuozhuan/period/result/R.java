package cfd.zuozhuan.period.result;

import lombok.Builder;
import lombok.Data;

/**
 * @author
 * @date 2024/11/21 18:27
 * @desciption:
 */
@Builder
@Data
public class R<T>{

    private Integer code;

    private String msg;

    private T data;

    public static R success() {
        return R.success(null);
    }

    public static <T> R success(T data) {
        return R.build(200, "success", data);
    }


    public static <T> R failure() {
        return R.build(-1, "请求异常", null);
    }

    public static <T> R failure(String msg) {
        return R.build(-1, msg, null);
    }

    public static R failure(ResponseEnum responseEnum) {
        return R.build(responseEnum.getCode(), responseEnum.getMsg(), null);
    }

    public static <T> R build(Integer code, String msg, T data) {
        return R.builder()
                .code(code)
                .msg(msg)
                .data(data)
                .build();
    }
}
