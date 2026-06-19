<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>

<style>
body{
    margin:0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #667eea, #764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:40px;
    border-radius:20px;
    box-shadow:0 10px 25px rgba(0,0,0,0.3);
    text-align:center;
    width:500px;
}

h1{
    color:#4a148c;
    font-size:40px;
}

h2{
    color:#1976d2;
}

p{
    color:#555;
    font-size:18px;
}

.btn{
    background:#ff5722;
    color:white;
    padding:12px 25px;
    border:none;
    border-radius:25px;
    font-size:18px;
    cursor:pointer;
    text-decoration:none;
}

.btn:hover{
    background:#e64a19;
}
</style>

</head>
<body>

<div class="container">
    <h1>Welcome</h1>

    <h2>Lavanya Ravi Kumar Seelam</h2>

    <p>
        Spring MVC Application Successfully Running 🚀
    </p>

    <a href="https://www.google.com" class="btn">
        Visit Google
    </a>
</div>

</body>
</html>