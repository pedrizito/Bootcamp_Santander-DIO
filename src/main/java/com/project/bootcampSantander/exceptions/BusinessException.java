package com.project.bootcampSantander.exceptions;

import com.project.bootcampSantander.utils.MessageUtils;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
