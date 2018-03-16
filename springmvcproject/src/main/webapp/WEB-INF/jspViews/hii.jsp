<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";  %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=basePath%>js/lib/bootstrap/bootstrap-theme/css/bootstrap-theme.min.css" type="text/css"/>
<link rel="stylesheet" href="<%=basePath%>js/lib/bootstrap/bootstrap-theme/css/bootstrap.min.css" type="text/css"/>
<title>Insert title here</title>
<script src="<%=basePath%>js/lib/requirejs/require.js" data-main="<%=basePath%>js/main.js"></script>
</head>
<body>

</body>
</html>