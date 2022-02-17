<%--
  Created by IntelliJ IDEA.
  User: zhangbin
  Date: 2022/2/17
  Time: 下午2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Library</title>
    <style type="text/css">
      a{
        text-decoration: none;
        color: bisque;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 38px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background: powderblue;
        border-radius: 4px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
  </h3>
  </body>
</html>
