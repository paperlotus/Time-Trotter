
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""
<!DOCTYPE html>
<html>
<head>
<title>Time Trotter</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<script src=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.66*/(""""type="text/javascript"></script>

<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.91*/("""">
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*11.31*/routes/*11.37*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*11.87*/("""">
<link rel="stylesheet"  type="text/css" media="all" href=""""),_display_(Seq[Any](/*12.60*/routes/*12.66*/.Assets.at("stylesheets/jquery.pnotify.default.css"))),format.raw/*12.118*/("""" />
<link rel="stylesheet"  type="text/css" media="all" href=""""),_display_(Seq[Any](/*13.60*/routes/*13.66*/.Assets.at("stylesheets/jquery.pnotify.default.icons.css"))),format.raw/*13.124*/("""" />
  <script src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("javascripts/jquery.pnotify.js"))),format.raw/*14.66*/("""" type="text/javascript"></script> 
</head>
<body>

	<div class="container">
		<div class="heading">
			"""),_display_(Seq[Any](/*20.5*/helper/*20.11*/.form(routes.Application.authenticate)/*20.49*/ {_display_(Seq[Any](format.raw/*20.51*/("""
			<a href=""""),_display_(Seq[Any](/*21.14*/routes/*21.20*/.Application.index)),format.raw/*21.38*/("""">
 			<h1 style="color:#f4995d;">Time Trotter</h1></a>
<!-- 			<div class="copy">A product by Orlov Trotter LLC</div> -->
			<legend></legend>
			<br>
			<br>
			<br>
				<h3 style="font-color:#fff;">Time sheets that don't suck!!</h3>
				<br>
				<br>
				
	            """),_display_(Seq[Any](/*32.15*/if(flash.contains("error"))/*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""
	                <p class="error" style="color:red;">
	                    """),_display_(Seq[Any](/*34.23*/flash/*34.28*/.get("error"))),format.raw/*34.41*/("""
	                </p>
	            """)))})),format.raw/*36.15*/("""
	            
	            """),_display_(Seq[Any](/*38.15*/if(flash.contains("success"))/*38.44*/ {_display_(Seq[Any](format.raw/*38.46*/("""
	                <p class="success">
	                    """),_display_(Seq[Any](/*40.23*/flash/*40.28*/.get("success"))),format.raw/*40.43*/("""
	                </p>
	            """)))})),format.raw/*42.15*/("""
	            """),_display_(Seq[Any](/*43.15*/if(flash.contains("registered"))/*43.47*/{_display_(Seq[Any](format.raw/*43.48*/("""
						<p class="registered" class="serif" style="color:#00ff00;">
						      <b>"""),_display_(Seq[Any](/*45.17*/flash/*45.22*/.get("registered"))),format.raw/*45.40*/("""</b>
						</p>
				""")))})),format.raw/*47.6*/("""
	            <fieldset id="login_field">
					<div class="well" style="width:400px;">
						<p>
			                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*51.81*/form("email")/*51.94*/.value)),format.raw/*51.100*/("""" rel="popover" data-content="What's your Email Address?">
			            </p>
			            <p>
			                <input type="password" name="password" placeholder="Password" rel="popover" data-content="What's your password on Time Trotter?">
			            </p>
			            <p>
			                <button type="submit" class="btn btn-success">Login</button>
			            </p>
		          </div>
		         </fieldset>
       	
			""")))})),format.raw/*62.5*/("""
		</div>
		<div class="forgotPass">
			<a href=""""),_display_(Seq[Any](/*65.14*/routes/*65.20*/.Application.forgotpassword)),format.raw/*65.47*/("""">Forgot Password?</a> 
		</div>
		<div class="registration">
			<h2>Don't have an account yet?
           		<a href=""""),_display_(Seq[Any](/*69.24*/routes/*69.30*/.Application.registration)),format.raw/*69.55*/("""" class="btn btn-large btn-warning">Register Now</a>
           	</h2>
		</div>
		
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
	<script src=""""),_display_(Seq[Any](/*128.16*/routes/*128.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*128.64*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*129.16*/routes/*129.22*/.Assets.at("javascripts/jqBootstrapValidation.js"))),format.raw/*129.72*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*130.39*/routes/*130.45*/.Assets.at("javascripts/jquery.validate.js"))),format.raw/*130.89*/(""""></script>
	
</body>
<script type="text/javascript">
$('#login_field input').on('mouseenter',function() """),format.raw/*134.52*/("""{"""),format.raw/*134.53*/("""
	$(this).popover('show')
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/(""");
$('#login_field input').on('mouseleave',function() """),format.raw/*137.52*/("""{"""),format.raw/*137.53*/("""
	$(this).popover('hide')
"""),format.raw/*139.1*/("""}"""),format.raw/*139.2*/(""");
//$.pnotify.defaults.history = false;
//alert(localStorage.getItem("notification_mesg"));
$(document).ready(function()"""),format.raw/*142.29*/("""{"""),format.raw/*142.30*/("""
	if(localStorage.getItem("notification_mesg"))"""),format.raw/*143.47*/("""{"""),format.raw/*143.48*/("""
		
		$.pnotify("""),format.raw/*145.13*/("""{"""),format.raw/*145.14*/("""
			history:false,
	        
	        text: localStorage.getItem("notification_mesg")
	    """),format.raw/*149.6*/("""}"""),format.raw/*149.7*/(""");
		localStorage.removeItem("notification_mesg")
	"""),format.raw/*151.2*/("""}"""),format.raw/*151.3*/("""
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/(""");
</script>


<style>
body """),format.raw/*157.6*/("""{"""),format.raw/*157.7*/("""
	padding-bottom: 40px;
	color: #5a5a5a;
"""),format.raw/*160.1*/("""}"""),format.raw/*160.2*/("""

h1 """),format.raw/*162.4*/("""{"""),format.raw/*162.5*/("""
	margin: 10px 0;
	font-family: walkaway;
	font-weight: bold;
	line-height: 20px;
	color: #fff;
	text-rendering: optimizelegibility;
	font-style: italic;
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/("""

h2"""),format.raw/*172.3*/("""{"""),format.raw/*172.4*/("""
    color:#fff;
"""),format.raw/*174.1*/("""}"""),format.raw/*174.2*/("""

.copy"""),format.raw/*176.6*/("""{"""),format.raw/*176.7*/("""
padding-left:60px;
color: #fff;

"""),format.raw/*180.1*/("""}"""),format.raw/*180.2*/("""

.heading """),format.raw/*182.10*/("""{"""),format.raw/*182.11*/("""
	padding-top: 40px;
"""),format.raw/*184.1*/("""}"""),format.raw/*184.2*/("""

.content """),format.raw/*186.10*/("""{"""),format.raw/*186.11*/("""
	padding-top: 100px;
	border-color: black;
	border-style: solid;
	border-width: 2px;
"""),format.raw/*191.1*/("""}"""),format.raw/*191.2*/("""

/* CUSTOMIZE THE NAVBAR
    -------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper """),format.raw/*197.17*/("""{"""),format.raw/*197.18*/("""
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	z-index: 10;
	margin-top: 20px;
	margin-bottom: -90px;
	/* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
"""),format.raw/*206.1*/("""}"""),format.raw/*206.2*/("""

.navbar-wrapper .navbar """),format.raw/*208.25*/("""{"""),format.raw/*208.26*/("""
	
"""),format.raw/*210.1*/("""}"""),format.raw/*210.2*/("""

/* Remove border and change up box shadow for more contrast */
.navbar .navbar-inner """),format.raw/*213.23*/("""{"""),format.raw/*213.24*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
"""),format.raw/*218.1*/("""}"""),format.raw/*218.2*/("""

#navbar-inner-scroll """),format.raw/*220.22*/("""{"""),format.raw/*220.23*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	position: relative;
	top: 10px;
"""),format.raw/*227.1*/("""}"""),format.raw/*227.2*/("""

/* Downsize the brand/project name a bit */
.navbar .brand """),format.raw/*230.16*/("""{"""),format.raw/*230.17*/("""
	font-size: 20px;
	font-family: apple chancery;
	font-weight: bold;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .5);
	padding: 14px 20px 16px;
"""),format.raw/*236.1*/("""}"""),format.raw/*236.2*/("""

.navbar-inverse .brand,.navbar-inverse .nav>li>a """),format.raw/*238.50*/("""{"""),format.raw/*238.51*/("""
	color: #F87217;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
"""),format.raw/*241.1*/("""}"""),format.raw/*241.2*/("""

/* Navbar links: increase padding for taller navbar */
.navbar .nav>li>a """),format.raw/*244.19*/("""{"""),format.raw/*244.20*/("""
	padding: 15px 20px;
"""),format.raw/*246.1*/("""}"""),format.raw/*246.2*/("""

/* Offset the responsive button for proper vertical alignment */
.navbar .btn-navbar """),format.raw/*249.21*/("""{"""),format.raw/*249.22*/("""
	margin-top: 10px;
"""),format.raw/*251.1*/("""}"""),format.raw/*251.2*/("""

/* MARKETING CONTENT
    -------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .span4 """),format.raw/*257.19*/("""{"""),format.raw/*257.20*/("""
	text-align: center;
"""),format.raw/*259.1*/("""}"""),format.raw/*259.2*/("""

.marketing h2 """),format.raw/*261.15*/("""{"""),format.raw/*261.16*/("""
	font-weight: normal;
	color: #F87217;
"""),format.raw/*264.1*/("""}"""),format.raw/*264.2*/("""

.marketing .span4 p """),format.raw/*266.21*/("""{"""),format.raw/*266.22*/("""
	margin-left: 10px;
	margin-right: 10px;
"""),format.raw/*269.1*/("""}"""),format.raw/*269.2*/("""
</style>
</html>

"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.Html = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:58:32 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/login/login.scala.html
                    HASH: 264213604b97fe5539139c1c0569ef77dcf236c3
                    MATRIX: 746->1|854->32|1059->202|1073->208|1139->253|1257->335|1272->341|1333->380|1403->414|1418->420|1490->470|1589->533|1604->539|1679->591|1780->656|1795->662|1876->720|1934->742|1949->748|2014->791|2160->902|2175->908|2222->946|2262->948|2313->963|2328->969|2368->987|2688->1271|2724->1298|2764->1300|2879->1379|2893->1384|2928->1397|2999->1436|3066->1467|3104->1496|3144->1498|3242->1560|3256->1565|3293->1580|3364->1619|3416->1635|3457->1667|3496->1668|3617->1753|3631->1758|3671->1776|3725->1799|3942->1980|3964->1993|3993->1999|4476->2451|4565->2504|4580->2510|4629->2537|4788->2660|4803->2666|4850->2691|13701->11508|13717->11514|13782->11556|13847->11584|13863->11590|13936->11640|14024->11691|14040->11697|14107->11741|14245->11850|14275->11851|14331->11879|14360->11880|14444->11935|14474->11936|14530->11964|14559->11965|14712->12089|14742->12090|14819->12138|14849->12139|14896->12157|14926->12158|15049->12253|15078->12254|15159->12307|15188->12308|15218->12310|15247->12311|15308->12344|15337->12345|15409->12389|15438->12390|15473->12397|15502->12398|15692->12560|15721->12561|15755->12567|15784->12568|15831->12587|15860->12588|15897->12597|15926->12598|15992->12636|16021->12637|16063->12650|16093->12651|16144->12674|16173->12675|16215->12688|16245->12689|16364->12780|16393->12781|16620->12979|16650->12980|16885->13187|16914->13188|16971->13216|17001->13217|17034->13222|17063->13223|17182->13313|17212->13314|17403->13477|17432->13478|17486->13503|17516->13504|17742->13702|17771->13703|17864->13767|17894->13768|18065->13911|18094->13912|18176->13965|18206->13966|18299->14031|18328->14032|18435->14110|18465->14111|18517->14135|18546->14136|18665->14226|18695->14227|18745->14249|18774->14250|18981->14428|19011->14429|19063->14453|19092->14454|19139->14472|19169->14473|19240->14516|19269->14517|19322->14541|19352->14542|19425->14587|19454->14588
                    LINES: 26->1|29->1|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|48->20|48->20|48->20|48->20|49->21|49->21|49->21|60->32|60->32|60->32|62->34|62->34|62->34|64->36|66->38|66->38|66->38|68->40|68->40|68->40|70->42|71->43|71->43|71->43|73->45|73->45|73->45|75->47|79->51|79->51|79->51|90->62|93->65|93->65|93->65|97->69|97->69|97->69|156->128|156->128|156->128|157->129|157->129|157->129|158->130|158->130|158->130|162->134|162->134|164->136|164->136|165->137|165->137|167->139|167->139|170->142|170->142|171->143|171->143|173->145|173->145|177->149|177->149|179->151|179->151|180->152|180->152|185->157|185->157|188->160|188->160|190->162|190->162|198->170|198->170|200->172|200->172|202->174|202->174|204->176|204->176|208->180|208->180|210->182|210->182|212->184|212->184|214->186|214->186|219->191|219->191|225->197|225->197|234->206|234->206|236->208|236->208|238->210|238->210|241->213|241->213|246->218|246->218|248->220|248->220|255->227|255->227|258->230|258->230|264->236|264->236|266->238|266->238|269->241|269->241|272->244|272->244|274->246|274->246|277->249|277->249|279->251|279->251|285->257|285->257|287->259|287->259|289->261|289->261|292->264|292->264|294->266|294->266|297->269|297->269
                    -- GENERATED --
                */
            