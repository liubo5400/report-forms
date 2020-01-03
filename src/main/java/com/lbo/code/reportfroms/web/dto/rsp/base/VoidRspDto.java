package com.lbo.code.reportfroms.web.dto.rsp.base;

import lombok.Data;

@Data
public class VoidRspDto {

    private String result;

    public VoidRspDto() {
        this.result = "success";
    }
}
