
package views.html.status

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
object companyStatus extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4 class="container"><b><i>Company Status</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""
<script type="text/javascript">
 $(document).ready(function()"""),format.raw/*8.30*/("""{"""),format.raw/*8.31*/("""
	 
	
	$("#CompanyaddcompanyApproveButton").show();
	$("#CompanyaddcompanyDisapproveButton").show();
	
		$("#Companyaddstatus").change(function()"""),format.raw/*14.43*/("""{"""),format.raw/*14.44*/("""
			if($("#Companyaddstatus :selected").val() =='Approved')"""),format.raw/*15.59*/("""{"""),format.raw/*15.60*/("""
				$("#CompanyaddcompanyDisapproveButton").show();
				$("#CompanyaddcompanyApproveButton").hide();
			"""),format.raw/*18.4*/("""}"""),format.raw/*18.5*/("""
			if($("#Companyaddstatus :selected").val() =='Disapproved')"""),format.raw/*19.62*/("""{"""),format.raw/*19.63*/("""
				$("#CompanyaddcompanyApproveButton").show();
				$("#CompanyaddcompanyDisapproveButton").hide();
			"""),format.raw/*22.4*/("""}"""),format.raw/*22.5*/("""	
			if($("#Companyaddstatus :selected").val() =='PendingApproval')"""),format.raw/*23.66*/("""{"""),format.raw/*23.67*/("""
				$("#CompanyaddcompanyApproveButton").show();
				$("#CompanyaddcompanyDisapproveButton").show();
			"""),format.raw/*26.4*/("""}"""),format.raw/*26.5*/("""	
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");
 """),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
 
 function Companyadd_gridAction_isToBeHidden(_action)"""),format.raw/*30.54*/("""{"""),format.raw/*30.55*/("""
	 if(_action == 'Cross' && $("#Companyaddstatus :selected").val() == 'Approved')"""),format.raw/*31.81*/("""{"""),format.raw/*31.82*/("""
		return false; 
	 """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
	 
	if(_action == 'Tick' && $("#Companyaddstatus :selected").val() == 'Disapproved')"""),format.raw/*35.82*/("""{"""),format.raw/*35.83*/("""
		return false; 
	 """),format.raw/*37.3*/("""}"""),format.raw/*37.4*/("""
	if($("#Companyaddstatus :selected").val() == 'PendingApproval')"""),format.raw/*38.65*/("""{"""),format.raw/*38.66*/("""
		return false; 
	 """),format.raw/*40.3*/("""}"""),format.raw/*40.4*/("""
	 return true;
 """),format.raw/*42.2*/("""}"""),format.raw/*42.3*/("""
 
 function Company_confimationDialog(_url)
 """),format.raw/*45.2*/("""{"""),format.raw/*45.3*/("""
	 if(_url == '/companyStatusApprove')"""),format.raw/*46.38*/("""{"""),format.raw/*46.39*/("""
		 return true;
	 """),format.raw/*48.3*/("""}"""),format.raw/*48.4*/("""
	 
	 if(_url == '/companyStatusDisapprove')"""),format.raw/*50.41*/("""{"""),format.raw/*50.42*/("""
		 return true;
	 """),format.raw/*52.3*/("""}"""),format.raw/*52.4*/("""
	 return false;
	
 """),format.raw/*55.2*/("""}"""),format.raw/*55.3*/("""
 </script>
 
 """))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/status/companyStatus.scala.html
                    HASH: a689eae4207dac091b842f7097a5e2ad172ec236
                    MATRIX: 794->1|964->94|1001->97|1032->120|1071->122|1112->129|1163->159|1265->227|1319->260|1352->263|1443->327|1471->328|1650->479|1679->480|1767->540|1796->541|1931->649|1959->650|2050->713|2079->714|2214->822|2242->823|2338->891|2367->892|2502->1000|2530->1001|2562->1006|2590->1007|2622->1012|2650->1013|2738->1073|2767->1074|2877->1156|2906->1157|2955->1179|2983->1180|3098->1267|3127->1268|3176->1290|3204->1291|3298->1357|3327->1358|3376->1380|3404->1381|3450->1400|3478->1401|3554->1450|3582->1451|3649->1490|3678->1491|3726->1512|3754->1513|3828->1559|3857->1560|3905->1581|3933->1582|3983->1605|4011->1606
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|36->8|36->8|42->14|42->14|43->15|43->15|46->18|46->18|47->19|47->19|50->22|50->22|51->23|51->23|54->26|54->26|55->27|55->27|56->28|56->28|58->30|58->30|59->31|59->31|61->33|61->33|63->35|63->35|65->37|65->37|66->38|66->38|68->40|68->40|70->42|70->42|73->45|73->45|74->46|74->46|76->48|76->48|78->50|78->50|80->52|80->52|83->55|83->55
                    -- GENERATED --
                */
            