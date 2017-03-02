<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="weui_cells_title">带说明、跳转的列表项</div>
<div class="weui_cells weui_cells_access">
    <s:iterator value="listIndexInfo">
        <a class="weui_cell" href="javascript:;">
            <div class="weui_cell_bd weui_cell_primary">
                <p>
                    <s:property value="loseName"/>
                </p>
            </div>
            <div class="weui_cell_ft">
                <s:if test="%{loseType==0}">
                    失物申报
                </s:if>
                <s:else>
                    失物上交
                </s:else>
            </div>
        </a>
    </s:iterator>
    <s:if test="%{p.total==p.page}">
        暂无更多信息.
    </s:if>
    <%--总页数和页数传到主页中去     后续需要优化--%>
    <span style="display:none" , id="span1">${p.page}</span>
    <span style="display:none" , id="span2">${p.total}</span>
</div>
