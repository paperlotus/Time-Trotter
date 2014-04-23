
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
object timesheetTable extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.user.User,Form[models.timesheet.Timesheet],List[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user : models.user.User, timesheetForm : Form[models.timesheet.Timesheet], projectsList : List[String]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._ 

def /*6.2*/timesheetRowDetails/*6.21*/(field: Field, className: String="timesheetRow"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.71*/("""
	<div class="twipsies well """),_display_(Seq[Any](/*7.29*/className)),format.raw/*7.38*/("""">
		<div class="innerInputDiv">
			<div class="innerChainSelect">
				"""),_display_(Seq[Any](/*10.6*/select(
					field("projectCode"),
					options(projectsList),
					args = '_label -> "",
					'class -> "largeInput largeInputFirst required",
					'_default -> "-select-" 
				))),format.raw/*16.6*/("""
				
				"""),_display_(Seq[Any](/*18.6*/if(timesheetForm != null && field("projectCode").value.toString != "None")/*18.80*/{_display_(Seq[Any](format.raw/*18.81*/("""
					"""),_display_(Seq[Any](/*19.7*/select(
						field("taskCode"),
						options(controllers.Timesheets.getTaskByProject(user.id,field("projectCode").value.get)),
						args = '_label -> "", 
						'class -> "largeInput  taskInput",
						'_default -> "-select-" 
					))),format.raw/*25.7*/("""
				""")))}/*26.6*/else/*26.10*/{_display_(Seq[Any](format.raw/*26.11*/("""
					"""),_display_(Seq[Any](/*27.7*/select(
						field("taskCode"),
						options(),
						args = '_label -> "", 
						'class -> "largeInput taskInput",
						'_default -> "-select-"
					))),format.raw/*33.7*/("""
				""")))})),format.raw/*34.6*/("""
			</div>
			
		</div>
		
		<div class="innerHrsDiv">
			 
			"""),_display_(Seq[Any](/*41.5*/inputText(
				field("mon"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*46.5*/("""
			
			"""),_display_(Seq[Any](/*48.5*/inputText(
				field("tue"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*53.5*/("""
			
			"""),_display_(Seq[Any](/*55.5*/inputText(
				field("wed"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*60.5*/("""
			
			"""),_display_(Seq[Any](/*62.5*/inputText(
				field("thu"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*67.5*/("""
			
			"""),_display_(Seq[Any](/*69.5*/inputText(
				field("fri"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*74.5*/("""
			
			"""),_display_(Seq[Any](/*76.5*/inputText(
				field("sat"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*81.5*/("""
			
			"""),_display_(Seq[Any](/*83.5*/inputText(
				field("sun"),
				args = '_label -> "",
				'placeholder -> "0:00",
				'class -> "smallInput"
			))),format.raw/*88.5*/("""
		</div>
		<div class="totalHrsDiv">
		"""),_display_(Seq[Any](/*91.4*/inputText(
				field("totalHrs"),
				'_label -> "",
				'placeholder -> "",
				'class -> "smallInput totalHRSInput readonlycls"
			))),format.raw/*96.5*/("""
		</div>	
		"""),_display_(Seq[Any](/*98.4*/checkbox(   
				field("overTime"),
				'_label -> "",
				'class -> "checkBox checkBoxInput"
			))),format.raw/*102.5*/("""
		<a class="remove btn danger pull-right" id="remove">X</a>
	</div>
""")))};
Seq[Any](format.raw/*1.106*/(""" 

"""),format.raw/*5.1*/("""
"""),format.raw/*105.2*/("""

<script src=""""),_display_(Seq[Any](/*107.15*/routes/*107.21*/.Assets.at("javascripts/jquery.chainedSelects.js"))),format.raw/*107.71*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*108.15*/routes/*108.21*/.Assets.at("customScripts/timesheetRow.js"))),format.raw/*108.64*/("""" type="text/javascript"></script>

<div id="timeSheetTable">
	
	<div class="worksheetHeader">
		<h5>Work/Absence Hours Reporting</h5>
		<div id="statusInfo">
			<h6>With :</h6>
			<label style="margin: 4px 10px 0 0; padding:4px 0; float:left;">"""),_display_(Seq[Any](/*116.69*/timesheetForm("timesheetWith.firstName")/*116.109*/.value)),format.raw/*116.115*/(""" """),_display_(Seq[Any](/*116.117*/timesheetForm("timesheetWith.lastName")/*116.156*/.value)),format.raw/*116.162*/("""</label>
			<label style="margin: 4px 0px 0 0; padding:4px 0; float:left;">/</label>
			<h6>Status :</h6>
			<label style="margin: 4px 0; padding:4px 0; float:left;" id="outputStatus"></label>
			<p>
			"""),_display_(Seq[Any](/*121.5*/select(
					timesheetForm("status"),
					options(controllers.Timesheets.getTimesheetStatus()),
					args = '_label -> "", 
					'class -> "mediumInput hidden inputStatus"
				))),format.raw/*126.6*/("""	
			</p>
		</div>
	</div>
	
	<div class="reportingTable">
		<div class="tableCss">
			<div class="innerLabelDiv">
				<div class="largeInputLabel largeInputLabel_First clearfix">Project Codes</div>
				<div class="largeInputLabel clearfix">Task Codes</div>
			</div>
			<div class="innerDaysDiv">
				<div class="smallInputLabel clearfix">
					M<br>
					<span id="dayLabel_0"></span>
				</div>
				<div class="smallInputLabel clearfix">
					T<br>
					<span id="dayLabel_1"></span>
				</div>
				<div class="smallInputLabel clearfix">
					W<br>
					<span id="dayLabel_2"></span>
				</div>
				<div class="smallInputLabel clearfix">
					Th<br>
					<span id="dayLabel_3"></span>
				</div>
				<div class="smallInputLabel clearfix">
					F<br>
					<span id="dayLabel_4"></span>
				</div>
				<div class="smallInputLabel clearfix">
					S<br>
					<span id="dayLabel_5"></span>
				</div>
				<div class="smallInputLabel clearfix">
					S<br>
					<span id="dayLabel_6"></span>
				</div>
				<div class="smallInputLabel totalHRSLabel clearfix">T</div>
				<div class="smallInputLabel clearfix">Overtime</div>
				<a class="btn" id="addMore" style="margin-left: 18px; float: right;"><b>+</b></a>
			</div>
		</div>
		
		"""),_display_(Seq[Any](/*172.4*/repeat(timesheetForm("timesheetRows"), min = 1)/*172.51*/{timesheetRow =>_display_(Seq[Any](format.raw/*172.67*/("""
			"""),_display_(Seq[Any](/*173.5*/timesheetRowDetails(timesheetRow))),format.raw/*173.38*/("""
		""")))})),format.raw/*174.4*/("""
					
		"""),_display_(Seq[Any](/*176.4*/timesheetRowDetails(
			timesheetForm("timesheetRows[x]"),
			className = "timesheetRow_template"
		))),format.raw/*179.4*/("""	
	</div>
	
	<div class="actions">
		<input type="button" id="copyFromLastWeek" class="btn btn-warning" Value="Copy from last week">
		<input type="button" id="saveTimesheetForm" class="btn btn-warning"  value="Save">
		<input type="button" id="submitTimesheetForm" class="btn btn-warning" value="Submit">
		<input type="button" id="retractTimesheetForm" class="btn btn-warning" value="Retract">
		<input type="hidden" id="cancelTimesheetForm" class="btn btn-warning" Value="Cancel">
	</div>
		
		"""),_display_(Seq[Any](/*190.4*/if(timesheetForm != null)/*190.29*/{_display_(Seq[Any](format.raw/*190.30*/("""
			"""),_display_(Seq[Any](/*191.5*/inputText(
				timesheetForm("id"),
				args = '_label -> "",
				'type -> "hidden",
				'class -> "TIMEID"
			))),format.raw/*196.5*/("""
		""")))})),format.raw/*197.4*/("""	
	
		"""),_display_(Seq[Any](/*199.4*/select(
			timesheetForm("status"),
			options(controllers.Timesheets.getTimesheetStatus()),
			args = '_label -> "", 
			'class -> "mediumInput hidden inputStatus",
			'type -> "hidden"
		))),format.raw/*205.4*/("""	
</div>"""))}
    }
    
    def render(user:models.user.User,timesheetForm:Form[models.timesheet.Timesheet],projectsList:List[String]): play.api.templates.Html = apply(user,timesheetForm,projectsList)
    
    def f:((models.user.User,Form[models.timesheet.Timesheet],List[String]) => play.api.templates.Html) = (user,timesheetForm,projectsList) => apply(user,timesheetForm,projectsList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/timesheet/timesheetTable.scala.html
                    HASH: 36ed8e943d099da5767b5e47ce70fa2b5692a8b8
                    MATRIX: 798->1|1015->167|1042->186|1157->236|1222->266|1252->275|1362->350|1568->535|1616->548|1699->622|1738->623|1781->631|2044->873|2069->880|2082->884|2121->885|2164->893|2346->1054|2384->1061|2490->1132|2630->1251|2676->1262|2816->1381|2862->1392|3002->1511|3048->1522|3188->1641|3234->1652|3374->1771|3420->1782|3560->1901|3606->1912|3746->2031|3825->2075|3985->2214|4036->2230|4160->2332|4273->105|4304->164|4334->2405|4389->2423|4405->2429|4478->2479|4565->2529|4581->2535|4647->2578|4938->2832|4989->2872|5019->2878|5059->2880|5109->2919|5139->2925|5384->3134|5589->3317|6902->4594|6959->4641|7014->4657|7056->4663|7112->4696|7149->4701|7197->4713|7323->4817|7868->5326|7903->5351|7943->5352|7985->5358|8124->5475|8161->5480|8206->5489|8424->5685
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|37->10|43->16|45->18|45->18|45->18|46->19|52->25|53->26|53->26|53->26|54->27|60->33|61->34|68->41|73->46|75->48|80->53|82->55|87->60|89->62|94->67|96->69|101->74|103->76|108->81|110->83|115->88|118->91|123->96|125->98|129->102|133->1|135->5|136->105|138->107|138->107|138->107|139->108|139->108|139->108|147->116|147->116|147->116|147->116|147->116|147->116|152->121|157->126|203->172|203->172|203->172|204->173|204->173|205->174|207->176|210->179|221->190|221->190|221->190|222->191|227->196|228->197|230->199|236->205
                    -- GENERATED --
                */
            