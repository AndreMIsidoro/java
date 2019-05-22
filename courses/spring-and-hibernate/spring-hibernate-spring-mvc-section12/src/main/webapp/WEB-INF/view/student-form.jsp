<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<title>
	Student Registration Form
</title>

</head>

<body>

	<form:form action="processForm" modelAttributes="student">
		First Name: <form:input path="firstName"/>
		<br>
		<br>
		Last Name: <form:input path="lastName"/>
		<br>
		<br>
		
		<form:select path="country">
		
			<!--<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" />-->
			
			<form:options items="${student.countryOptions}"/>
		
		</form:select>
		
		<br><br>
		
		JAVA <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		
		<br><br>
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		
		<input type="submit" value="Submit"/>
		
	</form:form>


</body>

</html>