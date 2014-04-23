
package views.html.report

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
object viewUsageByHrs extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(proId:String):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*5.1*/("""
<link rel="stylesheet"  href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/BarChart.css"))),format.raw/*6.76*/("""" />
<link rel="stylesheet"  href=""""),_display_(Seq[Any](/*7.32*/routes/*7.38*/.Assets.at("stylesheets/base.css"))),format.raw/*7.72*/("""" />
<link rel="stylesheet"  type="text/css" media="all" href=""""),_display_(Seq[Any](/*8.60*/routes/*8.66*/.Assets.at("stylesheets/jquery.pnotify.default.css"))),format.raw/*8.118*/("""" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*9.38*/routes/*9.44*/.Assets.at("javascripts/jit.js"))),format.raw/*9.76*/(""""></script>
<style>
	#custom-modal-container"""),format.raw/*11.25*/("""{"""),format.raw/*11.26*/("""
		width: 900px !important;
		left: 38% !important;
		max-height: 600px !important;
		top: 8% !important;
	"""),format.raw/*16.2*/("""}"""),format.raw/*16.3*/("""

	.formClass"""),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
		padding: 0 30px 40px;
	"""),format.raw/*20.2*/("""}"""),format.raw/*20.3*/("""
	
	.modal-body"""),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""
		max-height: none !important;
	"""),format.raw/*24.2*/("""}"""),format.raw/*24.3*/("""
	
	.modal-footer"""),format.raw/*26.15*/("""{"""),format.raw/*26.16*/("""
		padding: 15px 15px 5px !important;
		text-align: left;
		background-color: none !important;
		margin-top: 15px;
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/("""
	
	table"""),format.raw/*33.7*/("""{"""),format.raw/*33.8*/("""
		width: 100%;
		text-align: center;
		margin-top: 15px;
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/("""
	
	table tr th"""),format.raw/*39.13*/("""{"""),format.raw/*39.14*/("""
		padding: 5px 0 5px;
		border-bottom: 1px solid #333;
	"""),format.raw/*42.2*/("""}"""),format.raw/*42.3*/("""
	
	table tr td"""),format.raw/*44.13*/("""{"""),format.raw/*44.14*/("""
		padding: 5px 0;
		border-bottom: 1px solid #d5d5d5;
		border-left: 1px solid #d5d5d5;
		border-right: 1px solid #d5d5d5;
	"""),format.raw/*49.2*/("""}"""),format.raw/*49.3*/("""
	
	.modal-header .close"""),format.raw/*51.22*/("""{"""),format.raw/*51.23*/("""
		margin-right: -25px;
	"""),format.raw/*53.2*/("""}"""),format.raw/*53.3*/("""
	
</style>

<div class="formClass">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<h4>Graphical Project Details</h4>
	</div>

	<div class="modal-body">	
		<div id="container">
			<div id="left-container">
				<h4>Graph by HRS Spent</h4>
				<div style="display: none;">
					<ul id="id-list" ></ul>
					<a id="update" href="#" class="theme button white">Update Data</a>
				</div>
			</div>
	
			<div id="center-container">
				<div id="infovis"></div>
			</div>
			
			<div id="right-container" style="display: none;">
				<div id="inner-details"></div>
			</div>
			<div id="log"></div>
		</div>
		
		<div id="container2">
			<div id="left-container2" >
				<h4>Graph by Money Spent</h4>
				<div style="display: none;">
					<ul id="id-list2"></ul>
					<a style="display: none;" id="update2" href="#" class="theme button white">Update Data</a>
				</div>	
			</div>
	
			<div id="center-container2">
				<div id="infovis2"></div>
			</div>
			
			<div id="right-container2" style="display: none;">
				<div id="inner-details2"></div>
			</div>
			<div id="log2"></div>
		</div>
	</div>
</div>		
	<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*104.31*/("""{"""),format.raw/*104.32*/("""
			ProjectsaddviewGraph_onReady();			
		"""),format.raw/*106.3*/("""}"""),format.raw/*106.4*/(""");	
	
		function ProjectsaddviewGraph_onReady()"""),format.raw/*108.42*/("""{"""),format.raw/*108.43*/("""
			setTimeout(function()"""),format.raw/*109.25*/("""{"""),format.raw/*109.26*/("""
				$.ajax("""),format.raw/*110.12*/("""{"""),format.raw/*110.13*/("""
					type: "GET",
					dataType: "json",
					url:"/projViewGraphHrs",
					data:"""),format.raw/*114.11*/("""{"""),format.raw/*114.12*/("""id:"""),_display_(Seq[Any](/*114.16*/proId)),format.raw/*114.21*/("""}"""),format.raw/*114.22*/(""",
					success: function(data)"""),format.raw/*115.29*/("""{"""),format.raw/*115.30*/("""
						$("#infovis").empty();
						$("#infovis2").empty();
						init(data[0]);
						init2(data[1]);
					"""),format.raw/*120.6*/("""}"""),format.raw/*120.7*/("""
				"""),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""); 
			"""),format.raw/*122.4*/("""}"""),format.raw/*122.5*/(""",100);
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""
		
		function init(data) """),format.raw/*125.23*/("""{"""),format.raw/*125.24*/("""
			var labelType, useGradients, nativeTextSupport, animate;
			(function() """),format.raw/*127.16*/("""{"""),format.raw/*127.17*/("""
				var ua = navigator.userAgent, iStuff = ua.match(/iPhone/i)
						|| ua.match(/iPad/i), typeOfCanvas = typeof HTMLCanvasElement, nativeCanvasSupport = (typeOfCanvas == 'object' || typeOfCanvas == 'function'), textSupport = nativeCanvasSupport
						&& (typeof document.createElement('canvas')
								.getContext('2d').fillText == 'function');
				//I'm setting this based on the fact that ExCanvas provides text support for IE
				//and that as of today iPhone/iPad current text support is lame
				labelType = (!nativeCanvasSupport || (textSupport && !iStuff)) ? 'Native'
						: 'HTML';
				nativeTextSupport = labelType == 'Native';
				useGradients = true;
				animate = !(iStuff || !nativeCanvasSupport);
			"""),format.raw/*139.4*/("""}"""),format.raw/*139.5*/(""")();
			
			var Log = """),format.raw/*141.14*/("""{"""),format.raw/*141.15*/("""
				elem : false,
				write : function(text) """),format.raw/*143.28*/("""{"""),format.raw/*143.29*/("""
					if (!this.elem)
						this.elem = document.getElementById('log');
					this.elem.innerHTML = text;
					this.elem.style.left = (500 - this.elem.offsetWidth / 2) + 'px';
				"""),format.raw/*148.5*/("""}"""),format.raw/*148.6*/("""
			"""),format.raw/*149.4*/("""}"""),format.raw/*149.5*/(""";
			//init data
			var json = data;
			console.log(json);
			//init BarChart
			var barChart = null;
			barChart = new $jit.BarChart("""),format.raw/*155.33*/("""{"""),format.raw/*155.34*/("""
				//id of the visualization container
				injectInto : 'infovis',
				//whether to add animations
				animate : true,
				//horizontal or vertical barcharts
				orientation : 'vertical',
				//bars separation
				barsOffset : 20,
				//visualization offset
				Margin : """),format.raw/*165.14*/("""{"""),format.raw/*165.15*/("""
					top : 5,
					left : 5,
					right : 5,
					bottom : 5
				"""),format.raw/*170.5*/("""}"""),format.raw/*170.6*/(""",
				//labels offset position
				labelOffset : 5,
				//bars style
				type : useGradients ? 'stacked:gradient' : 'stacked',
				//whether to show the aggregation of the values
				showAggregates : true,
				//whether to show the labels for the bars
				showLabels : true,
				//labels style
				Label : """),format.raw/*180.13*/("""{"""),format.raw/*180.14*/("""
					type : labelType, //Native or HTML
					size : 13,
					family : 'Arial',
					color : 'white'
				"""),format.raw/*185.5*/("""}"""),format.raw/*185.6*/(""",
				//add tooltips
				Tips : """),format.raw/*187.12*/("""{"""),format.raw/*187.13*/("""
					enable : true,
					onShow : function(tip, elem) """),format.raw/*189.35*/("""{"""),format.raw/*189.36*/("""
						tip.innerHTML = "<b>" + elem.name + "</b>: " + elem.value;
					"""),format.raw/*191.6*/("""}"""),format.raw/*191.7*/("""
				"""),format.raw/*192.5*/("""}"""),format.raw/*192.6*/("""
			"""),format.raw/*193.4*/("""}"""),format.raw/*193.5*/(""");
			//load JSON data.
			barChart.loadJSON(json);
			//end
			var list = null;
			list = $jit.id('id-list'), button = $jit.id('update'), orn = $jit
					.id('switch-orientation');
			
			//update json on click 'Update Data'
			$jit.util.addEvent(button, 'click', function() """),format.raw/*202.51*/("""{"""),format.raw/*202.52*/("""
				var util = $jit.util;
				if (util.hasClass(button, 'gray'))
					return;
				util.removeClass(button, 'white');
				util.addClass(button, 'gray');
				barChart.updateJSON(json2);
			"""),format.raw/*209.4*/("""}"""),format.raw/*209.5*/(""");
			//dynamically add legend to list
			var legend = barChart.getLegend(), listItems = [];
			for ( var name in legend) """),format.raw/*212.30*/("""{"""),format.raw/*212.31*/("""
				listItems
						.push('<div class=\'query-color\' style=\'background-color:'
	          + legend[name] +'\'>&nbsp;</div>'
								+ name);
			"""),format.raw/*217.4*/("""}"""),format.raw/*217.5*/("""
			list.innerHTML = '<li>' + listItems.join('</li><li>') + '</li>';
		"""),format.raw/*219.3*/("""}"""),format.raw/*219.4*/("""
		
		function init2(data) """),format.raw/*221.24*/("""{"""),format.raw/*221.25*/("""
			var labelType, useGradients, nativeTextSupport, animate;
	
			(function() """),format.raw/*224.16*/("""{"""),format.raw/*224.17*/("""
				var ua = navigator.userAgent, iStuff = ua.match(/iPhone/i)
						|| ua.match(/iPad/i), typeOfCanvas = typeof HTMLCanvasElement, nativeCanvasSupport = (typeOfCanvas == 'object' || typeOfCanvas == 'function'), textSupport = nativeCanvasSupport
						&& (typeof document.createElement('canvas')
								.getContext('2d').fillText == 'function');
				//I'm setting this based on the fact that ExCanvas provides text support for IE
				//and that as of today iPhone/iPad current text support is lame
				labelType = (!nativeCanvasSupport || (textSupport && !iStuff)) ? 'Native'
						: 'HTML';
				nativeTextSupport = labelType == 'Native';
				useGradients = true;
				animate = !(iStuff || !nativeCanvasSupport);
			"""),format.raw/*236.4*/("""}"""),format.raw/*236.5*/(""")();
	
			var Log = """),format.raw/*238.14*/("""{"""),format.raw/*238.15*/("""
				elem : false,
				write : function(text) """),format.raw/*240.28*/("""{"""),format.raw/*240.29*/("""
					if (!this.elem)
						this.elem = document.getElementById('log2');
					this.elem.innerHTML = text;
					this.elem.style.left = (500 - this.elem.offsetWidth / 2) + 'px';
				"""),format.raw/*245.5*/("""}"""),format.raw/*245.6*/("""
			"""),format.raw/*246.4*/("""}"""),format.raw/*246.5*/(""";
	
			//init data
			var json = data;
			
			//init BarChart
			var barChart = new $jit.BarChart("""),format.raw/*252.37*/("""{"""),format.raw/*252.38*/("""
				//id of the visualization container
				injectInto : 'infovis2',
				//whether to add animations
				animate : true,
				//horizontal or vertical barcharts
				orientation : 'vertical',
				//bars separation
				barsOffset : 20,
				//visualization offset
				Margin : """),format.raw/*262.14*/("""{"""),format.raw/*262.15*/("""
					top : 5,
					left : 5,
					right : 5,
					bottom : 5
				"""),format.raw/*267.5*/("""}"""),format.raw/*267.6*/(""",
				//labels offset position
				labelOffset : 5,
				//bars style
				type : useGradients ? 'stacked:gradient' : 'stacked',
				//whether to show the aggregation of the values
				showAggregates : true,
				//whether to show the labels for the bars
				showLabels : true,
				//labels style
				Label : """),format.raw/*277.13*/("""{"""),format.raw/*277.14*/("""
					type : labelType, //Native or HTML
					size : 13,
					family : 'Arial',
					color : 'white'
				"""),format.raw/*282.5*/("""}"""),format.raw/*282.6*/(""",
				//add tooltips
				Tips : """),format.raw/*284.12*/("""{"""),format.raw/*284.13*/("""
					enable : true,
					onShow : function(tip, elem) """),format.raw/*286.35*/("""{"""),format.raw/*286.36*/("""
						tip.innerHTML = "<b>" + elem.name + "</b>: " + elem.value;
					"""),format.raw/*288.6*/("""}"""),format.raw/*288.7*/("""
				"""),format.raw/*289.5*/("""}"""),format.raw/*289.6*/("""
			"""),format.raw/*290.4*/("""}"""),format.raw/*290.5*/(""");
			//load JSON data.
			barChart.loadJSON(json);
			//end
			var list = $jit.id('id-list2'), button = $jit.id('update2'), orn = $jit
					.id('switch-orientation');
			//update json on click 'Update Data'
			$jit.util.addEvent(button, 'click', function() """),format.raw/*297.51*/("""{"""),format.raw/*297.52*/("""
				var util = $jit.util;
				if (util.hasClass(button, 'gray'))
					return;
				util.removeClass(button, 'white');
				util.addClass(button, 'gray');
				barChart.updateJSON(json2);
			"""),format.raw/*304.4*/("""}"""),format.raw/*304.5*/(""");
			//dynamically add legend to list
			var legend = barChart.getLegend(), listItems = [];
			for ( var name in legend) """),format.raw/*307.30*/("""{"""),format.raw/*307.31*/("""
				listItems
						.push('<div class=\'query-color\' style=\'background-color:'
	          + legend[name] +'\'>&nbsp;</div>'
								+ name);
			"""),format.raw/*312.4*/("""}"""),format.raw/*312.5*/("""
			list.innerHTML = '<li>' + listItems.join('</li><li>') + '</li>';
		"""),format.raw/*314.3*/("""}"""),format.raw/*314.4*/("""
		
	</script>"""))}
    }
    
    def render(proId:String): play.api.templates.Html = apply(proId)
    
    def f:((String) => play.api.templates.Html) = (proId) => apply(proId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/report/viewUsageByHrs.scala.html
                    HASH: 6160de91e718e817b86bef9924dfc7511c098e3a
                    MATRIX: 739->1|882->15|912->72|980->105|994->111|1053->149|1125->186|1139->192|1194->226|1294->291|1308->297|1382->349|1460->392|1474->398|1527->430|1601->476|1630->477|1769->589|1797->590|1840->605|1869->606|1924->634|1952->635|1997->652|2026->653|2088->688|2116->689|2163->708|2192->709|2340->830|2368->831|2406->842|2434->843|2524->906|2552->907|2597->924|2626->925|2713->985|2741->986|2786->1003|2815->1004|2972->1134|3000->1135|3054->1161|3083->1162|3137->1189|3165->1190|4469->2465|4499->2466|4570->2509|4599->2510|4677->2559|4707->2560|4762->2586|4792->2587|4834->2600|4864->2601|4979->2687|5009->2688|5050->2692|5078->2697|5108->2698|5168->2729|5198->2730|5339->2843|5368->2844|5402->2850|5431->2851|5467->2859|5496->2860|5534->2870|5563->2871|5620->2899|5650->2900|5757->2978|5787->2979|6545->3709|6574->3710|6627->3734|6657->3735|6734->3783|6764->3784|6976->3968|7005->3969|7038->3974|7067->3975|7236->4115|7266->4116|7578->4399|7608->4400|7707->4471|7736->4472|8081->4788|8111->4789|8249->4899|8278->4900|8341->4934|8371->4935|8457->4992|8487->4993|8588->5066|8617->5067|8651->5073|8680->5074|8713->5079|8742->5080|9056->5365|9086->5366|9309->5561|9338->5562|9492->5687|9522->5688|9702->5840|9731->5841|9832->5914|9861->5915|9919->5944|9949->5945|10059->6026|10089->6027|10847->6757|10876->6758|10927->6780|10957->6781|11034->6829|11064->6830|11277->7015|11306->7016|11339->7021|11368->7022|11501->7126|11531->7127|11844->7411|11874->7412|11973->7483|12002->7484|12347->7800|12377->7801|12515->7911|12544->7912|12607->7946|12637->7947|12723->8004|12753->8005|12854->8078|12883->8079|12917->8085|12946->8086|12979->8091|13008->8092|13302->8357|13332->8358|13555->8553|13584->8554|13738->8679|13768->8680|13948->8832|13977->8833|14078->8906|14107->8907
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|45->16|45->16|47->18|47->18|49->20|49->20|51->22|51->22|53->24|53->24|55->26|55->26|60->31|60->31|62->33|62->33|66->37|66->37|68->39|68->39|71->42|71->42|73->44|73->44|78->49|78->49|80->51|80->51|82->53|82->53|133->104|133->104|135->106|135->106|137->108|137->108|138->109|138->109|139->110|139->110|143->114|143->114|143->114|143->114|143->114|144->115|144->115|149->120|149->120|150->121|150->121|151->122|151->122|152->123|152->123|154->125|154->125|156->127|156->127|168->139|168->139|170->141|170->141|172->143|172->143|177->148|177->148|178->149|178->149|184->155|184->155|194->165|194->165|199->170|199->170|209->180|209->180|214->185|214->185|216->187|216->187|218->189|218->189|220->191|220->191|221->192|221->192|222->193|222->193|231->202|231->202|238->209|238->209|241->212|241->212|246->217|246->217|248->219|248->219|250->221|250->221|253->224|253->224|265->236|265->236|267->238|267->238|269->240|269->240|274->245|274->245|275->246|275->246|281->252|281->252|291->262|291->262|296->267|296->267|306->277|306->277|311->282|311->282|313->284|313->284|315->286|315->286|317->288|317->288|318->289|318->289|319->290|319->290|326->297|326->297|333->304|333->304|336->307|336->307|341->312|341->312|343->314|343->314
                    -- GENERATED --
                */
            