package cfd.zuozhuan.period.entity.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author
 * @date 2024/11/25 17:11
 * @desciption:
 */
@Data
public class LoginParam {

    @NotBlank(message = "账号为空")
    @ApiModelProperty("账号")
    private String account;

    @NotBlank(message = "密码为空")
    @ApiModelProperty("密码")
    private String password;

}
