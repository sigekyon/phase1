<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2Tutorial</title>
</head>
<body>
<h2>Hello Struts2</h2>
<s:form action="helloStruts2">
    <p><s:property value="message"/></p>
    <s:textfield name="message" value="%{message}" size="50"/>
    <s:submit value="送信" />
</s:form>
</body>
</html>