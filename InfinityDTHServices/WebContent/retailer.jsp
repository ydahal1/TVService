<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
 
<t:layout title="Retailer Registration">
 
 	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->

	</jsp:attribute>
	 
	<jsp:attribute name="body">
		<!-- Add HTML content to page body here -->
		<div class="container theme-showcase" role="main">
		
			<header>
				<div class="page-header">
			  		<h1>Infinity Retailer<small>   Register</small></h1>
				</div>	
			</header>
			
			<div class="page-body">
				<div class="container">
				  
				  <form id ="form" method ="post" action = "retailerController">
				    <div class="form-group">
				      <label for="inputdefault">Name (Individual or Company)</label>
				      <input class="form-control" id="inputdefault" type="text">
				    </div>
				    <div class="form-group">
				      <label for="inputlg">Contact No:1</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="inputsm">Contact No:2</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Address 1</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Address 2</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">City</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">State</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Zip Code</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Set Top Box Limit</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Credit Limit</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Commission Percentage</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Service Charges</label>
				      <input class="form-control input-sm" id="inputsm" type="text">
				    </div>
				    <div class="form-group">
						<label  for="sel1">Inventory List</label>
						<input id="inputsm1" type="file" accept=".csv" class="file">
				    </div>
				    <div class="form-group">
				      <label for="sel1">Retailer Creation Date</label>
				      <input class="form-control input-sm1" type="date" id="theDate" readonly>
				    </div>
				    
				   <!--  <div class="form-group">
				      <label for="sel3">input-sm</label>
				      <select class="form-control input-sm" id="sel3">
				        <option>1</option>
				        <option>2</option>
				        <option>3</option>
				      </select>
				    </div> -->
				    <button type="submit" class="submit">Submit</button>
				  </form>
				</div>
			</div>
			
			<footer class="footer">
 				<p>&copy; 2017 Infinity DTH Services, Inc.</p>
			</footer>
			
		</div>
	</jsp:attribute>
 
</t:layout>