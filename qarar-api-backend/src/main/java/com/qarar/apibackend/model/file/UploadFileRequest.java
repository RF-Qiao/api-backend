package com.qarar.apibackend.model.file;

import lombok.Data;

import java.io.Serializable;


@Data
public class UploadFileRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 业务
     */
    private String biz;
}