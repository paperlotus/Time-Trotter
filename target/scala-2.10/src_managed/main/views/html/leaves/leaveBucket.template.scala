
package views.html.leaves

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
object leaveBucket extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/(""" 
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Leaves")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
	"""),_display_(Seq[Any](/*3.3*/menuContext(_menuContext,user))),format.raw/*3.33*/("""
	<h4><b style=" width: 1051px; margin-left: 20px;"><i>Leaves Request</i></b></h4>
	"""),_display_(Seq[Any](/*5.3*/searchContext(context,null,"add"))),format.raw/*5.36*/("""
""")))})),format.raw/*6.2*/("""


<script type="text/javascript">
function My_Leave_Approval_Bucketadd_gridAction_isToBeHidden(_action)"""),format.raw/*10.70*/("""{"""),format.raw/*10.71*/("""
	 if(_action == 'Cross' && $("#My_Leave_Approval_Bucketaddstatus :selected").val() == 'Approved')"""),format.raw/*11.98*/("""{"""),format.raw/*11.99*/("""
		return false; 
	 """),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""
	 
	if(_action == 'Tick' && $("#My_Leave_Approval_Bucketaddstatus :selected").val() == 'Rejected')"""),format.raw/*15.96*/("""{"""),format.raw/*15.97*/("""
		return false; 
	 """),format.raw/*17.3*/("""}"""),format.raw/*17.4*/("""
	
	if($("#My_Leave_Approval_Bucketaddstatus :selected").val() == 'Submitted')"""),format.raw/*19.76*/("""{"""),format.raw/*19.77*/("""
		return false; 
	 """),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
	
	 return true;
 """),format.raw/*24.2*/("""}"""),format.raw/*24.3*/("""
 
 $(document).ready(function()"""),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""
	 
	
	$("#My_Leave_Approval_BucketaddleaveApproveButton").hide();
	$("#My_Leave_Approval_BucketaddleaveRejectButton").show();
	
		$("#My_Leave_Approval_Bucketaddstatus").change(function()"""),format.raw/*32.60*/("""{"""),format.raw/*32.61*/("""
			if($("#My_Leave_Approval_Bucketaddstatus :selected").val() =='Approved')"""),format.raw/*33.76*/("""{"""),format.raw/*33.77*/("""
				$("#My_Leave_Approval_BucketaddleaveRejectButton").show();
				$("#My_Leave_Approval_BucketaddleaveApproveButton").hide();
			"""),format.raw/*36.4*/("""}"""),format.raw/*36.5*/("""
			if($("#My_Leave_Approval_Bucketaddstatus :selected").val() =='Submitted')"""),format.raw/*37.77*/("""{"""),format.raw/*37.78*/("""
				$("#My_Leave_Approval_BucketaddleaveRejectButton").show();
				$("#My_Leave_Approval_BucketaddleaveApproveButton").show();
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/("""
			if($("#My_Leave_Approval_Bucketaddstatus :selected").val() =='Rejected')"""),format.raw/*41.76*/("""{"""),format.raw/*41.77*/("""
				$("#My_Leave_Approval_BucketaddleaveApproveButton").show();
				$("#My_Leave_Approval_BucketaddleaveRejectButton").hide();
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/("""	
		"""),format.raw/*45.3*/("""}"""),format.raw/*45.4*/(""");
 """),format.raw/*46.2*/("""}"""),format.raw/*46.3*/(""");
 
 function My_Leave_Approval_Bucket_confimationDialog(_url)
 """),format.raw/*49.2*/("""{"""),format.raw/*49.3*/("""
	 if(_url == '/leave/approveLeave')"""),format.raw/*50.36*/("""{"""),format.raw/*50.37*/("""
		 return true;
	 """),format.raw/*52.3*/("""}"""),format.raw/*52.4*/("""
	 
	 if(_url == '/leave/rejectLeave')"""),format.raw/*54.35*/("""{"""),format.raw/*54.36*/("""
		 return true;
	 """),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
	 return false;
	
 """),format.raw/*59.2*/("""}"""),format.raw/*59.3*/("""
 
 </script>"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/leaves/leaveBucket.scala.html
                    HASH: d7c017fadc99349dafffcf95ea9db37b2615647a
                    MATRIX: 792->1|962->94|1000->98|1033->123|1072->125|1110->129|1161->159|1282->246|1336->279|1369->282|1505->390|1534->391|1661->490|1690->491|1739->513|1767->514|1896->615|1925->616|1974->638|2002->639|2110->719|2139->720|2188->742|2216->743|2265->765|2293->766|2355->800|2384->801|2606->995|2635->996|2740->1073|2769->1074|2930->1208|2958->1209|3064->1287|3093->1288|3254->1422|3282->1423|3387->1500|3416->1501|3577->1635|3605->1636|3637->1641|3665->1642|3697->1647|3725->1648|3820->1716|3848->1717|3913->1754|3942->1755|3990->1776|4018->1777|4086->1817|4115->1818|4163->1839|4191->1840|4241->1863|4269->1864
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|38->10|38->10|39->11|39->11|41->13|41->13|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|60->32|60->32|61->33|61->33|64->36|64->36|65->37|65->37|68->40|68->40|69->41|69->41|72->44|72->44|73->45|73->45|74->46|74->46|77->49|77->49|78->50|78->50|80->52|80->52|82->54|82->54|84->56|84->56|87->59|87->59
                    -- GENERATED --
                */
            