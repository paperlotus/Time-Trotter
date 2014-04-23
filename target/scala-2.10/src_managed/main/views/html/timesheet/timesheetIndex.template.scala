
package views.html.timesheet

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
object timesheetIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[dto.MenuBar,models.user.User,Form[models.timesheet.Timesheet],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User, timesheetForm : Form[models.timesheet.Timesheet]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.103*/(""" 

"""),format.raw/*5.1*/("""	
"""),_display_(Seq[Any](/*6.2*/main("Welcome to Timesheet")/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
	
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("customCSS/customTimesheet.css"))),format.raw/*8.96*/("""">
	<script src=""""),_display_(Seq[Any](/*9.16*/routes/*9.22*/.Assets.at("customScripts/timesheet.js"))),format.raw/*9.62*/("""" type="text/javascript"></script>
	
	"""),_display_(Seq[Any](/*11.3*/menuContext(_menuContext,user))),format.raw/*11.33*/("""
	
	"""),_display_(Seq[Any](/*13.3*/helper/*13.9*/.form(action = routes.Timesheets.create, 'id -> "createTimesheet", 'enctype -> "multipart/form-data")/*13.110*/ {_display_(Seq[Any](format.raw/*13.112*/("""
		<div class="tsMainDiv">
			<div class="timesheetInfoDiv">
				<div id="empInfo">
					<!-- <h5 id="selectedWeekRange"></h5> -->
					<h5>Employee Name : """),_display_(Seq[Any](/*18.27*/user/*18.31*/.firstName)),format.raw/*18.41*/(""" """),_display_(Seq[Any](/*18.43*/user/*18.47*/.lastName)),format.raw/*18.56*/("""</h5>
					<h6>Employee ID : """),_display_(Seq[Any](/*19.25*/user/*19.29*/.employeeId)),format.raw/*19.40*/("""</h6>
				    <input type="hidden" id="employeeID" value=""""),_display_(Seq[Any](/*20.54*/user/*20.58*/.id)),format.raw/*20.61*/("""">
				</div>
				<div id="weekInfo">
				 	<div class="right_section">
					 	<!-- <div class="button-toggle">
						 	<a class="button button-toggle-arrow jump-one-week-back" id="previousWeek" title="Previous Week">
						 		<span class="ss-icon"><img src="/assets/images/previous_arrow.png" /></span>
						 	</a>
						 	<a class="button thisWeekButton" title="This Week" id="thisWeek">This Week</a>
							<a class="button button-toggle-arrow jump-one-week-forward" id="nextWeek" title="Next Week">				 
								<span class="ss-icon"><img src="/assets/images/next_arrow.png" /></span>
						 	</a>
						</div> -->
										 
							<input class="week-picker" type="text" value="" readonly>
							<!-- <span class="button button-toggle-arrow jump-one-week-back" title="Select Week">
								<i class="icon-calendar"></i>
							</span> -->
							<input type="button" style="display: none;" id="getEmployeeTimesheet" value="Go" class="btn">
					</div>
					
					<input type="button" style="display: none;" value="Go" class="goButton btn">
					"""),_display_(Seq[Any](/*42.7*/inputText(
						timesheetForm("weekOfYear"),
						args = '_label -> "",
						'type -> "hidden",
						'id -> "weekValue"
					))),format.raw/*47.7*/("""
					"""),_display_(Seq[Any](/*48.7*/inputText(
						timesheetForm("year"),
						args = '_label -> "",
						'type -> "hidden",
						'id -> "yearValue"
					))),format.raw/*53.7*/("""
					
				</div>
			</div>
			<div class="worksheetDiv">
						
			</div>
		</div>
	""")))})),format.raw/*61.3*/(""" 
""")))})))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User,timesheetForm:Form[models.timesheet.Timesheet]): play.api.templates.Html = apply(_menuContext,user,timesheetForm)
    
    def f:((dto.MenuBar,models.user.User,Form[models.timesheet.Timesheet]) => play.api.templates.Html) = (_menuContext,user,timesheetForm) => apply(_menuContext,user,timesheetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/timesheet/timesheetIndex.scala.html
                    HASH: 390c92ea6d84ebf68c500f0bad7a8960f5325d9a
                    MATRIX: 797->1|1029->102|1060->161|1098->165|1134->193|1173->195|1259->246|1273->252|1337->295|1391->314|1405->320|1466->360|1542->401|1594->431|1636->438|1650->444|1761->545|1802->547|2000->709|2013->713|2045->723|2083->725|2096->729|2127->738|2194->769|2207->773|2240->784|2336->844|2349->848|2374->851|3485->1927|3641->2062|3684->2070|3834->2199|3959->2293
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|42->13|42->13|42->13|42->13|47->18|47->18|47->18|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|71->42|76->47|77->48|82->53|90->61
                    -- GENERATED --
                */
            