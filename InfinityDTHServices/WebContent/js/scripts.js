/**
 * when page has loaded
 * perform JavaScript validation
 */

$(document).ready(function() {
	// Validate input
	$('input[type=text]').focusout('input', function() {
		// get input value
		var value = $(this).val();
		
		// is it empty?
			if(value) {
				// not empty		
				$(this).removeClass("invalid").addClass("valid");
				
				
			} else {
				// empty
				$(this).removeClass("valid").addClass("invalid");
			}
			
	});
	$("#form").submit(function(){
	    var isFormValid = true;

	    $(".input-sm").each(function(){
	        if ($.trim($(this).val()).length == 0){
	        	$(this).removeClass("valid").addClass("invalid");
	            isFormValid = false;
	        }
	        else{
	        	$(this).removeClass("invalid").addClass("valid");
	        }
	    });

	    if (!isFormValid) alert("Please fill in all the  fields that are red ");
	    		return isFormValid;
	    
	});
	//get current date 
        var date = new Date();

        var day = date.getDate();
        var month = date.getMonth() + 1;
        var year = date.getFullYear();

        if (month < 10) month = "0" + month;
        if (day < 10) day = "0" + day;

        var today =  month + "-" + day + "-" + year;       
        $("#theDate").attr("value", today);
  
});
$('#form').on('submit', function() {
    return $('#form').jqxValidator('validate');
});
$('#testForm')
.jqxValidator({  rules : [
       {
           input : '#firstName',
           message : 'Country Name is required!',
           action : 'keyup, blur',
           rule : 'required'
       }],
       theme : theme
});






