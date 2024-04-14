package com.kttkpm.movieservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseEntity {
    Object data;
    MessEntity mess;

    public ResponseEntity() {
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MessEntity getMess() {
        return this.mess;
    }

    public void setMess(MessEntity mess) {
        this.mess = mess;
    }
}
