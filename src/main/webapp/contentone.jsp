<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 17-3-5
  Time: 下午6:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>">
    <title>明德失物招领信息发布中心|明德微校园</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="css/weui.min.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <script type="text/javascript" src="js/jquery-2.1.4.js"></script>



</head>
<body>
<br>
<article class="weui_article">
    <h1></h1>
    <section>
        <h2 class="title">标题:&nbsp;&nbsp;${submitInfo.loseName}</h2>
        类型:&nbsp;&nbsp;<span>${submitInfo.loseType}</span><br>
        物品简述:<br>&nbsp;&nbsp;&nbsp;&nbsp;<span>${submitInfo.loseInfo}</span><br>
        地点:&nbsp;&nbsp;<span>${submitInfo.loseLocation}</span><br>
        联系电话:&nbsp;&nbsp;<span>${submitInfo.losePhone}</span><br>
        发布时间:&nbsp;&nbsp;<span>${submitInfo.loseTime}</span><br>
                <div style="text-align: center">
                    <c:if test="${submitInfo.loseImg != 'aa'}">
                        <img src="${submitInfo.loseImg}" height="200" width="200" >
                    </c:if>
                </div>





    </section>
</article>
<br>
<div class='demos-content-padded'>
    <a href="lose.html" id='show-actions' class="weui_btn weui_btn_primary">返回主页</a>
</div>


<script src="js/jquery-2.1.4.js"></script>
<script src="js/fastclick.js"></script>
<script>
    $(function () {
        FastClick.attach(document.body);
    });
</script>
<script src="js/jquery-weui.js"></script>


<br><br><br><br>
<div align="center" style="font-style: italic;color: #9B9B9B">
    <p>&copy;明德微校园&nbsp;&nbsp;&nbsp;&nbsp;<font>MrCrab</font></p>
</div>
</body>
</html>
