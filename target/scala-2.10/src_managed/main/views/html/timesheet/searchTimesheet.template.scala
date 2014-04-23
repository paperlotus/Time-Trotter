
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
object searchTimesheet extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,Form[models.timesheet.Timesheet],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User, timesheetForm : Form[models.timesheet.Timesheet]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.145*/(""" 

"""),format.raw/*5.1*/("""	
"""),_display_(Seq[Any](/*6.2*/main("Welcome to Timesheet")/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
	
	
	"""),_display_(Seq[Any](/*9.3*/menuContext(_menuContext,user))),format.raw/*9.33*/("""
	
		<!--<div class="tsMainDiv">
			<div class="timesheetInfoDiv">
				<div id="empInfo">
					<h5>Employee Name : """),_display_(Seq[Any](/*14.27*/user/*14.31*/.firstName)),format.raw/*14.41*/(""" """),_display_(Seq[Any](/*14.43*/user/*14.47*/.lastName)),format.raw/*14.56*/("""</h5>
					<h6>Employee ID : """),_display_(Seq[Any](/*15.25*/user/*15.29*/.employeeId)),format.raw/*15.40*/("""</h6>
					<input type="hidden" id="employeeID" value=""""),_display_(Seq[Any](/*16.51*/user/*16.55*/.id)),format.raw/*16.58*/("""">
					<input type="button" id="getEmployeeTimesheet" value="Go" class="btn">
				</div>
			</div>
			<div class="searchDiv">
				
			</div>
		</div> -->
	 """),_display_(Seq[Any](/*24.4*/searchContext(context,null,"add"))),format.raw/*24.37*/("""
""")))})),format.raw/*25.2*/("""
<h5 id="My_TimeSheet_Approval_Bucket_caution" style="display:none;"> WILL YOU LIKE TO CONTINUE AND DISAPPROVE ??</h5>
<script type="text/javascript">
 $(document).ready(function()"""),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
	 $("#Timesheetadd_editButton").show();
	 $("#Timesheetaddstatus").change(function()"""),format.raw/*30.45*/("""{"""),format.raw/*30.46*/("""
			if($("#Timesheetaddstatus :selected").val() =='Approved')"""),format.raw/*31.61*/("""{"""),format.raw/*31.62*/("""
				$("#Timesheetadd_editButton").hide();
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			else
			if($("#Timesheetaddstatus :selected").val() =='Submitted')"""),format.raw/*35.62*/("""{"""),format.raw/*35.63*/("""
				$("#Timesheetadd_editButton").hide();
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""
			else
				$("#Timesheetadd_editButton").show();
		"""),format.raw/*40.3*/("""}"""),format.raw/*40.4*/(""");
	 
	 
  """),format.raw/*43.3*/("""}"""),format.raw/*43.4*/(""");
 
 
  </script>"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User,timesheetForm:Form[models.timesheet.Timesheet]): play.api.templates.Html = apply(context,_menuContext,user,timesheetForm)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,Form[models.timesheet.Timesheet]) => play.api.templates.Html) = (context,_menuContext,user,timesheetForm) => apply(context,_menuContext,user,timesheetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/timesheet/searchTimesheet.scala.html
                    HASH: 18f6db9bb9ec782bbd2bcd8e352070e739c49ecc
                    MATRIX: 832->1|1106->144|1137->203|1175->207|1211->235|1250->237|1294->247|1345->277|1502->398|1515->402|1547->412|1585->414|1598->418|1629->427|1696->458|1709->462|1742->473|1835->530|1848->534|1873->537|2074->703|2129->736|2163->739|2374->922|2403->923|2518->1010|2547->1011|2637->1073|2666->1074|2741->1122|2769->1123|2869->1195|2898->1196|2973->1244|3001->1245|3084->1301|3112->1302|3153->1316|3181->1317
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|38->9|38->9|43->14|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|53->24|53->24|54->25|57->28|57->28|59->30|59->30|60->31|60->31|62->33|62->33|64->35|64->35|66->37|66->37|69->40|69->40|72->43|72->43
                    -- GENERATED --
                */
            