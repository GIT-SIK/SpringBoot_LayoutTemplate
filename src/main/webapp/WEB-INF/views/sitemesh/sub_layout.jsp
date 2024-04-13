<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/taglib"%>
<!DOCTYPE html>
<html lang="ko">
   <head>
   <%@ include file="/WEB-INF/views/sitemesh/css.jsp" %>
   <sitemesh:write property='head'/>
   </head>
   <body>
   		<%@ include file="/WEB-INF/views/sitemesh/scripts.jsp" %>
		<%@ include file="/WEB-INF/views/sitemesh/nav.jsp" %>
		<sitemesh:write property='body' />
   </body>
</html>