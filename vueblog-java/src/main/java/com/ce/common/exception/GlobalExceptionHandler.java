package com.ce.common.exception;

import com.ce.common.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author c__e
 * @date 2020/12/6 11:01
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.ce")
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = ShiroException.class)
    public Result handler(ShiroException exception) {
        log.error("运行时异常：-------------{exception}", exception);
        return Result.fail(401, exception.getMessage(), null);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handler(MethodArgumentNotValidException exception) {
        log.error("实体校验异常：-------------{exception}", exception);
        String defaultMessage = exception.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage();
        return Result.fail(defaultMessage);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Result handler(IllegalArgumentException exception) {
        log.error("Assert异常：-------------{exception}", exception);
        return Result.fail(exception.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result handler(RuntimeException exception) {
        log.error("运行时异常：-------------{exception}", exception);
        return Result.fail(exception.getMessage());
    }
}
