package com.chamathka.controllers;


import com.chamathka.annotations.IsUser;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@IsUser
@Path("/ac")
public class TestConfig {

    @GET
    public String get(){

        return "bla";
    }
}


