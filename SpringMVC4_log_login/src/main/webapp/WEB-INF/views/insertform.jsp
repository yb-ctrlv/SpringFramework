<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.do">
		<table border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" ></td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><input type="text" name="password" ></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" onclick="location.href='list.do'">취소</button>
					<input type="submit" value="추가">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>