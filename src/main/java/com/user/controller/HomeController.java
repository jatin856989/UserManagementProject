package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
               <html>
                   <head><title>User Management API</title></head>
                   <body style="font-family:sans-serif;text-align:center;margin-top:40px">
                       <h1>👋 Welcome to User Management API</h1>
                       <p>This backend project is live on Render!</p>
                       <p>Use Postman to test APIs like:</p>
                       <code>/api/auth/register</code> |
                       <code>/api/auth/login</code> |
                       <code>/api/user/all</code>
                   </body>
               </html>
               """;
    }
}

