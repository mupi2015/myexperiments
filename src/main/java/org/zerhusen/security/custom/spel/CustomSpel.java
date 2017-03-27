package org.zerhusen.security.custom.spel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by root on 23/3/17.
 */
public interface CustomSpel {

    boolean hasAccess(String key,HttpServletRequest request);
}
