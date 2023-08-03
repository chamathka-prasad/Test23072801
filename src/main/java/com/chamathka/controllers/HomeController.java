package com.chamathka.controllers;


import com.chamathka.annotations.IsUser;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@IsUser
@Path("/")

public class HomeController  {

    @GET
    @Produces(MediaType.TEXT_HTML)

    public String get(){


        return "Home";
    }
}
