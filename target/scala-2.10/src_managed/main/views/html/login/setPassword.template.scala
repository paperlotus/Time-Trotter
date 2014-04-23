
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
object setPassword extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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


	<script type="text/javascript" src=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*16.93*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*17.16*/routes/*17.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*17.64*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*18.93*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*19.39*/routes/*19.45*/.Assets.at("javascripts/select2.js"))),format.raw/*19.81*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.39*/routes/*20.45*/.Assets.at("javascripts/select2_locale_en.js.template"))),format.raw/*20.100*/(""""></script>

<body>

	<div class="container">
		<legend></legend>
		
		<div class="container">
		<div class="heading">
				"""),_display_(Seq[Any](/*29.6*/helper/*29.12*/.form(routes.Application.changePassword, 'id -> "changePassword")/*29.77*/ {_display_(Seq[Any](format.raw/*29.79*/("""
            <a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Application.index)),format.raw/*30.47*/("""">
                <h1 style="color:#f4995d;">Time Trotter</h1></a>
			<legend></legend>
			<br>
			<br>
			<br>
			<div class="row">
						<div class="well" style=" width:45% ">
				<h4>Please Set a New Password</h4>		
				<div class="control-group">
							<div class="controls">
						<p>
			                <input type="password" id="oldpassword" name="oldpassword" placeholder="Current Password" required  value="">
			            </p>
			           </div>
			        </div>    
			           <div class="control-group">
							<div class="controls">
			                <input type="password" id="password" name="password" placeholder="Password" required  value="">
			            </div>
			           </div> 
			            <p>
			                <input type="password" id="cpassword" name="cpassword" placeholder="Confirm Password" required  value="">
			            </p>
			            <button type="submit" class="btn btn-success">Set Password</button>
				""")))})),format.raw/*55.6*/("""
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
		
<script type="text/javascript">
	$(document).ready(function() """),format.raw/*64.31*/("""{"""),format.raw/*64.32*/("""
		$("#changePassword").validate("""),format.raw/*65.33*/("""{"""),format.raw/*65.34*/("""
			rules : """),format.raw/*66.12*/("""{"""),format.raw/*66.13*/("""
				password : """),format.raw/*67.16*/("""{"""),format.raw/*67.17*/("""
					required : true,
					passwordCheck : true,
					minlength : 6
				"""),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""",
				cpassword : """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
					required : true,
					equalTo : "#password"
				"""),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""",
				oldpassword : """),format.raw/*76.19*/("""{"""),format.raw/*76.20*/("""
					remote : """),format.raw/*77.15*/("""{"""),format.raw/*77.16*/("""
						url:"/checkOldPassword",
						type : "post",
						data : """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
							q : function()"""),format.raw/*81.22*/("""{"""),format.raw/*81.23*/("""
								return $("#oldpassword").val(); 
						 """),format.raw/*83.8*/("""}"""),format.raw/*83.9*/("""
					"""),format.raw/*84.6*/("""}"""),format.raw/*84.7*/("""
				  """),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""
				"""),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/(""",
		messages : """),format.raw/*88.14*/("""{"""),format.raw/*88.15*/("""
			password : """),format.raw/*89.15*/("""{"""),format.raw/*89.16*/("""
				required : "Enter your password",
				passwordCheck : "Password must contain atleast one A-Z and 0-9",
				minlength : "Password must be minimum 6 characters"
			"""),format.raw/*93.4*/("""}"""),format.raw/*93.5*/(""",
			cpassword : """),format.raw/*94.16*/("""{"""),format.raw/*94.17*/("""
				required : "Enter confirm password",
				equalTo : "Password and Confirm Password must match"
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/(""",
			oldpassword : """),format.raw/*98.18*/("""{"""),format.raw/*98.19*/("""
				remote : "Enter correct password"					
			"""),format.raw/*100.4*/("""}"""),format.raw/*100.5*/("""
		"""),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""",

		errorClass : "help-inline",
		errorElement : "span",
		highlight: function (element) """),format.raw/*105.33*/("""{"""),format.raw/*105.34*/("""
		    $(element).closest('.control-group').removeClass('success').addClass('error');
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""",
		success: function(element) """),format.raw/*108.30*/("""{"""),format.raw/*108.31*/("""
		     element
		        .addClass('valid')
		        .closest('.control-group').removeClass('error').addClass('success');
		"""),format.raw/*112.3*/("""}"""),format.raw/*112.4*/("""
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/(""");
		
	"""),format.raw/*115.2*/("""}"""),format.raw/*115.3*/(""");
</script>

<script>
$(document).ready(function()"""),format.raw/*119.29*/("""{"""),format.raw/*119.30*/("""
	jQuery.validator.addMethod("passwordCheck", function(value, element) """),format.raw/*120.71*/("""{"""),format.raw/*120.72*/("""
		var pattern = /^[A-Za-z0-9]*?([A-Za-z][0-9]|[0-9][A-Za-z])[A-Za-z0-9]*$/;
		var pwd = value;
		 if (pattern.test(pwd)) """),format.raw/*123.27*/("""{"""),format.raw/*123.28*/("""
			 return true;
		 """),format.raw/*125.4*/("""}"""),format.raw/*125.5*/("""
		 else
		 """),format.raw/*127.4*/("""{"""),format.raw/*127.5*/("""	 
			 return false;
		 """),format.raw/*129.4*/("""}"""),format.raw/*129.5*/(""" 
		"""),format.raw/*130.3*/("""}"""),format.raw/*130.4*/(""","");
	
"""),format.raw/*132.1*/("""}"""),format.raw/*132.2*/(""");

</script>	

<style>
body """),format.raw/*137.6*/("""{"""),format.raw/*137.7*/("""
	padding-bottom: 40px;
	color: #5a5a5a;
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/("""

h1 """),format.raw/*142.4*/("""{"""),format.raw/*142.5*/("""
	margin: 10px 0;
	font-family: walkaway;
	font-weight: bold;
	line-height: 20px;
	color: black;
	text-rendering: optimizelegibility;
	font-style: italic;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""

.copy"""),format.raw/*152.6*/("""{"""),format.raw/*152.7*/("""
padding-left:60px;
color: grey;

"""),format.raw/*156.1*/("""}"""),format.raw/*156.2*/("""

.heading """),format.raw/*158.10*/("""{"""),format.raw/*158.11*/("""
	padding-top: 40px;
"""),format.raw/*160.1*/("""}"""),format.raw/*160.2*/("""

.content """),format.raw/*162.10*/("""{"""),format.raw/*162.11*/("""
	padding-top: 100px;
	border-color: black;
	border-style: solid;
	border-width: 2px;
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""

/* CUSTOMIZE THE NAVBAR
    -------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper """),format.raw/*173.17*/("""{"""),format.raw/*173.18*/("""
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	z-index: 10;
	margin-top: 20px;
	margin-bottom: -90px;
	/* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/("""

.navbar-wrapper .navbar """),format.raw/*184.25*/("""{"""),format.raw/*184.26*/("""
	
"""),format.raw/*186.1*/("""}"""),format.raw/*186.2*/("""

/* Remove border and change up box shadow for more contrast */
.navbar .navbar-inner """),format.raw/*189.23*/("""{"""),format.raw/*189.24*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
"""),format.raw/*194.1*/("""}"""),format.raw/*194.2*/("""

#navbar-inner-scroll """),format.raw/*196.22*/("""{"""),format.raw/*196.23*/("""
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	position: relative;
	top: 10px;
"""),format.raw/*203.1*/("""}"""),format.raw/*203.2*/("""

/* Downsize the brand/project name a bit */
.navbar .brand """),format.raw/*206.16*/("""{"""),format.raw/*206.17*/("""
	font-size: 20px;
	font-family: apple chancery;
	font-weight: bold;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .5);
	padding: 14px 20px 16px;
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""

.navbar-inverse .brand,.navbar-inverse .nav>li>a """),format.raw/*214.50*/("""{"""),format.raw/*214.51*/("""
	color: #F87217;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/("""

/* Navbar links: increase padding for taller navbar */
.navbar .nav>li>a """),format.raw/*220.19*/("""{"""),format.raw/*220.20*/("""
	padding: 15px 20px;
"""),format.raw/*222.1*/("""}"""),format.raw/*222.2*/("""

/* Offset the responsive button for proper vertical alignment */
.navbar .btn-navbar """),format.raw/*225.21*/("""{"""),format.raw/*225.22*/("""
	margin-top: 10px;
"""),format.raw/*227.1*/("""}"""),format.raw/*227.2*/("""

/* MARKETING CONTENT
    -------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .span4 """),format.raw/*233.19*/("""{"""),format.raw/*233.20*/("""
	text-align: center;
"""),format.raw/*235.1*/("""}"""),format.raw/*235.2*/("""

.marketing h2 """),format.raw/*237.15*/("""{"""),format.raw/*237.16*/("""
	font-weight: normal;
	color: #F87217;
"""),format.raw/*240.1*/("""}"""),format.raw/*240.2*/("""

.marketing .span4 p """),format.raw/*242.21*/("""{"""),format.raw/*242.22*/("""
	margin-left: 10px;
	margin-right: 10px;
"""),format.raw/*245.1*/("""}"""),format.raw/*245.2*/("""
</style>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:48:44 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/login/setPassword.scala.html
                    HASH: e2cdf3d1f8329adbe42854dd6548324c0adc7c14
                    MATRIX: 799->0|1002->168|1016->174|1082->219|1199->301|1213->307|1273->346|1358->395|1373->401|1438->444|1509->479|1524->485|1583->522|1655->558|1670->564|1742->614|1833->669|1848->675|1918->723|1982->751|1997->757|2061->799|2148->850|2163->856|2233->904|2320->955|2335->961|2393->997|2480->1048|2495->1054|2573->1109|2741->1242|2756->1248|2830->1313|2870->1315|2930->1339|2945->1345|2985->1363|4008->2355|4169->2488|4198->2489|4260->2523|4289->2524|4330->2537|4359->2538|4404->2555|4433->2556|4537->2633|4565->2634|4612->2653|4641->2654|4725->2711|4753->2712|4802->2733|4831->2734|4875->2750|4904->2751|5001->2820|5030->2821|5081->2844|5110->2845|5188->2896|5216->2897|5250->2904|5278->2905|5313->2913|5341->2914|5374->2920|5402->2921|5433->2925|5461->2926|5505->2942|5534->2943|5578->2959|5607->2960|5805->3131|5833->3132|5879->3150|5908->3151|6040->3256|6068->3257|6116->3277|6145->3278|6222->3327|6251->3328|6283->3332|6312->3333|6435->3427|6465->3428|6583->3518|6612->3519|6673->3551|6703->3552|6861->3682|6890->3683|6922->3687|6951->3688|6988->3697|7017->3698|7101->3753|7131->3754|7232->3826|7262->3827|7416->3952|7446->3953|7497->3976|7526->3977|7568->3991|7597->3992|7651->4018|7680->4019|7713->4024|7742->4025|7780->4035|7809->4036|7871->4070|7900->4071|7972->4115|8001->4116|8036->4123|8065->4124|8256->4287|8285->4288|8322->4297|8351->4298|8417->4336|8446->4337|8488->4350|8518->4351|8569->4374|8598->4375|8640->4388|8670->4389|8789->4480|8818->4481|9045->4679|9075->4680|9310->4887|9339->4888|9396->4916|9426->4917|9459->4922|9488->4923|9607->5013|9637->5014|9828->5177|9857->5178|9911->5203|9941->5204|10167->5402|10196->5403|10289->5467|10319->5468|10490->5611|10519->5612|10601->5665|10631->5666|10724->5731|10753->5732|10860->5810|10890->5811|10942->5835|10971->5836|11090->5926|11120->5927|11170->5949|11199->5950|11406->6128|11436->6129|11488->6153|11517->6154|11564->6172|11594->6173|11665->6216|11694->6217|11747->6241|11777->6242|11850->6287|11879->6288
                    LINES: 29->1|35->7|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|57->29|57->29|57->29|57->29|58->30|58->30|58->30|83->55|92->64|92->64|93->65|93->65|94->66|94->66|95->67|95->67|99->71|99->71|100->72|100->72|103->75|103->75|104->76|104->76|105->77|105->77|108->80|108->80|109->81|109->81|111->83|111->83|112->84|112->84|113->85|113->85|114->86|114->86|115->87|115->87|116->88|116->88|117->89|117->89|121->93|121->93|122->94|122->94|125->97|125->97|126->98|126->98|128->100|128->100|129->101|129->101|133->105|133->105|135->107|135->107|136->108|136->108|140->112|140->112|141->113|141->113|143->115|143->115|147->119|147->119|148->120|148->120|151->123|151->123|153->125|153->125|155->127|155->127|157->129|157->129|158->130|158->130|160->132|160->132|165->137|165->137|168->140|168->140|170->142|170->142|178->150|178->150|180->152|180->152|184->156|184->156|186->158|186->158|188->160|188->160|190->162|190->162|195->167|195->167|201->173|201->173|210->182|210->182|212->184|212->184|214->186|214->186|217->189|217->189|222->194|222->194|224->196|224->196|231->203|231->203|234->206|234->206|240->212|240->212|242->214|242->214|245->217|245->217|248->220|248->220|250->222|250->222|253->225|253->225|255->227|255->227|261->233|261->233|263->235|263->235|265->237|265->237|268->240|268->240|270->242|270->242|273->245|273->245
                    -- GENERATED --
                */
            