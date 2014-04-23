
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
object userStatus extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4 class="container"><b><i>User Status</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""


<script type="text/javascript">
 $(document).ready(function()"""),format.raw/*10.30*/("""{"""),format.raw/*10.31*/("""
 
	 $("#UseradduserApproveButton").show();
	$("#UseradduserdisapproveButton").show();
	
		$("#Useraddstatus").change(function()"""),format.raw/*15.40*/("""{"""),format.raw/*15.41*/("""
			if($("#Useraddstatus :selected").val() =='Approved')"""),format.raw/*16.56*/("""{"""),format.raw/*16.57*/("""
				$("#UseradduserdisapproveButton").show();
				$("#UseradduserApproveButton").hide();
			"""),format.raw/*19.4*/("""}"""),format.raw/*19.5*/("""
			if($("#Useraddstatus :selected").val() =='Disapproved')"""),format.raw/*20.59*/("""{"""),format.raw/*20.60*/("""
				$("#UseradduserdisapproveButton").hide();
				$("#UseradduserApproveButton").show();
			"""),format.raw/*23.4*/("""}"""),format.raw/*23.5*/("""
			if($("#Useraddstatus :selected").val() =='PendingApproval')"""),format.raw/*24.63*/("""{"""),format.raw/*24.64*/("""
				$("#UseradduserdisapproveButton").show();
				$("#UseradduserApproveButton").show();
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
 """),format.raw/*29.2*/("""}"""),format.raw/*29.3*/(""");
 
 function Usereditmanager_customParameterBuilder()"""),format.raw/*31.51*/("""{"""),format.raw/*31.52*/("""
	   return $('#Usereditrolex :selected').val()
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
 
 function Useredit_onCardReady(_wizard)"""),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""
	 if((_wizard).index==1)"""),format.raw/*36.25*/("""{"""),format.raw/*36.26*/("""
		 $("#UsereditannualIncome").focusout(function()"""),format.raw/*37.50*/("""{"""),format.raw/*37.51*/("""          
		        $("#Useredithourlyrate").val((parseInt($('input[id=UsereditannualIncome]').val(),10)/2080).toFixed(2));
		     """),format.raw/*39.8*/("""}"""),format.raw/*39.9*/(""");
	 """),format.raw/*40.3*/("""}"""),format.raw/*40.4*/("""
 """),format.raw/*41.2*/("""}"""),format.raw/*41.3*/("""
 
 
function Useradd_gridAction_isToBeHidden(_action)"""),format.raw/*44.50*/("""{"""),format.raw/*44.51*/("""
	 if(_action == 'Cross' && $("#Useraddstatus :selected").val() == 'Approved')"""),format.raw/*45.78*/("""{"""),format.raw/*45.79*/("""
		return false; 
	 """),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
	 
	if(_action == 'Tick' && $("#Useraddstatus :selected").val() == 'Disapproved')"""),format.raw/*49.79*/("""{"""),format.raw/*49.80*/("""
		return false; 
	 """),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
	if($("#Useraddstatus :selected").val() == 'PendingApproval')"""),format.raw/*52.62*/("""{"""),format.raw/*52.63*/("""
		return false; 
	 """),format.raw/*54.3*/("""}"""),format.raw/*54.4*/("""
	 return true;
 """),format.raw/*56.2*/("""}"""),format.raw/*56.3*/("""
 
$( ".tooltipShow" ).tooltip("""),format.raw/*58.29*/("""{"""),format.raw/*58.30*/(""" 
	content: "Awesome title!",
	position : "right"
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/(""");


$( ".tooltipShow" ).tooltip('show');
 
 function User_confimationDialog(_url)
 """),format.raw/*67.2*/("""{"""),format.raw/*67.3*/("""
	 if(_url == '/userStatusApprove')"""),format.raw/*68.35*/("""{"""),format.raw/*68.36*/("""
		 return true;
	 """),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
	 
	 if(_url == '/userStatusdisapprove')"""),format.raw/*72.38*/("""{"""),format.raw/*72.39*/("""
		 return true;
	 """),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
	 return false;
	
 """),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
 
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
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/status/userStatus.scala.html
                    HASH: 71344e007dd5edb9944935fb2777e53c044a17b9
                    MATRIX: 791->1|961->94|998->97|1029->120|1068->122|1109->129|1160->159|1259->224|1313->257|1346->260|1442->328|1471->329|1632->462|1661->463|1746->520|1775->521|1898->617|1926->618|2014->678|2043->679|2166->775|2194->776|2286->840|2315->841|2438->937|2466->938|2498->943|2526->944|2558->949|2586->950|2671->1007|2700->1008|2777->1058|2805->1059|2877->1103|2906->1104|2960->1130|2989->1131|3068->1182|3097->1183|3258->1317|3286->1318|3319->1324|3347->1325|3377->1328|3405->1329|3490->1386|3519->1387|3626->1466|3655->1467|3704->1489|3732->1490|3844->1574|3873->1575|3922->1597|3950->1598|4041->1661|4070->1662|4119->1684|4147->1685|4193->1704|4221->1705|4282->1738|4311->1739|4391->1792|4419->1793|4536->1883|4564->1884|4628->1920|4657->1921|4705->1942|4733->1943|4804->1986|4833->1987|4881->2008|4909->2009|4959->2032|4987->2033
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|38->10|38->10|43->15|43->15|44->16|44->16|47->19|47->19|48->20|48->20|51->23|51->23|52->24|52->24|55->27|55->27|56->28|56->28|57->29|57->29|59->31|59->31|61->33|61->33|63->35|63->35|64->36|64->36|65->37|65->37|67->39|67->39|68->40|68->40|69->41|69->41|72->44|72->44|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|80->52|80->52|82->54|82->54|84->56|84->56|86->58|86->58|89->61|89->61|95->67|95->67|96->68|96->68|98->70|98->70|100->72|100->72|102->74|102->74|105->77|105->77
                    -- GENERATED --
                */
            