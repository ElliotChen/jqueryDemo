<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/demo_page.css" rel="stylesheet" />
<link href="css/demo_table.css" rel="stylesheet" />
<script type="text/javascript" src="script/jquery-1.7.js"></script>
<script type="text/javascript" src="script/jquery.dataTables.js"></script>
</head>
<body>
	<script type="text/javascript">
		$().ready(function() {
			$("#exa").dataTable({
				"bProcessing" : true,
				"bServerSide" : true,
				"sAjaxSource" : '/jquery/DataTableServlet01'
			});
		});
	</script>
	<form>
		<input type="text" name="name" /> <input type="text" name="id" /> <input
			type="text" name="phone" /> <input type="button" value="Search" />
	</form>
	<table id="exa">
		<thead>
			<tr>
				<th>Name</th>
				<th>ID</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
</body>
</html>