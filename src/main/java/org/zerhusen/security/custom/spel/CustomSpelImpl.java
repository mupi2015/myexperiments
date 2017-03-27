package org.zerhusen.security.custom.spel;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by root on 23/3/17.
 */

@Component("fun")
public class CustomSpelImpl implements CustomSpel {

    public CustomSpelImpl(){
        System.out.println("NEW INSTANCE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }


    @Override
    public boolean hasAccess(String key,HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ###### "+request.getHeader("Authorization"));
        //System.out.println("CALLING THIS METHOD***************************************************    "+authentication.getName()+" :: "+this.hashCode()+" :: "+authentication.hashCode());
        return true;
    }
}
