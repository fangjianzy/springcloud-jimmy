package com.fangj.springcloud.core.commons.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fangj.springcloud.core.exception.BizException;

/**
 *  全局异常
  * <p>Title: GlobalExceptionHandler</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月26日
 */
public class GlobalExceptionHandler {
    private final static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BizException.class)
    public void baseExceptionHandler(BizException ex) {
        log.error("BizException:", ex);
    }

    @ExceptionHandler(Exception.class)
    public void otherExceptionHandler(Exception ex) {
        log.error("Exception:", ex);
    }
}