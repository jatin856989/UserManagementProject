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
                        :root {
                            --bg-color: #f5f7fa;
                            --text-color: #333;
                            --card-bg: #ffffff;
                            --card-shadow: rgba(0, 0, 0, 0.08);
                            --highlight: #007BFF;
                        }
                        body.dark-mode {
                            --bg-color: #1e1e1e;
                            --text-color: #f5f5f5;
                            --card-bg: #2c2c2c;
                            --card-shadow: rgba(255, 255, 255, 0.1);
                        }
                        * {
                            box-sizing: border-box;
                        }
                        body {
                            margin: 0;
                            padding: 0;
                            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                            background-color: var(--bg-color);
                            color: var(--text-color);
                            height: 100vh;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            transition: background 0.3s, color 0.3s;
                        }
                        .theme-toggle {
                            position: absolute;
                            top: 20px;
                            right: 20px;
                            font-size: 18px;
                            cursor: pointer;
                            background-color: var(--card-bg);
                            padding: 8px 12px;
                            border-radius: 8px;
                            box-shadow: 0 2px 6px var(--card-shadow);
                            user-select: none;
                            transition: all 0.3s;
                        }
                        .card {
                            background: var(--card-bg);
                            border-radius: 12px;
                            box-shadow: 0 8px 20px var(--card-shadow);
                            padding: 40px;
                            max-width: 600px;
                            width: 90%;
                            text-align: center;
                            transition: transform 0.3s ease, box-shadow 0.3s ease;
                            position: relative;
                        }
                        .card:hover {
                            transform: translateY(-4px);
                            box-shadow: 0 12px 25px var(--card-shadow);
                        }
                        h1 {
                            font-size: 28px;
                            margin-bottom: 20px;
                            color: var(--text-color);
                            display: inline-block;
                        }
                        h1 span {
                            display: inline-block;
                            transition: transform 0.5s ease, color 0.5s ease;
                        }
                        h1:hover span {
                            animation: rotateLetter 1s ease-in-out;
                            color: var(--highlight);
                        }
                        @keyframes rotateLetter {
                            0% { transform: rotateY(0); }
                            50% { transform: rotateY(180deg); }
                            100% { transform: rotateY(0); }
                        }
                        p {
                            font-size: 16px;
                            margin-bottom: 10px;
                        }
                        .scrolling-text {
                            display: inline-block;
                            white-space: nowrap;
                            overflow: hidden;
                            position: relative;
                            width: 100%;
                        }
                        .scrolling-text strong {
                            display: inline-block;
                            animation: marquee 8s linear infinite;
                        }
                        @keyframes marquee {
                            0% { transform: translateX(100%); }
                            100% { transform: translateX(-100%); }
                        }
                        .endpoints {
                            margin: 20px 0;
                            display: flex;
                            flex-wrap: wrap;
                            justify-content: center;
                            gap: 10px;
                        }
                        .endpoint {
                            padding: 10px 18px;
                            border: 1px solid var(--highlight);
                            color: var(--highlight);
                            border-radius: 6px;
                            text-decoration: none;
                            font-size: 14px;
                            background-color: #f0f8ff;
                            cursor: pointer;
                            animation: pulse 2s infinite;
                            transition: all 0.2s ease;
                        }
                        body.dark-mode .endpoint {
                            background-color: #3a3a3a;
                            color: #80bfff;
                            border-color: #80bfff;
                        }
                        .endpoint:hover {
                            background-color: var(--highlight);
                            color: #fff;
                            transform: scale(1.05);
                        }
                        @keyframes pulse {
                            0% { box-shadow: 0 0 0 0 var(--highlight); }
                            70% { box-shadow: 0 0 0 10px rgba(0,123,255, 0); }
                            100% { box-shadow: 0 0 0 0 rgba(0,123,255, 0); }
                        }
                        .modal {
                            display: none;
                            position: fixed;
                            top: 0;
                            left: 0;
                            width: 100%;
                            height: 100%;
                            background: rgba(0, 0, 0, 0.5);
                            justify-content: center;
                            align-items: center;
                            z-index: 999;
                        }
                        .modal-content {
                            background: var(--card-bg);
                            color: var(--text-color);
                            padding: 20px;
                            border-radius: 10px;
                            max-width: 400px;
                            text-align: center;
                            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
                        }
                        .modal-content i {
                            font-size: 36px;
                            color: var(--highlight);
                            margin-bottom: 10px;
                        }
                        .modal-content button {
                            margin-top: 15px;
                            padding: 8px 16px;
                            background-color: var(--highlight);
                            border: none;
                            border-radius: 6px;
                            color: white;
                            cursor: pointer;
                        }
                        .modal-content button:hover {
                            background-color: #0056b3;
                        }
                        footer {
                            margin-top: 25px;
                            font-size: 13px;
                            color: var(--text-color);
                            opacity: 0;
                            animation: fadeIn 2s ease-in-out 1.5s forwards;
                        }
                        @keyframes fadeIn {
                            to { opacity: 1; }
                        }
                    </style>
                    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
                </head>
                <body>
                    <div class="theme-toggle" onclick="toggleTheme()">☾ Toggle Dark Mode</div>
                    <div class="card">
                        <h1>
                            <span>U</span><span>s</span><span>e</span><span>r</span>
                            <span> </span>
                            <span>M</span><span>a</span><span>n</span><span>a</span><span>g</span><span>e</span><span>m</span><span>e</span><span>n</span><span>t</span>
                            <span> </span>
                            <span>A</span><span>P</span><span>I</span>
                        </h1>
                        <p>Welcome to the backend service of the User Management System.</p>
                        <p class="scrolling-text"><strong>This Spring Boot project is deployed live.</strong></p>
                        <p>Use the following API endpoints:</p>
                        <div class="endpoints">
                            <div class="endpoint" onclick="showModal('POST /api/auth/register')">POST /api/auth/register</div>
                            <div class="endpoint" onclick="showModal('POST /api/auth/login')">POST /api/auth/login</div>
                            <div class="endpoint" onclick="showModal('GET /api/user/all')">GET /api/user/all</div>
                        </div>
                        <footer>Made with Spring Boot & MySQL • Hosted on Render</footer>
                    </div>

                    <div class="modal" id="endpointModal">
                        <div class="modal-content">
                            <i class="fas fa-info-circle"></i>
                            <p id="modalText">To access this endpoint, use Postman or any API testing tool.</p>
                            <button onclick="closeModal()">OK</button>
                        </div>
                    </div>

                    <audio id="pingSound" src="https://cdn.pixabay.com/download/audio/2022/03/15/audio_ae2ab38026.mp3?filename=click-notification-1762.mp3"></audio>

                    <script>
                        function showModal(endpoint) {
                            const sound = document.getElementById("pingSound");
                            sound.play();
                            document.getElementById("modalText").textContent =
                                "To access '" + endpoint + "', use Postman or any API testing tool.";
                            const modal = document.getElementById("endpointModal");
                            modal.style.display = "flex";
                            // Auto close after 4 seconds
                            setTimeout(() => {
                                modal.style.display = "none";
                            }, 4000);
                        }

                        function closeModal() {
                            document.getElementById("endpointModal").style.display = "none";
                        }

                        function toggleTheme() {
                            document.body.classList.toggle("dark-mode");
                            localStorage.setItem("theme", document.body.classList.contains("dark-mode") ? "dark" : "light");
                        }

                        // Load saved theme
                        window.onload = function () {
                            const savedTheme = localStorage.getItem("theme");
                            if (savedTheme === "dark") {
                                document.body.classList.add("dark-mode");
                            }
                        };
                    </script>
                </body>
                </html>
                """;
    }
}
