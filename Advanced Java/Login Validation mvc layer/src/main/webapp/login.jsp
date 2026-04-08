<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Successful</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body { font-family: sans-serif; min-height: 100vh; background: #f5f5f3; display: flex; align-items: center; justify-content: center; }
        .card { background: white; border-radius: 12px; border: 0.5px solid #ddd; padding: 2.5rem 2rem; max-width: 420px; width: 100%; text-align: center; }
        .icon { width: 64px; height: 64px; border-radius: 50%; background: #eaf3de; display: flex; align-items: center; justify-content: center; margin: 0 auto 1.5rem; }
        h1 { font-size: 22px; font-weight: 500; margin-bottom: 0.5rem; color: #1a1a1a; }
        p { font-size: 15px; color: #666; margin-bottom: 2rem; line-height: 1.6; }
        .info-box { background: #f5f5f3; border-radius: 8px; padding: 1rem 1.25rem; margin-bottom: 2rem; text-align: left; }
        .info-row { display: flex; justify-content: space-between; padding: 6px 0; font-size: 14px; }
        .info-row span:first-child { color: #888; }
        .divider { border-top: 0.5px solid #ddd; }
        .badge { background: #eaf3de; color: #3b6d11; font-size: 12px; padding: 2px 10px; border-radius: 8px; }
        .btn { display: block; width: 100%; padding: 10px; background: white; border: 0.5px solid #aaa; border-radius: 8px; font-size: 15px; font-weight: 500; color: #1a1a1a; text-decoration: none; }
        .logout { display: block; margin-top: 12px; font-size: 13px; color: #888; text-decoration: none; }
    </style>
</head>
<body>
<div class="card">
    <div class="icon">
        <svg width="32" height="32" viewBox="0 0 24 24" fill="none">
            <path d="M5 13l4 4L19 7" stroke="#3b6d11" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"/>
        </svg>
    </div>

    <h1>Login successful</h1>
    <p>Welcome back! You have signed in successfully.</p>

    <div class="info-box">
        <div class="info-row">
            <span>Username</span>
            <!-- Session se username dikhao -->
            <span><%= session.getAttribute("username") != null ? session.getAttribute("username") : "User" %></span>
        </div>
        <div class="divider"></div>
        <div class="info-row">
            <span>Status</span>
            <span class="badge">Active</span>
        </div>
    </div>

    
    <a href="Signin.jsp" class="logout">Sign out</a>
</div>
</body>
</html>