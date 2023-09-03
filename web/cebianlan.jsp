<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center">
    <tr>
        <td>姓名</td>
        <td>性别</td>
        <td>身份证号</td>
        <td>操作</td>
    </tr>
    <%
        request.setCharacterEncoding("utf-8");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/older?&useSSL=false&serverTimezone=UTC", "root", "123456");
        String id=request.getParameter("sex");
        System.out.println("id的值"+id);
        PreparedStatement preparedStatement=con.prepareStatement("select name,sex,idcard from people where sex='"+id+"'");
        ResultSet rs=preparedStatement.executeQuery();
        while (rs.next()){
            out.println("<tr><td>" + rs.getString("name") + "</td><td>" + rs.getString("sex") + "</td><td>" + rs.getString("idcard") + "</td><td><a href='xiangxi.jsp?id=" +id  +"'>详情</a></td></tr>" + "</br>");
        }
        rs.close();
        preparedStatement.close();
        con.close();

    %>
</table>
</body>
</html>
