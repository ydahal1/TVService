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
				<div class="container">
        <h2>Infinity Operator</h2>
  
  				<form>
				    <div class="form-group">
				      <label for="firstName">First Name</label>
				      <input class="form-control" id="firstName" type="text">
				    </div>
				    <div class="form-group1">
				      <label for="lastName">Last Name</label>
				      <input class="form-control" id="LastName" type="text">
				    </div>
				    <div class="form-group2">
				      <label for="emailID">Email ID</label>
				      <input class="form-control" id="EmailID" type="text">
				    </div>
				    <div class="form-group3">
				      <label for="sel1">Shift Start Time</label>
				      <select class="form-control" id="sel1">
				        <option> 7:00 am</option>
				        <option> 3:00 pm</option>
				        <option> 11:00 pm</option>
				       
				      </select>
				    </div>
				    <div class="form-group4">
				      <label for="sel2">Shift End Time</label>
				      <select class="form-control" id="sel2">
				        <option>3:00 pm</option>
				        <option>11:00 pm</option>
				        <option>7:00 am</option>
				      </select>
				    </div>
				    <br>
				    <div class="form-group5">
				      <label for="MaxCustomersManaged">Max. number of Customers to be managed</label>
				      <p>10 customers</p>
				    </div>
				    <br>
					<div class="form-group">
				      <label for="sel1">Customer Creation Date</label>
				      <input class="form-control input-sm" type="date" id="theDate" readonly>
				    </div>
				     <button type="submit" class="btn btn-default">Submit</button>
				  </form>
				</div>
			</div>
			
			<footer class="footer">
 				<p>&copy; 2017 Infinity DTH Services, Inc.</p>
			</footer>
			
		</div>
	</jsp:attribute>
 
</t:layout>