<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 17-3-7
  Time: 下午9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失物招领后台</title>
</head>
<body>
<s:iterator value="list">
    <s:property value="loseName"/>   &nbsp;&nbsp;&nbsp;&nbsp;  <a href="/scampus_lose/li/infodel.action?p.total=<s:property value="lid"/>">del</a>
    <br>
</s:iterator>


</body>
</html>
