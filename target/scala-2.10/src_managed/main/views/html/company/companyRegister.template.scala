
package views.html.company

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
object companyRegister extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Time Trotter</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src=""""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*6.66*/("""" type="text/javascript"></script>
<!-- Bootstrap -->
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.95*/("""">
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*10.87*/("""">
 <link rel="stylesheet"  type="text/css" media="all" href=""""),_display_(Seq[Any](/*11.61*/routes/*11.67*/.Assets.at("stylesheets/jquery.pnotify.default.css"))),format.raw/*11.119*/("""" />
  <script src=""""),_display_(Seq[Any](/*12.17*/routes/*12.23*/.Assets.at("javascripts/jquery.pnotify.min.js"))),format.raw/*12.70*/("""" type="text/javascript"></script>       
</head>

<body>

		<div class="container">
		<div class="heading">
			"""),_display_(Seq[Any](/*19.5*/helper/*19.11*/.form(routes.Application.companycreateAccount, 'id -> "registerCompanyForm")/*19.87*/{_display_(Seq[Any](format.raw/*19.88*/("""
            <a href=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Application.index)),format.raw/*20.47*/("""">
                <h1 style="color:#f4995d;">Time Trotter</h1></a>
							<legend></legend>
									<br>
									<br>
									<br>
										<div class="row">
											<div class="span5">
												<fieldset id="companyRegisterHere">
												"""),_display_(Seq[Any](/*29.14*/if(flash.contains("registered"))/*29.46*/{_display_(Seq[Any](format.raw/*29.47*/("""
														<p class="registered" class="serif" style="color:red;">
													     <b>"""),_display_(Seq[Any](/*31.23*/flash/*31.28*/.get("registered"))),format.raw/*31.46*/("""</b>
														</p>
													""")))})),format.raw/*33.15*/("""
													<div class="well">
														<div class="control-group">
											            	<div class="controls">
											                <input type="text" id="companyName" name="companyName" placeholder="Company Name" required rel="popover" data-content="Enter Your Company Name" >
											            	</div>
											            </div>
											            
											            <div class="control-group">
															<div class="controls">
											                <input type="email" id="companyEmail" name="companyEmail" placeholder="Company Email" required value="" rel="popover" data-content="Enter Your Company E-Mail Address" >
															</div>
														</div>
											            
											            <p>
											                <input type="text" id="companyPhone" name="companyPhone" placeholder="Company Phone Number" required value="" rel="popover" data-content="Enter Company Contact Number" >
											            </p>
											            
											            <p>
											            	<textarea type="text" id="address" name="address" placeholder="Address" rel="popover" data-content="Enter Address for Contact (Min 15 Characters)" ></textarea>
											            </p>
											            
											            
											            <p>
											            	<button type="submit" onClick="popupWin()" class="btn btn-success">Register</button>
											            	<a href=""""),_display_(Seq[Any](/*58.35*/routes/*58.41*/.Application.registration)),format.raw/*58.66*/("""" class="btn btn-warning">Back</a>
											            </p>
										            
											    """)))})),format.raw/*61.17*/("""
								          </div>
								  </fieldset>
				    	     </div>
					  </div>
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

	<script src=""""),_display_(Seq[Any](/*125.16*/routes/*125.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*125.64*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*126.39*/routes/*126.45*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*126.93*/(""""></script>

</body>

<script type="text/javascript">
	$(document).ready(function() """),format.raw/*131.31*/("""{"""),format.raw/*131.32*/("""
		// Popover  show
		$('#companyRegisterHere input').on('mouseenter',function() """),format.raw/*133.62*/("""{"""),format.raw/*133.63*/("""
			$(this).popover('show')
		"""),format.raw/*135.3*/("""}"""),format.raw/*135.4*/(""");
		//Popover hide
		$('#companyRegisterHere input').on('mouseleave',function() """),format.raw/*137.62*/("""{"""),format.raw/*137.63*/("""
			$(this).popover('hide')
		"""),format.raw/*139.3*/("""}"""),format.raw/*139.4*/(""");
		
		//on key-press of company code check whether company code is present or not
		
		/* $("#companyCode").keyup(function()"""),format.raw/*143.40*/("""{"""),format.raw/*143.41*/("""
			var q = $("#companyCode").val();
			$.ajax ("""),format.raw/*145.12*/("""{"""),format.raw/*145.13*/("""
				type : "POST",
				url:"/checkCompanyCode",
				data : """),format.raw/*148.12*/("""{"""),format.raw/*148.13*/("""q : q"""),format.raw/*148.18*/("""}"""),format.raw/*148.19*/(""",
				success : function(response)"""),format.raw/*149.33*/("""{"""),format.raw/*149.34*/("""
					if(response===true)"""),format.raw/*150.25*/("""{"""),format.raw/*150.26*/("""
						alert("true");
					"""),format.raw/*152.6*/("""}"""),format.raw/*152.7*/("""				
					else"""),format.raw/*153.10*/("""{"""),format.raw/*153.11*/("""
						alert("false");
					"""),format.raw/*155.6*/("""}"""),format.raw/*155.7*/("""
				"""),format.raw/*156.5*/("""}"""),format.raw/*156.6*/("""
			"""),format.raw/*157.4*/("""}"""),format.raw/*157.5*/(""") 
		"""),format.raw/*158.3*/("""}"""),format.raw/*158.4*/(""") */
		
		$('#registerCompanyForm').validate("""),format.raw/*160.38*/("""{"""),format.raw/*160.39*/("""
			rules : """),format.raw/*161.12*/("""{"""),format.raw/*161.13*/("""
				companyCode : """),format.raw/*162.19*/("""{"""),format.raw/*162.20*/("""
					remote : """),format.raw/*163.15*/("""{"""),format.raw/*163.16*/("""
						url:"/checkCompanyCode",
						type : "post",
						data : """),format.raw/*166.14*/("""{"""),format.raw/*166.15*/("""
							q : function()"""),format.raw/*167.22*/("""{"""),format.raw/*167.23*/("""
								return $("#companyCode").val(); 
						 """),format.raw/*169.8*/("""}"""),format.raw/*169.9*/("""
					"""),format.raw/*170.6*/("""}"""),format.raw/*170.7*/("""
				"""),format.raw/*171.5*/("""}"""),format.raw/*171.6*/("""
		      """),format.raw/*172.9*/("""}"""),format.raw/*172.10*/(""",
		      companyName : """),format.raw/*173.23*/("""{"""),format.raw/*173.24*/("""
					remote : """),format.raw/*174.15*/("""{"""),format.raw/*174.16*/("""
						url:"/checkCompanyName",
						type : "post",
						data : """),format.raw/*177.14*/("""{"""),format.raw/*177.15*/("""
							q : function()"""),format.raw/*178.22*/("""{"""),format.raw/*178.23*/("""
								return $("#companyName").val(); 
						 """),format.raw/*180.8*/("""}"""),format.raw/*180.9*/("""
					"""),format.raw/*181.6*/("""}"""),format.raw/*181.7*/("""
				"""),format.raw/*182.5*/("""}"""),format.raw/*182.6*/("""
		      """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""",
		      companyEmail : """),format.raw/*184.24*/("""{"""),format.raw/*184.25*/("""
					remote : """),format.raw/*185.15*/("""{"""),format.raw/*185.16*/("""
						url:"/checkCompanyEmail",
						type : "post",
						data : """),format.raw/*188.14*/("""{"""),format.raw/*188.15*/("""
							q : function()"""),format.raw/*189.22*/("""{"""),format.raw/*189.23*/("""
								return $("#companyEmail").val(); 
						 """),format.raw/*191.8*/("""}"""),format.raw/*191.9*/("""
					"""),format.raw/*192.6*/("""}"""),format.raw/*192.7*/("""
				  """),format.raw/*193.7*/("""}"""),format.raw/*193.8*/("""
				"""),format.raw/*194.5*/("""}"""),format.raw/*194.6*/(""",
				address : """),format.raw/*195.15*/("""{"""),format.raw/*195.16*/("""
					required : true,
					minlength : 15
				"""),format.raw/*198.5*/("""}"""),format.raw/*198.6*/("""
	    	"""),format.raw/*199.7*/("""}"""),format.raw/*199.8*/(""",
			messages: """),format.raw/*200.14*/("""{"""),format.raw/*200.15*/("""
				companyCode : """),format.raw/*201.19*/("""{"""),format.raw/*201.20*/("""
					remote : "Already Taken"
				"""),format.raw/*203.5*/("""}"""),format.raw/*203.6*/(""",
				companyName : """),format.raw/*204.19*/("""{"""),format.raw/*204.20*/("""
					remote : "Already Taken"
				"""),format.raw/*206.5*/("""}"""),format.raw/*206.6*/(""",
				companyEmail : """),format.raw/*207.20*/("""{"""),format.raw/*207.21*/("""
					remote : "Not Available"					
				"""),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""",
				address : """),format.raw/*210.15*/("""{"""),format.raw/*210.16*/("""
					minlength : "Address must be minimum 15 characters"
				"""),format.raw/*212.5*/("""}"""),format.raw/*212.6*/(""",
			"""),format.raw/*213.4*/("""}"""),format.raw/*213.5*/(""",
			errorClass : "help-inline",
			errorElement : "span",
			highlight: function (element) """),format.raw/*216.34*/("""{"""),format.raw/*216.35*/("""
			    $(element).closest('.control-group').removeClass('success').addClass('error');
			"""),format.raw/*218.4*/("""}"""),format.raw/*218.5*/(""",
			
			success: function(element) """),format.raw/*220.31*/("""{"""),format.raw/*220.32*/("""
			     element
			        .addClass('valid')
			        .closest('.control-group').removeClass('error').addClass('success');
			"""),format.raw/*224.4*/("""}"""),format.raw/*224.5*/("""
		"""),format.raw/*225.3*/("""}"""),format.raw/*225.4*/(""")
	"""),format.raw/*226.2*/("""}"""),format.raw/*226.3*/(""");
	
</script>

<SCRIPT LANGUAGE="JavaScript">
	function popupWin() """),format.raw/*231.22*/("""{"""),format.raw/*231.23*/("""
		
		isFormValid = $("#registerCompanyForm").valid();
		if(isFormValid)"""),format.raw/*234.18*/("""{"""),format.raw/*234.19*/("""
			localStorage.setItem("notification_mesg", 'Your Registration request is recieved. We are currently reviewing it.');	
		"""),format.raw/*236.3*/("""}"""),format.raw/*236.4*/("""
		return isFormValid;
		
		
	"""),format.raw/*240.2*/("""}"""),format.raw/*240.3*/("""
	

</script>

<style>
body """),format.raw/*246.6*/("""{"""),format.raw/*246.7*/("""
	padding-bottom: 40px;
	color: #5a5a5a;
"""),format.raw/*249.1*/("""}"""),format.raw/*249.2*/("""

h1 """),format.raw/*251.4*/("""{"""),format.raw/*251.5*/("""
	margin: 10px 0;
	font-family: walkaway;
	font-weight: bold;
	line-height: 20px;
	color: black;
	text-rendering: optimizelegibility;
	font-style: italic;
"""),format.raw/*259.1*/("""}"""),format.raw/*259.2*/("""

.copy"""),format.raw/*261.6*/("""{"""),format.raw/*261.7*/("""
padding-left:60px;
color: grey;

"""),format.raw/*265.1*/("""}"""),format.raw/*265.2*/("""

.heading """),format.raw/*267.10*/("""{"""),format.raw/*267.11*/("""
	padding-top: 40px;
"""),format.raw/*269.1*/("""}"""),format.raw/*269.2*/("""

.content """),format.raw/*271.10*/("""{"""),format.raw/*271.11*/("""
	padding-top: 100px;
	border-color: black;
	border-style: solid;
	border-width: 2px;
"""),format.raw/*276.1*/("""}"""),format.raw/*276.2*/("""

/* CUSTOMIZE THE NAVBAR
    -------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper """),format.raw/*282.17*/("""{"""),format.raw/*282.18*/("""
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	z-index: 10;
	margin-top: 20px;
	margin-bottom: -90px;
	/* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
"""),format.raw/*291.1*/("""}"""),format.raw/*291.2*/("""

.navbar-wrapper .navbar """),format.raw/*293.25*/("""{"""),format.raw/*293.26*/("""
	
"""),format.raw/*295.1*/("""}"""),format.raw/*295.2*/("""

/* Remove border and change up box shadow for more contrast */
.navbar .navbar-inner """),format.raw/*298.23*/("""{"""),format.raw/*298.24*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
"""),format.raw/*303.1*/("""}"""),format.raw/*303.2*/("""

#navbar-inner-scroll """),format.raw/*305.22*/("""{"""),format.raw/*305.23*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	position: relative;
	top: 10px;
"""),format.raw/*312.1*/("""}"""),format.raw/*312.2*/("""

/* Downsize the brand/project name a bit */
.navbar .brand """),format.raw/*315.16*/("""{"""),format.raw/*315.17*/("""
	font-size: 20px;
	font-family: apple chancery;
	font-weight: bold;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .5);
	padding: 14px 20px 16px;
"""),format.raw/*321.1*/("""}"""),format.raw/*321.2*/("""

.navbar-inverse .brand,.navbar-inverse .nav>li>a """),format.raw/*323.50*/("""{"""),format.raw/*323.51*/("""
	color: #F87217;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
"""),format.raw/*326.1*/("""}"""),format.raw/*326.2*/("""

/* Navbar links: increase padding for taller navbar */
.navbar .nav>li>a """),format.raw/*329.19*/("""{"""),format.raw/*329.20*/("""
	padding: 15px 20px;
"""),format.raw/*331.1*/("""}"""),format.raw/*331.2*/("""

/* Offset the responsive button for proper vertical alignment */
.navbar .btn-navbar """),format.raw/*334.21*/("""{"""),format.raw/*334.22*/("""
	margin-top: 10px;
"""),format.raw/*336.1*/("""}"""),format.raw/*336.2*/("""

/* MARKETING CONTENT
    -------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .span4 """),format.raw/*342.19*/("""{"""),format.raw/*342.20*/("""
	text-align: center;
"""),format.raw/*344.1*/("""}"""),format.raw/*344.2*/("""

.marketing h2 """),format.raw/*346.15*/("""{"""),format.raw/*346.16*/("""
	font-weight: normal;
	color: #F87217;
"""),format.raw/*349.1*/("""}"""),format.raw/*349.2*/("""

.marketing .span4 p """),format.raw/*351.21*/("""{"""),format.raw/*351.22*/("""
	margin-left: 10px;
	margin-right: 10px;
"""),format.raw/*354.1*/("""}"""),format.raw/*354.2*/("""
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
                    DATE: Tue Apr 22 22:49:30 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/company/companyRegister.scala.html
                    HASH: 1784bc57b7bba4d2a4bcb44d81ee8ed44aa7e5cc
                    MATRIX: 805->0|988->148|1002->154|1068->199|1204->300|1218->306|1278->345|1362->394|1376->400|1440->443|1510->477|1525->483|1597->533|1697->597|1712->603|1787->655|1845->677|1860->683|1929->730|2084->850|2099->856|2184->932|2223->933|2283->957|2298->963|2338->981|2638->1245|2679->1277|2718->1278|2849->1373|2863->1378|2903->1396|2975->1436|4501->2926|4516->2932|4563->2957|4700->3062|13588->11916|13604->11922|13669->11964|13757->12015|13773->12021|13844->12069|13962->12158|13992->12159|14104->12242|14134->12243|14194->12275|14223->12276|14335->12359|14365->12360|14425->12392|14454->12393|14613->12523|14643->12524|14722->12574|14752->12575|14844->12638|14874->12639|14908->12644|14938->12645|15002->12680|15032->12681|15087->12707|15117->12708|15174->12737|15203->12738|15247->12753|15277->12754|15335->12784|15364->12785|15398->12791|15427->12792|15460->12797|15489->12798|15523->12804|15552->12805|15628->12852|15658->12853|15700->12866|15730->12867|15779->12887|15809->12888|15854->12904|15884->12905|15982->12974|16012->12975|16064->12998|16094->12999|16173->13050|16202->13051|16237->13058|16266->13059|16300->13065|16329->13066|16367->13076|16397->13077|16451->13102|16481->13103|16526->13119|16556->13120|16654->13189|16684->13190|16736->13213|16766->13214|16845->13265|16874->13266|16909->13273|16938->13274|16972->13280|17001->13281|17039->13291|17069->13292|17124->13318|17154->13319|17199->13335|17229->13336|17328->13406|17358->13407|17410->13430|17440->13431|17520->13483|17549->13484|17584->13491|17613->13492|17649->13500|17678->13501|17712->13507|17741->13508|17787->13525|17817->13526|17895->13576|17924->13577|17960->13585|17989->13586|18034->13602|18064->13603|18113->13623|18143->13624|18208->13661|18237->13662|18287->13683|18317->13684|18382->13721|18411->13722|18462->13744|18492->13745|18562->13787|18591->13788|18637->13805|18667->13806|18759->13870|18788->13871|18822->13877|18851->13878|18975->13973|19005->13974|19125->14066|19154->14067|19221->14105|19251->14106|19413->14240|19442->14241|19474->14245|19503->14246|19535->14250|19564->14251|19666->14324|19696->14325|19800->14400|19830->14401|19983->14526|20012->14527|20074->14561|20103->14562|20165->14596|20194->14597|20266->14641|20295->14642|20330->14649|20359->14650|20550->14813|20579->14814|20616->14823|20645->14824|20711->14862|20740->14863|20782->14876|20812->14877|20863->14900|20892->14901|20934->14914|20964->14915|21083->15006|21112->15007|21339->15205|21369->15206|21604->15413|21633->15414|21690->15442|21720->15443|21753->15448|21782->15449|21901->15539|21931->15540|22122->15703|22151->15704|22205->15729|22235->15730|22461->15928|22490->15929|22583->15993|22613->15994|22784->16137|22813->16138|22895->16191|22925->16192|23018->16257|23047->16258|23154->16336|23184->16337|23236->16361|23265->16362|23384->16452|23414->16453|23464->16475|23493->16476|23700->16654|23730->16655|23782->16679|23811->16680|23858->16698|23888->16699|23959->16742|23988->16743|24041->16767|24071->16768|24144->16813|24173->16814
                    LINES: 29->1|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|47->19|47->19|47->19|47->19|48->20|48->20|48->20|57->29|57->29|57->29|59->31|59->31|59->31|61->33|86->58|86->58|86->58|89->61|153->125|153->125|153->125|154->126|154->126|154->126|159->131|159->131|161->133|161->133|163->135|163->135|165->137|165->137|167->139|167->139|171->143|171->143|173->145|173->145|176->148|176->148|176->148|176->148|177->149|177->149|178->150|178->150|180->152|180->152|181->153|181->153|183->155|183->155|184->156|184->156|185->157|185->157|186->158|186->158|188->160|188->160|189->161|189->161|190->162|190->162|191->163|191->163|194->166|194->166|195->167|195->167|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|201->173|201->173|202->174|202->174|205->177|205->177|206->178|206->178|208->180|208->180|209->181|209->181|210->182|210->182|211->183|211->183|212->184|212->184|213->185|213->185|216->188|216->188|217->189|217->189|219->191|219->191|220->192|220->192|221->193|221->193|222->194|222->194|223->195|223->195|226->198|226->198|227->199|227->199|228->200|228->200|229->201|229->201|231->203|231->203|232->204|232->204|234->206|234->206|235->207|235->207|237->209|237->209|238->210|238->210|240->212|240->212|241->213|241->213|244->216|244->216|246->218|246->218|248->220|248->220|252->224|252->224|253->225|253->225|254->226|254->226|259->231|259->231|262->234|262->234|264->236|264->236|268->240|268->240|274->246|274->246|277->249|277->249|279->251|279->251|287->259|287->259|289->261|289->261|293->265|293->265|295->267|295->267|297->269|297->269|299->271|299->271|304->276|304->276|310->282|310->282|319->291|319->291|321->293|321->293|323->295|323->295|326->298|326->298|331->303|331->303|333->305|333->305|340->312|340->312|343->315|343->315|349->321|349->321|351->323|351->323|354->326|354->326|357->329|357->329|359->331|359->331|362->334|362->334|364->336|364->336|370->342|370->342|372->344|372->344|374->346|374->346|377->349|377->349|379->351|379->351|382->354|382->354
                    -- GENERATED --
                */
            