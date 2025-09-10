<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>

 <style>
        body {
            background-color: cyan;;
            color: black;
        }
    </style>
</head>

<body>
    <h2 > Hello, welcome to User ..👋</h2> </br> </br>
        <h3> Name:      ${user.getName()}  </h3>
        <h3> Email Id:  ${user.getEmail()}  </h3>
        <h3> Phone No:  ${user.getPhoneno()}  </h3>

</body>
</html>
