<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<style>
body{
    font-family: Arial, sans-serif;
    margin: 30px;
}

.container{
    width: 500px;
    margin: auto;
}

h1{
    text-align: center;
    color: blue;
}

form{
    border: 1px solid gray;
    padding: 15px;
    margin-bottom: 20px;
    border-radius: 10px;
}

input{
    width: 95%;
    padding: 8px;
    margin-top: 5px;
    margin-bottom: 10px;
}

button{
    padding: 8px 15px;
    background-color: green;
    color: white;
    border: none;
    cursor: pointer;
}
</style>

</head>
<body>

<div class="container">

<h1>Employee Management</h1>

<!-- SAVE -->

<form action="save" method="post">

<h3>Save Employee</h3>

ID:
<input type="number" name="id">

Name:
<input type="text" name="name">

Salary:
<input type="number" name="salary">

<button type="submit">Save</button>

</form>

<!-- UPDATE -->

<form action="update" method="post">

<h3>Update Employee</h3>

ID:
<input type="number" name="id">

Name:
<input type="text" name="name">

Salary:
<input type="number" name="salary">

<button type="submit">Update</button>

</form>

<!-- DELETE -->

<form action="delete" method="post">

<h3>Delete Employee</h3>

ID:
<input type="number" name="id">

<button type="submit">Delete</button>

</form>

<!-- VIEW -->

<form action="employees" method="get">

<h3>View Employees</h3>

<button type="submit">Show Employees</button>

</form>

</div>

</body>
</html>