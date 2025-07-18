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
                    * {
                        box-sizing: border-box;
                    }
                    body {
                        margin: 0;
                        padding: 0;
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        background-color: #f5f7fa;
                        color: #333;
                        height: 100vh;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                    }
                    .card {
                        background: #ffffff;
                        border-radius: 12px;
                        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.08);
                        padding: 40px;
                        max-width: 600px;
                        width: 90%;
                        text-align: center;
                        transition: transform 0.3s ease, box-shadow 0.3s ease;
                    }
                    .card:hover {
                        transform: translateY(-4px);
                        box-shadow: 0 12px 25px rgba(0, 0, 0, 0.12);
                    }
                    h1 {
                        font-size: 28px;
                        margin-bottom: 20px;
                        color: #222;
                    }
                    p {
                        font-size: 16px;
                        margin-bottom: 10px;
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
                        border: 1px solid #007BFF;
                        color: #007BFF;
                        border-radius: 6px;
                        text-decoration: none;
                        font-size: 14px;
                        transition: all 0.2s ease;
                        background-color: #f0f8ff;
                        cursor: pointer;
                    }
                    .endpoint:hover {
                        background-color: #007BFF;
                        color: #fff;
                    }
                    footer {
                        margin-top: 25px;
                        font-size: 13px;
                        color: #666;
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <h1>User Management API</h1>
                    <p>Welcome to the backend service of the User Management System.</p>
                    <p>This Spring Boot project is <strong>deployed live</strong>.</p>
                    <p>Use the following API endpoints:</p>
                    <div class="endpoints">
                        <div class="endpoint">POST /api/auth/register</div>
                        <div class="endpoint">POST /api/auth/login</div>
                        <div class="endpoint">GET /api/user/all</div>
                    </div>
                    <footer>Made with Spring Boot & MySQL • Hosted on Render</footer>
                </div>
            </body>
            </html>
            """;
}
