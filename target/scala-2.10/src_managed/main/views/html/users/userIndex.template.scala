
package views.html.users

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
object userIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>Manage Users</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""
 <script type="text/javascript">
   
	     $(document).ready(function()"""),format.raw/*9.35*/("""{"""),format.raw/*9.36*/("""
	       
		   $("#UserannualIncome").focusout(function()"""),format.raw/*11.48*/("""{"""),format.raw/*11.49*/("""          
              $("#Userhourlyrate").val((parseInt($('input[id=UserannualIncome]').val(),10)/2080).toFixed(2));
           """),format.raw/*13.12*/("""}"""),format.raw/*13.13*/(""");	
	     """),format.raw/*14.7*/("""}"""),format.raw/*14.8*/(""");
	     
	     function Usermanager_customParameterBuilder()"""),format.raw/*16.52*/("""{"""),format.raw/*16.53*/("""
	    	   return $('#Userrolex :selected').val()
	     """),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""
	     
	     function Usereditmanager_customParameterBuilder()"""),format.raw/*20.56*/("""{"""),format.raw/*20.57*/("""
	    	   return $('#Usereditrolex :selected').val()
	     """),format.raw/*22.7*/("""}"""),format.raw/*22.8*/("""
	     
	     function Userhrmanager_customParameterBuilder()"""),format.raw/*24.54*/("""{"""),format.raw/*24.55*/("""
	    	   return $('#Userrolex :selected').val()
	     """),format.raw/*26.7*/("""}"""),format.raw/*26.8*/("""
	     
	     function Useredit_onCardReady(_wizard)"""),format.raw/*28.45*/("""{"""),format.raw/*28.46*/("""
	    	 if((_wizard).index==1)"""),format.raw/*29.30*/("""{"""),format.raw/*29.31*/("""
	    		 $("#UsereditannualIncome").focusout(function()"""),format.raw/*30.55*/("""{"""),format.raw/*30.56*/("""
	    			 alert($("#UsereditannualIncome").val());
	    			 if($("#UsereditannualIncome").val() != null && $("#UsereditannualIncome").val() != "")"""),format.raw/*32.96*/("""{"""),format.raw/*32.97*/("""
	    		 		$("#Useredithourlyrate").val((parseInt($('input[id=UsereditannualIncome]').val(),10)/2080).toFixed(2));
	    			 """),format.raw/*34.10*/("""}"""),format.raw/*34.11*/("""
	    		 """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""");
	    		 
	    		 checkEmployeeStatus();
	    		 
	    		 $("#Usereditstatus").change(function()"""),format.raw/*39.47*/("""{"""),format.raw/*39.48*/("""
	    			 checkEmployeeStatus(); 
	    		 """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""");
	    		 
	    		 $("#Useraddstatus").change(function()"""),format.raw/*43.46*/("""{"""),format.raw/*43.47*/("""
	    			 checkEmployeeStatus(); 
	    		 """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");
	    		 
	    	 """),format.raw/*47.8*/("""}"""),format.raw/*47.9*/("""
	     
	     
	    	 if((_wizard).index==0)"""),format.raw/*50.30*/("""{"""),format.raw/*50.31*/("""
	    		 $('#Usereditemail').attr("disabled","disabled")
	    	 """),format.raw/*52.8*/("""}"""),format.raw/*52.9*/("""
	     """),format.raw/*53.7*/("""}"""),format.raw/*53.8*/("""
	     
	     function checkEmployeeStatus()"""),format.raw/*55.37*/("""{"""),format.raw/*55.38*/("""
	    	 if($("#Usereditstatus").val() === "OffRolls" )"""),format.raw/*56.54*/("""{"""),format.raw/*56.55*/("""
    			 $("#UsereditreleaseDate").addClass("addDisplayNoneClass");
    		 """),format.raw/*58.8*/("""}"""),format.raw/*58.9*/("""else if($("#Usereditstatus").val() === "OnRolls" )"""),format.raw/*58.59*/("""{"""),format.raw/*58.60*/("""
    			 $("#UsereditreleaseDate").removeClass("addDisplayNoneClass");
    		 """),format.raw/*60.8*/("""}"""),format.raw/*60.9*/("""
	     """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
	     
 </script>"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/users/userIndex.scala.html
                    HASH: 0d3453307e7db12e946e7c1ffbe230274b420bcb
                    MATRIX: 789->1|959->94|996->97|1027->120|1066->122|1107->129|1158->159|1283->250|1337->283|1370->286|1472->361|1500->362|1587->421|1616->422|1778->556|1807->557|1845->568|1873->569|1964->632|1993->633|2077->690|2105->691|2198->756|2227->757|2315->818|2343->819|2434->882|2463->883|2547->940|2575->941|2657->995|2686->996|2745->1027|2774->1028|2858->1084|2887->1085|3063->1233|3092->1234|3246->1360|3275->1361|3312->1371|3341->1372|3471->1474|3500->1475|3571->1519|3600->1520|3687->1579|3716->1580|3787->1624|3816->1625|3864->1646|3892->1647|3967->1694|3996->1695|4089->1761|4117->1762|4152->1770|4180->1771|4254->1817|4283->1818|4366->1873|4395->1874|4499->1951|4527->1952|4605->2002|4634->2003|4741->2083|4769->2084|4804->2092|4832->2093
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|37->9|37->9|39->11|39->11|41->13|41->13|42->14|42->14|44->16|44->16|46->18|46->18|48->20|48->20|50->22|50->22|52->24|52->24|54->26|54->26|56->28|56->28|57->29|57->29|58->30|58->30|60->32|60->32|62->34|62->34|63->35|63->35|67->39|67->39|69->41|69->41|71->43|71->43|73->45|73->45|75->47|75->47|78->50|78->50|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|86->58|86->58|86->58|86->58|88->60|88->60|89->61|89->61
                    -- GENERATED --
                */
            