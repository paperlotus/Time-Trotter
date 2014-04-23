
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html >
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/clock.png"))),format.raw/*9.95*/("""">
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*10.39*/routes/*10.45*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.84*/("""">
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*11.39*/routes/*11.45*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*11.95*/("""">
         <link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.40*/routes/*12.46*/.Assets.at("stylesheets/ui.jqgrid.css"))),format.raw/*12.85*/("""">
         <link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.40*/routes/*13.46*/.Assets.at("stylesheets/jquery-ui-custom.css"))),format.raw/*13.92*/("""">
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*14.41*/routes/*14.47*/.Assets.at("stylesheets/bootstrap-wizard.css"))),format.raw/*14.93*/("""" />
          <link rel="stylesheet" href=""""),_display_(Seq[Any](/*15.41*/routes/*15.47*/.Assets.at("stylesheets/fuelux.css"))),format.raw/*15.83*/("""">
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*16.41*/routes/*16.47*/.Assets.at("stylesheets/fuelux-responsive.min.css"))),format.raw/*16.98*/("""" />
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*17.41*/routes/*17.47*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*17.87*/("""" />
		<link rel="stylesheet"  href=""""),_display_(Seq[Any](/*18.34*/routes/*18.40*/.Assets.at("customCSS/timeTrotter.css"))),format.raw/*18.79*/("""" />         
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*19.41*/routes/*19.47*/.Assets.at("stylesheets/select2.css"))),format.raw/*19.84*/("""" />
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*20.41*/routes/*20.47*/.Assets.at("stylesheets/BarChart.css"))),format.raw/*20.85*/("""" />
         <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*21.41*/routes/*21.47*/.Assets.at("stylesheets/base.css"))),format.raw/*21.81*/("""" />
         
         <link rel="stylesheet"  type="text/css" media="all" href=""""),_display_(Seq[Any](/*23.69*/routes/*23.75*/.Assets.at("stylesheets/jquery.pnotify.default.css"))),format.raw/*23.127*/("""" />
        <script src=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*24.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("javascripts/require.js"))),format.raw/*25.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Assets.at("javascripts/loader.js"))),format.raw/*26.64*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Assets.at("javascripts/pillbox.js"))),format.raw/*27.65*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*28.46*/routes/*28.52*/.Assets.at("javascripts/select2.js"))),format.raw/*28.88*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*29.40*/routes/*29.46*/.Assets.at("javascripts/select2_locale_en.js.template"))),format.raw/*29.101*/(""""></script>
		<script src=""""),_display_(Seq[Any](/*30.17*/routes/*30.23*/.Assets.at("javascripts/jquery-ui-1.9.2.custom.min.js"))),format.raw/*30.78*/("""" type="text/javascript"></script>
		    
        <!-- IMP: If you want to use bootstrap-wizard put it after loader -->
        <script src=""""),_display_(Seq[Any](/*33.23*/routes/*33.29*/.Assets.at("javascripts/bootstrap-wizard.js"))),format.raw/*33.74*/("""" type="text/javascript"></script>
        <!-- IMP: Do not add  bootstrap.js , as loader.js is doing your job -->
        <!-- <script src=""""),_display_(Seq[Any](/*35.28*/routes/*35.34*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*35.76*/("""" type="text/javascript"></script> -->
        <script src=""""),_display_(Seq[Any](/*36.23*/routes/*36.29*/.Assets.at("javascripts/bootstrap-datepicker.js"))),format.raw/*36.78*/("""" type="text/javascript"></script>
         <script src=""""),_display_(Seq[Any](/*37.24*/routes/*37.30*/.Assets.at("javascripts/grid.locale-en.js"))),format.raw/*37.73*/("""" type="text/javascript"></script>
         <script src=""""),_display_(Seq[Any](/*38.24*/routes/*38.30*/.Assets.at("javascripts/jquery.jqGrid.min.js"))),format.raw/*38.76*/("""" type="text/javascript"></script>
         <script src=""""),_display_(Seq[Any](/*39.24*/routes/*39.30*/.Assets.at("javascripts/jquery.validate.min.js"))),format.raw/*39.78*/("""" type="text/javascript"></script>
    	 <script src=""""),_display_(Seq[Any](/*40.21*/routes/*40.27*/.Assets.at("javascripts/jquery.pnotify.min.js"))),format.raw/*40.74*/("""" type="text/javascript"></script>
    	 <script type="text/javascript" src=""""),_display_(Seq[Any](/*41.44*/routes/*41.50*/.Assets.at("javascripts/jit.js"))),format.raw/*41.82*/(""""></script>
    	 <script type="text/javascript" src=""""),_display_(Seq[Any](/*42.44*/routes/*42.50*/.Assets.at("javascripts/bootstrap-datetimepicker.min.js"))),format.raw/*42.107*/(""""></script>
    	 <script type="text/javascript" src=""""),_display_(Seq[Any](/*43.44*/routes/*43.50*/.Assets.at("javascripts/moment.js"))),format.raw/*43.85*/(""""></script>
    	 <script type="text/javascript" src=""""),_display_(Seq[Any](/*44.44*/routes/*44.50*/.Assets.at("javascripts/bootbox.min.js"))),format.raw/*44.90*/(""""></script>
    </head>
    <body>
    	<div id="loading" style='position:fixed;
    							top:50%;
    							left:50%;
    							z-index:1;'>
    		<img alt="loading" src='"""),_display_(Seq[Any](/*51.32*/routes/*51.38*/.Assets.at("images/loading.gif"))),format.raw/*51.70*/("""'>
    	</div>
    
    	"""),_display_(Seq[Any](/*54.7*/views/*54.12*/.html.header())),format.raw/*54.26*/("""
		
		<div class="container">
			"""),_display_(Seq[Any](/*57.5*/content)),format.raw/*57.12*/("""
		</div>
		
		"""),_display_(Seq[Any](/*60.4*/views/*60.9*/.html.footer())),format.raw/*60.23*/("""
    </body>
    <script src=""""),_display_(Seq[Any](/*62.19*/routes/*62.25*/.Assets.at("javascripts/bootstrap-dropdown.js"))),format.raw/*62.72*/("""" type="text/javascript"></script>
    <script type="text/javascript">
    	$("#loading").hide();
    	$(document).bind("ajaxSend", function()"""),format.raw/*65.45*/("""{"""),format.raw/*65.46*/("""
    	   		$("#loading").show();
    	 """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/(""").bind("ajaxComplete", function()"""),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
    	   		$("#loading").hide();
    	 """),format.raw/*69.7*/("""}"""),format.raw/*69.8*/(""");
    	$(document).ready(function()"""),format.raw/*70.34*/("""{"""),format.raw/*70.35*/("""
    	if(localStorage.getItem("notification_mesg"))"""),format.raw/*71.51*/("""{"""),format.raw/*71.52*/("""
	    	$.pnotify("""),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
		        title: '',
		        text: localStorage.getItem("notification_mesg")
		    """),format.raw/*75.7*/("""}"""),format.raw/*75.8*/(""");
    	"""),format.raw/*76.6*/("""}"""),format.raw/*76.7*/("""
    	"""),format.raw/*77.6*/("""}"""),format.raw/*77.7*/(""");
    </script>     
