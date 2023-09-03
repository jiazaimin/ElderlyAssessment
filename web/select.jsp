<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老年人信息查询</title>
</head>
<body>
<div><table align="center">
    <tr><td>
        老年人信息查询
    </td></tr>
</table></div>

<div align="center">
    <form action="selectjsp.jsp" method="get" >
        <table align="center" border="1">
            <tr><td>请输入：</td></tr>
            <tr><td>姓名：<input type="text" name="name"></td></tr>
            <tr><td>性别：<input type="text" name="sex"></td></tr>
            <tr><td>生日：<input type="text" name="birth"></td></tr>
            <tr><td><input type="submit" value="提交"></td></tr>
        </table>
    </form></div>


<div style=" width: 100px;height: 100px;overflow:hidden">
    <div style="width: 100px;display:inline-block;">
        <ol style="list-style: unset">
            <li>
                <a href="cebianlan.jsp?sex=男" target="ifa">男性</a>
            </li>
            <li>
                <a href="cebianlan.jsp?sex=女" target="ifa">女性</a>
            </li>

        </ol>
    </div>
    <div style="display:inline-block;width: 950px">
        <section>
            <iframe src="selectalljsp.jsp" name="ifa" style="border: none; overflow:hidden;width: 100% ;height: 430px"></iframe>
        </section>
    </div>
</div>
</body>
</html>
