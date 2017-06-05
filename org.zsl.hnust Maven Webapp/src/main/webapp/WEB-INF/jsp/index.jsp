<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
  </head>
  
  <body>
  	<a href="toadd">add</a><br />
    <c:forEach var="user" items="${list }">
    	姓名：${user.userName };  <a href="toupdate?id=${user.id }">update</a><br />
    	密码：${user.password };<br />
    	年龄：${user.age };<br />
    	描述：${user.description };<br /><br /><br />
    </c:forEach>
  </body>
</html>