</html>

<style>
.cpnotify"""),format.raw/*82.10*/("""{"""),format.raw/*82.11*/("""
	position: fixed;
	top: 50% !important;
	left: 50% !important;
	z-index:1060;
 """),format.raw/*87.2*/("""}"""),format.raw/*87.3*/("""

</style>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/main.scala.html
                    HASH: c7d99c0ebbcd7e6e659248e3431f5a6c0e87ea9f
                    MATRIX: 727->1|834->31|923->85|949->90|1046->152|1060->158|1115->192|1211->253|1225->259|1276->289|1353->330|1368->336|1429->375|1506->416|1521->422|1593->472|1671->514|1686->520|1747->559|1825->601|1840->607|1908->653|1987->696|2002->702|2070->748|2151->793|2166->799|2224->835|2303->878|2318->884|2391->935|2472->980|2487->986|2549->1026|2623->1064|2638->1070|2699->1109|2789->1163|2804->1169|2863->1206|2944->1251|2959->1257|3019->1295|3100->1340|3115->1346|3171->1380|3290->1463|3305->1469|3380->1521|3443->1548|3458->1554|3525->1599|3618->1656|3633->1662|3691->1698|3784->1755|3799->1761|3856->1796|3949->1853|3964->1859|4022->1895|4138->1975|4153->1981|4211->2017|4298->2068|4313->2074|4391->2129|4455->2157|4470->2163|4547->2218|4725->2360|4740->2366|4807->2411|4985->2553|5000->2559|5064->2601|5161->2662|5176->2668|5247->2717|5341->2775|5356->2781|5421->2824|5515->2882|5530->2888|5598->2934|5692->2992|5707->2998|5777->3046|5868->3101|5883->3107|5952->3154|6066->3232|6081->3238|6135->3270|6226->3325|6241->3331|6321->3388|6412->3443|6427->3449|6484->3484|6575->3539|6590->3545|6652->3585|6865->3762|6880->3768|6934->3800|6995->3826|7009->3831|7045->3845|7114->3879|7143->3886|7194->3902|7207->3907|7243->3921|7310->3952|7325->3958|7394->4005|7564->4147|7593->4148|7659->4187|7687->4188|7748->4221|7777->4222|7843->4261|7871->4262|7935->4298|7964->4299|8043->4350|8072->4351|8117->4368|8146->4369|8259->4455|8287->4456|8322->4464|8350->4465|8383->4471|8411->4472|8487->4520|8516->4521|8623->4601|8651->4602
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|61->33|61->33|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|79->51|79->51|79->51|82->54|82->54|82->54|85->57|85->57|88->60|88->60|88->60|90->62|90->62|90->62|93->65|93->65|95->67|95->67|95->67|95->67|97->69|97->69|98->70|98->70|99->71|99->71|100->72|100->72|103->75|103->75|104->76|104->76|105->77|105->77|110->82|110->82|115->87|115->87
                    -- GENERATED --
                */
            