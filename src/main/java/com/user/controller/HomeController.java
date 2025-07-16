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
                            margin: 0;
                            padding: 0;
                            height: 100vh;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            background: linear-gradient(135deg, #1f1c2c, #928dab);
                            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        }
                        .container {
                            background: rgba(255, 255, 255, 0.1);
                            padding: 40px;
                            border-radius: 20px;
                            backdrop-filter: blur(10px);
                            box-shadow: 0 0 25px rgba(255, 255, 255, 0.2);
                            color: #fff;
                            text-align: center;
                            max-width: 700px;
                            transition: transform 0.3s ease-in-out;
                        }
                        .container:hover {
                            transform: scale(1.02);
                            box-shadow: 0 0 30px rgba(0, 255, 255, 0.3);
                        }
                        h1 {
                            font-size: 36px;
                            background: linear-gradient(90deg, #00c6ff, #0072ff);
                            -webkit-background-clip: text;
                            -webkit-text-fill-color: transparent;
                            animation: glow 2s ease-in-out infinite alternate;
                        }
                        @keyframes glow {
                            from { text-shadow: 0 0 10px #00c6ff; }
                            to { text-shadow: 0 0 20px #0072ff; }
                        }
                        p {
                            font-size: 16px;
                            margin: 10px 0;
                        }
                        .endpoint {
                            display: inline-block;
                            margin: 10px;
                            padding: 10px 20px;
                            border: 2px solid #00ffe7;
                            border-radius: 8px;
                            color: #00ffe7;
                            background-color: transparent;
                            font-size: 14px;
                            text-decoration: none;
                            transition: all 0.3s ease;
                            cursor: pointer;
                        }
                        .endpoint:hover {
                            background-color: #00ffe7;
                            color: #111;
                            box-shadow: 0 0 15px #00ffe7;
                            transform: translateY(-2px);
                        }
                        footer {
                            margin-top: 30px;
                            font-size: 14px;
                            color: #ccc;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <h1>🚀 User Management API</h1>
                        <p>Welcome to the backend service of the User Management System!</p>
                        <p>This Spring Boot project is <strong>live on Render</strong>.</p>
                        <p>Use the following API endpoints via Postman:</p>
                        <div>
                            <div class="endpoint">POST /api/auth/register</div>
                            <div class="endpoint">POST /api/auth/login</div>
                            <div class="endpoint">GET /api/user/all</div>
                        </div>
                        <footer>Built with 💻 using Spring Boot & MySQL</footer>
                    </div>
                </body>
                </html>
                """;
    }
}
