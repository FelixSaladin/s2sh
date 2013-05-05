<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><font color="red">Save User</font></h1>
	<s:form action="saveUser">
		<s:textfield name="user.firstname" label="first name"></s:textfield>
		<s:textfield name="user.lastname" label="last name"></s:textfield>
		<s:textfield name="user.age" label="age"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>