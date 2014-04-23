
package views.html.forgotpassword

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
object displaypassword extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(display:models.user.User):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Welcome to Timesheet")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
	<div class="container">
		<div class="heading">
		
		"""),_display_(Seq[Any](/*8.4*/helper/*8.10*/.form(routes.Application.login)/*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""
				
					<br>
					<br>
					<br>
					<fieldset id="login_field" class="right-align" style="width:35%;margin-top:70px;">
					
				
								<div class="well" style="width:100%;">
									<h3>Please Check your Inbox for your User Name and Password</h3>
									
			        			    <p>
			           				 	<button type="submit" class="btn btn-success" style="margin-left:185px;">Go To Login</button>
			           			   </p>
		       			  	 </div>
			</fieldset>
			""")))})),format.raw/*24.5*/("""
		</div>
	</div>	
""")))})),format.raw/*27.2*/("""		"""))}
    }
    
    def render(display:models.user.User): play.api.templates.Html = apply(display)
    
    def f:((models.user.User) => play.api.templates.Html) = (display) => apply(display)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/forgotpassword/displaypassword.scala.html
                    HASH: 6c6b85cbf090b4b1e89c266d1d3aba315f0cd0c3
                    MATRIX: 758->1|878->27|906->47|943->50|979->78|1018->80|1112->140|1126->146|1165->177|1203->178|1719->663|1773->686
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|36->8|36->8|36->8|36->8|52->24|55->27
                    -- GENERATED --
                */
            