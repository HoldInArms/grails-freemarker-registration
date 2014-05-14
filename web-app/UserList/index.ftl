<html>
	<head>
		<title>User List</title>
	</head>
	<body>
	
		<table border="1">
			<thead>
				<tr>
					<td>
						Username
					</td>
				</tr>
			</thead>
			<tbody>
				<#list Users as u>
					<tr>
						<td>
							${u.username}
						</td>
					</tr>
				</#list>
			</tbody>
		</table>
	
	</body>
</html>
