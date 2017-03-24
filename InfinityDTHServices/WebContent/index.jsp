<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
 
<t:layout title="Title Goes Here">
 
 	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>
	 
	<jsp:attribute name="body">
		<!-- Add HTML content to page body here -->
		<div class="container theme-showcase" role="main">
		
			<header>
				<div class="page-header">
			  		<h1>Example page header <small>Subtext for header</small></h1>
				</div>	
			</header>
			
			<div class="page-body">
				<form method="post" action="SampleController">
					<label>Name:</label>
					<input type="text" name="name">
					<input type="submit" name="submit" value="Submit">
				</form>
			</div>
			
			<footer class="footer">
 				<p>&copy; 2017 Company, Inc.</p>
			</footer>
			
		</div>
	</jsp:attribute>
 
</t:layout>