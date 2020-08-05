<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import="com.login.dto.MyMemberDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%
		MyMemberDto dto = (MyMemberDto)request.getAttribute("dto");
	%>
<body>
	<h1>회원 등급 변경 페이지</h1>
	<form action="logincontroller.jsp" method="post">
		<input type="hidden" name="command" value="updaterole">
		<input type="hidden" name="myno" value="<%=dto.getMyno() %>" >
		<table border="1">
			<tr>
				<th>NO</th>
				<td><%=dto.getMyno() %></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><%=dto.getMyname() %></td>
			</tr>
			<tr>
				<td>
					<select>
						<option value="USER" <%=dto.getMyrole().equals("USER")? "selected" : "" %>>일반회원</option>
						<option value="ADMIN" <%=dto.getMyrole().equals("ADMIN")? "selected" : ""  %>>관리자</option>
						<option value="MANAGER" <%=dto.getMyrole().equals("MANAGER")? "selected" : "" %>>매니저</option>
					</select>
				</td>
			</tr>
			<tr>	
				<td colspan="2" align="right">
					<input type="submit" value="변경">
					<input type="button" value="취소"  onclick="location.href='logincontroller.jsp?command=userlistenabled' ">
 				</td>
			</tr>			
		</table>
	</form>
</body>
</html>