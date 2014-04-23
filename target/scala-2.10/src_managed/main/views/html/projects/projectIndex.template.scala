
package views.html.projects

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
object projectIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>Manage Projects</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""

<script type="text/javascript">
 $(document).ready(function()"""),format.raw/*9.30*/("""{"""),format.raw/*9.31*/("""
	 $("#Projectbudget").click(function()"""),format.raw/*10.39*/("""{"""),format.raw/*10.40*/("""
			 var startdt = $("#startDate input").val();
			 var enddt = $("#endDate input").val();
			 
			 var bits1=startdt.split('-');
		     var date1 = new Date(bits1[2],bits1[1],bits1[0],0,0,0,0);
		     
   			 var bits2=enddt.split('-');
			 var date2 = new Date(bits2[2],bits2[1],bits2[0],0,0,0,0);
			 
			 if(date1.getTime() > date2.getTime())
				"""),format.raw/*21.5*/("""{"""),format.raw/*21.6*/("""
					  
				 $.pnotify("""),format.raw/*23.16*/("""{"""),format.raw/*23.17*/("""
				        title: 'Alert!',
				        addclass: 'cpnotify',
				        delay:2500,
				        text: "Invalid Date Selection"
				    """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");
				"""),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""" 
	 """),format.raw/*30.3*/("""}"""),format.raw/*30.4*/(""");
	 
	 $("#s2id_ProjectclientName").after("<a style='margin-left: 2%;' href='"""),_display_(Seq[Any](/*32.74*/routes/*32.80*/.Clients.index)),format.raw/*32.94*/("""'>New Client</a>");
 """),format.raw/*33.2*/("""}"""),format.raw/*33.3*/(""");
 
 function Projectadd_onCardReady(_wizard)"""),format.raw/*35.42*/("""{"""),format.raw/*35.43*/("""
	 
 """),format.raw/*37.2*/("""}"""),format.raw/*37.3*/("""
 

 
 
 function Projectedit_onCardReady(_wizard)"""),format.raw/*42.43*/("""{"""),format.raw/*42.44*/("""
	 
	 if((_wizard).index==2)"""),format.raw/*44.25*/("""{"""),format.raw/*44.26*/("""
		 Useredit_SearchGrid.resizeGrid();  
	 """),format.raw/*46.3*/("""}"""),format.raw/*46.4*/(""" 
	 
	 if((_wizard).index==1)"""),format.raw/*48.25*/("""{"""),format.raw/*48.26*/("""
		 $("#Projecteditbudget").click(function()"""),format.raw/*49.44*/("""{"""),format.raw/*49.45*/("""
			 var startdt = $("#ProjecteditstartDate input").val();
			 var enddt = $("#ProjecteditendDate input").val();
			 
			 var bits1=startdt.split('-');
		     var date1 = new Date(bits1[2],bits1[1],bits1[0],0,0,0,0);
		     
   			 var bits2=enddt.split('-');
			 var date2 = new Date(bits2[2],bits2[1],bits2[0],0,0,0,0);
			 
			 if(date1.getTime() > date2.getTime())
				"""),format.raw/*60.5*/("""{"""),format.raw/*60.6*/("""
					  
				 $.pnotify("""),format.raw/*62.16*/("""{"""),format.raw/*62.17*/("""
				        title: 'Alert!',
				        addclass: 'cpnotify',
				        delay:2500,
				        text: "Invalid Date Selection"
				    """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""");
				"""),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""" 
	 
	 
	 """),format.raw/*71.3*/("""}"""),format.raw/*71.4*/(""");
	 """),format.raw/*72.3*/("""}"""),format.raw/*72.4*/("""
	 
 """),format.raw/*74.2*/("""}"""),format.raw/*74.3*/("""
 
 
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
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/projects/projectIndex.scala.html
                    HASH: fb9d276f01dcab1f2e411b60fc14d8d1b1010755
                    MATRIX: 795->1|965->94|1002->97|1033->120|1072->122|1113->129|1164->159|1292->253|1346->286|1379->289|1472->355|1500->356|1568->396|1597->397|1986->759|2014->760|2068->786|2097->787|2268->931|2297->932|2332->940|2360->941|2392->946|2420->947|2537->1028|2552->1034|2588->1048|2637->1070|2665->1071|2741->1119|2770->1120|2804->1127|2832->1128|2915->1183|2944->1184|3002->1214|3031->1215|3102->1259|3130->1260|3189->1291|3218->1292|3291->1337|3320->1338|3731->1722|3759->1723|3813->1749|3842->1750|4013->1894|4042->1895|4077->1903|4105->1904|4145->1917|4173->1918|4206->1924|4234->1925|4268->1932|4296->1933
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|37->9|37->9|38->10|38->10|49->21|49->21|51->23|51->23|56->28|56->28|57->29|57->29|58->30|58->30|60->32|60->32|60->32|61->33|61->33|63->35|63->35|65->37|65->37|70->42|70->42|72->44|72->44|74->46|74->46|76->48|76->48|77->49|77->49|88->60|88->60|90->62|90->62|95->67|95->67|96->68|96->68|99->71|99->71|100->72|100->72|102->74|102->74
                    -- GENERATED --
                */
            