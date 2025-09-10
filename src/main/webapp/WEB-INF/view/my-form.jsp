<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>

 <style>
        body {
            background-color: lightblue;
            color: black;
        }
    </style>
</head>

<body>

    <h2>  My Form </h2>
    <form action="submitForm"  method="post">
        Name: <input type="text"  name="name"/> </br> </br>
        Email Id: <input type="text"  name="email"/> </br> </br>
        Phone No: <input type="text"  name="phoneno"/> </br> </br>
         <input type="submit"  value="Submit Form"/>



    </form>
</body>
</html>
