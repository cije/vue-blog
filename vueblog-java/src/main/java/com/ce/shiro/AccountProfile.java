package com.ce.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author c__e
 * @date 2020/12/6 10:56
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}