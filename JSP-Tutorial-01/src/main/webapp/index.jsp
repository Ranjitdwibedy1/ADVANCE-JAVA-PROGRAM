<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:blue">
<h1>Hello World</h1>

<h1>Declaration tag: </h1>
<%! int a=10;
    String name="Ranjit";
%>

<h1>Expression tag: <%= a %>
                    <%= name %>
</h1>

<h1>Scriptlet tag: </h1>
<% int sum = 20+30;
   int sub = sum+10;
   out.println("Sum:"+sum);
   out.println("Sub:"+sub);

%>
<h1 style="color:red">Sum=<%= sum %></h1>
<h1>Sum=<%= sub %></h1>


</body>
</html>