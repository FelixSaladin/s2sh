<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1><font color="red">Update User</font></h1>
	<s:form action="updateUserSubmit">
		<s:hidden name="user.id" value="%{user.id}" />
		<s:textfield name="user.firstname" label="first name" value="%{user.firstname}"></s:textfield>
		<s:textfield name="user.lastname" label="last name" value="%{user.lastname}"></s:textfield>
		<s:textfield name="user.age" label="age" value="%{user.age}"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>