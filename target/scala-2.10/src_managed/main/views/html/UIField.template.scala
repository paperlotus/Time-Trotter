
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
object UIField extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.ui.component.FieldType,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(fieldType:com.mnt.core.ui.component.FieldType,_namespace:String,_fieldClass:String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.86*/("""
"""),_display_(Seq[Any](/*2.2*/fieldType/*2.11*/.ctype.name/*2.22*/ match/*2.28*/{/*3.10*/case "INPUT" =>/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
		     			"""),_display_(Seq[Any](/*4.12*/if(!fieldType.hidden)/*4.33*/{_display_(Seq[Any](format.raw/*4.34*/("""
		     			"""),_display_(Seq[Any](/*5.12*/if(!fieldType.autocomplete && !fieldType.multiselect)/*5.65*/{_display_(Seq[Any](format.raw/*5.66*/("""
		     			 <div class="control-group" >
				     			<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*7.61*/fieldType/*7.70*/.label)),format.raw/*7.76*/("""
				     				"""),_display_(Seq[Any](/*8.15*/if(fieldType.validation !=null && fieldType.validation.required)/*8.79*/{_display_(Seq[Any](format.raw/*8.80*/("""
										  	<sup style="color: red"> *</sup>
									  """)))})),format.raw/*10.13*/("""
								</label>
								<div class="controls">
									  """),_display_(Seq[Any](/*13.13*/if(fieldType.validation !=null && fieldType.validation.required)/*13.77*/{_display_(Seq[Any](format.raw/*13.78*/("""
									  	<input id=""""),_display_(Seq[Any](/*14.25*/(_namespace + fieldType.name))),format.raw/*14.54*/("""" name=""""),_display_(Seq[Any](/*14.63*/fieldType/*14.72*/.name)),format.raw/*14.77*/("""" value='"""),_display_(Seq[Any](/*14.87*/(fieldType.value.o))),format.raw/*14.106*/("""' """),_display_(Seq[Any](/*14.109*/fieldType/*14.118*/.htmlAttrib)),format.raw/*14.129*/(""" class='"""),_display_(Seq[Any](/*14.138*/_fieldClass)),format.raw/*14.149*/("""' required  type="text" rel="popover" >
									  """)))}/*15.13*/else/*15.17*/{_display_(Seq[Any](format.raw/*15.18*/("""
									    <input id=""""),_display_(Seq[Any](/*16.26*/(_namespace + fieldType.name))),format.raw/*16.55*/("""" name=""""),_display_(Seq[Any](/*16.64*/fieldType/*16.73*/.name)),format.raw/*16.78*/("""" value='"""),_display_(Seq[Any](/*16.88*/(fieldType.value.o))),format.raw/*16.107*/("""' """),_display_(Seq[Any](/*16.110*/fieldType/*16.119*/.htmlAttrib)),format.raw/*16.130*/(""" class='"""),_display_(Seq[Any](/*16.139*/_fieldClass)),format.raw/*16.150*/("""' type="text">
									  """)))})),format.raw/*17.13*/("""
								</div>	  
							""")))}/*19.9*/else/*19.13*/{_display_(Seq[Any](format.raw/*19.14*/("""
								<div class="control-group" >
				     			<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*21.61*/fieldType/*21.70*/.label)),format.raw/*21.76*/("""
				     				"""),_display_(Seq[Any](/*22.15*/if(fieldType.validation !=null && fieldType.validation.required)/*22.79*/{_display_(Seq[Any](format.raw/*22.80*/("""
										  	<sup style="color: red"> *</sup>
									  """)))})),format.raw/*24.13*/("""
								</label>
								<div class="controls">
									  """),_display_(Seq[Any](/*27.13*/if(fieldType.validation !=null && fieldType.validation.required)/*27.77*/{_display_(Seq[Any](format.raw/*27.78*/("""
									  	<input id=""""),_display_(Seq[Any](/*28.25*/(_namespace + fieldType.name))),format.raw/*28.54*/("""" name=""""),_display_(Seq[Any](/*28.63*/fieldType/*28.72*/.name)),format.raw/*28.77*/("""" value='"""),_display_(Seq[Any](/*28.87*/(fieldType.value.o))),format.raw/*28.106*/("""' """),_display_(Seq[Any](/*28.109*/fieldType/*28.118*/.htmlAttrib)),format.raw/*28.129*/(""" class='"""),_display_(Seq[Any](/*28.138*/_fieldClass)),format.raw/*28.149*/("""' required  type="text" rel="popover" >
									  """)))}/*29.13*/else/*29.17*/{_display_(Seq[Any](format.raw/*29.18*/("""
									    <input id=""""),_display_(Seq[Any](/*30.26*/(_namespace + fieldType.name))),format.raw/*30.55*/("""" name=""""),_display_(Seq[Any](/*30.64*/fieldType/*30.73*/.name)),format.raw/*30.78*/("""" value='"""),_display_(Seq[Any](/*30.88*/(fieldType.value.o))),format.raw/*30.107*/("""' """),_display_(Seq[Any](/*30.110*/fieldType/*30.119*/.htmlAttrib)),format.raw/*30.130*/(""" class='"""),_display_(Seq[Any](/*30.139*/_fieldClass)),format.raw/*30.150*/("""' type="text">
									  """)))})),format.raw/*31.13*/("""
									   <input id='"""),_display_(Seq[Any](/*32.25*/(_namespace + fieldType.name +"_hidden"))),format.raw/*32.65*/("""' value='"""),_display_(Seq[Any](/*32.75*/(fieldType.value.id))),format.raw/*32.95*/("""' name='"""),_display_(Seq[Any](/*32.104*/(fieldType.name + "_id"))),format.raw/*32.128*/("""'  type="hidden">
								</div>
								
								<script>
											$('#"""),_display_(Seq[Any](/*36.17*/(_namespace + fieldType.name))),format.raw/*36.46*/("""').select2("""),format.raw/*36.57*/("""{"""),format.raw/*36.58*/("""
												placeholder: "Search",
												minimumInputLength: 2,
												multiple:"""),_display_(Seq[Any](/*39.23*/fieldType/*39.32*/.multiselect)),format.raw/*39.44*/(""",
											    ajax: """),format.raw/*40.22*/("""{"""),format.raw/*40.23*/(""" // instead of writing the function to execute the request we use Select2's convenient helper
											        url: "/findDelegatedTo",
											        dataType: 'json',
											        data: function (term, page) """),format.raw/*43.48*/("""{"""),format.raw/*43.49*/("""
											            return """),format.raw/*44.31*/("""{"""),format.raw/*44.32*/("""
											                query: term, // search term
											                page_limit: 10
											            """),format.raw/*47.24*/("""}"""),format.raw/*47.25*/(""";
											        """),format.raw/*48.20*/("""}"""),format.raw/*48.21*/(""",
											        results: function (data, page) """),format.raw/*49.51*/("""{"""),format.raw/*49.52*/(""" // parse the results into the format expected by Select2.
											            // since we are using custom formatting functions we do not need to alter remote JSON data
											            return """),format.raw/*51.31*/("""{"""),format.raw/*51.32*/("""results: data.results"""),format.raw/*51.53*/("""}"""),format.raw/*51.54*/(""";
											        """),format.raw/*52.20*/("""}"""),format.raw/*52.21*/("""
											    """),format.raw/*53.16*/("""}"""),format.raw/*53.17*/(""",
											    formatResult: function(exercise) """),format.raw/*54.49*/("""{"""),format.raw/*54.50*/(""" 
											        return "<div class='select2-user-result'>" + exercise._1 + "</div>"; 
											    """),format.raw/*56.16*/("""}"""),format.raw/*56.17*/(""",
											    formatSelection: function(result) """),format.raw/*57.50*/("""{"""),format.raw/*57.51*/(""" 
											    	return result._1; 
											    """),format.raw/*59.16*/("""}"""),format.raw/*59.17*/(""",
											    initSelection: function(element, callback) """),format.raw/*60.59*/("""{"""),format.raw/*60.60*/("""
											    	var _id=$(element).val();
											    	var data = [];
											    	"""),_display_(Seq[Any](/*63.18*/if(fieldType.multiselect)/*63.43*/{_display_(Seq[Any](format.raw/*63.44*/("""
											    		"""),_display_(Seq[Any](/*64.19*/if(fieldType.value.li!=null)/*64.47*/{_display_(Seq[Any](format.raw/*64.48*/("""
											    			"""),_display_(Seq[Any](/*65.20*/for(mo<-fieldType.value.li) yield /*65.47*/{_display_(Seq[Any](format.raw/*65.48*/("""
											    				data.push("""),format.raw/*66.30*/("""{"""),format.raw/*66.31*/("""id: """),_display_(Seq[Any](/*66.36*/mo/*66.38*/.id)),format.raw/*66.41*/(""", _1:'"""),_display_(Seq[Any](/*66.48*/mo/*66.50*/.o)),format.raw/*66.52*/("""' """),format.raw/*66.54*/("""}"""),format.raw/*66.55*/(""");	
											    			""")))})),format.raw/*67.20*/("""
											    		""")))})),format.raw/*68.19*/("""
											    	""")))}/*69.18*/else/*69.22*/{_display_(Seq[Any](format.raw/*69.23*/("""
											    		 data = """),format.raw/*70.26*/("""{"""),format.raw/*70.27*/("""_1:_id,id:$('#"""),_display_(Seq[Any](/*70.42*/(_namespace + fieldType.name))),format.raw/*70.71*/("""').val()"""),format.raw/*70.79*/("""}"""),format.raw/*70.80*/(""";
											    	""")))})),format.raw/*71.18*/("""
											    	callback(data);
											    """),format.raw/*73.16*/("""}"""),format.raw/*73.17*/("""
											"""),format.raw/*74.12*/("""}"""),format.raw/*74.13*/(""").on('change',function(ev)"""),format.raw/*74.39*/("""{"""),format.raw/*74.40*/("""
												$('#'+'"""),_display_(Seq[Any](/*75.21*/(_namespace + fieldType.name ))),format.raw/*75.51*/("""').val(ev.val);
											"""),format.raw/*76.12*/("""}"""),format.raw/*76.13*/(""");
											
											</script>							
							""")))})),format.raw/*79.9*/("""
				     	""")))}/*80.12*/else/*80.16*/{_display_(Seq[Any](format.raw/*80.17*/("""
							<input id=""""),_display_(Seq[Any](/*81.20*/(_namespace + fieldType.name))),format.raw/*81.49*/("""" value='"""),_display_(Seq[Any](/*81.59*/(fieldType.value.o))),format.raw/*81.78*/("""' name='"""),_display_(Seq[Any](/*81.87*/(fieldType.name + "_hidden"))),format.raw/*81.115*/("""' type="hidden">
						""")))})),format.raw/*82.8*/("""
						</div>
			     	""")))}/*85.10*/case "CHECKBOX" =>/*85.28*/ {_display_(Seq[Any](format.raw/*85.30*/("""
		     			"""),_display_(Seq[Any](/*86.12*/if(!fieldType.hidden)/*86.33*/{_display_(Seq[Any](format.raw/*86.34*/("""
		     			 <div class="control-group" >
				     			<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*88.61*/fieldType/*88.70*/.label)),format.raw/*88.76*/("""
				     				"""),_display_(Seq[Any](/*89.15*/if(fieldType.validation !=null && fieldType.validation.required)/*89.79*/{_display_(Seq[Any](format.raw/*89.80*/("""
										  	<sup style="color: red"> *</sup>
									  """)))})),format.raw/*91.13*/("""
								</label>
								<div class="controls">
									  """),_display_(Seq[Any](/*94.13*/if(fieldType.validation !=null && fieldType.validation.required)/*94.77*/{_display_(Seq[Any](format.raw/*94.78*/("""
									  	"""),_display_(Seq[Any](/*95.14*/if(fieldType.value.o == true)/*95.43*/{_display_(Seq[Any](format.raw/*95.44*/("""
									  		<input id=""""),_display_(Seq[Any](/*96.26*/(_namespace + fieldType.name))),format.raw/*96.55*/("""" name=""""),_display_(Seq[Any](/*96.64*/fieldType/*96.73*/.name)),format.raw/*96.78*/("""" value='"""),_display_(Seq[Any](/*96.88*/(fieldType.value.o))),format.raw/*96.107*/("""' """),_display_(Seq[Any](/*96.110*/fieldType/*96.119*/.htmlAttrib)),format.raw/*96.130*/(""" class='"""),_display_(Seq[Any](/*96.139*/_fieldClass)),format.raw/*96.150*/("""' required  type="checkbox" checked="checked" rel="popover" >
									  	""")))}/*97.14*/else/*97.18*/{_display_(Seq[Any](format.raw/*97.19*/("""
									  		<input id=""""),_display_(Seq[Any](/*98.26*/(_namespace + fieldType.name))),format.raw/*98.55*/("""" name=""""),_display_(Seq[Any](/*98.64*/fieldType/*98.73*/.name)),format.raw/*98.78*/("""" value='"""),_display_(Seq[Any](/*98.88*/(fieldType.value.o))),format.raw/*98.107*/("""' """),_display_(Seq[Any](/*98.110*/fieldType/*98.119*/.htmlAttrib)),format.raw/*98.130*/(""" class='"""),_display_(Seq[Any](/*98.139*/_fieldClass)),format.raw/*98.150*/("""' required  type="checkbox" rel="popover" >
									  	""")))})),format.raw/*99.14*/("""
									  """)))}/*100.13*/else/*100.17*/{_display_(Seq[Any](format.raw/*100.18*/("""
									  	"""),_display_(Seq[Any](/*101.14*/if(fieldType.value.o == true)/*101.43*/{_display_(Seq[Any](format.raw/*101.44*/("""
									  		<input id=""""),_display_(Seq[Any](/*102.26*/(_namespace + fieldType.name))),format.raw/*102.55*/("""" name=""""),_display_(Seq[Any](/*102.64*/fieldType/*102.73*/.name)),format.raw/*102.78*/("""" value='"""),_display_(Seq[Any](/*102.88*/(fieldType.value.o))),format.raw/*102.107*/("""' """),_display_(Seq[Any](/*102.110*/fieldType/*102.119*/.htmlAttrib)),format.raw/*102.130*/(""" class='"""),_display_(Seq[Any](/*102.139*/_fieldClass)),format.raw/*102.150*/("""' type="checkbox" checked="checked">
									  	""")))}/*103.14*/else/*103.18*/{_display_(Seq[Any](format.raw/*103.19*/("""
									  		<input id=""""),_display_(Seq[Any](/*104.26*/(_namespace + fieldType.name))),format.raw/*104.55*/("""" name=""""),_display_(Seq[Any](/*104.64*/fieldType/*104.73*/.name)),format.raw/*104.78*/("""" value='"""),_display_(Seq[Any](/*104.88*/(fieldType.value.o))),format.raw/*104.107*/("""' """),_display_(Seq[Any](/*104.110*/fieldType/*104.119*/.htmlAttrib)),format.raw/*104.130*/(""" class='"""),_display_(Seq[Any](/*104.139*/_fieldClass)),format.raw/*104.150*/("""' type="checkbox">
									  	""")))})),format.raw/*105.14*/("""
									  """)))})),format.raw/*106.13*/("""
								</div>	  
				     	""")))}/*108.12*/else/*108.16*/{_display_(Seq[Any](format.raw/*108.17*/("""
							<input id=""""),_display_(Seq[Any](/*109.20*/(_namespace + fieldType.name))),format.raw/*109.49*/("""" name='"""),_display_(Seq[Any](/*109.58*/(fieldType.name + "_hidden"))),format.raw/*109.86*/("""' type="hidden">
						""")))})),format.raw/*110.8*/("""
						</div>
			     	""")))}/*113.10*/case "SEARCH" =>/*113.26*/ {_display_(Seq[Any](format.raw/*113.28*/("""
			     		<div class="control-group" >
			     			<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*115.60*/fieldType/*115.69*/.label)),format.raw/*115.75*/("""
				     				"""),_display_(Seq[Any](/*116.15*/if(fieldType.validation !=null && fieldType.validation.required)/*116.79*/{_display_(Seq[Any](format.raw/*116.80*/("""
										  	<sup style="color: red"> *</sup>
									  """)))})),format.raw/*118.13*/("""
									  <img id='"""),_display_(Seq[Any](/*119.22*/(_namespace + fieldType.name +"_browse"))),format.raw/*119.62*/("""' alt="" src=""""),_display_(Seq[Any](/*119.77*/routes/*119.83*/.Assets.at("images/browse.jpg"))),format.raw/*119.114*/("""" >
							</label>
							<div class="controls">
									  """),_display_(Seq[Any](/*122.13*/if(fieldType.validation !=null && fieldType.validation.required)/*122.77*/{_display_(Seq[Any](format.raw/*122.78*/("""
									  	<input id=""""),_display_(Seq[Any](/*123.25*/(_namespace + fieldType.name))),format.raw/*123.54*/("""" name=""""),_display_(Seq[Any](/*123.63*/fieldType/*123.72*/.name)),format.raw/*123.77*/("""" value='"""),_display_(Seq[Any](/*123.87*/(fieldType.value.o))),format.raw/*123.106*/("""' """),_display_(Seq[Any](/*123.109*/fieldType/*123.118*/.htmlAttrib)),format.raw/*123.129*/(""" readonly class='"""),_display_(Seq[Any](/*123.147*/_fieldClass)),format.raw/*123.158*/("""' required  type="text" rel="popover" >
									  """)))}/*124.13*/else/*124.17*/{_display_(Seq[Any](format.raw/*124.18*/("""
									    <input id=""""),_display_(Seq[Any](/*125.26*/(_namespace + fieldType.name))),format.raw/*125.55*/("""" name=""""),_display_(Seq[Any](/*125.64*/fieldType/*125.73*/.name)),format.raw/*125.78*/("""" value='"""),_display_(Seq[Any](/*125.88*/(fieldType.value.o))),format.raw/*125.107*/("""' """),_display_(Seq[Any](/*125.110*/fieldType/*125.119*/.htmlAttrib)),format.raw/*125.130*/(""" readonly class='"""),_display_(Seq[Any](/*125.148*/_fieldClass)),format.raw/*125.159*/("""' type="text">
									  """)))})),format.raw/*126.13*/("""
									  <input type="hidden" id='"""),_display_(Seq[Any](/*127.38*/(_namespace + fieldType.name +"_hidden"))),format.raw/*127.78*/("""' name='"""),_display_(Seq[Any](/*127.87*/(fieldType.name + "_id"))),format.raw/*127.111*/("""' value='"""),_display_(Seq[Any](/*127.121*/(fieldType.value.o))),format.raw/*127.140*/("""' >
							</div>
			     		</div>
	
			     		<script>
			     			$('#"""),_display_(Seq[Any](/*132.17*/(_namespace + fieldType.name +"_browse"))),format.raw/*132.57*/("""').click(function()"""),format.raw/*132.76*/("""{"""),format.raw/*132.77*/("""
			     				var _url = '"""),_display_(Seq[Any](/*133.26*/((fieldType.value.o.asInstanceOf[com.mnt.core.helper.SearchUI]).triggerUrl))),format.raw/*133.101*/("""';
			     				_url = _url + "?id=" + """"),_display_(Seq[Any](/*134.38*/(_namespace + fieldType.name))),format.raw/*134.67*/("""" + "_hidden&name=" + """"),_display_(Seq[Any](/*134.91*/(_namespace + fieldType.name))),format.raw/*134.120*/("""";
			     				win = window.open(_url,'Search', 'width=940, height=600');
			     				
			     			"""),format.raw/*137.12*/("""}"""),format.raw/*137.13*/(""");
						</script>
			     	""")))}/*140.10*/case "SELECT_OPTION" =>/*140.33*/ {_display_(Seq[Any](format.raw/*140.35*/("""
		     			  <div class="control-group" >
							  <label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*142.58*/fieldType/*142.67*/.label)),format.raw/*142.73*/("""</label>
							  <div class="controls">
							    <select id=""""),_display_(Seq[Any](/*144.25*/(_namespace + fieldType.name))),format.raw/*144.54*/("""" name=""""),_display_(Seq[Any](/*144.63*/fieldType/*144.72*/.name)),format.raw/*144.77*/("""" class='"""),_display_(Seq[Any](/*144.87*/_fieldClass)),format.raw/*144.98*/("""'>
								    """),_display_(Seq[Any](/*145.14*/for(option<-fieldType.options) yield /*145.44*/{_display_(Seq[Any](format.raw/*145.45*/("""
								    	<option value='"""),_display_(Seq[Any](/*146.30*/option)),format.raw/*146.36*/("""'>"""),_display_(Seq[Any](/*146.39*/option/*146.45*/.getName)),format.raw/*146.53*/("""</option>
								    """)))})),format.raw/*147.14*/("""	
							      
							    </select>
							  </div>
						</div>
						
					""")))}/*155.6*/case "DATE" =>/*155.20*/ {_display_(Seq[Any](format.raw/*155.22*/("""
							<div class="control-group">
						  	<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*157.58*/fieldType/*157.67*/.label)),format.raw/*157.73*/("""
						  	 """),_display_(Seq[Any](/*158.12*/if(fieldType.validation !=null && fieldType.validation.required)/*158.76*/{_display_(Seq[Any](format.raw/*158.77*/("""
									  	<sup style="color: red"> *</sup>
							 """)))})),format.raw/*160.10*/("""
							</label>
						  
							<div id=""""),_display_(Seq[Any](/*163.18*/(fieldType.name))),format.raw/*163.34*/("""" data-provide="datepicker" class='input-append date datepicker' data-date="" data-date-format="dd-mm-yyyy">
											<span class="add-on"><i class="icon-calendar"></i></span>
											"""),_display_(Seq[Any](/*165.13*/if(fieldType.value.dt!=null)/*165.41*/{_display_(Seq[Any](format.raw/*165.42*/("""
												<input size="16" type="text" value='"""),_display_(Seq[Any](/*166.50*/(fieldType.value.dt.format("dd-MM-yyyy")))),format.raw/*166.91*/("""' readonly name=""""),_display_(Seq[Any](/*166.109*/(fieldType.name))),format.raw/*166.125*/("""" class='"""),_display_(Seq[Any](/*166.135*/_fieldClass)),format.raw/*166.146*/("""'>
											""")))}/*167.13*/else/*167.17*/{_display_(Seq[Any](format.raw/*167.18*/("""
												<input size="16" type="text" value='' name='"""),_display_(Seq[Any](/*168.58*/(fieldType.name))),format.raw/*168.74*/("""' readonly class="add-on">
											""")))})),format.raw/*169.13*/("""
							</div>
						</div>
					""")))}})),format.raw/*174.10*/("""
	     		"""))}
    }
    
    def render(fieldType:com.mnt.core.ui.component.FieldType,_namespace:String,_fieldClass:String): play.api.templates.Html = apply(fieldType,_namespace,_fieldClass)
    
    def f:((com.mnt.core.ui.component.FieldType,String,String) => play.api.templates.Html) = (fieldType,_namespace,_fieldClass) => apply(fieldType,_namespace,_fieldClass)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/UIField.scala.html
                    HASH: 8b6e4fcf6e4e07c19e5ba54b5dff4cc2512b5392
                    MATRIX: 768->1|929->85|966->88|983->97|1002->108|1016->114|1025->126|1048->141|1087->143|1135->156|1164->177|1202->178|1250->191|1311->244|1349->245|1487->348|1504->357|1531->363|1582->379|1654->443|1692->444|1785->505|1885->569|1958->633|1997->634|2059->660|2110->689|2155->698|2173->707|2200->712|2246->722|2288->741|2328->744|2347->753|2381->764|2427->773|2461->784|2533->837|2546->841|2585->842|2648->869|2699->898|2744->907|2762->916|2789->921|2835->931|2877->950|2917->953|2936->962|2970->973|3016->982|3050->993|3110->1021|3157->1050|3170->1054|3209->1055|3345->1155|3363->1164|3391->1170|3443->1186|3516->1250|3555->1251|3648->1312|3748->1376|3821->1440|3860->1441|3922->1467|3973->1496|4018->1505|4036->1514|4063->1519|4109->1529|4151->1548|4191->1551|4210->1560|4244->1571|4290->1580|4324->1591|4396->1644|4409->1648|4448->1649|4511->1676|4562->1705|4607->1714|4625->1723|4652->1728|4698->1738|4740->1757|4780->1760|4799->1769|4833->1780|4879->1789|4913->1800|4973->1828|5035->1854|5097->1894|5143->1904|5185->1924|5231->1933|5278->1957|5393->2036|5444->2065|5483->2076|5512->2077|5644->2173|5662->2182|5696->2194|5748->2218|5777->2219|6030->2444|6059->2445|6119->2477|6148->2478|6300->2602|6329->2603|6379->2625|6408->2626|6489->2679|6518->2680|6751->2885|6780->2886|6829->2907|6858->2908|6908->2930|6937->2931|6982->2948|7011->2949|7090->3000|7119->3001|7255->3109|7284->3110|7364->3162|7393->3163|7475->3217|7504->3218|7593->3279|7622->3280|7752->3374|7786->3399|7825->3400|7881->3420|7918->3448|7957->3449|8014->3470|8057->3497|8096->3498|8155->3529|8184->3530|8225->3535|8236->3537|8261->3540|8304->3547|8315->3549|8339->3551|8369->3553|8398->3554|8454->3578|8506->3598|8544->3617|8557->3621|8596->3622|8651->3649|8680->3650|8731->3665|8782->3694|8818->3702|8847->3703|8899->3723|8977->3773|9006->3774|9047->3787|9076->3788|9130->3814|9159->3815|9217->3837|9269->3867|9325->3895|9354->3896|9439->3950|9471->3963|9484->3967|9523->3968|9580->3989|9631->4018|9677->4028|9718->4047|9763->4056|9814->4084|9870->4109|9915->4146|9942->4164|9982->4166|10031->4179|10061->4200|10100->4201|10239->4304|10257->4313|10285->4319|10337->4335|10410->4399|10449->4400|10542->4461|10642->4525|10715->4589|10754->4590|10805->4605|10843->4634|10882->4635|10945->4662|10996->4691|11041->4700|11059->4709|11086->4714|11132->4724|11174->4743|11214->4746|11233->4755|11267->4766|11313->4775|11347->4786|11442->4862|11455->4866|11494->4867|11557->4894|11608->4923|11653->4932|11671->4941|11698->4946|11744->4956|11786->4975|11826->4978|11845->4987|11879->4998|11925->5007|11959->5018|12049->5076|12083->5090|12097->5094|12137->5095|12189->5110|12228->5139|12268->5140|12332->5167|12384->5196|12430->5205|12449->5214|12477->5219|12524->5229|12567->5248|12608->5251|12628->5260|12663->5271|12710->5280|12745->5291|12816->5342|12830->5346|12870->5347|12934->5374|12986->5403|13032->5412|13051->5421|13079->5426|13126->5436|13169->5455|13210->5458|13230->5467|13265->5478|13312->5487|13347->5498|13413->5531|13460->5545|13512->5577|13526->5581|13566->5582|13624->5603|13676->5632|13722->5641|13773->5669|13830->5694|13876->5731|13902->5747|13943->5749|14081->5850|14100->5859|14129->5865|14182->5881|14256->5945|14296->5946|14390->6007|14450->6030|14513->6070|14565->6085|14581->6091|14636->6122|14738->6187|14812->6251|14852->6252|14915->6278|14967->6307|15013->6316|15032->6325|15060->6330|15107->6340|15150->6359|15191->6362|15211->6371|15246->6382|15302->6400|15337->6411|15410->6464|15424->6468|15464->6469|15528->6496|15580->6525|15626->6534|15645->6543|15673->6548|15720->6558|15763->6577|15804->6580|15824->6589|15859->6600|15915->6618|15950->6629|16011->6657|16087->6696|16150->6736|16196->6745|16244->6769|16292->6779|16335->6798|16449->6875|16512->6915|16560->6934|16590->6935|16654->6962|16753->7037|16831->7078|16883->7107|16944->7131|16997->7160|17127->7261|17157->7262|17208->7304|17241->7327|17282->7329|17420->7430|17439->7439|17468->7445|17572->7512|17624->7541|17670->7550|17689->7559|17717->7564|17764->7574|17798->7585|17852->7602|17899->7632|17939->7633|18007->7664|18036->7670|18076->7673|18092->7679|18123->7687|18180->7711|18284->7808|18308->7822|18349->7824|18481->7919|18500->7928|18529->7934|18579->7947|18653->8011|18693->8012|18783->8069|18866->8115|18905->8131|19134->8323|19172->8351|19212->8352|19300->8403|19364->8444|19420->8462|19460->8478|19508->8488|19543->8499|19579->8515|19593->8519|19633->8520|19729->8579|19768->8595|19841->8635|19912->8688
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->3|30->3|30->3|31->4|31->4|31->4|32->5|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|37->10|40->13|40->13|40->13|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|51->24|54->27|54->27|54->27|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|59->32|59->32|59->32|59->32|59->32|63->36|63->36|63->36|63->36|66->39|66->39|66->39|67->40|67->40|70->43|70->43|71->44|71->44|74->47|74->47|75->48|75->48|76->49|76->49|78->51|78->51|78->51|78->51|79->52|79->52|80->53|80->53|81->54|81->54|83->56|83->56|84->57|84->57|86->59|86->59|87->60|87->60|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|94->67|95->68|96->69|96->69|96->69|97->70|97->70|97->70|97->70|97->70|97->70|98->71|100->73|100->73|101->74|101->74|101->74|101->74|102->75|102->75|103->76|103->76|106->79|107->80|107->80|107->80|108->81|108->81|108->81|108->81|108->81|108->81|109->82|111->85|111->85|111->85|112->86|112->86|112->86|114->88|114->88|114->88|115->89|115->89|115->89|117->91|120->94|120->94|120->94|121->95|121->95|121->95|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|123->97|123->97|123->97|124->98|124->98|124->98|124->98|124->98|124->98|124->98|124->98|124->98|124->98|124->98|124->98|125->99|126->100|126->100|126->100|127->101|127->101|127->101|128->102|128->102|128->102|128->102|128->102|128->102|128->102|128->102|128->102|128->102|128->102|128->102|129->103|129->103|129->103|130->104|130->104|130->104|130->104|130->104|130->104|130->104|130->104|130->104|130->104|130->104|130->104|131->105|132->106|134->108|134->108|134->108|135->109|135->109|135->109|135->109|136->110|138->113|138->113|138->113|140->115|140->115|140->115|141->116|141->116|141->116|143->118|144->119|144->119|144->119|144->119|144->119|147->122|147->122|147->122|148->123|148->123|148->123|148->123|148->123|148->123|148->123|148->123|148->123|148->123|148->123|148->123|149->124|149->124|149->124|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|151->126|152->127|152->127|152->127|152->127|152->127|152->127|157->132|157->132|157->132|157->132|158->133|158->133|159->134|159->134|159->134|159->134|162->137|162->137|164->140|164->140|164->140|166->142|166->142|166->142|168->144|168->144|168->144|168->144|168->144|168->144|168->144|169->145|169->145|169->145|170->146|170->146|170->146|170->146|170->146|171->147|177->155|177->155|177->155|179->157|179->157|179->157|180->158|180->158|180->158|182->160|185->163|185->163|187->165|187->165|187->165|188->166|188->166|188->166|188->166|188->166|188->166|189->167|189->167|189->167|190->168|190->168|191->169|194->174
                    -- GENERATED --
                */
            