
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
object UIPageGenerator extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[com.mnt.core.helper.UIModel,Boolean,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_pageContext:com.mnt.core.helper.UIModel,isModal:Boolean):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/if(isModal)/*3.13*/{_display_(Seq[Any](format.raw/*3.14*/("""
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	
		<h2>"""),_display_(Seq[Any](/*7.8*/_pageContext/*7.20*/.pageTitle)),format.raw/*7.30*/("""</h2>
	</div>
	<div class="modal-body">	
""")))})),format.raw/*10.2*/("""
<form  id='"""),_display_(Seq[Any](/*11.13*/(_pageContext.pageName + "_form"))),format.raw/*11.46*/("""' action="">
 	<div class="container">	   
	"""),_display_(Seq[Any](/*13.3*/for(rlist<-_pageContext.getFieldLayout.iterator) yield /*13.51*/{_display_(Seq[Any](format.raw/*13.52*/("""
	     <div class="row-fluid">
	     	"""),_display_(Seq[Any](/*15.9*/for(fieldType<-rlist.iterator) yield /*15.39*/{_display_(Seq[Any](format.raw/*15.40*/("""
		     	"""),_display_(Seq[Any](/*16.10*/rlist/*16.15*/.size/*16.20*/ match/*16.26*/{/*17.10*/case 1 =>/*17.19*/{_display_(Seq[Any](format.raw/*17.20*/("""
		     			<div class="span12">
		     			"""),_display_(Seq[Any](/*19.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*19.61*/("""
		     		""")))}/*21.10*/case 2 =>/*21.19*/{_display_(Seq[Any](format.raw/*21.20*/("""
		     			<div class="span6">
		     			"""),_display_(Seq[Any](/*23.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*23.61*/("""
		     		""")))}/*25.10*/case 3 =>/*25.19*/{_display_(Seq[Any](format.raw/*25.20*/("""
		     			<div class="span4">
		     			"""),_display_(Seq[Any](/*27.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*27.61*/("""
		     		""")))}/*29.10*/case 4 =>/*29.19*/{_display_(Seq[Any](format.raw/*29.20*/("""
		     			<div class="span3">
		     			"""),_display_(Seq[Any](/*31.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*31.61*/("""
		     		""")))}/*33.10*/case 6 =>/*33.19*/{_display_(Seq[Any](format.raw/*33.20*/("""
		     			<div class="span2">
		     			"""),_display_(Seq[Any](/*35.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*35.61*/("""
		     		""")))}/*37.10*/case 7 =>/*37.19*/{_display_(Seq[Any](format.raw/*37.20*/("""
		     			<div class="span1">
		     			"""),_display_(Seq[Any](/*39.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*39.61*/("""
		     		""")))}/*41.10*/case 8 =>/*41.19*/{_display_(Seq[Any](format.raw/*41.20*/("""
		     			<div class="span1">
		     			"""),_display_(Seq[Any](/*43.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*43.61*/("""
		     		""")))}/*45.10*/case 9 =>/*45.19*/{_display_(Seq[Any](format.raw/*45.20*/("""
		     			<div class="span1">
		     			"""),_display_(Seq[Any](/*47.12*/UIField(fieldType,_pageContext.pageName,"span12"))),format.raw/*47.61*/("""
		     		""")))}})),format.raw/*49.10*/("""
		     			</div>
	     	""")))})),format.raw/*51.9*/("""
	     </div>
	""")))})),format.raw/*53.3*/("""   			
		
    
 	</div>
 	
		     
		 
</form>
"""),_display_(Seq[Any](/*61.2*/if(isModal)/*61.13*/{_display_(Seq[Any](format.raw/*61.14*/("""
	</div><!-- /modal-body -->
	<div class="modal-footer">
		<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
""")))})),format.raw/*65.2*/("""	
	"""),_display_(Seq[Any](/*66.3*/for(button <- _pageContext.getButtonActions) yield /*66.47*/{_display_(Seq[Any](format.raw/*66.48*/("""
  		"""),_display_(Seq[Any](/*67.6*/if(button.visibility)/*67.27*/{_display_(Seq[Any](format.raw/*67.28*/("""
		  			<button type="button" id='"""),_display_(Seq[Any](/*68.35*/(_pageContext.pageName  +   button.id))),format.raw/*68.73*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*68.101*/button/*68.107*/.label)),format.raw/*68.113*/("""</button>
  		""")))})),format.raw/*69.6*/("""
  	""")))})),format.raw/*70.5*/("""
 """),_display_(Seq[Any](/*71.3*/if(isModal)/*71.14*/{_display_(Seq[Any](format.raw/*71.15*/(""" 		    
  	</div>
  """)))})),format.raw/*73.4*/("""
<script>

$(document).ready(function()"""),format.raw/*76.29*/("""{"""),format.raw/*76.30*/("""
	
	var """),_display_(Seq[Any](/*78.7*/(_pageContext.pageName  + "_jsObject"))),format.raw/*78.45*/(""" = """),format.raw/*78.48*/("""{"""),format.raw/*78.49*/("""
		initialise: function ()"""),format.raw/*79.26*/("""{"""),format.raw/*79.27*/("""
			this.bindButtons();
		"""),format.raw/*81.3*/("""}"""),format.raw/*81.4*/(""",
		bindButtons: function()"""),format.raw/*82.26*/("""{"""),format.raw/*82.27*/("""
			"""),_display_(Seq[Any](/*83.5*/(_pageContext.pageName +"_this"))),format.raw/*83.37*/(""" = """),_display_(Seq[Any](/*83.41*/(_pageContext.pageName + "_jsObject"))),format.raw/*83.78*/(""";
			"""),_display_(Seq[Any](/*84.5*/for(button <- _pageContext.getButtonActions) yield /*84.49*/{_display_(Seq[Any](format.raw/*84.50*/("""
				"""),_display_(Seq[Any](/*85.6*/if(button.visibility)/*85.27*/{_display_(Seq[Any](format.raw/*85.28*/("""
			  		"""),_display_(Seq[Any](/*86.9*/button/*86.15*/.target.name/*86.27*/ match/*86.33*/{/*87.7*/case "SUBMIT" =>/*87.23*/ {_display_(Seq[Any](format.raw/*87.25*/("""
							$('#"""),_display_(Seq[Any](/*88.13*/(_pageContext.pageName  +   button.id))),format.raw/*88.51*/("""').click(function()"""),format.raw/*88.70*/("""{"""),format.raw/*88.71*/("""
								"""),_display_(Seq[Any](/*89.10*/(_pageContext.pageName + "_this"))),format.raw/*89.43*/(""".doSubmitAction(""""),_display_(Seq[Any](/*89.61*/button/*89.67*/.url)),format.raw/*89.71*/("""");	
				  			"""),format.raw/*90.10*/("""}"""),format.raw/*90.11*/(""");
				  		""")))}/*92.7*/case "MODAL" =>/*92.22*/ {_display_(Seq[Any](format.raw/*92.24*/("""
							$('#"""),_display_(Seq[Any](/*93.13*/(_pageContext.pageName  +   button.id))),format.raw/*93.51*/("""').click(function()"""),format.raw/*93.70*/("""{"""),format.raw/*93.71*/("""
								
				  			"""),format.raw/*95.10*/("""}"""),format.raw/*95.11*/(""");
						""")))}/*97.7*/case "ACTION" =>/*97.23*/ {_display_(Seq[Any](format.raw/*97.25*/("""
							$('#"""),_display_(Seq[Any](/*98.13*/(_pageContext.pageName  +   button.id))),format.raw/*98.51*/("""').click(function()"""),format.raw/*98.70*/("""{"""),format.raw/*98.71*/("""
								"""),_display_(Seq[Any](/*99.10*/(_pageContext.pageName + "_this"))),format.raw/*99.43*/(""".doCustomAction(""""),_display_(Seq[Any](/*99.61*/button/*99.67*/.url)),format.raw/*99.71*/("""");
				  			"""),format.raw/*100.10*/("""}"""),format.raw/*100.11*/(""");
						""")))}})),format.raw/*102.9*/("""
		  		""")))})),format.raw/*103.8*/("""
			""")))})),format.raw/*104.5*/("""
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/(""",
		doCustomAction: function(_url)"""),format.raw/*106.33*/("""{"""),format.raw/*106.34*/("""
			
			$.ajax("""),format.raw/*108.11*/("""{"""),format.raw/*108.12*/("""
				url:_url,
				data: """),format.raw/*110.11*/("""{"""),format.raw/*110.12*/("""
					query: function()"""),format.raw/*111.23*/("""{"""),format.raw/*111.24*/("""
						
					"""),format.raw/*113.6*/("""}"""),format.raw/*113.7*/("""
				"""),format.raw/*114.5*/("""}"""),format.raw/*114.6*/(""",
				success: function(data) """),format.raw/*115.29*/("""{"""),format.raw/*115.30*/("""
						
				"""),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""",
				error: function(data) """),format.raw/*118.27*/("""{"""),format.raw/*118.28*/("""
					
				"""),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
			"""),format.raw/*121.4*/("""}"""),format.raw/*121.5*/(""")
		"""),format.raw/*122.3*/("""}"""),format.raw/*122.4*/(""",
		doSubmitAction: function(_url)"""),format.raw/*123.33*/("""{"""),format.raw/*123.34*/("""
			
			$('#"""),_display_(Seq[Any](/*125.9*/(_pageContext.pageName + "_form"))),format.raw/*125.42*/("""').attr('action' ,_url);
			$('#"""),_display_(Seq[Any](/*126.9*/(_pageContext.pageName + "_form"))),format.raw/*126.42*/("""').submit();
		"""),format.raw/*127.3*/("""}"""),format.raw/*127.4*/("""
	"""),format.raw/*128.2*/("""}"""),format.raw/*128.3*/("""
	"""),_display_(Seq[Any](/*129.3*/(_pageContext.pageName + "_jsObject"))),format.raw/*129.40*/(""".initialise();
	$('#"""),_display_(Seq[Any](/*130.7*/(_pageContext.pageName + "_modal"))),format.raw/*130.41*/("""').modal('show');
	$('#"""),_display_(Seq[Any](/*131.7*/(_pageContext.pageName + "_form"))),format.raw/*131.40*/("""').validate("""),format.raw/*131.52*/("""{"""),format.raw/*131.53*/("""
	//errorElement:"", 
	rules: """),format.raw/*133.9*/("""{"""),format.raw/*133.10*/("""
	    		 """),_display_(Seq[Any](/*134.10*/for(fieldType<-_pageContext.getFields.iterator) yield /*134.57*/{_display_(Seq[Any](format.raw/*134.58*/("""
	    			 """),_display_(Seq[Any](/*135.11*/if(fieldType.validation !=null )/*135.43*/{_display_(Seq[Any](format.raw/*135.44*/("""
		    			 	 """),_display_(Seq[Any](/*136.14*/(fieldType.name))),format.raw/*136.30*/(""" :"""),format.raw/*136.32*/("""{"""),format.raw/*136.33*/("""
			    				 minlength: """),_display_(Seq[Any](/*137.25*/fieldType/*137.34*/.validation.minlength)),format.raw/*137.55*/(""",
			    				 required : """),_display_(Seq[Any](/*138.25*/fieldType/*138.34*/.validation.required)),format.raw/*138.54*/(""",
			    				 email: """),_display_(Seq[Any](/*139.21*/fieldType/*139.30*/.validation.email)),format.raw/*139.47*/(""",
			    				 maxlength: """),_display_(Seq[Any](/*140.25*/fieldType/*140.34*/.validation.maxlength)),format.raw/*140.55*/(""",
			    				 date: """),_display_(Seq[Any](/*141.20*/fieldType/*141.29*/.validation.date)),format.raw/*141.45*/(""",
			    				 digits: """),_display_(Seq[Any](/*142.22*/fieldType/*142.31*/.validation.digits)),format.raw/*142.49*/(""",
								 number: """),_display_(Seq[Any](/*143.19*/fieldType/*143.28*/.validation.number)),format.raw/*143.46*/("""			    				 
			    			 """),format.raw/*144.12*/("""}"""),format.raw/*144.13*/(""",
		    			 
		    			 
	    		 	""")))})),format.raw/*147.11*/("""
	    		 """)))})),format.raw/*148.10*/("""
    	 """),format.raw/*149.7*/("""}"""),format.raw/*149.8*/(""",
    	 messages: """),format.raw/*150.17*/("""{"""),format.raw/*150.18*/("""
    		 """),_display_(Seq[Any](/*151.9*/for(fieldType<-_pageContext.getFields.iterator) yield /*151.56*/{_display_(Seq[Any](format.raw/*151.57*/("""
    			 """),_display_(Seq[Any](/*152.10*/if(fieldType.validation !=null )/*152.42*/{_display_(Seq[Any](format.raw/*152.43*/("""
    				 """),_display_(Seq[Any](/*153.11*/if(!fieldType.validation.messages.equals(""))/*153.56*/{_display_(Seq[Any](format.raw/*153.57*/("""
	    				 """),_display_(Seq[Any](/*154.12*/fieldType/*154.21*/.name)),format.raw/*154.26*/(""" :  """),_display_(Seq[Any](/*154.31*/fieldType/*154.40*/.validation.messages)),format.raw/*154.60*/(""",
    				 """)))})),format.raw/*155.11*/("""
	    		 """)))})),format.raw/*156.10*/("""
    		  """)))})),format.raw/*157.10*/("""
    	 """),format.raw/*158.7*/("""}"""),format.raw/*158.8*/(""",
    			 
        
    
    highlight: function (element) """),format.raw/*162.35*/("""{"""),format.raw/*162.36*/("""
        $(element).closest('.control-group').removeClass('success').addClass('error');
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/(""",
    success: function(element) """),format.raw/*165.32*/("""{"""),format.raw/*165.33*/("""
        element
        .addClass('valid')
        .closest('.control-group').removeClass('error').addClass('success');
      """),format.raw/*169.7*/("""}"""),format.raw/*169.8*/("""
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/(""");
"""),format.raw/*171.1*/("""}"""),format.raw/*171.2*/(""");
</script>
"""))}
    }
    
    def render(_pageContext:com.mnt.core.helper.UIModel,isModal:Boolean): play.api.templates.Html = apply(_pageContext,isModal)
    
    def f:((com.mnt.core.helper.UIModel,Boolean) => play.api.templates.Html) = (_pageContext,isModal) => apply(_pageContext,isModal)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/UIPageGenerator.scala.html
                    HASH: 10b93832fa0dc84e5aeb98ff0206979e58e2c0a8
                    MATRIX: 762->1|897->59|936->64|955->75|993->76|1164->213|1184->225|1215->235|1291->280|1341->294|1396->327|1478->374|1542->422|1581->423|1657->464|1703->494|1742->495|1789->506|1803->511|1817->516|1832->522|1842->534|1860->543|1899->544|1980->589|2051->638|2082->661|2100->670|2139->671|2219->715|2290->764|2321->787|2339->796|2378->797|2458->841|2529->890|2560->913|2578->922|2617->923|2697->967|2768->1016|2799->1039|2817->1048|2856->1049|2936->1093|3007->1142|3038->1165|3056->1174|3095->1175|3175->1219|3246->1268|3277->1291|3295->1300|3334->1301|3414->1345|3485->1394|3516->1417|3534->1426|3573->1427|3653->1471|3724->1520|3769->1543|3828->1571|3877->1589|3968->1645|3988->1656|4027->1657|4197->1796|4237->1801|4297->1845|4336->1846|4378->1853|4408->1874|4447->1875|4519->1911|4579->1949|4644->1977|4660->1983|4689->1989|4736->2005|4773->2011|4812->2015|4832->2026|4871->2027|4925->2050|4995->2092|5024->2093|5070->2104|5130->2142|5161->2145|5190->2146|5245->2173|5274->2174|5329->2202|5357->2203|5413->2231|5442->2232|5483->2238|5537->2270|5577->2274|5636->2311|5678->2318|5738->2362|5777->2363|5819->2370|5849->2391|5888->2392|5933->2402|5948->2408|5969->2420|5984->2426|5993->2435|6018->2451|6058->2453|6108->2467|6168->2505|6215->2524|6244->2525|6291->2536|6346->2569|6400->2587|6415->2593|6441->2597|6484->2612|6513->2613|6544->2634|6568->2649|6608->2651|6658->2665|6718->2703|6765->2722|6794->2723|6843->2744|6872->2745|6901->2764|6926->2780|6966->2782|7016->2796|7076->2834|7123->2853|7152->2854|7199->2865|7254->2898|7308->2916|7323->2922|7349->2926|7392->2940|7422->2941|7466->2962|7507->2971|7545->2977|7577->2981|7606->2982|7670->3017|7700->3018|7746->3035|7776->3036|7832->3063|7862->3064|7915->3088|7945->3089|7988->3104|8017->3105|8051->3111|8080->3112|8140->3143|8170->3144|8212->3158|8241->3159|8299->3188|8329->3189|8370->3202|8399->3203|8432->3208|8461->3209|8494->3214|8523->3215|8587->3250|8617->3251|8668->3266|8724->3299|8794->3333|8850->3366|8894->3382|8923->3383|8954->3386|8983->3387|9023->3391|9083->3428|9141->3450|9198->3484|9259->3509|9315->3542|9356->3554|9386->3555|9446->3587|9476->3588|9524->3599|9588->3646|9628->3647|9677->3659|9719->3691|9759->3692|9811->3707|9850->3723|9881->3725|9911->3726|9974->3752|9993->3761|10037->3782|10101->3809|10120->3818|10163->3838|10223->3861|10242->3870|10282->3887|10346->3914|10365->3923|10409->3944|10468->3966|10487->3975|10526->3991|10587->4015|10606->4024|10647->4042|10705->4063|10724->4072|10765->4090|10819->4115|10849->4116|10919->4153|10963->4164|10999->4172|11028->4173|11076->4192|11106->4193|11152->4203|11216->4250|11256->4251|11304->4262|11346->4294|11386->4295|11435->4307|11490->4352|11530->4353|11580->4366|11599->4375|11627->4380|11669->4385|11688->4394|11731->4414|11777->4427|11821->4438|11865->4449|11901->4457|11930->4458|12022->4521|12052->4522|12174->4616|12203->4617|12266->4651|12296->4652|12455->4783|12484->4784|12514->4786|12543->4787|12575->4791|12604->4792
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|38->10|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->17|44->17|44->17|46->19|46->19|47->21|47->21|47->21|49->23|49->23|50->25|50->25|50->25|52->27|52->27|53->29|53->29|53->29|55->31|55->31|56->33|56->33|56->33|58->35|58->35|59->37|59->37|59->37|61->39|61->39|62->41|62->41|62->41|64->43|64->43|65->45|65->45|65->45|67->47|67->47|68->49|70->51|72->53|80->61|80->61|80->61|84->65|85->66|85->66|85->66|86->67|86->67|86->67|87->68|87->68|87->68|87->68|87->68|88->69|89->70|90->71|90->71|90->71|92->73|95->76|95->76|97->78|97->78|97->78|97->78|98->79|98->79|100->81|100->81|101->82|101->82|102->83|102->83|102->83|102->83|103->84|103->84|103->84|104->85|104->85|104->85|105->86|105->86|105->86|105->86|105->87|105->87|105->87|106->88|106->88|106->88|106->88|107->89|107->89|107->89|107->89|107->89|108->90|108->90|109->92|109->92|109->92|110->93|110->93|110->93|110->93|112->95|112->95|113->97|113->97|113->97|114->98|114->98|114->98|114->98|115->99|115->99|115->99|115->99|115->99|116->100|116->100|117->102|118->103|119->104|120->105|120->105|121->106|121->106|123->108|123->108|125->110|125->110|126->111|126->111|128->113|128->113|129->114|129->114|130->115|130->115|132->117|132->117|133->118|133->118|135->120|135->120|136->121|136->121|137->122|137->122|138->123|138->123|140->125|140->125|141->126|141->126|142->127|142->127|143->128|143->128|144->129|144->129|145->130|145->130|146->131|146->131|146->131|146->131|148->133|148->133|149->134|149->134|149->134|150->135|150->135|150->135|151->136|151->136|151->136|151->136|152->137|152->137|152->137|153->138|153->138|153->138|154->139|154->139|154->139|155->140|155->140|155->140|156->141|156->141|156->141|157->142|157->142|157->142|158->143|158->143|158->143|159->144|159->144|162->147|163->148|164->149|164->149|165->150|165->150|166->151|166->151|166->151|167->152|167->152|167->152|168->153|168->153|168->153|169->154|169->154|169->154|169->154|169->154|169->154|170->155|171->156|172->157|173->158|173->158|177->162|177->162|179->164|179->164|180->165|180->165|184->169|184->169|185->170|185->170|186->171|186->171
                    -- GENERATED --
                */
            