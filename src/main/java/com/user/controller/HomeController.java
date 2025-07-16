package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>User Management API</title>
                    <style>
                        body {
                            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                            background-color: #f4f4f4;
                            margin: 0;
                            padding: 0;
                            display: flex;
                            flex-direction: column;
                            align-items: center;
                            justify-content: center;
                            height: 100vh;
                            color: #333;
                        }
                        .container {
                            background: #ffffff;
                            padding: 40px;
                            border-radius: 12px;
                            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
                            text-align: center;
                            max-width: 600px;
                        }
                        h1 {
                            color: #4CAF50;
                            margin-bottom: 20px;
                        }
                        p {
                            font-size: 16px;
                            margin: 8px 0;
                        }
                        code {
                            background-color: #e8e8e8;
                            padding: 4px 8px;
                            border-radius: 4px;
                            font-size: 14px;
                            display: inline-block;
                            margin: 4px;
                        }
                        footer {
                            margin-top: 30px;
                            font-size: 13px;
                            color: #777;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <h1>🚀 User Management API</h1>
                        <p>Welcome to the backend service of the User Management System!</p>
                        <p>This Spring Boot project is <strong>live on Render</strong>.</p>
                        <p>You can use <strong>Postman</strong> to interact with the following endpoints:</p>
                        <code>POST /api/auth/register</code><br/>
                        <code>POST /api/auth/login</code><br/>
                        <code>GET /api/user/all</code>
                        <footer>Built with 💻 using Spring Boot & MySQL</footer>
                    </div>
                </body>
                </html>
                """;
    }
}
