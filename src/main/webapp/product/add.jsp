<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.city.erp.model.ProductcategoryEntity" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: liltt
  Date: 2022/3/10
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>产品增加</h1>
<form action="add.do" method="post">
    产品名称：<input type="text" name="name"/><br/>
    产品单价：<input type="text" name="price"/><br/>
    产品数量：<input type="text" name="stock"/><br/>
    产品类别：<select name="tid" id=typeSel>
    <%
        List<ProductcategoryEntity> ls = (List<ProductcategoryEntity>) request.getAttribute("ValueA");
        for (ProductcategoryEntity l : ls) {%>
    <option value="<%=l.getgNo()%>"><%=l.getgName() %>
    </option>
    <%
        }
    %>
</select>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
