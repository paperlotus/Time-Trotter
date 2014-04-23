
package views.html

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
object menuContext extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(menuContext: dto.MenuBar,user: models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""
<div class="tabbable container">
<ul class="nav nav-tabs" style="background:#5c5c5c;">
	"""),_display_(Seq[Any](/*4.3*/for(items<-menuContext.items) yield /*4.32*/{_display_(Seq[Any](format.raw/*4.33*/("""
		
		 """),_display_(Seq[Any](/*6.5*/if(items.isSubMenu())/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
		  	
		  		"""),_display_(Seq[Any](/*8.8*/if(items.name == "Logout")/*8.34*/{_display_(Seq[Any](format.raw/*8.35*/("""
		  		<li style="float:right;">
		 			 <a href=""""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Application.index)),format.raw/*10.42*/("""" style="padding-top: 8px; float:left;"> """),_display_(Seq[Any](/*10.84*/user/*10.88*/.firstName)),format.raw/*10.98*/(""" |</a>
		 			 <a style="float:left;" href='"""),_display_(Seq[Any](/*11.38*/items/*11.43*/.url)),format.raw/*11.47*/("""'>"""),_display_(Seq[Any](/*11.50*/items/*11.55*/.name)),format.raw/*11.60*/("""</a>
		 		</li>
		 		""")))}/*13.7*/else/*13.11*/{_display_(Seq[Any](format.raw/*13.12*/("""
		 		<li>
		 			<a href='"""),_display_(Seq[Any](/*15.17*/items/*15.22*/.url)),format.raw/*15.26*/("""'>"""),_display_(Seq[Any](/*15.29*/items/*15.34*/.name)),format.raw/*15.39*/("""</a>
		 		</li>
		 		""")))})),format.raw/*17.7*/("""
		 	
		 """)))}/*19.5*/else/*19.9*/{_display_(Seq[Any](format.raw/*19.10*/("""
		 	<li class="dropdown">
		 		"""),_display_(Seq[Any](/*21.7*/if(items.name == "Action Items")/*21.39*/{_display_(Seq[Any](format.raw/*21.40*/("""
		 			"""),_display_(Seq[Any](/*22.8*/if(controllers.Application.count != 0)/*22.46*/{_display_(Seq[Any](format.raw/*22.47*/("""
		 			<div class="noti_bubble">"""),_display_(Seq[Any](/*23.33*/controllers/*23.44*/.Application.count)),format.raw/*23.62*/("""</div>
		 			""")))})),format.raw/*24.8*/("""
		 		""")))})),format.raw/*25.7*/("""	
		 			<a class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" href="#">"""),_display_(Seq[Any](/*26.89*/items/*26.94*/.name)),format.raw/*26.99*/(""" <b class="caret"></b></a>
		 			<ul class="dropdown-menu">
                  	"""),_display_(Seq[Any](/*28.21*/for(subMenu<-items.subMenu) yield /*28.48*/{_display_(Seq[Any](format.raw/*28.49*/("""
                 	 <li><a href='"""),_display_(Seq[Any](/*29.34*/subMenu/*29.41*/.url)),format.raw/*29.45*/("""' >"""),_display_(Seq[Any](/*29.49*/subMenu/*29.56*/.name)),format.raw/*29.61*/("""</a></li>
                 	 """)))})),format.raw/*30.21*/("""
                </ul>
		 	</li>
		 """)))})),format.raw/*33.5*/("""
		 
	""")))})),format.raw/*35.3*/("""
</ul>
<div class="tab-content">
	<div class="tab-pane active" id="tab-panel-holder-contents">
		
	</div>
</div>
</div>

<script>
	function loadTabContent(_url)"""),format.raw/*45.31*/("""{"""),format.raw/*45.32*/("""
		$.post(_url,'',function(data)"""),format.raw/*46.32*/("""{"""),format.raw/*46.33*/("""
			$('#tab-panel-holder-contents').empty();
			$('#tab-panel-holder-contents').html(data);			
		"""),format.raw/*49.3*/("""}"""),format.raw/*49.4*/(""");
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/("""
	
	$('ul.nav li.dropdown').hover(function() """),format.raw/*52.43*/("""{"""),format.raw/*52.44*/("""
		  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(5);
		"""),format.raw/*54.3*/("""}"""),format.raw/*54.4*/(""", function() """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/("""
		  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(5);
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/(""");

</script>

<style>
.noti_bubble """),format.raw/*61.14*/("""{"""),format.raw/*61.15*/("""
    position:absolute;
    top: -18px;
    right:14px;
    padding:4px 8px 2px 8px;
    background-color:orange;
    color:white;
    font-weight:bold;
    font-size:14px;
    
    border-radius:30px;
    box-shadow:1px 1px 1px gray;
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
</style>
"""))}
    }
    
    def render(menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (menuContext,user) => apply(menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/menuContext.scala.html
                    HASH: 7c938ea165cbfcb8ab7b05d327d9ffb4127f2cac
                    MATRIX: 751->1|877->50|1004->143|1048->172|1086->173|1130->183|1159->204|1197->205|1247->221|1281->247|1319->248|1407->300|1422->306|1462->324|1540->366|1553->370|1585->380|1666->425|1680->430|1706->434|1745->437|1759->442|1786->447|1828->471|1841->475|1880->476|1945->505|1959->510|1985->514|2024->517|2038->522|2065->527|2120->551|2150->563|2162->567|2201->568|2271->603|2312->635|2351->636|2395->645|2442->683|2481->684|2551->718|2571->729|2611->747|2657->762|2696->770|2823->861|2837->866|2864->871|2982->953|3025->980|3064->981|3135->1016|3151->1023|3177->1027|3217->1031|3233->1038|3260->1043|3323->1074|3394->1114|3434->1123|3632->1293|3661->1294|3722->1327|3751->1328|3878->1428|3906->1429|3938->1434|3966->1435|4041->1482|4070->1483|4176->1562|4204->1563|4245->1576|4274->1577|4381->1657|4409->1658|4478->1699|4507->1700|4781->1947|4809->1948
                    LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|43->15|43->15|43->15|45->17|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|57->29|57->29|57->29|58->30|61->33|63->35|73->45|73->45|74->46|74->46|77->49|77->49|78->50|78->50|80->52|80->52|82->54|82->54|82->54|82->54|84->56|84->56|89->61|89->61|101->73|101->73
                    -- GENERATED --
                */
            