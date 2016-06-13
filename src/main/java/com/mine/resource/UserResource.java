package com.mine.resource;


import com.mine.domain.AppUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@RestController
//@Component
//@Path("/")
public class UserResource {
    @Context
    private HttpServletRequest httpRequest;

    @Value("${custom.welcome}")
    private String welString;

    @RequestMapping(value="/users",  method= RequestMethod.GET)
//    @GET
//    @Path("users")
//    @Produces(MediaType.APPLICATION_JSON)
    public List<AppUser> appUsers() {
        AppUser appUser = new AppUser(1, "张三");
        AppUser appUser2 = new AppUser(2, "李四");
        List<AppUser> list =new ArrayList<>();
        list.add(appUser);
        list.add(appUser2);
        return list;
    }


    public String welcome(){
        return welString;
    }
}
