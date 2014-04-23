
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
object timesheetsBucket extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/(""" 
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Timesheet")/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
	"""),_display_(Seq[Any](/*3.3*/menuContext(_menuContext,user))),format.raw/*3.33*/("""
	<h4><b style=" width: 1051px; margin-left: 20px;"><i>Timesheets Bucket</i></b></h4>
	"""),_display_(Seq[Any](/*5.3*/searchContext(context,null,"add"))),format.raw/*5.36*/("""
""")))})),format.raw/*6.2*/("""
<h5 id="My_TimeSheet_Approval_Bucket_caution" style="display:none;"> WOULD YOU LIKE TO CONTINUE AND DISAPPROVE?</h5>

<script type="text/javascript">
 	     
	function My_TimeSheet_Approval_Bucket_confimationDialog(_url)
	 """),format.raw/*12.3*/("""{"""),format.raw/*12.4*/("""
		 if(_url == '/timesheet/approveTimesheets')"""),format.raw/*13.46*/("""{"""),format.raw/*13.47*/("""
			 return false;
		 """),format.raw/*15.4*/("""}"""),format.raw/*15.5*/("""
		 
		 if(_url == '/timesheet/rejectTimesheets')"""),format.raw/*17.45*/("""{"""),format.raw/*17.46*/("""
			 return true;
		 """),format.raw/*19.4*/("""}"""),format.raw/*19.5*/("""
		 return false;
		
	 """),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""
	
	$(document).ready(function()"""),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""

		$("#My_TimeSheet_Approval_BucketaddtimesheetApproveButton").show();
		$("#My_TimeSheet_Approval_BucketaddtimesheetRejectButton").show();
		
		$("#My_TimeSheet_Approval_Bucketaddstatus").change(function()"""),format.raw/*29.64*/("""{"""),format.raw/*29.65*/("""
			if($("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() =='Approved')"""),format.raw/*30.80*/("""{"""),format.raw/*30.81*/("""
				$("#My_TimeSheet_Approval_BucketaddtimesheetRejectButton").show();
				$("#My_TimeSheet_Approval_BucketaddtimesheetApproveButton").hide();
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			if($("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() =='Submitted')"""),format.raw/*34.81*/("""{"""),format.raw/*34.82*/("""
				$("#My_TimeSheet_Approval_BucketaddtimesheetApproveButton").show();
				$("#My_TimeSheet_Approval_BucketaddtimesheetRejectButton").show();
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""
			if($("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() =='Rejected')"""),format.raw/*38.80*/("""{"""),format.raw/*38.81*/("""
				$("#My_TimeSheet_Approval_BucketaddtimesheetApproveButton").show();
				$("#My_TimeSheet_Approval_BucketaddtimesheetRejectButton").hide();
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""	
		"""),format.raw/*42.3*/("""}"""),format.raw/*42.4*/(""");
		
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""");
	
	function My_TimeSheet_Approval_Bucketadd_gridAction_isToBeHidden(_action)"""),format.raw/*46.75*/("""{"""),format.raw/*46.76*/("""
		 if(_action == 'Cross' && $("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() == 'Approved')"""),format.raw/*47.103*/("""{"""),format.raw/*47.104*/("""
			return false; 
		 """),format.raw/*49.4*/("""}"""),format.raw/*49.5*/("""
		 
		if(_action == 'Tick' && $("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() == 'Rejected')"""),format.raw/*51.101*/("""{"""),format.raw/*51.102*/("""
			return false; 
		 """),format.raw/*53.4*/("""}"""),format.raw/*53.5*/("""
		
		if($("#My_TimeSheet_Approval_Bucketaddstatus :selected").val() == 'Submitted')"""),format.raw/*55.81*/("""{"""),format.raw/*55.82*/("""
			return false; 
		 """),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
		
		 return true;
	 """),format.raw/*60.3*/("""}"""),format.raw/*60.4*/("""
 
 </script>"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:34:02 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/timesheet/timesheetsBucket.scala.html
                    HASH: 4a3a8fbcf950e68609dbcbdbe83985556a7289bb
                    MATRIX: 800->1|970->94|1008->98|1044->126|1083->128|1121->132|1172->162|1296->252|1350->285|1383->288|1640->518|1668->519|1743->566|1772->567|1823->591|1851->592|1930->643|1959->644|2009->667|2037->668|2090->694|2118->695|2180->729|2209->730|2449->942|2478->943|2587->1024|2616->1025|2793->1175|2821->1176|2931->1258|2960->1259|3137->1409|3165->1410|3274->1491|3303->1492|3480->1642|3508->1643|3540->1648|3568->1649|3604->1658|3632->1659|3741->1740|3770->1741|3903->1845|3933->1846|3984->1870|4012->1871|4148->1978|4178->1979|4229->2003|4257->2004|4371->2090|4400->2091|4451->2115|4479->2116|4531->2141|4559->2142
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|40->12|40->12|41->13|41->13|43->15|43->15|45->17|45->17|47->19|47->19|50->22|50->22|52->24|52->24|57->29|57->29|58->30|58->30|61->33|61->33|62->34|62->34|65->37|65->37|66->38|66->38|69->41|69->41|70->42|70->42|72->44|72->44|74->46|74->46|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|83->55|83->55|85->57|85->57|88->60|88->60
                    -- GENERATED --
                */
            