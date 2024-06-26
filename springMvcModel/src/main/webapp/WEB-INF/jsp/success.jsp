<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  Id <%=request.getAttribute("id") %>
  <br>
  Name <%=request.getAttribute("name") %>
  <br>
  ListData <%=request.getAttribute("listData") %>
  <br>
 <h5>el </h5>
   
  Id ${id} 
  <br>
  Name ${name}
  <br>
  ListData ${listData}
    
    <h5>student class data</h5>
    
    Id ${stData.getId()}
    Name ${stData.getName()}
</body>
</html>                    