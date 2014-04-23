
package views.html.login

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object registration extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Time Trotter</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<script src=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*7.66*/(""""type="text/javascript"></script>

<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.95*/("""">
<link rel="stylesheet"  href=""""),_display_(Seq[Any](/*11.32*/routes/*11.38*/.Assets.at("stylesheets/select2.css"))),format.raw/*11.75*/("""" />
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*12.87*/("""">
</head>
<body>

	<div class="container">
		<legend></legend>
		
		<div class="container">
		<div class="heading">
				"""),_display_(Seq[Any](/*21.6*/helper/*21.12*/.form(routes.Application.createAccount, 'id -> "createUserForm")/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
			<a href=""""),_display_(Seq[Any](/*22.14*/routes/*22.20*/.Application.index)),format.raw/*22.38*/("""">
 			<h1 style="color:#f4995d;">Time Trotter</h1></a>
			<legend></legend>
			<br>
			<br>
			<br>
			<div class="row">
				<div class="span8">
					<fieldset id="registerHere">
						"""),_display_(Seq[Any](/*31.8*/if(flash.contains("registered"))/*31.40*/{_display_(Seq[Any](format.raw/*31.41*/("""
							<p class="registered" class="serif" style="color:red;">
						     <b>"""),_display_(Seq[Any](/*33.16*/flash/*33.21*/.get("registered"))),format.raw/*33.39*/("""</b>
							</p>
								""")))})),format.raw/*35.10*/("""
					
						<div class="well">
						<input type="hidden" id="companyId" name="companyId" > 
						<!-- <p>
			                <input type="text" id="companyId" name="companyId" placeholder="Company Id" required rel="popover" data-content="Enter your Company Id (Ask your Company Administrator for CompanyId)">
			            </p> -->
			            <!-- <p>
			            	<input type='text' id="companyName" placeholder="Company Name" autocomplete="off" required /><br>
			            </p> -->
			            <p>
			                <input type="text" id="firstName" name="firstName" placeholder="First Name" required rel="popover" data-content="Enter Your First Name" >
			                
			            </p>
			            <p>
			                <input type="text" id="middleName" name="middleName" placeholder="Middle Name" rel="popover" data-content="Enter Your Middle Name" >
			            </p>
			            <p>
			                <input type="text" id="lastName" name="lastName" placeholder="Last Name" required rel="popover" data-content="Enter Your Last Name" >
			            </p>
			            <!-- <p>
			                <input type="text" name="jobTitle" placeholder="Job Title" rel="popover" data-content="Enter Job Title">
			            </p> -->
						<div class="control-group">
							<div class="controls">
			                <input type="email" id="email" name="email" placeholder="Email" required value="" rel="popover" data-content="Enter Desired LoginName" >
							</div>
						</div>
							<div class="control-group">
							<div class="controls">
			                <input type="password" id="password"  name="password" placeholder="Password" required  value="" rel="popover" data-content="Enter Password Containig A-Z and 0-9" >
							</div>
						</div>
						<p>   
			                <input type="password" id="cpassword" name="cpassword" placeholder="Confirm Password" required rel="popover" data-content="Please Re-Confirm your Password" >
			            </p>
			           	<p>   
			                <select id="employeeStatus" name="status" required data-content="Please Select Category" >
			                	<option value="OnRolls">Employee</option>
			                	<option value="OffRolls">Non-Employee</option>
			                </select>
			            </p>
			            <br>
			            <p>
			             
			                <button type="submit" onClick="popupWin()" class="btn btn-success">Register</button>
			                <a href=""""),_display_(Seq[Any](/*81.30*/routes/*81.36*/.Application.login)),format.raw/*81.54*/("""" class="btn btn-info">Back</a>
			            </p>
			            <p>
			            	Don't have a Company Domain yet?
           					<a href=""""),_display_(Seq[Any](/*85.27*/routes/*85.33*/.Application.companyregistration)),format.raw/*85.65*/("""" class="btn btn-warning">Register Your Company</a>
			            </p>
			           </fieldset>
			          </div>
			         </div>
			""")))})),format.raw/*90.5*/("""
		</div>
		<!-- BODY  -->
		
		<!-- FOOTER -->
			<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<h3 id="myModalLabel">Privacy & Terms</h3>
			</div>
			<div class="modal-body">
				<p><h4>Time Trotter Website Privacy Policy</h4>
In this Website Privacy Statement ("statement"), we, Orlov Trotter Inc., provide information about how we collect, use and transfer personally identifiable data from you, an individual person and website visitor, through Orlov Trotter's publicly accessible websites (any of our websites such as www.orlovtrotter.com that can be accessed without a password) and on which we post a direct link to this statement (collectively the "site").
<br>
<h4>Scope</h4>
This statement covers only data collected through the site and not any other data collection or processing, including, without limitation, data collection practices of webpages to which the site links, or data that we or our affiliates collect offline or through webpages that do not display a direct link to this statement, for example the Orlov Trotter applications on which we host data for registered customers. The scope of our Safe Harbor Certification is defined by our General EEA Safe Harbor Notice.
<br>
<h4>Types of Data and Collection Methods</h4>
Through the site, we receive data that you actively submit as well as data that we track:

Actively Submitted Data: When you request information, subscribe to a mailing list or for a service, respond to an online survey or otherwise actively send us data, we usually collect data such as your name, e-mail address(es), mailing address(es), telephone number(s), and certain information related to the business you represent such as number of employees and industry type. You can opt out of providing information by not entering it when asked and, if such information is required in order to allow us to respond to your inquiry, you will receive a notice advising you of this. In each such instance, you will know what data we collect through the site, because you actively submit it.

Passively Tracked Data: When you visit the site, we also passively track information on your computer and Internet connection, such as the IP address of your computer and/or Internet service provider, the date and time you access the site, the Internet address of websites from which you link to our site, the computer technology you are using and your movements and preferences on our site. We use technology that many other websites employ, including, without limitation, "cookies" or small data files stored on your computer's hard drive, to collect such information. In some instances, we also use cookies to collect information in connection with future visits from that website, to recognize you as a previous visitor, or to track your activity on our site. If you follow a link to the site from an affiliate or promotion, we store information about your arrival from that affiliate or promotion in a session cookie. You do not need to have cookies turned on to visit our site. You can refuse cookies by turning them off on your browser. But, if you want to access webpages that require registration, you need to accept a mandatory session cookie, which you can delete after you leave the site.

Combinations: Unless you also actively submit personal information such as your name or address, passively tracked data does not typically allow us to identify you personally (even though it can theoretically be done, we do not have the means or an interest to find out who you are, unless you identify yourself voluntarily through an active submission of data). To the extent permitted by applicable law, we reserve the right to combine passively tracked data with personal data that you actively submit.
<br>
<h4>Collection Purposes, Use of Data</h4>
We collect passively tracked data primarily for purposes of administering, protecting and improving our site and our systems, to better understand the preferences of our site visitors, to identify server problems, to compile aggregated statistics about site usage, and to help personalize your experience on our site. We do not deliver third party online advertisements on our sites but we advertise our products and services on others' Web sites. We work with service providers to deliver retargeting advertisements and other advertisements on our behalf to visitors of our timetrotter.com site.

We collect actively submitted data primarily for two purposes: Firstly, for the purpose for which you originally sent us the data (e.g., to provide information to you or sign you up for a free trial); and secondly, for purposes of contacting you to further discuss your interest in our company, the services we provide and ways we can improve them to provide information on services, promotions and events. You can opt out of receiving marketing emails as explained below.
<br>
<h4>Disclosures of Personal Information</h4>
We are not in the business of selling or renting your information to telemarketers and we do not share your personally identifiable information with others, except as follows: We freely share your information within the Orlov Trotter group of companies. We also may share information with trusted business partners, such as system integrators, distributors, and referral partners and any other party specifically identified on the page on which you submit your information. We engage agents and service providers who process data only on our behalf and for our purposes under confidentiality agreements. We may share your information as required by law or in the interest of protecting or exercising our or others' legal rights, e.g., without limitation, in connection with requests from law enforcement officials and in connection with court proceedings. We may share or transfer your information in connection with a prospective or actual sale, merger, transfer or other reorganization of all or parts of our business. Also, we reserve the right to fully use and disclose any information that is not in personally identifiable form (such as statistics and survey results that do not identify you individually by name).
<br>
<h4>Opt-Out</h4>
In connection with promotions or other projects, we may ask you specifically whether you have objections against a certain kind of data use or sharing. If you opt-out under such circumstances, we will respect your decision. To opt out of receiving commercial communications from Orlov Trotter, please click on the "opt-out" link in the communication or, , please contact us at support@timetrotter.com. Please note that our affiliates and other data recipients have their own data privacy policies, which may differ from ours and you would have to contact them separately with respect to opt-out requests.
<br>
<h4>Access</h4>
If personal information you have submitted through the site is no longer accurate, current, or complete, and you wish to update it, please send an e-mail to support@timetrotter.com. Upon appropriate request we will usually be glad to update or amend your information, but we reserve the right to use information obtained previously to verify your identity or take other actions that we believe are appropriate.
<br>
<h4>Security</h4>
Transmissions over the Internet are never 100% secure or error-free. However, we take reasonable steps to protect your personal information from loss, misuse, and unauthorized access, disclosure, alteration, and destruction.
<br>
<h4>Effective Date, Amendments</h4>
This statement is effective as of April 13, 2013. We reserve the right to change, modify, add or remove portions of this statement from time to time and in our sole discretion, but will alert you that changes have been made by indicating on the statement the date it was last updated. When you visit the site, you are accepting the current version of this statement as posted on the site at that time. We recommend that users revisit this statement on occasion to learn of any changes.
<br>
<h4>Contact Us</h4>
Please feel free to contact us with any comments, questions, complaints or suggestions you might have regarding the information practices described in this statement. You may send us an e-mail at support@timetrotter.com or write to us Orlov Trotter LLC., telephone: 732-406-8023. </p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
			</div>
		</div>
<!-- 		FOOTER -->
		<footer>
			<p>
				&copy; 2013 Orlov Trotter, Inc. &middot; <a href="#myModal" data-toggle="modal">Privacy & Terms</a>
			</p>
		</footer>
	</div>
	<script src=""""),_display_(Seq[Any](/*149.16*/routes/*149.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*149.64*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*150.39*/routes/*150.45*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*150.93*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*151.39*/routes/*151.45*/.Assets.at("javascripts/jquery.alphanumeric.pack.js"))),format.raw/*151.98*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*152.39*/routes/*152.45*/.Assets.at("javascripts/jquery.alphanumeric.js"))),format.raw/*152.93*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*153.39*/routes/*153.45*/.Assets.at("javascripts/select2.js"))),format.raw/*153.81*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*154.39*/routes/*154.45*/.Assets.at("javascripts/select2_locale_en.js.template"))),format.raw/*154.100*/(""""></script>
	
</body>


<script type="text/javascript">
	//Auto-Complete
	/* $(document).ready(function() """),format.raw/*161.34*/("""{"""),format.raw/*161.35*/("""
		$(".typeahead").typeahead("""),format.raw/*162.29*/("""{"""),format.raw/*162.30*/("""
    		minLength:1,
   			 source: function(query, process) """),format.raw/*164.41*/("""{"""),format.raw/*164.42*/("""
   			 	objects = [];
   			 	map = """),format.raw/*166.15*/("""{"""),format.raw/*166.16*/("""}"""),format.raw/*166.17*/("""
   				     $.get('/companysearch', """),format.raw/*167.37*/("""{"""),format.raw/*167.38*/(""" q: query """),format.raw/*167.48*/("""}"""),format.raw/*167.49*/(""", function(data) """),format.raw/*167.66*/("""{"""),format.raw/*167.67*/("""
        				console.log(data)
  			         $.each(data,function(i,object) """),format.raw/*169.46*/("""{"""),format.raw/*169.47*/("""
  			        		
				    		map[object.companyName] = object;
				    		objects.push(object.companyName);
				       """),format.raw/*173.12*/("""}"""),format.raw/*173.13*/(""");  
        			process(objects);
       		 """),format.raw/*175.11*/("""}"""),format.raw/*175.12*/(""");
 		   """),format.raw/*176.7*/("""}"""),format.raw/*176.8*/(""",
			    updater: function (item) """),format.raw/*177.33*/("""{"""),format.raw/*177.34*/("""
			    	$('#companyId').val(map[item].id);
			    	return item;
				    """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""
				"""),format.raw/*181.5*/("""}"""),format.raw/*181.6*/(""");
			"""),format.raw/*182.4*/("""}"""),format.raw/*182.5*/("""); */
</script>


<script type="text/javascript">
	$(document).ready(function() """),format.raw/*187.31*/("""{"""),format.raw/*187.32*/("""
		// Popover  show
		$('#registerHere input').on('mouseenter',function() """),format.raw/*189.55*/("""{"""),format.raw/*189.56*/("""
			$(this).popover('show')
		"""),format.raw/*191.3*/("""}"""),format.raw/*191.4*/(""");
		//Popover hide
		$('#registerHere input').on('mouseleave',function() """),format.raw/*193.55*/("""{"""),format.raw/*193.56*/("""
			$(this).popover('hide')
		"""),format.raw/*195.3*/("""}"""),format.raw/*195.4*/(""");
	
		// Validation
		$("#createUserForm").validate("""),format.raw/*198.33*/("""{"""),format.raw/*198.34*/("""
			rules : """),format.raw/*199.12*/("""{"""),format.raw/*199.13*/("""
				password : """),format.raw/*200.16*/("""{"""),format.raw/*200.17*/("""
					required : true,
					passwordCheck : true,
					minlength : 6
				"""),format.raw/*204.5*/("""}"""),format.raw/*204.6*/(""",
				cpassword : """),format.raw/*205.17*/("""{"""),format.raw/*205.18*/("""
					required : true,
					equalTo : "#password"
				"""),format.raw/*208.5*/("""}"""),format.raw/*208.6*/(""",
				email : """),format.raw/*209.13*/("""{"""),format.raw/*209.14*/("""
					remote : """),format.raw/*210.15*/("""{"""),format.raw/*210.16*/("""
						url:"/checkUserEmail",
						type : "post",
						data : """),format.raw/*213.14*/("""{"""),format.raw/*213.15*/("""
							q : function()"""),format.raw/*214.22*/("""{"""),format.raw/*214.23*/("""
								return $("#email").val(); 
						 """),format.raw/*216.8*/("""}"""),format.raw/*216.9*/("""
					"""),format.raw/*217.6*/("""}"""),format.raw/*217.7*/("""
				  """),format.raw/*218.7*/("""}"""),format.raw/*218.8*/("""
				"""),format.raw/*219.5*/("""}"""),format.raw/*219.6*/("""
			"""),format.raw/*220.4*/("""}"""),format.raw/*220.5*/(""",

			messages : """),format.raw/*222.15*/("""{"""),format.raw/*222.16*/("""
				password : """),format.raw/*223.16*/("""{"""),format.raw/*223.17*/("""
					required : "Enter your password",
					passwordCheck : "Password must contain atleast one A-Z and 0-9",
					minlength : "Password must be minimum 6 characters"
					
				"""),format.raw/*228.5*/("""}"""),format.raw/*228.6*/(""",
				cpassword : """),format.raw/*229.17*/("""{"""),format.raw/*229.18*/("""
					required : "Enter confirm password",
					equalTo : "Password and Confirm Password must match"
				"""),format.raw/*232.5*/("""}"""),format.raw/*232.6*/(""",
				email : """),format.raw/*233.13*/("""{"""),format.raw/*233.14*/("""
					remote : "Not Available or Wrong Domain"					
				"""),format.raw/*235.5*/("""}"""),format.raw/*235.6*/("""
			"""),format.raw/*236.4*/("""}"""),format.raw/*236.5*/(""",

			errorClass : "help-inline",
			errorElement : "span",
			highlight: function (element) """),format.raw/*240.34*/("""{"""),format.raw/*240.35*/("""
			    $(element).closest('.control-group').removeClass('success').addClass('error');
			"""),format.raw/*242.4*/("""}"""),format.raw/*242.5*/(""",
			success: function(element) """),format.raw/*243.31*/("""{"""),format.raw/*243.32*/("""
			     element
			        .addClass('valid')
			        .closest('.control-group').removeClass('error').addClass('success');
			"""),format.raw/*247.4*/("""}"""),format.raw/*247.5*/("""
		"""),format.raw/*248.3*/("""}"""),format.raw/*248.4*/(""");
		
		
	"""),format.raw/*251.2*/("""}"""),format.raw/*251.3*/(""");
	
</script>

<SCRIPT LANGUAGE="JavaScript">
	function popupWin() """),format.raw/*256.22*/("""{"""),format.raw/*256.23*/("""
		
		isFormValid = $("#createUserForm").valid();
		if(isFormValid)"""),format.raw/*259.18*/("""{"""),format.raw/*259.19*/("""
			localStorage.setItem("notification_mesg", 'Your Registration request is recieved. We are currently reviewing it.');	
		"""),format.raw/*261.3*/("""}"""),format.raw/*261.4*/("""
		return isFormValid;
		
		
	"""),format.raw/*265.2*/("""}"""),format.raw/*265.3*/("""
	
$(document).ready(function()"""),format.raw/*267.29*/("""{"""),format.raw/*267.30*/("""
		jQuery.validator.addMethod("passwordCheck", function(value, element) """),format.raw/*268.72*/("""{"""),format.raw/*268.73*/("""
			var pattern = /^[A-Za-z0-9]*?([A-Za-z][0-9]|[0-9][A-Za-z])[A-Za-z0-9]*$/;
			var pwd = value;
			 if (pattern.test(pwd)) """),format.raw/*271.28*/("""{"""),format.raw/*271.29*/("""
				 return true;
			 """),format.raw/*273.5*/("""}"""),format.raw/*273.6*/("""
			 else
			 """),format.raw/*275.5*/("""{"""),format.raw/*275.6*/("""	 
				 return false;
			 """),format.raw/*277.5*/("""}"""),format.raw/*277.6*/(""" 
		"""),format.raw/*278.3*/("""}"""),format.raw/*278.4*/(""","");
		
"""),format.raw/*280.1*/("""}"""),format.raw/*280.2*/(""");

	

</script>


<style>
body """),format.raw/*288.6*/("""{"""),format.raw/*288.7*/("""
	padding-bottom: 40px;
	color: #5a5a5a;
"""),format.raw/*291.1*/("""}"""),format.raw/*291.2*/("""

h1 """),format.raw/*293.4*/("""{"""),format.raw/*293.5*/("""
	margin: 10px 0;
	font-family: walkaway;
	font-weight: bold;
	line-height: 20px;
	color: black;
	text-rendering: optimizelegibility;
	font-style: italic;
"""),format.raw/*301.1*/("""}"""),format.raw/*301.2*/("""

.copy"""),format.raw/*303.6*/("""{"""),format.raw/*303.7*/("""
padding-left:60px;
color: grey;

"""),format.raw/*307.1*/("""}"""),format.raw/*307.2*/("""

.heading """),format.raw/*309.10*/("""{"""),format.raw/*309.11*/("""
	padding-top: 40px;
"""),format.raw/*311.1*/("""}"""),format.raw/*311.2*/("""

.content """),format.raw/*313.10*/("""{"""),format.raw/*313.11*/("""
	padding-top: 100px;
	border-color: black;
	border-style: solid;
	border-width: 2px;
"""),format.raw/*318.1*/("""}"""),format.raw/*318.2*/("""

/* CUSTOMIZE THE NAVBAR
    -------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper """),format.raw/*324.17*/("""{"""),format.raw/*324.18*/("""
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	z-index: 10;
	margin-top: 20px;
	margin-bottom: -90px;
	/* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
"""),format.raw/*333.1*/("""}"""),format.raw/*333.2*/("""

.navbar-wrapper .navbar """),format.raw/*335.25*/("""{"""),format.raw/*335.26*/("""
	
"""),format.raw/*337.1*/("""}"""),format.raw/*337.2*/("""

/* Remove border and change up box shadow for more contrast */
.navbar .navbar-inner """),format.raw/*340.23*/("""{"""),format.raw/*340.24*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
"""),format.raw/*345.1*/("""}"""),format.raw/*345.2*/("""

#navbar-inner-scroll """),format.raw/*347.22*/("""{"""),format.raw/*347.23*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	position: relative;
	top: 10px;
"""),format.raw/*354.1*/("""}"""),format.raw/*354.2*/("""

/* Downsize the brand/project name a bit */
.navbar .brand """),format.raw/*357.16*/("""{"""),format.raw/*357.17*/("""
	font-size: 20px;
	font-family: apple chancery;
	font-weight: bold;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .5);
	padding: 14px 20px 16px;
"""),format.raw/*363.1*/("""}"""),format.raw/*363.2*/("""

.navbar-inverse .brand,.navbar-inverse .nav>li>a """),format.raw/*365.50*/("""{"""),format.raw/*365.51*/("""
	color: #F87217;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
"""),format.raw/*368.1*/("""}"""),format.raw/*368.2*/("""

/* Navbar links: increase padding for taller navbar */
.navbar .nav>li>a """),format.raw/*371.19*/("""{"""),format.raw/*371.20*/("""
	padding: 15px 20px;
"""),format.raw/*373.1*/("""}"""),format.raw/*373.2*/("""

/* Offset the responsive button for proper vertical alignment */
.navbar .btn-navbar """),format.raw/*376.21*/("""{"""),format.raw/*376.22*/("""
	margin-top: 10px;
"""),format.raw/*378.1*/("""}"""),format.raw/*378.2*/("""

/* MARKETING CONTENT
    -------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .span4 """),format.raw/*384.19*/("""{"""),format.raw/*384.20*/("""
	text-align: center;
"""),format.raw/*386.1*/("""}"""),format.raw/*386.2*/("""

.marketing h2 """),format.raw/*388.15*/("""{"""),format.raw/*388.16*/("""
	font-weight: normal;
	color: #F87217;
"""),format.raw/*391.1*/("""}"""),format.raw/*391.2*/("""

.marketing .span4 p """),format.raw/*393.21*/("""{"""),format.raw/*393.22*/("""
	margin-left: 10px;
	margin-right: 10px;
"""),format.raw/*396.1*/("""}"""),format.raw/*396.2*/("""
</style>
</html>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:48:44 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/login/registration.scala.html
                    HASH: 91fdf2a71bc7c31650249e8536245adc48de32dc
                    MATRIX: 800->0|1003->168|1017->174|1083->219|1200->301|1214->307|1274->346|1359->395|1374->401|1439->444|1510->479|1525->485|1584->522|1656->558|1671->564|1743->614|1909->745|1924->751|1997->815|2037->817|2088->832|2103->838|2143->856|2374->1052|2415->1084|2454->1085|2571->1166|2585->1171|2625->1189|2685->1217|5267->3763|5282->3769|5322->3787|5508->3937|5523->3943|5577->3975|5754->4121|14552->12885|14568->12891|14633->12933|14721->12984|14737->12990|14808->13038|14896->13089|14912->13095|14988->13148|15076->13199|15092->13205|15163->13253|15251->13304|15267->13310|15326->13346|15414->13397|15430->13403|15509->13458|15651->13571|15681->13572|15740->13602|15770->13603|15861->13665|15891->13666|15959->13705|15989->13706|16019->13707|16086->13745|16116->13746|16155->13756|16185->13757|16231->13774|16261->13775|16368->13853|16398->13854|16547->13974|16577->13975|16652->14021|16682->14022|16720->14032|16749->14033|16813->14068|16843->14069|16947->14145|16977->14146|17011->14152|17040->14153|17075->14160|17104->14161|17218->14246|17248->14247|17353->14323|17383->14324|17443->14356|17472->14357|17577->14433|17607->14434|17667->14466|17696->14467|17781->14523|17811->14524|17853->14537|17883->14538|17929->14555|17959->14556|18064->14633|18093->14634|18141->14653|18171->14654|18256->14711|18285->14712|18329->14727|18359->14728|18404->14744|18434->14745|18530->14812|18560->14813|18612->14836|18642->14837|18715->14882|18744->14883|18779->14890|18808->14891|18844->14899|18873->14900|18907->14906|18936->14907|18969->14912|18998->14913|19046->14932|19076->14933|19122->14950|19152->14951|19362->15133|19391->15134|19439->15153|19469->15154|19605->15262|19634->15263|19678->15278|19708->15279|19794->15337|19823->15338|19856->15343|19885->15344|20011->15441|20041->15442|20161->15534|20190->15535|20252->15568|20282->15569|20444->15703|20473->15704|20505->15708|20534->15709|20575->15722|20604->15723|20706->15796|20736->15797|20835->15867|20865->15868|21018->15993|21047->15994|21109->16028|21138->16029|21200->16062|21230->16063|21332->16136|21362->16137|21519->16265|21549->16266|21602->16291|21631->16292|21675->16308|21704->16309|21760->16337|21789->16338|21822->16343|21851->16344|21890->16355|21919->16356|21987->16396|22016->16397|22088->16441|22117->16442|22152->16449|22181->16450|22372->16613|22401->16614|22438->16623|22467->16624|22533->16662|22562->16663|22604->16676|22634->16677|22685->16700|22714->16701|22756->16714|22786->16715|22905->16806|22934->16807|23161->17005|23191->17006|23426->17213|23455->17214|23512->17242|23542->17243|23575->17248|23604->17249|23723->17339|23753->17340|23944->17503|23973->17504|24027->17529|24057->17530|24283->17728|24312->17729|24405->17793|24435->17794|24606->17937|24635->17938|24717->17991|24747->17992|24840->18057|24869->18058|24976->18136|25006->18137|25058->18161|25087->18162|25206->18252|25236->18253|25286->18275|25315->18276|25522->18454|25552->18455|25604->18479|25633->18480|25680->18498|25710->18499|25781->18542|25810->18543|25863->18567|25893->18568|25966->18613|25995->18614
                    LINES: 29->1|35->7|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|61->33|61->33|61->33|63->35|109->81|109->81|109->81|113->85|113->85|113->85|118->90|177->149|177->149|177->149|178->150|178->150|178->150|179->151|179->151|179->151|180->152|180->152|180->152|181->153|181->153|181->153|182->154|182->154|182->154|189->161|189->161|190->162|190->162|192->164|192->164|194->166|194->166|194->166|195->167|195->167|195->167|195->167|195->167|195->167|197->169|197->169|201->173|201->173|203->175|203->175|204->176|204->176|205->177|205->177|208->180|208->180|209->181|209->181|210->182|210->182|215->187|215->187|217->189|217->189|219->191|219->191|221->193|221->193|223->195|223->195|226->198|226->198|227->199|227->199|228->200|228->200|232->204|232->204|233->205|233->205|236->208|236->208|237->209|237->209|238->210|238->210|241->213|241->213|242->214|242->214|244->216|244->216|245->217|245->217|246->218|246->218|247->219|247->219|248->220|248->220|250->222|250->222|251->223|251->223|256->228|256->228|257->229|257->229|260->232|260->232|261->233|261->233|263->235|263->235|264->236|264->236|268->240|268->240|270->242|270->242|271->243|271->243|275->247|275->247|276->248|276->248|279->251|279->251|284->256|284->256|287->259|287->259|289->261|289->261|293->265|293->265|295->267|295->267|296->268|296->268|299->271|299->271|301->273|301->273|303->275|303->275|305->277|305->277|306->278|306->278|308->280|308->280|316->288|316->288|319->291|319->291|321->293|321->293|329->301|329->301|331->303|331->303|335->307|335->307|337->309|337->309|339->311|339->311|341->313|341->313|346->318|346->318|352->324|352->324|361->333|361->333|363->335|363->335|365->337|365->337|368->340|368->340|373->345|373->345|375->347|375->347|382->354|382->354|385->357|385->357|391->363|391->363|393->365|393->365|396->368|396->368|399->371|399->371|401->373|401->373|404->376|404->376|406->378|406->378|412->384|412->384|414->386|414->386|416->388|416->388|419->391|419->391|421->393|421->393|424->396|424->396
                    -- GENERATED --
                */
            