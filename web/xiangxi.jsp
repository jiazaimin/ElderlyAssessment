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
<table align="center" border="1">
    <tr>
        <td>进食状况</td>
        <td>洗漱</td>
        <td>穿衣</td>
        <td>认知功能</td>
        <td>抑郁症状</td>
    </tr>
    <%
        request.setCharacterEncoding("utf-8");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/older?&useSSL=false&serverTimezone=UTC", "root", "123456");
        String id=request.getParameter("id");
        System.out.println("id的值"+id);
        PreparedStatement preparedStatement=con.prepareStatement("select eat,wash,wear from life where idcard='"+id+"'");
        PreparedStatement preparedStatement1= con.prepareStatement("select know,depression from spirit where idcard='"+id+"'");
        ResultSet rs=preparedStatement.executeQuery();
        ResultSet rs1=preparedStatement1.executeQuery();
        if (rs.next()&&rs1.next()){
            out.println("<tr><td>" + rs.getString("eat")+ "</td><td>" + rs.getString("wash")+ "</td><td>" + rs.getString("wear")+ "</td><td>" + rs1.getString("know")+ "</td><td>" + rs1.getString("depression")+"</td></tr>");
        }
        rs1.close();
        rs.close();
        preparedStatement1.close();
        preparedStatement.close();
        con.close();

    %>
    <tr><td><a href="select.jsp">返回</a></td></tr>
</table>
</body>
</html>
