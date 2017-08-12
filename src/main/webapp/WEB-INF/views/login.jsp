<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="static/css/login.css"/>
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center">这是tomcat1的页面</h1>

    <form action="login" method="get">
        <div class="login_putin">
            <ul>
                <li>用户名：<input type="text"  name="username"/></li>
                <li>密&nbsp&nbsp&nbsp码：<input type="password" name="password"/></li>
            </ul>
        </div>
        <div class="login_btn">
            <input type="submit" value="登陆">
        </div>
    </form>
</body>
</html>