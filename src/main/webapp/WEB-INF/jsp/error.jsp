<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR"/>
<title>Insert title here</title>
</head>
<body>
error.jsp


	<c:out value="<xmp>" escapeXml="true"></c:out>
	<c:out value="<xmp>" escapeXml="false"></c:out>
	<h2>Hello! ${name}</h2>
	<div>JSP version</div>
</body>
</html>