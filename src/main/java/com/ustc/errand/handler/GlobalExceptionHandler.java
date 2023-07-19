package com.ustc.errand.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

/**
 * 全局异常处理
 * todo:完善
 */
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        // 在这里处理异常逻辑，例如记录日志、发送通知等
        return new ResponseEntity<>("发生异常：" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException e) {
        // 处理空指针异常的逻辑
        return new ResponseEntity<>("空指针异常：" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIOException(IOException e) {
        // 处理IO异常的逻辑
        return new ResponseEntity<>("IO异常：" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // 可以根据需要添加更多的异常处理方法

    // 其他公共方法...
}

