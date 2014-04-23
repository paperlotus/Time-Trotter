
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
object editWizard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.mnt.core.helper.SearchContext,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_searchContext:com.mnt.core.helper.SearchContext):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

<div class="wizard" id='"""),_display_(Seq[Any](/*3.26*/(_searchContext.entityName + "_edit-wizard"))),format.raw/*3.70*/("""'>
 
		    <h1></h1>
		    """),_display_(Seq[Any](/*6.8*/for(wizard<-_searchContext.getWizards) yield /*6.46*/{_display_(Seq[Any](format.raw/*6.47*/("""
		    	<div class="wizard-card" data-cardname='"""),_display_(Seq[Any](/*7.49*/(wizard.name + "_edit"))),format.raw/*7.72*/("""' data-validate='"""),_display_(Seq[Any](/*7.90*/("form_"+_searchContext.entityName + "_edit_wizard"))),format.raw/*7.142*/("""'>
		        	<h3>"""),_display_(Seq[Any](/*8.17*/wizard/*8.23*/.name)),format.raw/*8.28*/("""</h3>
		        		"""),_display_(Seq[Any](/*9.14*/for(fieldType<-wizard.card.iterator) yield /*9.50*/{_display_(Seq[Any](format.raw/*9.51*/("""
		        			"""),_display_(Seq[Any](/*10.15*/fieldType/*10.24*/.ctype.name/*10.35*/ match/*10.41*/{/*11.9*/case "INPUT" =>/*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
									"""),_display_(Seq[Any](/*12.11*/if(!fieldType.hidden)/*12.32*/{_display_(Seq[Any](format.raw/*12.33*/("""
										"""),_display_(Seq[Any](/*13.12*/if(!fieldType.autocomplete && !fieldType.multiselect)/*13.65*/{_display_(Seq[Any](format.raw/*13.66*/("""
											"""),_display_(Seq[Any](/*14.13*/if(fieldType.order % 2 == 1)/*14.41*/{_display_(Seq[Any](format.raw/*14.42*/("""
		        								<div class="control-group" style="float:left;width:46%;margin: 0px; height:75px;">
		        							""")))}/*16.19*/else/*16.23*/{_display_(Seq[Any](format.raw/*16.24*/("""
		        								<div class="control-group" style=" height:75px;" >
		        							""")))})),format.raw/*18.19*/("""
											  <label class="control-label" for="textinput">"""),_display_(Seq[Any](/*19.60*/fieldType/*19.69*/.label)),format.raw/*19.75*/("""
											  """),_display_(Seq[Any](/*20.15*/if(fieldType.validation !=null && fieldType.validation.required)/*20.79*/{_display_(Seq[Any](format.raw/*20.80*/("""
												  	<sup style="color: red"> *</sup>
											  """)))})),format.raw/*22.15*/("""
											  </label>
											  <div class="controls">
											  	 """),_display_(Seq[Any](/*25.17*/if(fieldType.validation !=null && fieldType.validation.required)/*25.81*/{_display_(Seq[Any](format.raw/*25.82*/("""
											    	<input id='"""),_display_(Seq[Any](/*26.29*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*26.82*/("""' value='"""),_display_(Seq[Any](/*26.92*/(fieldType.value.o))),format.raw/*26.111*/("""' """),_display_(Seq[Any](/*26.114*/fieldType/*26.123*/.htmlAttrib)),format.raw/*26.134*/(""" name=""""),_display_(Seq[Any](/*26.142*/fieldType/*26.151*/.name)),format.raw/*26.156*/("""" placeholder=""""),_display_(Seq[Any](/*26.172*/fieldType/*26.181*/.label)),format.raw/*26.187*/("""" class="input-large" type="text" required rel="popover">
											      """)))}/*27.19*/else/*27.23*/{_display_(Seq[Any](format.raw/*27.24*/("""
											      	<input id='"""),_display_(Seq[Any](/*28.31*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*28.84*/("""' value='"""),_display_(Seq[Any](/*28.94*/(fieldType.value.o))),format.raw/*28.113*/("""' """),_display_(Seq[Any](/*28.116*/fieldType/*28.125*/.htmlAttrib)),format.raw/*28.136*/(""" name=""""),_display_(Seq[Any](/*28.144*/fieldType/*28.153*/.name)),format.raw/*28.158*/(""""  class="input-large" type="text">
											      """)))})),format.raw/*29.19*/("""
											  </div>
											</div>
										""")))}/*32.12*/else/*32.16*/{_display_(Seq[Any](format.raw/*32.17*/("""
											"""),_display_(Seq[Any](/*33.13*/if(fieldType.order % 2 == 1)/*33.41*/{_display_(Seq[Any](format.raw/*33.42*/("""
		        								<div class="control-group" style="float:left;width:46%;margin: 0px; height:75px;">
		        							""")))}/*35.19*/else/*35.23*/{_display_(Seq[Any](format.raw/*35.24*/("""
		        								<div class="control-group" style=" height:75px;" >
		        							""")))})),format.raw/*37.19*/("""
											  <label class="control-label" for="textinput">"""),_display_(Seq[Any](/*38.60*/fieldType/*38.69*/.label)),format.raw/*38.75*/("""
											  """),_display_(Seq[Any](/*39.15*/if(fieldType.validation !=null && fieldType.validation.required)/*39.79*/{_display_(Seq[Any](format.raw/*39.80*/("""
													  	<sup style="color: red"> *</sup>
											   """)))})),format.raw/*41.16*/("""
											  </label>
											  <div class="fuelux controls">
											  """),_display_(Seq[Any](/*44.15*/if(fieldType.autocomplete)/*44.41*/{_display_(Seq[Any](format.raw/*44.42*/("""
												  """),_display_(Seq[Any](/*45.16*/if(fieldType.value.o != null)/*45.45*/{_display_(Seq[Any](format.raw/*45.46*/("""
													  """),_display_(Seq[Any](/*46.17*/if(fieldType.validation !=null && fieldType.validation.required)/*46.81*/{_display_(Seq[Any](format.raw/*46.82*/("""
													    <input id='"""),_display_(Seq[Any](/*47.30*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*47.83*/("""' """),_display_(Seq[Any](/*47.86*/fieldType/*47.95*/.htmlAttrib)),format.raw/*47.106*/(""" value='"""),_display_(Seq[Any](/*47.115*/(fieldType.value.o.toString))),format.raw/*47.143*/("""' required placeholder=""""),_display_(Seq[Any](/*47.168*/fieldType/*47.177*/.label)),format.raw/*47.183*/("""" type="text">
													   """)))}/*48.18*/else/*48.22*/{_display_(Seq[Any](format.raw/*48.23*/("""
													      <input id='"""),_display_(Seq[Any](/*49.32*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*49.85*/("""' """),_display_(Seq[Any](/*49.88*/fieldType/*49.97*/.htmlAttrib)),format.raw/*49.108*/(""" value='"""),_display_(Seq[Any](/*49.117*/(fieldType.value.o.toString))),format.raw/*49.145*/("""' placeholder=""""),_display_(Seq[Any](/*49.161*/fieldType/*49.170*/.label)),format.raw/*49.176*/("""" type="text">
													   """)))})),format.raw/*50.18*/(""" 
													    <input id='"""),_display_(Seq[Any](/*51.30*/(_searchContext.entityName +  "edit" + fieldType.name +"_hidden"))),format.raw/*51.95*/("""' value='"""),_display_(Seq[Any](/*51.105*/(fieldType.value.id))),format.raw/*51.125*/("""' name='"""),_display_(Seq[Any](/*51.134*/(fieldType.name + "_id"))),format.raw/*51.158*/("""'  type="hidden">
												  """)))}/*52.16*/else/*52.20*/{_display_(Seq[Any](format.raw/*52.21*/("""
												  		<input id='"""),_display_(Seq[Any](/*53.29*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*53.82*/("""' placeholder=""""),_display_(Seq[Any](/*53.98*/fieldType/*53.107*/.label)),format.raw/*53.113*/("""" autocomplete="off"  type="text">
												    	<input id='"""),_display_(Seq[Any](/*54.30*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*54.94*/("""'  name='"""),_display_(Seq[Any](/*54.104*/(fieldType.name + "_id"))),format.raw/*54.128*/("""'  type="hidden">
												  """)))})),format.raw/*55.16*/("""
					  						  """)))}/*56.17*/else/*56.21*/{_display_(Seq[Any](format.raw/*56.22*/("""
					  						  	<input id='"""),_display_(Seq[Any](/*57.29*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*57.82*/("""' """),_display_(Seq[Any](/*57.85*/fieldType/*57.94*/.htmlAttrib)),format.raw/*57.105*/(""" placeholder=""""),_display_(Seq[Any](/*57.120*/fieldType/*57.129*/.label)),format.raw/*57.135*/("""" type="text">
												<input id='"""),_display_(Seq[Any](/*58.25*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*58.89*/("""'  name='"""),_display_(Seq[Any](/*58.99*/(fieldType.name + "_ids"))),format.raw/*58.124*/("""'  type="hidden">
					  						  
					  						  """)))})),format.raw/*60.17*/("""
					  						  
					  					      </div>
											</div>
											<script>
											"""),_display_(Seq[Any](/*65.13*/if(fieldType.value.li!=null)/*65.41*/{_display_(Seq[Any](format.raw/*65.42*/("""
												idss = [];
												"""),_display_(Seq[Any](/*67.14*/for(mo<-fieldType.value.li) yield /*67.41*/{_display_(Seq[Any](format.raw/*67.42*/("""
													idss.push("""),_display_(Seq[Any](/*68.25*/mo/*68.27*/.id)),format.raw/*68.30*/(""");
												""")))})),format.raw/*69.14*/("""
												$('#"""),_display_(Seq[Any](/*70.18*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*70.82*/("""').val(idss);
												$('#"""),_display_(Seq[Any](/*71.18*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*71.71*/("""').val(idss);
											""")))})),format.raw/*72.13*/("""
											$('#"""),_display_(Seq[Any](/*73.17*/(_searchContext.entityName + "edit" + fieldType.name ))),format.raw/*73.71*/("""').select2("""),format.raw/*73.82*/("""{"""),format.raw/*73.83*/("""
												minimumInputLength: 1,
												multiple:"""),_display_(Seq[Any](/*75.23*/fieldType/*75.32*/.multiselect)),format.raw/*75.44*/(""",
											    ajax: """),format.raw/*76.22*/("""{"""),format.raw/*76.23*/(""" // instead of writing the function to execute the request we use Select2's convenient helper
											        url: """"),_display_(Seq[Any](/*77.27*/(_searchContext.autoCompleteUrls.get(fieldType.label)))),format.raw/*77.81*/("""",
											        dataType: 'json',
											        data: function (term, page) """),format.raw/*79.48*/("""{"""),format.raw/*79.49*/("""
											            return """),format.raw/*80.31*/("""{"""),format.raw/*80.32*/("""
											                query: term, // search term
											                param: function()"""),format.raw/*82.45*/("""{"""),format.raw/*82.46*/("""
											                	if(typeof("""),_display_(Seq[Any](/*83.40*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*83.93*/("""_customParameterBuilder) == "function")"""),format.raw/*83.132*/("""{"""),format.raw/*83.133*/("""
                                                                     return """),_display_(Seq[Any](/*84.78*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*84.131*/("""_customParameterBuilder();
                                                                """),format.raw/*85.65*/("""}"""),format.raw/*85.66*/("""else"""),format.raw/*85.70*/("""{"""),format.raw/*85.71*/("""
                                                                     return "";
                                                                """),format.raw/*87.65*/("""}"""),format.raw/*87.66*/("""
                                                            """),format.raw/*88.61*/("""}"""),format.raw/*88.62*/(""",
											                page_limit: 10
											            """),format.raw/*90.24*/("""}"""),format.raw/*90.25*/(""";
											        """),format.raw/*91.20*/("""}"""),format.raw/*91.21*/(""",
											        results: function (data, page) """),format.raw/*92.51*/("""{"""),format.raw/*92.52*/(""" // parse the results into the format expected by Select2.
											            return """),format.raw/*93.31*/("""{"""),format.raw/*93.32*/("""results: data.results"""),format.raw/*93.53*/("""}"""),format.raw/*93.54*/(""";
											        """),format.raw/*94.20*/("""}"""),format.raw/*94.21*/("""
											    """),format.raw/*95.16*/("""}"""),format.raw/*95.17*/(""",
											    formatResult: function(exercise) """),format.raw/*96.49*/("""{"""),format.raw/*96.50*/(""" 
											    	return "<div class='select2-user-result'>" + exercise._1 + "</div>"; 
											    """),format.raw/*98.16*/("""}"""),format.raw/*98.17*/(""",
											    formatSelection: function(exercise) """),format.raw/*99.52*/("""{"""),format.raw/*99.53*/(""" 
											    	return exercise._1; 
											    """),format.raw/*101.16*/("""}"""),format.raw/*101.17*/(""",
											   
											    
											    initSelection: function(element, callback) """),format.raw/*104.59*/("""{"""),format.raw/*104.60*/("""
											    	var _id=$(element).val();
											    	var data = [];
											    	"""),_display_(Seq[Any](/*107.18*/if(fieldType.multiselect)/*107.43*/{_display_(Seq[Any](format.raw/*107.44*/("""
											    		"""),_display_(Seq[Any](/*108.19*/if(fieldType.value.li!=null)/*108.47*/{_display_(Seq[Any](format.raw/*108.48*/("""
											    			"""),_display_(Seq[Any](/*109.20*/for(mo<-fieldType.value.li) yield /*109.47*/{_display_(Seq[Any](format.raw/*109.48*/("""
											    				data.push("""),format.raw/*110.30*/("""{"""),format.raw/*110.31*/("""id: """),_display_(Seq[Any](/*110.36*/mo/*110.38*/.id)),format.raw/*110.41*/(""", _1:'"""),_display_(Seq[Any](/*110.48*/mo/*110.50*/.o)),format.raw/*110.52*/("""' """),format.raw/*110.54*/("""}"""),format.raw/*110.55*/(""");	
											    			""")))})),format.raw/*111.20*/("""
											    		""")))})),format.raw/*112.19*/("""
											    	""")))}/*113.18*/else/*113.22*/{_display_(Seq[Any](format.raw/*113.23*/("""
											    		 data = """),format.raw/*114.26*/("""{"""),format.raw/*114.27*/("""_1:_id,id:$('#"""),_display_(Seq[Any](/*114.42*/(_searchContext.entityName +  "edit" + fieldType.name +"_hidden"))),format.raw/*114.107*/("""').val()"""),format.raw/*114.115*/("""}"""),format.raw/*114.116*/(""";
											    	""")))})),format.raw/*115.18*/("""
											    	callback(data);
											    """),format.raw/*117.16*/("""}"""),format.raw/*117.17*/("""
											"""),format.raw/*118.12*/("""}"""),format.raw/*118.13*/(""").on('change',function(ev)"""),format.raw/*118.39*/("""{"""),format.raw/*118.40*/("""
												console.log(ev.val);
												$('#'+'"""),_display_(Seq[Any](/*120.21*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*120.85*/("""').val(ev.val);
											"""),format.raw/*121.12*/("""}"""),format.raw/*121.13*/(""");
											</script>
										""")))})),format.raw/*123.12*/("""
									""")))}/*124.11*/else/*124.15*/{_display_(Seq[Any](format.raw/*124.16*/("""
											<input id='"""),_display_(Seq[Any](/*125.24*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*125.77*/("""' name='"""),_display_(Seq[Any](/*125.86*/(fieldType.name))),format.raw/*125.102*/("""'  value='"""),_display_(Seq[Any](/*125.113*/(fieldType.value.o))),format.raw/*125.132*/("""' type="hidden">
									""")))})),format.raw/*126.11*/("""
								""")))}/*128.9*/case "SELECT_OPTION" =>/*128.32*/ {_display_(Seq[Any](format.raw/*128.34*/("""
									"""),_display_(Seq[Any](/*129.11*/if(fieldType.order % 2 == 1)/*129.39*/{_display_(Seq[Any](format.raw/*129.40*/("""
		        								<div class="control-group" style="float:left;width:46%;margin: 0px; height:75px;">
		        					""")))}/*131.17*/else/*131.21*/{_display_(Seq[Any](format.raw/*131.22*/("""
		        								<div class="control-group" style=" height:75px;" >
		        					""")))})),format.raw/*133.17*/("""
									  <label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*134.60*/fieldType/*134.69*/.label)),format.raw/*134.75*/("""</label>
									  <div class="controls">
									    <select id='"""),_display_(Seq[Any](/*136.27*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*136.80*/("""' name=""""),_display_(Seq[Any](/*136.89*/fieldType/*136.98*/.name)),format.raw/*136.103*/("""" class="input-large">
										    """),_display_(Seq[Any](/*137.16*/for(option<-fieldType.options) yield /*137.46*/{_display_(Seq[Any](format.raw/*137.47*/("""
										    	"""),_display_(Seq[Any](/*138.17*/if(option.name.equals(fieldType.value.display))/*138.64*/{_display_(Seq[Any](format.raw/*138.65*/("""
														<option value='"""),_display_(Seq[Any](/*139.31*/option)),format.raw/*139.37*/("""' selected >"""),_display_(Seq[Any](/*139.50*/option/*139.56*/.getName)),format.raw/*139.64*/("""</option>
					
										    	""")))}/*141.17*/else/*141.21*/{_display_(Seq[Any](format.raw/*141.22*/("""
													"""),_display_(Seq[Any](/*142.15*/if(option.uiHidden==false)/*142.41*/{_display_(Seq[Any](format.raw/*142.42*/("""
														<option value='"""),_display_(Seq[Any](/*143.31*/option)),format.raw/*143.37*/("""' >"""),_display_(Seq[Any](/*143.41*/option/*143.47*/.getName)),format.raw/*143.55*/("""</option>
													""")))})),format.raw/*144.15*/("""
										    	""")))})),format.raw/*145.17*/("""
										    """)))})),format.raw/*146.16*/("""	
									      
									    </select>
									  </div>
									</div>
								""")))}/*152.9*/case "SEARCH" =>/*152.25*/ {_display_(Seq[Any](format.raw/*152.27*/("""
									<div class="control-group">
		        					
		        					  <label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*155.66*/fieldType/*155.75*/.label)),format.raw/*155.81*/("""</label>
									  <div class="controls">
									    """),_display_(Seq[Any](/*157.15*/searchContext(_searchContext.getSearchContexts.get(fieldType.name),(_searchContext.entityName),"edit"))),format.raw/*157.117*/(""" 	
									   </div>
									   <input class="OneToMany" entity='"""),_display_(Seq[Any](/*159.47*/(_searchContext.entityName))),format.raw/*159.74*/("""' id='"""),_display_(Seq[Any](/*159.81*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*159.145*/("""' name='"""),_display_(Seq[Any](/*159.154*/(fieldType.name + "_ids"))),format.raw/*159.179*/("""'  type="hidden">
									<script type="text/javascript">
										"""),_display_(Seq[Any](/*161.12*/if(fieldType.value.li!=null)/*161.40*/{_display_(Seq[Any](format.raw/*161.41*/("""
											idss = [];
											"""),_display_(Seq[Any](/*163.13*/for(mo<-fieldType.value.li) yield /*163.40*/{_display_(Seq[Any](format.raw/*163.41*/("""
												idss.push("""),_display_(Seq[Any](/*164.24*/mo/*164.26*/.id)),format.raw/*164.29*/(""");
												$('#"""),_display_(Seq[Any](/*165.18*/(_searchContext.getSearchContexts.get(fieldType.name).entityName  + "edit" +  "_Pillbox ul"))),format.raw/*165.110*/("""').append("<li data-id='"""),_display_(Seq[Any](/*165.135*/mo/*165.137*/.id)),format.raw/*165.140*/("""' class='status-info'>"""),_display_(Seq[Any](/*165.163*/mo/*165.165*/.o)),format.raw/*165.167*/("""</li>");
											""")))})),format.raw/*166.13*/("""
											$('#"""),_display_(Seq[Any](/*167.17*/(_searchContext.entityName + "edit" + fieldType.name +"_hidden"))),format.raw/*167.81*/("""').val(idss);
										""")))})),format.raw/*168.12*/("""
									</script>
									</div>
									
								""")))}/*173.9*/case "DATE" =>/*173.23*/ {_display_(Seq[Any](format.raw/*173.25*/("""
									"""),_display_(Seq[Any](/*174.11*/if(fieldType.order % 2 == 1)/*174.39*/{_display_(Seq[Any](format.raw/*174.40*/("""
		        						<div class="control-group" style="float:left;width:46%;margin: 0px; height:75px;">
		        					""")))}/*176.17*/else/*176.21*/{_display_(Seq[Any](format.raw/*176.22*/("""
		        						<div class="control-group" style=" height:75px;" >
		        					""")))})),format.raw/*178.17*/("""
									  	<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*179.61*/fieldType/*179.70*/.label)),format.raw/*179.76*/("""
									"""),_display_(Seq[Any](/*180.11*/if(fieldType.validation !=null && fieldType.validation.required)/*180.75*/{_display_(Seq[Any](format.raw/*180.76*/("""
								    	<sup style="color: red"> *</sup>
									""")))})),format.raw/*182.11*/("""
									</label>
									<div id='"""),_display_(Seq[Any](/*184.20*/(_searchContext.entityName + "edit" + fieldType.name))),format.raw/*184.73*/("""' data-provide="datepicker" class="input-prepend date datepicker" data-date="" data-date-format="dd-mm-yyyy">
    									<span class="add-on"><i class="icon-calendar"></i></span>
    									"""),_display_(Seq[Any](/*186.15*/if(fieldType.value.dt!=null)/*186.43*/{_display_(Seq[Any](format.raw/*186.44*/("""
    										<input size="16" type="text" value='"""),_display_(Seq[Any](/*187.52*/(fieldType.value.dt.format("dd-MM-yyyy")))),format.raw/*187.93*/("""' name='"""),_display_(Seq[Any](/*187.102*/(fieldType.name))),format.raw/*187.118*/("""' placeholder="DD-MM-YYYY" class="add-on">
    									""")))}/*188.15*/else/*188.19*/{_display_(Seq[Any](format.raw/*188.20*/("""
    										<input size="16" type="text" value='' name='"""),_display_(Seq[Any](/*189.60*/(fieldType.name))),format.raw/*189.76*/("""' placeholder="DD-MM-YYYY" class="add-on">
    									""")))})),format.raw/*190.15*/("""
									</div>
								</div>
								""")))}})),format.raw/*194.9*/("""
		        		""")))})),format.raw/*195.14*/("""
		    	</div>
		    """)))})),format.raw/*197.8*/("""
		     <div class="wizard-success">
        			"""),_display_(Seq[Any](/*199.13*/(_searchContext.entityName + " Edited Successfully"))),format.raw/*199.65*/("""
    		</div>
 
		    <div class="wizard-error">
		        submission had an error
		    </div>
 
		    <div class="wizard-failure">
		        submission failed
		    </div>
		</div>

<script>
function """),_display_(Seq[Any](/*212.11*/("form_"+_searchContext.entityName + "_edit_wizard"))),format.raw/*212.63*/("""()"""),format.raw/*212.65*/("""{"""),format.raw/*212.66*/("""
	$('#"""),_display_(Seq[Any](/*213.7*/("form_"+_searchContext.entityName + "_edit-wizard"))),format.raw/*213.59*/("""').validate("""),format.raw/*213.71*/("""{"""),format.raw/*213.72*/("""
		//errorElement:"", 
		rules: """),format.raw/*215.10*/("""{"""),format.raw/*215.11*/("""
		    	 """),_display_(Seq[Any](/*216.10*/for(wizard<-_searchContext.getWizards) yield /*216.48*/{_display_(Seq[Any](format.raw/*216.49*/("""
		    		 """),_display_(Seq[Any](/*217.11*/for(fieldType<-wizard.card.iterator) yield /*217.47*/{_display_(Seq[Any](format.raw/*217.48*/("""
		    			 """),_display_(Seq[Any](/*218.12*/if(fieldType.validation !=null )/*218.44*/{_display_(Seq[Any](format.raw/*218.45*/("""
			    			 	 """),_display_(Seq[Any](/*219.15*/(fieldType.name))),format.raw/*219.31*/(""" :"""),format.raw/*219.33*/("""{"""),format.raw/*219.34*/("""
				    				 minlength: """),_display_(Seq[Any](/*220.26*/fieldType/*220.35*/.validation.minlength)),format.raw/*220.56*/(""",
				    				 required : """),_display_(Seq[Any](/*221.26*/fieldType/*221.35*/.validation.required)),format.raw/*221.55*/(""",
				    				 email: """),_display_(Seq[Any](/*222.22*/fieldType/*222.31*/.validation.email)),format.raw/*222.48*/(""",
				    				 maxlength: """),_display_(Seq[Any](/*223.26*/fieldType/*223.35*/.validation.maxlength)),format.raw/*223.56*/(""",
				    				 date: """),_display_(Seq[Any](/*224.21*/fieldType/*224.30*/.validation.date)),format.raw/*224.46*/(""",
				    				 digits: """),_display_(Seq[Any](/*225.23*/fieldType/*225.32*/.validation.digits)),format.raw/*225.50*/(""",
									 number: """),_display_(Seq[Any](/*226.20*/fieldType/*226.29*/.validation.number)),format.raw/*226.47*/("""			    				 
				    			 """),format.raw/*227.13*/("""}"""),format.raw/*227.14*/(""",
			    			 
			    			 
		    		 	""")))})),format.raw/*230.12*/("""
		    		 """)))})),format.raw/*231.11*/("""
		    	 """)))})),format.raw/*232.10*/("""
	    	 """),format.raw/*233.8*/("""}"""),format.raw/*233.9*/(""",
	    	 messages: """),format.raw/*234.18*/("""{"""),format.raw/*234.19*/("""
	    	 	"""),_display_(Seq[Any](/*235.10*/for(wizard<-_searchContext.getWizards) yield /*235.48*/{_display_(Seq[Any](format.raw/*235.49*/("""
	    		 """),_display_(Seq[Any](/*236.10*/for(fieldType<-wizard.card.iterator) yield /*236.46*/{_display_(Seq[Any](format.raw/*236.47*/("""
	    			 """),_display_(Seq[Any](/*237.11*/if(fieldType.validation !=null )/*237.43*/{_display_(Seq[Any](format.raw/*237.44*/("""
	    				 """),_display_(Seq[Any](/*238.12*/if(!fieldType.validation.messages.equals(""))/*238.57*/{_display_(Seq[Any](format.raw/*238.58*/("""
		    				 """),_display_(Seq[Any](/*239.13*/fieldType/*239.22*/.name)),format.raw/*239.27*/(""" :  '"""),_display_(Seq[Any](/*239.33*/fieldType/*239.42*/.validation.messages)),format.raw/*239.62*/("""',
	    				 """)))})),format.raw/*240.12*/("""
		    		 """)))})),format.raw/*241.11*/("""
	    		  """)))})),format.raw/*242.11*/("""
	    		 """)))})),format.raw/*243.10*/("""
	    	 """),format.raw/*244.8*/("""}"""),format.raw/*244.9*/(""",
	    			 
	        
	    
	    highlight: function (element) """),format.raw/*248.36*/("""{"""),format.raw/*248.37*/("""
	        $(element).closest('.control-group').removeClass('success').addClass('error');
	    """),format.raw/*250.6*/("""}"""),format.raw/*250.7*/(""",
	    success: function(element) """),format.raw/*251.33*/("""{"""),format.raw/*251.34*/("""
	        element
	        .addClass('valid')
	        .closest('.control-group').removeClass('error').addClass('success');
	      """),format.raw/*255.8*/("""}"""),format.raw/*255.9*/("""
	"""),format.raw/*256.2*/("""}"""),format.raw/*256.3*/(""");
	return $('#"""),_display_(Seq[Any](/*257.14*/("form_"+_searchContext.entityName + "_edit-wizard"))),format.raw/*257.66*/("""').valid();
"""),format.raw/*258.1*/("""}"""),format.raw/*258.2*/("""
//$(document).ready(function()"""),format.raw/*259.31*/("""{"""),format.raw/*259.32*/("""

//"""),format.raw/*261.3*/("""}"""),format.raw/*261.4*/(""")
</script>"""))}
    }
    
    def render(_searchContext:com.mnt.core.helper.SearchContext): play.api.templates.Html = apply(_searchContext)
    
    def f:((com.mnt.core.helper.SearchContext) => play.api.templates.Html) = (_searchContext) => apply(_searchContext)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/editWizard.scala.html
                    HASH: 44617056d58ea129ab88b80fcd36ce9865d36b22
                    MATRIX: 755->1|882->51|946->80|1011->124|1076->155|1129->193|1167->194|1252->244|1296->267|1349->285|1423->337|1478->357|1492->363|1518->368|1573->388|1624->424|1662->425|1714->441|1732->450|1752->461|1767->467|1776->478|1800->493|1840->495|1888->507|1918->528|1957->529|2006->542|2068->595|2107->596|2157->610|2194->638|2233->639|2374->761|2387->765|2426->766|2548->856|2645->917|2663->926|2691->932|2743->948|2816->1012|2855->1013|2952->1078|3066->1156|3139->1220|3178->1221|3244->1251|3319->1304|3365->1314|3407->1333|3447->1336|3466->1345|3500->1356|3545->1364|3564->1373|3592->1378|3645->1394|3664->1403|3693->1409|3789->1486|3802->1490|3841->1491|3909->1523|3984->1576|4030->1586|4072->1605|4112->1608|4131->1617|4165->1628|4210->1636|4229->1645|4257->1650|4344->1705|4416->1758|4429->1762|4468->1763|4518->1777|4555->1805|4594->1806|4735->1928|4748->1932|4787->1933|4909->2023|5006->2084|5024->2093|5052->2099|5104->2115|5177->2179|5216->2180|5315->2247|5434->2330|5469->2356|5508->2357|5561->2374|5599->2403|5638->2404|5692->2422|5765->2486|5804->2487|5871->2518|5946->2571|5985->2574|6003->2583|6037->2594|6083->2603|6134->2631|6196->2656|6215->2665|6244->2671|6296->2704|6309->2708|6348->2709|6417->2742|6492->2795|6531->2798|6549->2807|6583->2818|6629->2827|6680->2855|6733->2871|6752->2880|6781->2886|6846->2919|6914->2951|7001->3016|7048->3026|7091->3046|7137->3055|7184->3079|7237->3113|7250->3117|7289->3118|7355->3148|7430->3201|7482->3217|7501->3226|7530->3232|7631->3297|7717->3361|7764->3371|7811->3395|7877->3429|7914->3447|7927->3451|7966->3452|8032->3482|8107->3535|8146->3538|8164->3547|8198->3558|8250->3573|8269->3582|8298->3588|8374->3628|8460->3692|8506->3702|8554->3727|8638->3779|8771->3876|8808->3904|8847->3905|8922->3944|8965->3971|9004->3972|9066->3998|9077->4000|9102->4003|9151->4020|9206->4039|9292->4103|9360->4135|9435->4188|9494->4215|9548->4233|9624->4287|9663->4298|9692->4299|9788->4359|9806->4368|9840->4380|9892->4404|9921->4405|10078->4526|10154->4580|10271->4669|10300->4670|10360->4702|10389->4703|10519->4805|10548->4806|10625->4847|10700->4900|10768->4939|10798->4940|10913->5019|10989->5072|11109->5164|11138->5165|11170->5169|11199->5170|11374->5317|11403->5318|11493->5380|11522->5381|11619->5450|11648->5451|11698->5473|11727->5474|11808->5527|11837->5528|11955->5618|11984->5619|12033->5640|12062->5641|12112->5663|12141->5664|12186->5681|12215->5682|12294->5733|12323->5734|12456->5839|12485->5840|12567->5894|12596->5895|12681->5951|12711->5952|12834->6046|12864->6047|12995->6141|13030->6166|13070->6167|13127->6187|13165->6215|13205->6216|13263->6237|13307->6264|13347->6265|13407->6296|13437->6297|13479->6302|13491->6304|13517->6307|13561->6314|13573->6316|13598->6318|13629->6320|13659->6321|13716->6345|13769->6365|13808->6384|13822->6388|13862->6389|13918->6416|13948->6417|14000->6432|14089->6497|14127->6505|14158->6506|14211->6526|14290->6576|14320->6577|14362->6590|14392->6591|14447->6617|14477->6618|14570->6674|14657->6738|14714->6766|14744->6767|14814->6804|14846->6816|14860->6820|14900->6821|14962->6846|15038->6899|15084->6908|15124->6924|15173->6935|15216->6954|15277->6982|15307->7003|15340->7026|15381->7028|15430->7040|15468->7068|15508->7069|15648->7189|15662->7193|15702->7194|15823->7282|15921->7343|15940->7352|15969->7358|16077->7429|16153->7482|16199->7491|16218->7500|16247->7505|16323->7544|16370->7574|16410->7575|16465->7593|16522->7640|16562->7641|16631->7673|16660->7679|16710->7692|16726->7698|16757->7706|16811->7740|16825->7744|16865->7745|16918->7761|16954->7787|16994->7788|17063->7820|17092->7826|17133->7830|17149->7836|17180->7844|17238->7869|17289->7887|17339->7904|17447->8003|17473->8019|17514->8021|17673->8143|17692->8152|17721->8158|17817->8217|17943->8319|18050->8389|18100->8416|18144->8423|18232->8487|18279->8496|18328->8521|18437->8593|18475->8621|18515->8622|18589->8659|18633->8686|18673->8687|18735->8712|18747->8714|18773->8717|18831->8738|18947->8830|19010->8855|19023->8857|19050->8860|19111->8883|19124->8885|19150->8887|19205->8909|19260->8927|19347->8991|19406->9017|19484->9086|19508->9100|19549->9102|19598->9114|19636->9142|19676->9143|19814->9261|19828->9265|19868->9266|19987->9352|20086->9414|20105->9423|20134->9429|20183->9441|20257->9505|20297->9506|20389->9565|20466->9605|20542->9658|20776->9855|20814->9883|20854->9884|20944->9937|21008->9978|21055->9987|21095->10003|21173->10061|21187->10065|21227->10066|21325->10127|21364->10143|21455->10201|21532->10255|21580->10270|21636->10294|21724->10345|21799->10397|22052->10613|22127->10665|22158->10667|22188->10668|22232->10676|22307->10728|22348->10740|22378->10741|22441->10775|22471->10776|22519->10787|22574->10825|22614->10826|22663->10838|22716->10874|22756->10875|22806->10888|22848->10920|22888->10921|22941->10937|22980->10953|23011->10955|23041->10956|23105->10983|23124->10992|23168->11013|23233->11041|23252->11050|23295->11070|23356->11094|23375->11103|23415->11120|23480->11148|23499->11157|23543->11178|23603->11201|23622->11210|23661->11226|23723->11251|23742->11260|23783->11278|23842->11300|23861->11309|23902->11327|23957->11353|23987->11354|24060->11394|24105->11406|24149->11417|24186->11426|24215->11427|24264->11447|24294->11448|24342->11459|24397->11497|24437->11498|24485->11509|24538->11545|24578->11546|24627->11558|24669->11590|24709->11591|24759->11604|24814->11649|24854->11650|24905->11664|24924->11673|24952->11678|24995->11684|25014->11693|25057->11713|25105->11728|25150->11740|25195->11752|25239->11763|25276->11772|25305->11773|25401->11840|25431->11841|25555->11937|25584->11938|25648->11973|25678->11974|25841->12109|25870->12110|25901->12113|25930->12114|25984->12131|26059->12183|26100->12196|26129->12197|26190->12229|26220->12230|26254->12236|26283->12237
                    LINES: 26->1|29->1|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|43->16|43->16|43->16|45->18|46->19|46->19|46->19|47->20|47->20|47->20|49->22|52->25|52->25|52->25|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|53->26|54->27|54->27|54->27|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|55->28|56->29|59->32|59->32|59->32|60->33|60->33|60->33|62->35|62->35|62->35|64->37|65->38|65->38|65->38|66->39|66->39|66->39|68->41|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|74->47|74->47|74->47|74->47|74->47|74->47|74->47|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|76->49|76->49|76->49|76->49|76->49|76->49|76->49|76->49|77->50|78->51|78->51|78->51|78->51|78->51|78->51|79->52|79->52|79->52|80->53|80->53|80->53|80->53|80->53|81->54|81->54|81->54|81->54|82->55|83->56|83->56|83->56|84->57|84->57|84->57|84->57|84->57|84->57|84->57|84->57|85->58|85->58|85->58|85->58|87->60|92->65|92->65|92->65|94->67|94->67|94->67|95->68|95->68|95->68|96->69|97->70|97->70|98->71|98->71|99->72|100->73|100->73|100->73|100->73|102->75|102->75|102->75|103->76|103->76|104->77|104->77|106->79|106->79|107->80|107->80|109->82|109->82|110->83|110->83|110->83|110->83|111->84|111->84|112->85|112->85|112->85|112->85|114->87|114->87|115->88|115->88|117->90|117->90|118->91|118->91|119->92|119->92|120->93|120->93|120->93|120->93|121->94|121->94|122->95|122->95|123->96|123->96|125->98|125->98|126->99|126->99|128->101|128->101|131->104|131->104|134->107|134->107|134->107|135->108|135->108|135->108|136->109|136->109|136->109|137->110|137->110|137->110|137->110|137->110|137->110|137->110|137->110|137->110|137->110|138->111|139->112|140->113|140->113|140->113|141->114|141->114|141->114|141->114|141->114|141->114|142->115|144->117|144->117|145->118|145->118|145->118|145->118|147->120|147->120|148->121|148->121|150->123|151->124|151->124|151->124|152->125|152->125|152->125|152->125|152->125|152->125|153->126|154->128|154->128|154->128|155->129|155->129|155->129|157->131|157->131|157->131|159->133|160->134|160->134|160->134|162->136|162->136|162->136|162->136|162->136|163->137|163->137|163->137|164->138|164->138|164->138|165->139|165->139|165->139|165->139|165->139|167->141|167->141|167->141|168->142|168->142|168->142|169->143|169->143|169->143|169->143|169->143|170->144|171->145|172->146|177->152|177->152|177->152|180->155|180->155|180->155|182->157|182->157|184->159|184->159|184->159|184->159|184->159|184->159|186->161|186->161|186->161|188->163|188->163|188->163|189->164|189->164|189->164|190->165|190->165|190->165|190->165|190->165|190->165|190->165|190->165|191->166|192->167|192->167|193->168|197->173|197->173|197->173|198->174|198->174|198->174|200->176|200->176|200->176|202->178|203->179|203->179|203->179|204->180|204->180|204->180|206->182|208->184|208->184|210->186|210->186|210->186|211->187|211->187|211->187|211->187|212->188|212->188|212->188|213->189|213->189|214->190|217->194|218->195|220->197|222->199|222->199|235->212|235->212|235->212|235->212|236->213|236->213|236->213|236->213|238->215|238->215|239->216|239->216|239->216|240->217|240->217|240->217|241->218|241->218|241->218|242->219|242->219|242->219|242->219|243->220|243->220|243->220|244->221|244->221|244->221|245->222|245->222|245->222|246->223|246->223|246->223|247->224|247->224|247->224|248->225|248->225|248->225|249->226|249->226|249->226|250->227|250->227|253->230|254->231|255->232|256->233|256->233|257->234|257->234|258->235|258->235|258->235|259->236|259->236|259->236|260->237|260->237|260->237|261->238|261->238|261->238|262->239|262->239|262->239|262->239|262->239|262->239|263->240|264->241|265->242|266->243|267->244|267->244|271->248|271->248|273->250|273->250|274->251|274->251|278->255|278->255|279->256|279->256|280->257|280->257|281->258|281->258|282->259|282->259|284->261|284->261
                    -- GENERATED --
                */
            