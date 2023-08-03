package com.chamathka.controllers;


import com.chamathka.annotations.IsUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.jersey.server.mvc.Viewable;

import java.util.HashMap;
import java.util.Map;


@Path("/login")
public class LogInController {


    @Context
    HttpServletRequest request;

    @GET
    @Produces(MediaType.TEXT_HTML)

    public Viewable index(){

        return new Viewable("/logIn_index");

    }

    @POST
    public Response loginaction(@FormParam("email") String email, @FormParam("password") String password,@Context HttpServletRequest request){



        if(email.equals("user@gmail.com") && password.equals("123")){


//return  "redirect:/";

            return Response.status(Response.Status.FOUND).location(UriBuilder.fromUri("").build()).build();

        }else{


            request.getSession().setAttribute("user","1");
//            return "redirect:/login";


//            return Response.temporaryRedirect(UriBuilder.fromUri("login").build()).build();
//mekedi method 1k modify karan naha eka nisa to many redirect wenawa.tempory nisa parana request 1k mai ganne

            return Response.status(Response.Status.FOUND).location(UriBuilder.fromUri("ac").build()).build();
//mekedi get method 1k ta redirect wenawa 302 aluth request 1k

        }


    }
}
