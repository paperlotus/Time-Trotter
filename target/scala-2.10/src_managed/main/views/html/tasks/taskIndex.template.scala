
package views.html.tasks

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
object taskIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>Manage Tasks</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""
<script type="text/javascript">
 $(document).ready(function()"""),format.raw/*8.30*/("""{"""),format.raw/*8.31*/("""
	 $("#Taskeffort").click(function()"""),format.raw/*9.36*/("""{"""),format.raw/*9.37*/("""
			 var startdt = $("#startDate input").val();
			 var enddt = $("#endDate input").val();
			 
			 var bits1=startdt.split('-');
		     var date1 = new Date(bits1[2],bits1[1],bits1[0],0,0,0,0);
		     
   			 var bits2=enddt.split('-');
			 var date2 = new Date(bits2[2],bits2[1],bits2[0],0,0,0,0);
			 
			 if(date1.getTime() > date2.getTime())
				"""),format.raw/*20.5*/("""{"""),format.raw/*20.6*/("""
					  
				 $.pnotify("""),format.raw/*22.16*/("""{"""),format.raw/*22.17*/("""
				        title: 'Alert!',
				        addclass: 'cpnotify',
				        delay:2500,
				        text: "Invalid Date Selection"
				    """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""");
				"""),format.raw/*28.5*/("""}"""),format.raw/*28.6*/(""" 
	 """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/(""");
	 
	 $("#s2id_Taskproject").after("<a style='margin-left: 2%;' href='"""),_display_(Seq[Any](/*31.68*/routes/*31.74*/.Projects.index)),format.raw/*31.89*/("""'>New Project</a>");
 """),format.raw/*32.2*/("""}"""),format.raw/*32.3*/(""");
 function Taskedit_onCardReady(_wizard)"""),format.raw/*33.40*/("""{"""),format.raw/*33.41*/("""
	 if((_wizard).index==0)"""),format.raw/*34.25*/("""{"""),format.raw/*34.26*/("""
		 $("#Taskediteffort").click(function()"""),format.raw/*35.41*/("""{"""),format.raw/*35.42*/("""
			 var startdt = $("#TaskeditstartDate input").val();
			 var enddt = $("#TaskeditendDate input").val();
			 
			 var bits1=startdt.split('-');
		     var date1 = new Date(bits1[2],bits1[1],bits1[0],0,0,0,0);
		     
   			 var bits2=enddt.split('-');
			 var date2 = new Date(bits2[2],bits2[1],bits2[0],0,0,0,0);
			 
			 if(date1.getTime() > date2.getTime())
				"""),format.raw/*46.5*/("""{"""),format.raw/*46.6*/("""
					  
				 $.pnotify("""),format.raw/*48.16*/("""{"""),format.raw/*48.17*/("""
				        title: 'Alert!',
				        addclass: 'cpnotify',
				        delay:2500,
				        text: "Invalid Date Selection"
				    """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""");
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/(""" 
	 
	 
	 """),format.raw/*57.3*/("""}"""),format.raw/*57.4*/(""");
	 """),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""
	 
 """),format.raw/*60.2*/("""}"""),format.raw/*60.3*/("""
 
 function Taskadd_onCardReady(_wizard)"""),format.raw/*62.39*/("""{"""),format.raw/*62.40*/("""
	 if((_wizard).index==1)"""),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
		 Projectadd_SearchGrid.resizeGrid();  
	 """),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""
 """),format.raw/*66.2*/("""}"""),format.raw/*66.3*/("""
 

 
 
 function Taskedit_onCardReady(_wizard)"""),format.raw/*71.40*/("""{"""),format.raw/*71.41*/("""
	 
	 if((_wizard).index==1)"""),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
		 Projectedit_SearchGrid.resizeGrid();  
	 """),format.raw/*75.3*/("""}"""),format.raw/*75.4*/(""" 
 """),format.raw/*76.2*/("""}"""),format.raw/*76.3*/("""	 
 </script>"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/tasks/taskIndex.scala.html
                    HASH: 46363426d72b42898b2cd5bb8d833babf66719c6
                    MATRIX: 789->1|959->94|996->97|1027->120|1066->122|1107->129|1158->159|1283->250|1337->283|1370->286|1461->350|1489->351|1553->388|1581->389|1970->751|1998->752|2052->778|2081->779|2252->923|2281->924|2316->932|2344->933|2376->938|2404->939|2515->1014|2530->1020|2567->1035|2617->1058|2645->1059|2716->1102|2745->1103|2799->1129|2828->1130|2898->1172|2927->1173|3332->1551|3360->1552|3414->1578|3443->1579|3614->1723|3643->1724|3678->1732|3706->1733|3746->1746|3774->1747|3807->1753|3835->1754|3869->1761|3897->1762|3968->1805|3997->1806|4051->1832|4080->1833|4153->1879|4181->1880|4211->1883|4239->1884|4319->1936|4348->1937|4406->1967|4435->1968|4509->2015|4537->2016|4568->2020|4596->2021
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|36->8|36->8|37->9|37->9|48->20|48->20|50->22|50->22|55->27|55->27|56->28|56->28|57->29|57->29|59->31|59->31|59->31|60->32|60->32|61->33|61->33|62->34|62->34|63->35|63->35|74->46|74->46|76->48|76->48|81->53|81->53|82->54|82->54|85->57|85->57|86->58|86->58|88->60|88->60|90->62|90->62|91->63|91->63|93->65|93->65|94->66|94->66|99->71|99->71|101->73|101->73|103->75|103->75|104->76|104->76
                    -- GENERATED --
                */
            