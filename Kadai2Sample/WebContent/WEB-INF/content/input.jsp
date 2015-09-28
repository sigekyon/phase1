<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>課題2-①</title>
</head>
<body>
<s:actionmessage />
<s:form>
<s:textfield name="lastName" label="姓"/><br>
<s:textfield name="firstName" label="名"/><br>
<s:submit name="inputValue" value="登録する" /><br>
</s:form>
</body>
</html>