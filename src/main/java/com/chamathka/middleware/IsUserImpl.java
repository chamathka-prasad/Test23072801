package com.chamathka.middleware;

import com.chamathka.annotations.IsUser;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.jersey.server.mvc.Viewable;

import java.io.IOException;




@Provider
@IsUser

public class IsUserImpl  implements ContainerRequestFilter {

    @Context
    HttpServletRequest request;
//dependency injection jearcy thamai mekata object assign karanne
    @Context
    HttpServletResponse response;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {


        HttpSession session= request.getSession();
        if(session.getAttribute("user")==null &&session.getAttribute("status")!="active"){
            System.out.println("non authonticate");

            containerRequestContext.abortWith(Response.status(Response.Status.FORBIDDEN).entity(new Viewable("/401")).build());
        }



    }
}
