<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 17-3-9
  Time: 下午8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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
<img src="pic/fenxiang.jpg" width="0" height="0">
<h1 class="demos-title" style="font-size:20px">明德失物招领信息发布中心</h1>
<br><br>
<div>
    <c:if test="${count == 0}">
        暂无更多信息...
    </c:if>
    <c:if test="${count != 0}">
        <div id="btn1" class="weui_cells weui_cells_access"></div>

        <s:iterator value="listIndexInfo">
            <a href="/li/content.action" class="weui_btn weui_btn_primary open-popup" data-target="#full">
                <a class="weui_cell" href="/scampus_lose/li/contentone.action?lid=<s:property value="lid"/>">
                    <div class="weui_cell_bd weui_cell_primary">
                        <p style="display: none"><s:property value="lid"/></p>
                        <p>
                            <s:property value="loseName"/>
                            <c:if test="${loseImg!='aa'}">
                                <font color="red">[图]</font>
                            </c:if>

                        </p>
                    </div>
                    <div class="weui_cell_ft">
                        <s:property value="loseType"/>
                    </div>
                </a>
            </a>
        </s:iterator>
    </c:if>

</div>
<br>
<div class='demos-content-padded'>
    <a href="javascript:;" id='show-actions' class="weui_btn weui_btn_primary">更多操作</a>
</div>


<script src="js/jquery-weui.js"></script>

<script>
    $(document).on("click", "#show-actions", function () {
        $.actions({
            title: "选择操作",
            onClose: function () {
                console.log("close");
            },
            actions: [
                {

                    text: "搜索",
                    className: "color-warning",
                    onClick: function () {
                        $.prompt({
                            text: "请输入搜索的内容：",
                            title: "输入姓名",
                            onOK: function(text) {
                                location.href="search?searchInfo="+text+"";
                            },
                            onCancel: function() {
                                console.log("取消");
                            },
                            input: '一卡通'
                        });
                    }
                },
                {
                    text: "返回主页",
                    className: "color-primary",
                    onClick: function () {
                        location.href = "lose.html";
                    }
                }
            ]
        });
    });
</script>


<br><br><br><br>
<div align="center" style="font-style: italic;color: #9B9B9B">
    <p>&copy;明德微校园&nbsp;&nbsp;&nbsp;&nbsp;<font>MrCrab</font></p>
</div>
</body>
</html>
