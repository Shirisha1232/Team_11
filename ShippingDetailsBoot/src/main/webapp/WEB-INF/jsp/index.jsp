<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:mso="urn:schemas-microsoft-com:office:office"
	xmlns:msdt="uuid:C2F41010-65B3-11d1-A29F-00AA00C14882">
<head>
<title>Shipping Details</title>
<script language="javascript">

function chkEmpty(){
var mob = /^[7-9]{1}[0-9]{9}$/;
var email=/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/;

if (document.frmReg.txtFullName.value == "") {alert("Please fill the Full Name");}
else if (document.frmReg.txtEmail.value == ""){alert("Please fill the Email");}
else if (email.test(document.frmReg.txtEmail.value) == false) { alert("Please enter valid Email Id.");}
else if (document.frmReg.txtPhone.value == "") {alert("Please fill the Contact No.");}
//else if (document.frmReg.txtPhone.length != 10) {alert("Enter 10-digit Contact no.");}
else if (mob.test(document.frmReg.txtPhone.value) == false) { alert("Please enter valid Contact no.");}
else if (document.frmReg.pincode.value == ""){alert("Please fill the pincode");}
else if (document.frmReg.txtAddress1.value == ""){alert("Please fill the Building & Flat No");}
else if (document.frmReg.txtAddress2.value == ""){alert("Please fill the Area name and village");}
else if (document.frmReg.txtAddress3.value == ""){alert("Please fill the Landmark");}

else if (document.frmReg.city.value==""){alert("Please fill the city")}
else if (document.frmReg.state.value==""){alert("Please fill the state")}

else {
alert("Delivery Address is added.");
window.location = 'PaymentDetails.html';
}
}


</script>


<!--[if gte mso 9]><xml>
<mso:CustomDocumentProperties>
<mso:Material_x0020_Type msdt:dt="string">Extra Material</mso:Material_x0020_Type>
<mso:Category msdt:dt="string">Assessment Component</mso:Category>
<mso:Level msdt:dt="string">L1</mso:Level>
</mso:CustomDocumentProperties>
</xml><![endif]-->
</head>
<body onclick="myFunction()">
	<h2 style="font-family: Calibri;" align="center">Shipping Details</h2>
	<h3 style="font-family: Calibri;" align="center">Select a delivery
		address.</h3>

	<form name="frmReg" action="/add_details" method="post">

		<table align="center"
			style="font-family: Calibri; box-shadow: 5px 5px 5px 5px cyan;">
			<tr>
				<td align="left">Order Id :</td>
				<td><input type="text" id="orderId"
					name="orderId"/></td>
			</tr>
			<tr>
				<td align="left">Full Name* :</td>
				<td><input type="text" class="Format1" id="txtFullName"
					name="fullName" required="required" /></td>
			</tr>

			<tr>
				<td align="left">Email* :</td>
				<td><input type="text" id="txtEmail" name="Email"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" /></td>
			</tr>

			<tr>
				<td align="left">Contact no.*:</td>
				<td><input type="text" name="contactNo" id="txtPhone"
					pattern="[789][0-9]{9}" /></td>
			</tr>
			<tr>
				<td align="left">Pincode:</td>
				<td><input type="text" name="pincode" id="pincode" /></td>
			</tr>


			</tr>
			<tr>
				<td align="left">Address*:</td>
			</tr>
			<tr>
				<td align="left">Building Name & Flat No</td>
				<td><input type="text" name="buildingName" id="txtAddress1" /></td>
			</tr>
			<tr>
				<td align="Left">Area Name, Colony, Village</td>
				<td align="left"><input type="text" name="area"
					id="txtAddress2" /></td>
			</tr>
			<tr>
				<td align="Left">Landmark</td>
				<td align="left"><input type="text" name="landmark"
					id="txtAddress3" /></td>
			</tr>
			<tr>
				<td align="Left">Town/City</td>
				<td align="left"><input type="text" name="city" id="city" /></td>
			</tr>
			<tr>
				<td align="Left">State</td>
				<td align="left"><input type="text" name="state" id="state" /></td>
			</tr>
			<tr>
				<td colspan=2 align="right"><br> <input type="submit"
					id="btnDeliver" value="Deliver to this address" onclick=chkEmpty()>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</tr>
		</table>

	</form>
</body>
</html>