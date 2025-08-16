<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<String> Apps = new ArrayList<>();
	Apps.add("---Selector-----");
	Apps.add("greet");
	Apps.add("names");
	%>
	<select name="App" id="app-selector">
		<%
		for (String app : Apps) {
		%>
		<option value=<%=app%>><%=app%></option>
		<%
		}
		%>

	</select>

	<script>
		document.getElementById("app-selector").addEventListener("change",
				function() {
					if (this.value && this.value !=="---Selector-----" ) {
						window.location.href = "<% request.getContextPath(); %>"+this.value;
					}
				});
	</script>

</body>
</html>