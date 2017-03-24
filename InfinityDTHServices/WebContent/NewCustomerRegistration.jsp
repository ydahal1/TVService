<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
 
<t:layout title="Infinity- Customer Registration">
 
 	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>
	 
	<jsp:attribute name="body">
		<!-- Add HTML content to page body here -->
		<div class="container theme-showcase" role="main">
		
			<header>
				<div class="page-header">
				</div>	
			</header>
			
			<div class="page-body">
				<div class="container">
  <h2>New Customer Registration</h2>
  <form>
    <div class="form-group">
      <label for="inputlg">First Name:</label>
      <input class="form-control" id="firstName" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Last Name:</label>
      <input class="form-control" id="lastName" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Email ID:</label>
      <input class="form-control" id="emailId" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Phone Number:</label>
      <input class="form-control" id="phoneNumber" type="text" place 		holder="XXX-XXX-XXX">
    </div>
    <div class="form-group">
      <label for="inputlg">Address:</label>
      <input class="form-control" id="address" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Address1:</label>
      <input class="form-control" id="address1" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Address2:</label>
      <input class="form-control" id="address2" type="text">
    </div>
     <div class="form-group">
      <label for="inputlg">Land Mark:</label>
      <input class="form-control" id="landMark" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">Pin Code:</label>
      <input class="form-control" id="pinCode" type="text">
    </div>
    <div class="form-group">
      <label for="inputlg">City:</label>
      <input class="form-control" id="city" type="text">
    </div>
    
    <div class="form-group">
      <label for="sel2">State:</label>
      <select class="form-control" for="input-lg" id="state">
        <option value="AL">Alabama</option>
			<option value="AK">Alaska</option>
			<option value="AZ">Arizona</option>
			<option value="AR">Arkansas</option>
			<option value="CA">California</option>
			<option value="CO">Colorado</option>
			<option value="CT">Connecticut</option>
			<option value="DE">Delaware</option>
			<option value="DC">District of Columbia</option>
			<option value="FL">Florida</option>
			<option value="GA">Georgia</option>
			<option value="HI">Hawaii</option>
			<option value="ID">Idaho</option>
			<option value="IL">Illinois</option>
			<option value="IN">Indiana</option>
			<option value="IA">Iowa</option>
			<option value="KS">Kansas</option>
			<option value="KY">Kentucky</option>
			<option value="LA">Louisiana</option>
			<option value="ME">Maine</option>
			<option value="MD">Maryland</option>
			<option value="MA">Massachusetts</option>
			<option value="MI">Michigan</option>
			<option value="MN">Minnesota</option>
			<option value="MS">Mississippi</option>
			<option value="MO">Missouri</option>
			<option value="MT">Montana</option>
			<option value="NE">Nebraska</option>
			<option value="NV">Nevada</option>
			<option value="NH">New Hampshire</option>
			<option value="NJ">New Jersey</option>
			<option value="NM">New Mexico</option>
			<option value="NY">New York</option>
			<option value="NC">North Carolina</option>
			<option value="ND">North Dakota</option>
			<option value="OH">Ohio</option>
			<option value="OK">Oklahoma</option>
			<option value="OR">Oregon</option>
			<option value="PA">Pennsylvania</option>
			<option value="RI">Rhode Island</option>
			<option value="SC">South Carolina</option>
			<option value="SD">South Dakota</option>
			<option value="TN">Tennessee</option>
			<option value="TX">Texas</option>
			<option value="UT">Utah</option>
			<option value="VT">Vermont</option>
			<option value="VA">Virginia</option>
			<option value="WA">Washington</option>
			<option value="WV">West Virginia</option>
			<option value="WI">Wisconsin</option>
			<option value="WY">Wyoming</option>
      </select>
    </div>
     <div class="form-group">
		<label for="sel1">Retailer Creation Date</label>
		<input class="form-control input-sm" type="date" id="theDate" readonly>
	</div>
     <input type="submit" class="btn btn-info" value="Submit">
    
  </form>
</div>
	</div>
			<footer class="footer">
 				<p>© 2017 Infinity DTH Services, Inc.</p>
			</footer>
			
		</div>
	</jsp:attribute>
 
</t:layout>