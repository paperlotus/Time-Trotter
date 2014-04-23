
package views.html

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
object home extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""
"""),_display_(Seq[Any](/*2.2*/menuContext(_menuContext,user))),format.raw/*2.32*/("""

<h1 align="center"><i>Welcome</i></h1>

<style>
.textResponse
"""),format.raw/*8.1*/("""{"""),format.raw/*8.2*/("""
width:27% !important;
font-weight: bold;
float:left;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
.dataResponse
"""),format.raw/*14.1*/("""{"""),format.raw/*14.2*/("""
margin-left:19%;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

</style>

<div class="container">
	<div class="well" style="width:53%; margin: 0 auto;">
	"""),_display_(Seq[Any](/*22.3*/helper/*22.9*/.form(routes.Application.changePassword, 'id -> "changePassword")/*22.74*/ {_display_(Seq[Any](format.raw/*22.76*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Salutation</span></h5><input class="dataResponse" type="text" value=""""),_display_(Seq[Any](/*23.163*/user/*23.167*/.salutation)),format.raw/*23.178*/("""" readonly="readonly"></form>
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">First Name</span></h5><input class="dataResponse" type="text" id="firstName" name="firstName" value=""""),_display_(Seq[Any](/*24.195*/user/*24.199*/.firstName.toUpperCase)),format.raw/*24.221*/("""" readonly="readonly"></form>
				"""),_display_(Seq[Any](/*25.6*/if(user.middleName != null)/*25.33*/{_display_(Seq[Any](format.raw/*25.34*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Middle Name</span></h5><input class="dataResponse" type="text" id="middleName" name="middleName" value=""""),_display_(Seq[Any](/*26.198*/user/*26.202*/.middleName.toUpperCase)),format.raw/*26.225*/("""" readonly="readonly"></form>
				""")))})),format.raw/*27.6*/("""
				"""),_display_(Seq[Any](/*28.6*/if(user.lastName != null)/*28.31*/{_display_(Seq[Any](format.raw/*28.32*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Last Name</span></h5><input class="dataResponse" type="text" id="lastName" name="lastName" value=""""),_display_(Seq[Any](/*29.192*/user/*29.196*/.lastName.toUpperCase)),format.raw/*29.217*/("""" readonly="readonly"></form>
				""")))})),format.raw/*30.6*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Email</span></h5><input class="dataResponse"type="text" id="email" name="email" value=""""),_display_(Seq[Any](/*31.181*/user/*31.185*/.email)),format.raw/*31.191*/("""" readonly="readonly"></form>
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Employee Id</span></h5><input class="dataResponse" type="text" id="employeeId" name="employeeId" value=""""),_display_(Seq[Any](/*32.198*/user/*32.202*/.employeeId)),format.raw/*32.213*/("""" readonly="readonly"></form>

				"""),_display_(Seq[Any](/*34.6*/if(user.companyobject != null)/*34.36*/{_display_(Seq[Any](format.raw/*34.37*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Company</span></h5><input class="dataResponse" type="text" value=""""),_display_(Seq[Any](/*35.160*/user/*35.164*/.companyobject.companyName.toUpperCase)),format.raw/*35.202*/("""" readonly="readonly"></form>
				""")))})),format.raw/*36.6*/("""

				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Role</span></h5><input class="dataResponse" type="text" value=""""),_display_(Seq[Any](/*38.157*/user/*38.161*/.designation)),format.raw/*38.173*/("""" readonly="readonly"></form>
				
				"""),_display_(Seq[Any](/*40.6*/if(user.manager != null && user.manager.lastName != null)/*40.63*/{_display_(Seq[Any](format.raw/*40.64*/("""
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Reporting Manager</span></h5><input class="dataResponse" type="text" value=""""),_display_(Seq[Any](/*41.170*/user/*41.174*/.manager.firstName.toUpperCase)),format.raw/*41.204*/(""" """),_display_(Seq[Any](/*41.206*/user/*41.210*/.manager.lastName.toUpperCase)),format.raw/*41.239*/("""" readonly="readonly"></form>
				""")))})),format.raw/*42.6*/("""
				<div class="control-group">
						<div class="controls">
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">New Password</span></h5><input class="dataResponse" type="password" id="password" name="password" placeholder="New Password" required  value=""></form>
				          </div>
			         </div>	
				<form class="form-inline"><h5 align="left" class="textResponse"><span class="text-info">Confirm New Password</span></h5><input class="dataResponse" type="password" id="cpassword" name="cpassword" placeholder="Confirm New Password" required  value=""></form>
				
				<button type="submit" class="btn btn-success" style="margin-left:46%;margin-top:2%;">Submit</button>
			""")))})),format.raw/*51.5*/("""
	</div>
</div>

	<script type="text/javascript" src=""""),_display_(Seq[Any](/*55.39*/routes/*55.45*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*55.93*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*56.16*/routes/*56.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*56.64*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*57.39*/routes/*57.45*/.Assets.at("javascripts/select2.js"))),format.raw/*57.81*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*58.39*/routes/*58.45*/.Assets.at("javascripts/select2_locale_en.js.template"))),format.raw/*58.100*/(""""></script>
	
	
	
		
<script type="text/javascript">
$('#changePasswordDiv').hide();
$('#changePasswordClick').hide();
	$(document).ready(function() """),format.raw/*66.31*/("""{"""),format.raw/*66.32*/("""
		$("#changePassword").validate("""),format.raw/*67.33*/("""{"""),format.raw/*67.34*/("""
			rules : """),format.raw/*68.12*/("""{"""),format.raw/*68.13*/("""
				password : """),format.raw/*69.16*/("""{"""),format.raw/*69.17*/("""
					required : true,
					passwordCheck : true,
					minlength : 6
				"""),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""",
				cpassword : """),format.raw/*74.17*/("""{"""),format.raw/*74.18*/("""
					required : true,
					equalTo : "#password"
				"""),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""",
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/(""",
		messages : """),format.raw/*79.14*/("""{"""),format.raw/*79.15*/("""
			password : """),format.raw/*80.15*/("""{"""),format.raw/*80.16*/("""
				required : "Enter your password",
				passwordCheck : "Password must contain atleast one A-Z and 0-9",
				minlength : "Password must be minimum 6 characters"
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/(""",
			cpassword : """),format.raw/*85.16*/("""{"""),format.raw/*85.17*/("""
				required : "Enter confirm password",
				equalTo : "Password and Confirm Password must match"
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/(""",
		"""),format.raw/*89.3*/("""}"""),format.raw/*89.4*/(""",

		errorClass : "help-inline",
		errorElement : "span",
		highlight: function (element) """),format.raw/*93.33*/("""{"""),format.raw/*93.34*/("""
		    $(element).closest('.control-group').removeClass('success').addClass('error');
		"""),format.raw/*95.3*/("""}"""),format.raw/*95.4*/(""",
		success: function(element) """),format.raw/*96.30*/("""{"""),format.raw/*96.31*/("""
		     element
		        .addClass('valid')
		        .closest('.control-group').removeClass('error').addClass('success');
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/("""
		"""),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""");
		
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/(""");
	
	$('#changePasswordButton').click(function() """),format.raw/*105.46*/("""{"""),format.raw/*105.47*/("""
		$('#changePasswordDiv').show();
		$('#changePasswordClick').show();
	"""),format.raw/*108.2*/("""}"""),format.raw/*108.3*/(""");
	$('#changePasswordClick').click(function() """),format.raw/*109.45*/("""{"""),format.raw/*109.46*/("""
		$('#changePasswordDiv').hide();
		$('#changePasswordClick').hide();
	"""),format.raw/*112.2*/("""}"""),format.raw/*112.3*/(""");
	
$(document).ready(function()"""),format.raw/*114.29*/("""{"""),format.raw/*114.30*/("""
		jQuery.validator.addMethod("passwordCheck", function(value, element) """),format.raw/*115.72*/("""{"""),format.raw/*115.73*/("""
			var pattern = /^[A-Za-z0-9]*?([A-Za-z][0-9]|[0-9][A-Za-z])[A-Za-z0-9]*$/;
			var pwd = value;
			 if (pattern.test(pwd)) """),format.raw/*118.28*/("""{"""),format.raw/*118.29*/("""
				 return true;
			 """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
			 else
			 """),format.raw/*122.5*/("""{"""),format.raw/*122.6*/("""	 
				 return false;
			 """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/(""" 
		"""),format.raw/*125.3*/("""}"""),format.raw/*125.4*/(""","");
		
"""),format.raw/*127.1*/("""}"""),format.raw/*127.2*/(""");	
</script>	




"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (_menuContext,user) => apply(_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/home.scala.html
                    HASH: 2a9eccc6f4171698d38968f3874a7e7e43a08f86
                    MATRIX: 744->1|872->52|909->55|960->85|1056->155|1083->156|1168->214|1196->215|1240->232|1268->233|1315->253|1343->254|1477->353|1491->359|1565->424|1605->426|1806->590|1820->594|1854->605|2116->830|2130->834|2175->856|2246->892|2282->919|2321->920|2557->1119|2571->1123|2617->1146|2684->1182|2726->1189|2760->1214|2799->1215|3029->1408|3043->1412|3087->1433|3154->1469|3373->1651|3387->1655|3416->1661|3681->1889|3695->1893|3729->1904|3802->1942|3841->1972|3880->1973|4078->2134|4092->2138|4153->2176|4220->2212|4417->2372|4431->2376|4466->2388|4543->2430|4609->2487|4648->2488|4856->2659|4870->2663|4923->2693|4962->2695|4976->2699|5028->2728|5095->2764|5858->3496|5953->3555|5968->3561|6038->3609|6102->3637|6117->3643|6181->3685|6268->3736|6283->3742|6341->3778|6428->3829|6443->3835|6521->3890|6706->4047|6735->4048|6797->4082|6826->4083|6867->4096|6896->4097|6941->4114|6970->4115|7074->4192|7102->4193|7149->4212|7178->4213|7262->4270|7290->4271|7322->4276|7350->4277|7394->4293|7423->4294|7467->4310|7496->4311|7694->4482|7722->4483|7768->4501|7797->4502|7929->4607|7957->4608|7989->4613|8017->4614|8139->4708|8168->4709|8285->4799|8313->4800|8373->4832|8402->4833|8560->4963|8589->4964|8621->4968|8650->4969|8687->4978|8716->4979|8797->5031|8827->5032|8930->5107|8959->5108|9036->5156|9066->5157|9169->5232|9198->5233|9262->5268|9292->5269|9394->5342|9424->5343|9581->5471|9611->5472|9664->5497|9693->5498|9737->5514|9766->5515|9822->5543|9851->5544|9884->5549|9913->5550|9952->5561|9981->5562
                    LINES: 26->1|29->1|30->2|30->2|36->8|36->8|40->12|40->12|42->14|42->14|44->16|44->16|50->22|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|79->51|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|94->66|94->66|95->67|95->67|96->68|96->68|97->69|97->69|101->73|101->73|102->74|102->74|105->77|105->77|106->78|106->78|107->79|107->79|108->80|108->80|112->84|112->84|113->85|113->85|116->88|116->88|117->89|117->89|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|131->103|131->103|133->105|133->105|136->108|136->108|137->109|137->109|140->112|140->112|142->114|142->114|143->115|143->115|146->118|146->118|148->120|148->120|150->122|150->122|152->124|152->124|153->125|153->125|155->127|155->127
                    -- GENERATED --
                */
            