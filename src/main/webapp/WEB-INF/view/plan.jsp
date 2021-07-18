<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Plan</title>
</head>
<body>
	<table >
		<tr align=center>
			<td>모델명</td>
			<td>재고</td>
			<td>주문</td>
			<td>주문-재고</td>
			<td>계획</td>
		</tr>
		
		<tr>
			<td><input value="${model}"></td>
			<td><input value="${stock}"></td>
			<td><input value="${order}"></td>
			<td><input value="${order-stock}"></td>
			<td><input value="0"></td>
		</tr>
		
	</table>
</body>
</html>