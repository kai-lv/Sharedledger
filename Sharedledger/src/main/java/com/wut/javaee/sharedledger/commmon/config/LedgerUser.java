package com.wut.javaee.sharedledger.commmon.config;


import com.wut.javaee.sharedledger.model.LUser;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Configuration
public class LedgerUser implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //声明一个request
        HttpServletRequest request = null;
        //初始用户名为匿名
        String username = "anonymous";
        //拿到Session
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(requestAttributes != null)
            request = requestAttributes.getRequest();
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("lUser");
        if(obj instanceof LUser){
            LUser lUser = (LUser) obj;
            username = lUser.getName();
        }

        return Optional.of(username);
    }
}
