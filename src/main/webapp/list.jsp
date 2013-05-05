<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function remove(){
		if(confirm("Are you sure?")){
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<h1><font color="red">Users List</font></h1>
	<table border="1" width="80%" align="center">
		<tr>
			<td>序号</td>
			<td>姓</td>
			<td>名</td>
			<td>年龄</td>
			<td>删除</td>
			<td>更新</td>
		</tr>
		<s:iterator value="#request.list" id="us">
		<tr>
			<td><s:property value="#us.id" /></td>
			<td><s:property value="#us.lastname" /></td>
			<td><s:property value="#us.firstname" /></td>
			<td><s:property value="#us.age" /></td>
			<td><s:a href="deleteUser.action?user.id=%{#us.id}" onclick="remove();">delete</s:a></td>
			<td><s:a href="updateUser.action?user.id=%{#us.id}">update</s:a></td>
		</tr>
		</s:iterator>
	</table>
</body>
</html>