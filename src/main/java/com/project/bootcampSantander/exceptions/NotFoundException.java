package com.project.bootcampSantander.exceptions;

import com.project.bootcampSantander.utils.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
