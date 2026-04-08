<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% String id=request.getParameter("id");
 %>
 
 <jsp:useBean id="p" class="com.beans.UserPOJO" scope="session"/>
 
 <%
 	if("signin".equals(id)) {
 %>
 	<jsp:setProperty property="*" name="p"/>
 <%
 } else {
 %>
 <jsp:setProperty property="userName" name="p"/>
 <jsp:setProperty property="password" name="p"/>
<%-- <jsp:setProperty property="Email" name="p"/> --%>
 
 <%
 }
 %>
 
 <jsp:forward page="LoginServlet"/>