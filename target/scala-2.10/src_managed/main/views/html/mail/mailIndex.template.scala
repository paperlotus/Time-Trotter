
package views.html.mail

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
object mailIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[dto.MenuBar,models.user.User,Form[models.mail.MailSetting],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User, mailForm : Form[models.mail.MailSetting]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.95*/("""
"""),format.raw/*4.1*/("""	

<style>
	.mailDiv"""),format.raw/*7.10*/("""{"""),format.raw/*7.11*/("""
		width: 25%;
		float: left;
		padding: 20px 40px;
		margin-top :5%;
	"""),format.raw/*12.2*/("""}"""),format.raw/*12.3*/("""
	
	.mailDiv input
	"""),format.raw/*15.2*/("""{"""),format.raw/*15.3*/("""
		padding: 5% !important;
		margin-bottom : 10% !important;
	"""),format.raw/*18.2*/("""}"""),format.raw/*18.3*/("""
</style>


"""),_display_(Seq[Any](/*22.2*/main("Welcome to Mail Setting")/*22.33*/ {_display_(Seq[Any](format.raw/*22.35*/("""
"""),_display_(Seq[Any](/*23.2*/menuContext(_menuContext,user))),format.raw/*23.32*/("""
  <h3><b><i>Mail Settings</i></b></h3>
		"""),_display_(Seq[Any](/*25.4*/helper/*25.10*/.form(routes.Mail.settingSave, 'id -> "emailSettings")/*25.64*/ {_display_(Seq[Any](format.raw/*25.66*/("""
				<div class="mailDiv">
							"""),_display_(Seq[Any](/*27.9*/inputText(
								mailForm("hostName"),
								args = '_label -> "Host Name",
								'id -> "hostName",
								'placeholder -> "Host Name",
								'required -> true
							))),format.raw/*33.9*/("""
							"""),_display_(Seq[Any](/*34.9*/inputText(
								mailForm("portNumber"),
								args = '_label -> "Port Number",
								'id -> "portNumber",
								'placeholder -> "Port Number",
								'required -> true
							))),format.raw/*40.9*/("""
				</div>
				
				<div class="mailDiv">	
							"""),_display_(Seq[Any](/*44.9*/inputText(
								mailForm("userName"),
								args = '_label -> "User Name",
								'id -> "userName",
								'placeholder -> "User Name",
								'type -> "email",
								'required -> true
							))),format.raw/*51.9*/("""
							"""),_display_(Seq[Any](/*52.9*/inputText(
								mailForm("password"),
								args = '_label -> "Password",
								'id -> "password",
								'placeholder -> "Password",
								'type -> "password",
								'required -> true
							))),format.raw/*59.9*/("""
				</div>
				
				<div class="mailDiv">	
							"""),_display_(Seq[Any](/*63.9*/checkbox(
								mailForm("sslPort"),
								args = '_label -> "SSL",
								'id -> "ssl",
								'placeholder -> "SSL"
							))),format.raw/*68.9*/("""
							"""),_display_(Seq[Any](/*69.9*/checkbox(
								mailForm("tlsPort"),
								args = '_label -> "TLS",
								'id -> "tls",
								'placeholder -> "TLS"
							))),format.raw/*74.9*/("""
				</div>
				<div style="margin-right: 27%;">
					<button type="submit" id="updateButton" style="margin-left: 5%;" class="btn btn-success">Submit</button>
					<a href=""""),_display_(Seq[Any](/*78.16*/routes/*78.22*/.Application.index)),format.raw/*78.40*/("""" style="margin-left: 1.5%;" class="btn btn-info">Back</a>
					
				</div>
		""")))})),format.raw/*81.4*/("""
""")))})),format.raw/*82.2*/("""
"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User,mailForm:Form[models.mail.MailSetting]): play.api.templates.Html = apply(_menuContext,user,mailForm)
    
    def f:((dto.MenuBar,models.user.User,Form[models.mail.MailSetting]) => play.api.templates.Html) = (_menuContext,user,mailForm) => apply(_menuContext,user,mailForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/mail/mailIndex.scala.html
                    HASH: d09c37e7e20e81b04c1d2bd375ab5d2a0ebe9890
                    MATRIX: 784->1|1007->94|1035->150|1085->173|1113->174|1216->250|1244->251|1294->274|1322->275|1414->340|1442->341|1494->358|1534->389|1574->391|1612->394|1664->424|1744->469|1759->475|1822->529|1862->531|1934->568|2139->752|2184->762|2397->954|2488->1010|2720->1221|2765->1231|2998->1443|3089->1499|3247->1636|3292->1646|3450->1783|3664->1961|3679->1967|3719->1985|3832->2067|3866->2070
                    LINES: 26->1|32->1|33->4|36->7|36->7|41->12|41->12|44->15|44->15|47->18|47->18|51->22|51->22|51->22|52->23|52->23|54->25|54->25|54->25|54->25|56->27|62->33|63->34|69->40|73->44|80->51|81->52|88->59|92->63|97->68|98->69|103->74|107->78|107->78|107->78|110->81|111->82
                    -- GENERATED --
                */
            