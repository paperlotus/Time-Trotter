
package views.html.report

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
object viewUserDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[utils.UserDetails],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userDetails : List[utils.UserDetails]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*5.1*/("""
<style>
	#custom-modal-container"""),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
		width: 700px !important;
		left: 45% !important;
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""

	.formClass"""),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
		padding: 0 30px 40px;
	"""),format.raw/*14.2*/("""}"""),format.raw/*14.3*/("""
	
	.modal-footer"""),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""
		padding: 15px 15px 5px !important;
		text-align: left;
		background-color: none !important;
		margin-top: 15px;
	"""),format.raw/*21.2*/("""}"""),format.raw/*21.3*/("""
	
	table"""),format.raw/*23.7*/("""{"""),format.raw/*23.8*/("""
		width: 100%;
		text-align: center;
		margin-top: 15px;
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/("""
	
	table tr th"""),format.raw/*29.13*/("""{"""),format.raw/*29.14*/("""
		padding: 5px 0 5px;
		border-bottom: 1px solid #333;
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/("""
	
	table tr td"""),format.raw/*34.13*/("""{"""),format.raw/*34.14*/("""
		padding: 5px 0;
		border-bottom: 1px solid #d5d5d5;
		border-left: 1px solid #d5d5d5;
		border-right: 1px solid #d5d5d5;
	"""),format.raw/*39.2*/("""}"""),format.raw/*39.3*/("""
	
	.modal-header .close"""),format.raw/*41.22*/("""{"""),format.raw/*41.23*/("""
		margin-right: -25px;
	"""),format.raw/*43.2*/("""}"""),format.raw/*43.3*/("""
	
</style>

<div class="formClass">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<h4>Project Details</h4>
	</div>

	<div class="modal-body">
	<table>
		<tr>
			<th>Employee</th>
			<th>HRS Spent</th>
			<th>Money Billed</th>
		</tr>
		"""),_display_(Seq[Any](/*60.4*/userDetails/*60.15*/.map/*60.19*/ { user =>_display_(Seq[Any](format.raw/*60.29*/("""	
			<tr>
				<td>"""),_display_(Seq[Any](/*62.10*/user/*62.14*/.empName)),format.raw/*62.22*/("""</td>
				<td>"""),_display_(Seq[Any](/*63.10*/user/*63.14*/.hrsSpent)),format.raw/*63.23*/("""</td>
				<td>"""),_display_(Seq[Any](/*64.10*/user/*64.14*/.moneyBilled)),format.raw/*64.26*/("""</td>
			</tr>
		""")))})),format.raw/*66.4*/("""	
	</table>
	</div>
</div>	"""))}
    }
    
    def render(userDetails:List[utils.UserDetails]): play.api.templates.Html = apply(userDetails)
    
    def f:((List[utils.UserDetails]) => play.api.templates.Html) = (userDetails) => apply(userDetails)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/report/viewUserDetails.scala.html
                    HASH: cb8eb1af08c5b23279c65d39600127e1fdfb54a6
                    MATRIX: 757->1|925->40|955->97|1017->132|1045->133|1128->189|1156->190|1199->205|1228->206|1283->234|1311->235|1358->254|1387->255|1535->376|1563->377|1601->388|1629->389|1719->452|1747->453|1792->470|1821->471|1908->531|1936->532|1981->549|2010->550|2167->680|2195->681|2249->707|2278->708|2332->735|2360->736|2710->1051|2730->1062|2743->1066|2791->1076|2848->1097|2861->1101|2891->1109|2943->1125|2956->1129|2987->1138|3039->1154|3052->1158|3086->1170|3137->1190
                    LINES: 26->1|32->1|34->5|36->7|36->7|39->10|39->10|41->12|41->12|43->14|43->14|45->16|45->16|50->21|50->21|52->23|52->23|56->27|56->27|58->29|58->29|61->32|61->32|63->34|63->34|68->39|68->39|70->41|70->41|72->43|72->43|89->60|89->60|89->60|89->60|91->62|91->62|91->62|92->63|92->63|92->63|93->64|93->64|93->64|95->66
                    -- GENERATED --
                */
            