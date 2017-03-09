<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<body>
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
<%--总页数和页数传到主页中去     后续需要优化--%>
<span style="display:none" , id="span1">${p.page}</span>
<span style="display:none" , id="span2">${p.total}</span>
</body>