
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
object viewTimesheet extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.timesheet.Timesheet,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(timesheet: models.timesheet.Timesheet,user : models.user.User):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*5.1*/("""
<style>
	#custom-modal-container"""),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
		width: 1000px !important;
		left: 30% !important;
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""

	.formClass"""),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
		padding: 0 30px;
	"""),format.raw/*14.2*/("""}"""),format.raw/*14.3*/("""
	
	.timesheetFirstRow"""),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""
		padding: 2% 5% 4%;
		margin-bottom: 2%;
	"""),format.raw/*19.2*/("""}"""),format.raw/*19.3*/("""
	
	.timesheetFirstRow p"""),format.raw/*21.22*/("""{"""),format.raw/*21.23*/("""
		float: left;
		margin-right: 8%;
	"""),format.raw/*24.2*/("""}"""),format.raw/*24.3*/("""
	
	.timesheetSecondRow"""),format.raw/*26.21*/("""{"""),format.raw/*26.22*/("""
		margin: 2% 0%;
		width: 100%;
	"""),format.raw/*29.2*/("""}"""),format.raw/*29.3*/("""
	
	.timesheetSecondRow td"""),format.raw/*31.24*/("""{"""),format.raw/*31.25*/("""
		padding: 1% 2% !important;
		border-right: 1px solid #d5d5d5;
		text-align: center; 
	"""),format.raw/*35.2*/("""}"""),format.raw/*35.3*/("""
	
	.timesheetSecondRow td:LAST-CHILD"""),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
		border-right: none;
	"""),format.raw/*39.2*/("""}"""),format.raw/*39.3*/("""
	
	.action"""),format.raw/*41.9*/("""{"""),format.raw/*41.10*/("""
		margin: 2% 0;
		float: right;
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/("""
	
	.modal-footer"""),format.raw/*46.15*/("""{"""),format.raw/*46.16*/("""
		padding: 15px 15px 5px !important;
		text-align: left;
		background-color: none !important;
		margin-top: 15px;
	"""),format.raw/*51.2*/("""}"""),format.raw/*51.3*/("""
	
	.modal-header .close"""),format.raw/*53.22*/("""{"""),format.raw/*53.23*/("""
		margin-right: -25px;
	"""),format.raw/*55.2*/("""}"""),format.raw/*55.3*/("""
</style>

<div class="formClass">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<h4>Timesheet of """),_display_(Seq[Any](/*61.21*/user/*61.25*/.firstName)),format.raw/*61.35*/(""" """),_display_(Seq[Any](/*61.37*/user/*61.41*/.lastName)),format.raw/*61.50*/("""</h4>
	</div>

	<div class="timesheetFirstRow"> 
		<p style="display:none;"><b>Timesheet ID :</b> <span id="timesheetID">"""),_display_(Seq[Any](/*65.74*/timesheet/*65.83*/.id)),format.raw/*65.86*/("""</span></p> 
	
		<p><b>Week Of Year :</b> """),_display_(Seq[Any](/*67.29*/timesheet/*67.38*/.weekOfYear)),format.raw/*67.49*/("""</p>
		
		<p><b>Status :</b> """),_display_(Seq[Any](/*69.23*/timesheet/*69.32*/.status)),format.raw/*69.39*/("""</p>
		
		<p><b>Timesheet With</b> : """),_display_(Seq[Any](/*71.31*/timesheet/*71.40*/.timesheetWith.firstName)),format.raw/*71.64*/(""" """),_display_(Seq[Any](/*71.66*/timesheet/*71.75*/.timesheetWith.lastName)),format.raw/*71.98*/("""</p>
	</div>

	<table class="timesheetSecondRow">
		<thead>
			<tr>
				<td style="width:15%">Project Code</td>
				<td style="width:15%">Task Code</td>
				<td style="width:10%">Mon</td>
				<td style="width:10%">Tue</td>
				<td style="width:10%">Wed</td>
				<td style="width:10%">Thu</td>
				<td style="width:10%">Fri</td>
				<td style="width:10%">Sat</td>
				<td style="width:10%">Sun</td>
				<td style="width:10%">Total Hrs</td>
				<td style="width:10%">is Overtime</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(Seq[Any](/*91.5*/for(row <- timesheet.timesheetRows) yield /*91.40*/{_display_(Seq[Any](format.raw/*91.41*/("""
				<tr>
					<td>"""),_display_(Seq[Any](/*93.11*/row/*93.14*/.projectCode)),format.raw/*93.26*/("""</td>
					<td>"""),_display_(Seq[Any](/*94.11*/row/*94.14*/.taskCode)),format.raw/*94.23*/("""</td>
					<td>
						"""),_display_(Seq[Any](/*96.8*/if(row.mon == null)/*96.27*/{_display_(Seq[Any](format.raw/*96.28*/("""
							0
						""")))}/*98.8*/else/*98.12*/{_display_(Seq[Any](format.raw/*98.13*/("""
							"""),_display_(Seq[Any](/*99.9*/row/*99.12*/.mon)),format.raw/*99.16*/("""
						""")))})),format.raw/*100.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*103.8*/if(row.tue == null)/*103.27*/{_display_(Seq[Any](format.raw/*103.28*/("""
							0
						""")))}/*105.8*/else/*105.12*/{_display_(Seq[Any](format.raw/*105.13*/("""
							"""),_display_(Seq[Any](/*106.9*/row/*106.12*/.tue)),format.raw/*106.16*/("""
						""")))})),format.raw/*107.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*110.8*/if(row.wed == null)/*110.27*/{_display_(Seq[Any](format.raw/*110.28*/("""
							0
						""")))}/*112.8*/else/*112.12*/{_display_(Seq[Any](format.raw/*112.13*/("""
							"""),_display_(Seq[Any](/*113.9*/row/*113.12*/.wed)),format.raw/*113.16*/("""
						""")))})),format.raw/*114.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*117.8*/if(row.thu == null)/*117.27*/{_display_(Seq[Any](format.raw/*117.28*/("""
							0
						""")))}/*119.8*/else/*119.12*/{_display_(Seq[Any](format.raw/*119.13*/("""
							"""),_display_(Seq[Any](/*120.9*/row/*120.12*/.thu)),format.raw/*120.16*/("""
						""")))})),format.raw/*121.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*124.8*/if(row.fri == null)/*124.27*/{_display_(Seq[Any](format.raw/*124.28*/("""
							0
						""")))}/*126.8*/else/*126.12*/{_display_(Seq[Any](format.raw/*126.13*/("""
							"""),_display_(Seq[Any](/*127.9*/row/*127.12*/.fri)),format.raw/*127.16*/("""
						""")))})),format.raw/*128.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*131.8*/if(row.sat == null)/*131.27*/{_display_(Seq[Any](format.raw/*131.28*/("""
							0
						""")))}/*133.8*/else/*133.12*/{_display_(Seq[Any](format.raw/*133.13*/("""
							"""),_display_(Seq[Any](/*134.9*/row/*134.12*/.sat)),format.raw/*134.16*/("""
						""")))})),format.raw/*135.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*138.8*/if(row.sun == null)/*138.27*/{_display_(Seq[Any](format.raw/*138.28*/("""
							0
						""")))}/*140.8*/else/*140.12*/{_display_(Seq[Any](format.raw/*140.13*/("""
							"""),_display_(Seq[Any](/*141.9*/row/*141.12*/.sun)),format.raw/*141.16*/("""
						""")))})),format.raw/*142.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*145.8*/if(row.totalHrs == null)/*145.32*/{_display_(Seq[Any](format.raw/*145.33*/("""
							0
						""")))}/*147.8*/else/*147.12*/{_display_(Seq[Any](format.raw/*147.13*/("""
							"""),_display_(Seq[Any](/*148.9*/row/*148.12*/.totalHrs)),format.raw/*148.21*/("""
						""")))})),format.raw/*149.8*/("""
					</td>
					<td>
						"""),_display_(Seq[Any](/*152.8*/if(row.overTime == null)/*152.32*/{_display_(Seq[Any](format.raw/*152.33*/("""
							No
						""")))}/*154.8*/else/*154.12*/{_display_(Seq[Any](format.raw/*154.13*/("""
							"""),_display_(Seq[Any](/*155.9*/if(row.overTime == true)/*155.33*/{_display_(Seq[Any](format.raw/*155.34*/("""
								Yes
							""")))}/*157.9*/else/*157.13*/{_display_(Seq[Any](format.raw/*157.14*/("""
								No
							""")))})),format.raw/*159.9*/("""
						""")))})),format.raw/*160.8*/("""
					</td>
				</tr>
			""")))})),format.raw/*163.5*/("""
		</tbody>
	</table>

	<div class="action">
		<input class="btn" type="button" id="approveTimeSheet" value="Approve">
		<input class="btn" type="button" id="rejectTimeSheet" value="Reject">
	</div>	
</div>

<script>
	$("#approveTimeSheet").click(function()"""),format.raw/*174.41*/("""{"""),format.raw/*174.42*/("""
		$.get('/timesheet/approveTimesheetsOk', """),format.raw/*175.43*/("""{"""),format.raw/*175.44*/("""id: $('#timesheetID').html()"""),format.raw/*175.72*/("""}"""),format.raw/*175.73*/(""", 
				function(response) """),format.raw/*176.24*/("""{"""),format.raw/*176.25*/("""
					_dataType = JSON.parse(response);
					$("#custom-modal-container").modal('hide');
					$.pnotify("""),format.raw/*179.16*/("""{"""),format.raw/*179.17*/("""
						history:false,
				        text: _dataType.message
				    """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/(""");
					My_TimeSheet_Approval_Bucketadd_SearchGrid.doSearch();
		"""),format.raw/*184.3*/("""}"""),format.raw/*184.4*/(""");
	"""),format.raw/*185.2*/("""}"""),format.raw/*185.3*/(""");

	$("#rejectTimeSheet").click(function()"""),format.raw/*187.40*/("""{"""),format.raw/*187.41*/("""
		$.get('/timesheet/rejectTimesheetsOk', """),format.raw/*188.42*/("""{"""),format.raw/*188.43*/("""id: $('#timesheetID').html()"""),format.raw/*188.71*/("""}"""),format.raw/*188.72*/(""", 
				function(response) """),format.raw/*189.24*/("""{"""),format.raw/*189.25*/("""
			_dataType = JSON.parse(response);
			$("#custom-modal-container").modal('hide');
			$.pnotify("""),format.raw/*192.14*/("""{"""),format.raw/*192.15*/("""
				history:false,
		        text: _dataType.message
		    """),format.raw/*195.7*/("""}"""),format.raw/*195.8*/(""");
			My_TimeSheet_Approval_Bucketadd_SearchGrid.doSearch();
		"""),format.raw/*197.3*/("""}"""),format.raw/*197.4*/(""");
	"""),format.raw/*198.2*/("""}"""),format.raw/*198.3*/(""");
</script>

"""))}
    }
    
    def render(timesheet:models.timesheet.Timesheet,user:models.user.User): play.api.templates.Html = apply(timesheet,user)
    
    def f:((models.timesheet.Timesheet,models.user.User) => play.api.templates.Html) = (timesheet,user) => apply(timesheet,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/timesheet/viewTimesheet.scala.html
                    HASH: ce15b855ec9af57d8f5f68529791c77973e3dda3
                    MATRIX: 778->1|970->64|1000->121|1062->156|1090->157|1174->214|1202->215|1245->230|1274->231|1324->254|1352->255|1404->279|1433->280|1507->327|1535->328|1589->354|1618->355|1685->395|1713->396|1766->421|1795->422|1859->459|1887->460|1943->488|1972->489|2092->582|2120->583|2187->622|2216->623|2269->649|2297->650|2337->663|2366->664|2430->701|2458->702|2505->721|2534->722|2682->843|2710->844|2764->870|2793->871|2847->898|2875->899|3076->1064|3089->1068|3121->1078|3159->1080|3172->1084|3203->1093|3365->1219|3383->1228|3408->1231|3489->1276|3507->1285|3540->1296|3608->1328|3626->1337|3655->1344|3731->1384|3749->1393|3795->1417|3833->1419|3851->1428|3896->1451|4467->1987|4518->2022|4557->2023|4615->2045|4627->2048|4661->2060|4714->2077|4726->2080|4757->2089|4817->2114|4845->2133|4884->2134|4921->2153|4934->2157|4973->2158|5018->2168|5030->2171|5056->2175|5097->2184|5165->2216|5194->2235|5234->2236|5272->2255|5286->2259|5326->2260|5372->2270|5385->2273|5412->2277|5453->2286|5521->2318|5550->2337|5590->2338|5628->2357|5642->2361|5682->2362|5728->2372|5741->2375|5768->2379|5809->2388|5877->2420|5906->2439|5946->2440|5984->2459|5998->2463|6038->2464|6084->2474|6097->2477|6124->2481|6165->2490|6233->2522|6262->2541|6302->2542|6340->2561|6354->2565|6394->2566|6440->2576|6453->2579|6480->2583|6521->2592|6589->2624|6618->2643|6658->2644|6696->2663|6710->2667|6750->2668|6796->2678|6809->2681|6836->2685|6877->2694|6945->2726|6974->2745|7014->2746|7052->2765|7066->2769|7106->2770|7152->2780|7165->2783|7192->2787|7233->2796|7301->2828|7335->2852|7375->2853|7413->2872|7427->2876|7467->2877|7513->2887|7526->2890|7558->2899|7599->2908|7667->2940|7701->2964|7741->2965|7780->2985|7794->2989|7834->2990|7880->3000|7914->3024|7954->3025|7996->3048|8010->3052|8050->3053|8104->3075|8145->3084|8206->3113|8503->3381|8533->3382|8606->3426|8636->3427|8693->3455|8723->3456|8779->3483|8809->3484|8945->3591|8975->3592|9072->3661|9102->3662|9197->3729|9226->3730|9259->3735|9288->3736|9362->3781|9392->3782|9464->3825|9494->3826|9551->3854|9581->3855|9637->3882|9667->3883|9797->3984|9827->3985|9918->4048|9947->4049|10040->4114|10069->4115|10102->4120|10131->4121
                    LINES: 26->1|32->1|34->5|36->7|36->7|39->10|39->10|41->12|41->12|43->14|43->14|45->16|45->16|48->19|48->19|50->21|50->21|53->24|53->24|55->26|55->26|58->29|58->29|60->31|60->31|64->35|64->35|66->37|66->37|68->39|68->39|70->41|70->41|73->44|73->44|75->46|75->46|80->51|80->51|82->53|82->53|84->55|84->55|90->61|90->61|90->61|90->61|90->61|90->61|94->65|94->65|94->65|96->67|96->67|96->67|98->69|98->69|98->69|100->71|100->71|100->71|100->71|100->71|100->71|120->91|120->91|120->91|122->93|122->93|122->93|123->94|123->94|123->94|125->96|125->96|125->96|127->98|127->98|127->98|128->99|128->99|128->99|129->100|132->103|132->103|132->103|134->105|134->105|134->105|135->106|135->106|135->106|136->107|139->110|139->110|139->110|141->112|141->112|141->112|142->113|142->113|142->113|143->114|146->117|146->117|146->117|148->119|148->119|148->119|149->120|149->120|149->120|150->121|153->124|153->124|153->124|155->126|155->126|155->126|156->127|156->127|156->127|157->128|160->131|160->131|160->131|162->133|162->133|162->133|163->134|163->134|163->134|164->135|167->138|167->138|167->138|169->140|169->140|169->140|170->141|170->141|170->141|171->142|174->145|174->145|174->145|176->147|176->147|176->147|177->148|177->148|177->148|178->149|181->152|181->152|181->152|183->154|183->154|183->154|184->155|184->155|184->155|186->157|186->157|186->157|188->159|189->160|192->163|203->174|203->174|204->175|204->175|204->175|204->175|205->176|205->176|208->179|208->179|211->182|211->182|213->184|213->184|214->185|214->185|216->187|216->187|217->188|217->188|217->188|217->188|218->189|218->189|221->192|221->192|224->195|224->195|226->197|226->197|227->198|227->198
                    -- GENERATED --
                */
            