
package views.html.notification

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
object notificationIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[dto.MenuBar,models.user.User,Form[org.codehaus.jackson.JsonNode],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User , notifyForm : Form[org.codehaus.jackson.JsonNode]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.104*/("""
"""),format.raw/*4.1*/("""


"""),_display_(Seq[Any](/*7.2*/main("Welcome to Timesheet Notification Setting")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""


"""),_display_(Seq[Any](/*10.2*/menuContext(_menuContext,user))),format.raw/*10.32*/("""
  <h3><b><i>TimeSheet Notification</i></b></h3>
  		"""),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(routes.Notifications.save, 'id -> "notificationSettings")/*12.75*/ {_display_(Seq[Any](format.raw/*12.77*/("""
			"""),_display_(Seq[Any](/*13.5*/for(_node<-notifyForm.get.iterator) yield /*13.40*/{_display_(Seq[Any](format.raw/*13.41*/("""
			<div class="container">
				<div class="row-fluid">
				<div class="span2">
					<input type="checkbox" name="d[]" """),_display_(Seq[Any](/*17.41*/(_node.get("f").getTextValue))),format.raw/*17.70*/(""" class="input-medium"> """),_display_(Seq[Any](/*17.94*/_node/*17.99*/.get("d").getTextValue)),format.raw/*17.121*/("""
				</div>
				
				"""),_display_(Seq[Any](/*20.6*/if(!_node.get("f").getTextValue.equals("checked"))/*20.56*/{_display_(Seq[Any](format.raw/*20.57*/("""
					<div class="span1 ">
						<input type="number" name="h[]" min="0" max="23" style="height:23px;width:50px" placeholder="hr" maxlength="2">
					</div>
					<div class="span2 ">
						<input type="number" name="m[]" min="0" max="59" style="height:23px;width:50px" placeholder="min" maxlength="2">
					</div>
				""")))}/*27.6*/else/*27.10*/{_display_(Seq[Any](format.raw/*27.11*/("""
					<div class="span1">
						<input type="number" name="h[]" min="0" max="23" value='"""),_display_(Seq[Any](/*29.64*/(_node.get("h").getIntValue))),format.raw/*29.92*/("""' placeholder="hr" maxlength="2" style="height:23px;width:50px">
					</div>
					<div class="span2">
						<input type="number" name="m[]" min="0" max="59" value='"""),_display_(Seq[Any](/*32.64*/(_node.get("m").getIntValue))),format.raw/*32.92*/("""' placeholder="min" maxlength="2" style="height:23px;;width:50px"">
					</div>
				""")))})),format.raw/*34.6*/("""
				<div class="span7"></div>
			</div>	
			</div>	
			""")))})),format.raw/*38.5*/("""
			
			<input type="submit" name="Submit" class="btn">
		""")))})),format.raw/*41.4*/("""  	
					
 """)))})),format.raw/*43.3*/("""
  
  """))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User,notifyForm:Form[org.codehaus.jackson.JsonNode]): play.api.templates.Html = apply(_menuContext,user,notifyForm)
    
    def f:((dto.MenuBar,models.user.User,Form[org.codehaus.jackson.JsonNode]) => play.api.templates.Html) = (_menuContext,user,notifyForm) => apply(_menuContext,user,notifyForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/notification/notificationIndex.scala.html
                    HASH: d5b886ebf55f75404f502ef0d87e5fe12d8ffbe9
                    MATRIX: 806->1|1039->103|1067->159|1108->166|1165->215|1204->217|1246->224|1298->254|1389->310|1404->316|1476->379|1516->381|1557->387|1608->422|1647->423|1807->547|1858->576|1918->600|1932->605|1977->627|2037->652|2096->702|2135->703|2479->1029|2492->1033|2531->1034|2658->1125|2708->1153|2912->1321|2962->1349|3080->1436|3172->1497|3265->1559|3310->1573
                    LINES: 26->1|32->1|33->4|36->7|36->7|36->7|39->10|39->10|41->12|41->12|41->12|41->12|42->13|42->13|42->13|46->17|46->17|46->17|46->17|46->17|49->20|49->20|49->20|56->27|56->27|56->27|58->29|58->29|61->32|61->32|63->34|67->38|70->41|72->43
                    -- GENERATED --
                */
            