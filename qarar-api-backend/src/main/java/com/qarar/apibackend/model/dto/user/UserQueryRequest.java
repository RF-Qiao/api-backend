package com.qarar.apibackend.model.dto.user;


import com.qarar.apibackend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 性别
     */
    private String gender;
    /**
     * 用户角色: user, admin
     */
    private String userRole;
}