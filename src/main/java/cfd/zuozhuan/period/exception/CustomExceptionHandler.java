package cfd.zuozhuan.period.exception;

import cfd.zuozhuan.period.result.R;
import cfd.zuozhuan.period.result.ResponseEnum;
import org.checkerframework.checker.units.qual.C;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author
 * @date 2024/11/21 18:38
 * @desciption:
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public R handleCustomException(CustomException e) {
        e.printStackTrace();
        return R.failure(e.getResponseEnum());
    }

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        e.printStackTrace();
        return R.failure();
    }

    @ExceptionHandler(value = {
            BadCredentialsException.class,
            UsernameNotFoundException.class,
            LockedException.class
    })
    public R handleNormalException(Exception e) {
        e.printStackTrace();
        return R.failure(e.getMessage());
    }
}
