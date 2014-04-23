
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
object emailvalidate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Welcome to Timesheet")/*1.30*/ {_display_(Seq[Any](format.raw/*1.32*/("""
	<div class="container">
		<div class="heading">
		
			
			"""),_display_(Seq[Any](/*6.5*/helper/*6.11*/.form(routes.Application.finduser)/*6.45*/{_display_(Seq[Any](format.raw/*6.46*/("""	
					<br>
					<br>
					<br>
					"""),_display_(Seq[Any](/*10.7*/if(flash.contains("success"))/*10.36*/{_display_(Seq[Any](format.raw/*10.37*/("""
	                <p class="success" style="color:red;">
	                    """),_display_(Seq[Any](/*12.23*/flash/*12.28*/.get("success"))),format.raw/*12.43*/("""
	                </p>
	            	""")))})),format.raw/*14.16*/("""
	            	"""),_display_(Seq[Any](/*15.16*/if(flash.contains("fail"))/*15.42*/{_display_(Seq[Any](format.raw/*15.43*/("""
	                <p class="fail" style="color:red;">
	                    """),_display_(Seq[Any](/*17.23*/flash/*17.28*/.get("fail"))),format.raw/*17.40*/("""
	                </p>
	            	""")))})),format.raw/*19.16*/("""
								<fieldset id="registerHere">
									<div class="well" style="width: 60%;">
										<p>
						                <input type="email" id="inputemail" name="inputemail" placeholder="Email"  >
						            	</p>
						            	<p>
						            	<button  type="submit" class="btn btn-info" >Submit</button>
						            	<a href=""""),_display_(Seq[Any](/*27.30*/routes/*27.36*/.Application.login)),format.raw/*27.54*/("""" class="btn btn-warning">Back</a>
						            	</p>
						            </div>
						       </fieldset>
						""")))})),format.raw/*31.8*/("""
			</div>
		</div>
""")))})),format.raw/*34.2*/("""


		<script src="http://code.jquery.com/jquery.js"></script>
		<script src=""""),_display_(Seq[Any](/*38.17*/routes/*38.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*38.65*/(""""></script>


</html>

"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/forgotpassword/emailvalidate.scala.html
                    HASH: 295933a09d33b53e5c0e16bef14a9d9d37e7f3f4
                    MATRIX: 819->1|855->29|894->31|994->97|1008->103|1050->137|1088->138|1165->180|1203->209|1242->210|1359->291|1373->296|1410->311|1482->351|1535->368|1570->394|1609->395|1723->473|1737->478|1771->490|1843->530|2242->893|2257->899|2297->917|2448->1037|2503->1061|2621->1143|2636->1149|2700->1191
                    LINES: 29->1|29->1|29->1|34->6|34->6|34->6|34->6|38->10|38->10|38->10|40->12|40->12|40->12|42->14|43->15|43->15|43->15|45->17|45->17|45->17|47->19|55->27|55->27|55->27|59->31|62->34|66->38|66->38|66->38
                    -- GENERATED --
                */
            