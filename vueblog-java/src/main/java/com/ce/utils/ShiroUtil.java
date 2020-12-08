package com.ce.utils;

import com.ce.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author c__e
 * @date 2020/12/6 16:39
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
