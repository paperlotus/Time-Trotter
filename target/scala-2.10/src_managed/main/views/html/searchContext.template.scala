
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
object searchContext extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_searchContext: com.mnt.core.helper.SearchContext,_parentSearchCtx:String,mode:String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.89*/("""

<div id='"""),_display_(Seq[Any](/*3.11*/(_searchContext.entityName + mode + "_search"))),format.raw/*3.57*/("""' class="well form-inline" >  
		
		"""),_display_(Seq[Any](/*5.4*/if(_searchContext.getFilter != null)/*5.40*/{_display_(Seq[Any](format.raw/*5.41*/("""
				
		"""),_display_(Seq[Any](/*7.4*/for(fieldType <- _searchContext.getFilter.iterator) yield /*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""
			"""),_display_(Seq[Any](/*8.5*/fieldType/*8.14*/.ctype.name/*8.25*/ match/*8.31*/{/*9.5*/case "INPUT" =>/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""
					<input id=""""),_display_(Seq[Any](/*10.18*/(_searchContext.entityName + mode + fieldType.name))),format.raw/*10.69*/("""" name=""""),_display_(Seq[Any](/*10.78*/fieldType/*10.87*/.name)),format.raw/*10.92*/("""" placeholder=""""),_display_(Seq[Any](/*10.108*/fieldType/*10.117*/.label)),format.raw/*10.123*/("""" class="input-medium search-query" type="text">
				""")))}/*12.5*/case "SELECT_OPTION" =>/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
		            <label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*13.63*/fieldType/*13.72*/.label)),format.raw/*13.78*/("""</label>
				    <select id=""""),_display_(Seq[Any](/*14.22*/(_searchContext.entityName  + mode +  fieldType.name))),format.raw/*14.75*/("""" name=""""),_display_(Seq[Any](/*14.84*/fieldType/*14.93*/.name)),format.raw/*14.98*/("""" class="input-xlarge search-on-select">
					    """),_display_(Seq[Any](/*15.11*/for(option<-fieldType.options) yield /*15.41*/{_display_(Seq[Any](format.raw/*15.42*/("""
					    	<option value='"""),_display_(Seq[Any](/*16.27*/option)),format.raw/*16.33*/("""'>"""),_display_(Seq[Any](/*16.36*/option/*16.42*/.getName)),format.raw/*16.50*/("""</option>
					    """)))})),format.raw/*17.11*/("""	
					</select>
				""")))}/*20.5*/case "DATE" =>/*20.19*/ {_display_(Seq[Any](format.raw/*20.21*/("""
				  	<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*21.56*/fieldType/*21.65*/.label)),format.raw/*21.71*/("""</label>
					<div data-provide="datepicker" class="input-append date datepicker" data-date="" data-date-format="dd-mm-yyyy">
	    				<input id=""""),_display_(Seq[Any](/*23.22*/(_searchContext.entityName + mode + fieldType.name))),format.raw/*23.73*/("""" size="16" type="text" value="" readonly name=""""),_display_(Seq[Any](/*23.122*/(fieldType.name))),format.raw/*23.138*/(""""><span class="add-on"><i class="icon-calendar"></i></span>
					</div>
				""")))}})),format.raw/*27.5*/("""
		""")))})),format.raw/*28.4*/("""
			<label class="control-label" for="singlebutton">&nbsp;</label>
			<button id='"""),_display_(Seq[Any](/*30.17*/(_searchContext.entityName  + mode +  "_searchButton"))),format.raw/*30.71*/("""' onclick="return false;" name="searchButton" class="btn">Search</button>
		""")))})),format.raw/*31.4*/("""							
				
</div>


<fieldset>

		<div class="row-fluid">
			<div class="span12">
				<div class="row-fluid">
					<div class="control-group">
					  <table id='"""),_display_(Seq[Any](/*42.20*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*42.73*/("""'><tr><td/></tr></table> 
						<div id='"""),_display_(Seq[Any](/*43.17*/(_searchContext.entityName  + mode +  "_jqGrid_pager"))),format.raw/*43.71*/("""' ></div> 

					</div>
					<div class="control-group">
					  <label class="control-label" for="button1id">&nbsp;</label>
					  <div class="controls">
						"""),_display_(Seq[Any](/*49.8*/if(_parentSearchCtx == null && _searchContext.showAddButton.visibility)/*49.79*/{_display_(Seq[Any](format.raw/*49.80*/("""
					  	 	<button type="button" id='"""),_display_(Seq[Any](/*50.38*/(_searchContext.entityName  + mode +  "_addButton"))),format.raw/*50.89*/("""' data-toggle="modal" class="btn btn-warning" data-target='#"""),_display_(Seq[Any](/*50.150*/(_searchContext.entityName + "_addModal"))),format.raw/*50.191*/("""'>Create New</button>
					  	""")))})),format.raw/*51.10*/("""	
					  	"""),_display_(Seq[Any](/*52.10*/if(_parentSearchCtx == null && _searchContext.showEditButton.visibility)/*52.82*/{_display_(Seq[Any](format.raw/*52.83*/("""
					  		"""),_display_(Seq[Any](/*53.11*/_searchContext/*53.25*/.showEditButton.target.name/*53.52*/ match/*53.58*/{/*54.9*/case "MODAL" =>/*54.24*/ {_display_(Seq[Any](format.raw/*54.26*/("""
						  			<button type="button" id='"""),_display_(Seq[Any](/*55.39*/(_searchContext.entityName  + mode +  "_editButton"))),format.raw/*55.91*/("""' data-toggle="modal" class="btn btn-warning" data-target='#"""),_display_(Seq[Any](/*55.152*/(_searchContext.entityName + "_editModal"))),format.raw/*55.194*/("""'>"""),_display_(Seq[Any](/*55.197*/_searchContext/*55.211*/.showEditButton.label)),format.raw/*55.232*/("""</button>
						  		""")))}/*57.11*/case "NEW" =>/*57.24*/ {_display_(Seq[Any](format.raw/*57.26*/("""
						  			<button type="button" id='"""),_display_(Seq[Any](/*58.39*/(_searchContext.entityName  + mode +  "_editButton"))),format.raw/*58.91*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*58.119*/_searchContext/*58.133*/.showEditButton.label)),format.raw/*58.154*/("""</button>
						  		""")))}})),format.raw/*60.11*/("""
					  	""")))})),format.raw/*61.10*/("""
					  	"""),_display_(Seq[Any](/*62.10*/if(_parentSearchCtx != null)/*62.38*/{_display_(Seq[Any](format.raw/*62.39*/("""
					  		<button type="button" id='"""),_display_(Seq[Any](/*63.37*/(_searchContext.entityName  + mode +  "_addToButton"))),format.raw/*63.90*/("""'  class="btn" >Add To Board...</button>
					  	""")))})),format.raw/*64.10*/("""
					  	"""),_display_(Seq[Any](/*65.10*/for(button <- _searchContext.getButtonActions) yield /*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
					  		"""),_display_(Seq[Any](/*66.11*/if(_parentSearchCtx == null && button.visibility)/*66.60*/{_display_(Seq[Any](format.raw/*66.61*/("""
						  		"""),_display_(Seq[Any](/*67.12*/button/*67.18*/.target.name/*67.30*/ match/*67.36*/{/*68.10*/case "MODAL" =>/*68.25*/ {_display_(Seq[Any](format.raw/*68.27*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*69.40*/(_searchContext.entityName  + mode +  button.id))),format.raw/*69.88*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*69.116*/button/*69.122*/.label)),format.raw/*69.128*/("""</button>
							  		""")))}/*71.12*/case "NEW" =>/*71.25*/ {_display_(Seq[Any](format.raw/*71.27*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*72.40*/(_searchContext.entityName  + mode +  button.id))),format.raw/*72.88*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*72.116*/button/*72.122*/.label)),format.raw/*72.128*/("""</button>
							  		""")))}/*74.12*/case "ACTION" =>/*74.28*/ {_display_(Seq[Any](format.raw/*74.30*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*75.40*/(_searchContext.entityName  + mode +  button.id))),format.raw/*75.88*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*75.116*/button/*75.122*/.label)),format.raw/*75.128*/("""</button>
							  		""")))}})),format.raw/*77.12*/("""
					  		""")))})),format.raw/*78.11*/("""
					  	""")))})),format.raw/*79.10*/("""
					  </div>
					</div>
					<!-- <div class="control-group">
					  <div class="fuelux controls">
					  	<div id='"""),_display_(Seq[Any](/*84.19*/(_searchContext.entityName  + mode +  "_Pillbox"))),format.raw/*84.68*/("""' class="pillbox">
					  		<ul>
					  		</ul>
					  	</div>
					  </div>
					</div> -->
				</div>
			</div>
		</div>
	
</fieldset>
"""),_display_(Seq[Any](/*95.2*/if(_parentSearchCtx == null && mode == "add" && _searchContext.showAddButton.visibility)/*95.90*/{_display_(Seq[Any](format.raw/*95.91*/("""
		"""),_display_(Seq[Any](/*96.4*/wizard(_searchContext))),format.raw/*96.26*/("""			  	 
""")))})),format.raw/*97.2*/("""
 
 
 
 
<div id="wizard-core-container"></div>
<div id="custom-modal-container" class="modal hide fade">
	
</div>
 
 	<script type="text/javascript">
 	
 	
 	
	var """),_display_(Seq[Any](/*111.7*/(_searchContext.entityName  + mode +  "_SearchGrid"))),format.raw/*111.59*/(""" = """),format.raw/*111.62*/("""{"""),format.raw/*111.63*/("""
			_searchURL: """"),_display_(Seq[Any](/*112.18*/_searchContext/*112.32*/.searchUrl)),format.raw/*112.42*/("""",
			initialise: function ()"""),format.raw/*113.27*/("""{"""),format.raw/*113.28*/("""
				$('#"""),_display_(Seq[Any](/*114.10*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*114.63*/("""').jqGrid("""),format.raw/*114.73*/("""{"""),format.raw/*114.74*/("""
			
			   	url:'"""),_display_(Seq[Any](/*116.14*/_searchContext/*116.28*/.searchUrl)),format.raw/*116.38*/("""',
			   	height:231,
			   	width: $('#"""),_display_(Seq[Any](/*118.20*/(_searchContext.entityName + mode + "_search"))),format.raw/*118.66*/("""').width() + 40,
			   	datatype: 'json',
			   	mtype: 'GET',
			   	colNames:[
			             """),_display_(Seq[Any](/*122.18*/for((col,index)<-_searchContext.getColumn.zipWithIndex) yield /*122.73*/{_display_(Seq[Any](format.raw/*122.74*/("""
			            	 """),_display_(Seq[Any](/*123.19*/if(index == 0)/*123.33*/{_display_(Seq[Any](format.raw/*123.34*/("""
			            	 '"""),_display_(Seq[Any](/*124.20*/col/*124.23*/.colName)),format.raw/*124.31*/("""'
			            	 """)))}/*125.19*/else/*125.23*/{_display_(Seq[Any](format.raw/*125.24*/("""
			            		,'"""),_display_(Seq[Any](/*126.21*/col/*126.24*/.colName)),format.raw/*126.32*/("""'
			            	 """)))})),format.raw/*127.19*/("""
			             """)))})),format.raw/*128.18*/("""
			             """),_display_(Seq[Any](/*129.18*/if(_searchContext.getGridActions !=null && _searchContext.getGridActions.size!=0)/*129.99*/{_display_(Seq[Any](format.raw/*129.100*/("""
				             	,'Action'
							 """)))})),format.raw/*131.10*/("""	
			             ],
			   	colModel :[
						"""),_display_(Seq[Any](/*134.8*/for((col,index)<-_searchContext.getColumn.zipWithIndex) yield /*134.63*/{_display_(Seq[Any](format.raw/*134.64*/("""
							"""),_display_(Seq[Any](/*135.9*/if(index == 0)/*135.23*/{_display_(Seq[Any](format.raw/*135.24*/("""
								"""),format.raw/*136.9*/("""{"""),format.raw/*136.10*/("""name:'"""),_display_(Seq[Any](/*136.17*/col/*136.20*/.name)),format.raw/*136.25*/("""', index:'"""),_display_(Seq[Any](/*136.36*/index)),format.raw/*136.41*/("""', width:'"""),_display_(Seq[Any](/*136.52*/col/*136.55*/.width)),format.raw/*136.61*/("""' ,align:'center'"""),format.raw/*136.78*/("""}"""),format.raw/*136.79*/("""
							""")))}/*137.9*/else/*137.13*/{_display_(Seq[Any](format.raw/*137.14*/("""
								,"""),format.raw/*138.10*/("""{"""),format.raw/*138.11*/("""name:'"""),_display_(Seq[Any](/*138.18*/col/*138.21*/.name)),format.raw/*138.26*/("""', index:'"""),_display_(Seq[Any](/*138.37*/index)),format.raw/*138.42*/("""', width:'"""),_display_(Seq[Any](/*138.53*/col/*138.56*/.width)),format.raw/*138.62*/("""',align:'center'"""),format.raw/*138.78*/("""}"""),format.raw/*138.79*/("""
							""")))})),format.raw/*139.9*/("""
						""")))})),format.raw/*140.8*/("""
						"""),_display_(Seq[Any](/*141.8*/if(_searchContext.getGridActions !=null && _searchContext.getGridActions.size!=0)/*141.89*/{_display_(Seq[Any](format.raw/*141.90*/("""
							,"""),format.raw/*142.9*/("""{"""),format.raw/*142.10*/("""name:'action', index:'action', width:40,align:'center',formatter:this.actionFormatter, search:false, title:false"""),format.raw/*142.122*/("""}"""),format.raw/*142.123*/("""
						""")))})),format.raw/*143.8*/("""
			   	],
			   	pagination : true,
			   	pager: '#"""),_display_(Seq[Any](/*146.18*/(_searchContext.entityName  + mode +  "_jqGrid_pager"))),format.raw/*146.72*/("""',
			   	rowNum:10,
			   	rowList:[10,20,30],
			   	viewrecords: true,
			   	gridview: true,
			   	multiselect: """),_display_(Seq[Any](/*151.22*/_searchContext/*151.36*/.isMultiSelectSearch)),format.raw/*151.56*/(""",
			   	caption:  '"""),_display_(Seq[Any](/*152.20*/( _searchContext.entityDisplayName))),format.raw/*152.55*/("""',
			   
			   	onSelectRow: function(id)"""),format.raw/*154.33*/("""{"""),format.raw/*154.34*/("""
			   	"""),format.raw/*155.8*/("""}"""),format.raw/*155.9*/(""",
			   	ondblClickRow: function(rowid) """),format.raw/*156.39*/("""{"""),format.raw/*156.40*/("""
			   		"""),_display_(Seq[Any](/*157.10*/if(_searchContext.showEditButton.visibility)/*157.54*/{_display_(Seq[Any](format.raw/*157.55*/("""
			   			"""),_display_(Seq[Any](/*158.11*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*158.59*/(""".doEdit();
			   		""")))})),format.raw/*159.10*/("""
			   		
			   		"""),_display_(Seq[Any](/*161.10*/if( _searchContext.onDoubleRowClickCallID != null)/*161.60*/{_display_(Seq[Any](format.raw/*161.61*/("""
			   			$('#"""),_display_(Seq[Any](/*162.15*/(_searchContext.entityName  + mode +  _searchContext.onDoubleRowClickCallID))),format.raw/*162.91*/("""').click();
			   		""")))})),format.raw/*163.10*/("""
			   		
			   	"""),format.raw/*165.8*/("""}"""),format.raw/*165.9*/(""",
			   	loadComplete:function (data)"""),format.raw/*166.36*/("""{"""),format.raw/*166.37*/("""
			   		$('a[id^=""""),_display_(Seq[Any](/*167.20*/(_searchContext.entityName + mode))),format.raw/*167.54*/("""_gridAction"'+']').each(function() """),format.raw/*167.89*/("""{"""),format.raw/*167.90*/("""
			   			if(typeof("""),_display_(Seq[Any](/*168.21*/(_searchContext.entityName + mode))),format.raw/*168.55*/("""_gridAction_isToBeHidden) == "function")"""),format.raw/*168.95*/("""{"""),format.raw/*168.96*/("""
			   				"""),_display_(Seq[Any](/*169.12*/(_searchContext.entityName + mode))),format.raw/*169.46*/("""_gridAction_isToBeHidden($(this).attr('type')) ? $(this).hide(): $(this).show();
			   			"""),format.raw/*170.10*/("""}"""),format.raw/*170.11*/("""
			   			
			   			_this = this;
				   		$(this).click(function(e)"""),format.raw/*173.35*/("""{"""),format.raw/*173.36*/("""
				   			var id = $(this).attr('cell');
				   			var _url = $(this).attr('url');
				   			var _action = $(this).attr('action');
				   			var s = id;
				   			if(typeof("""),_display_(Seq[Any](/*178.22*/(_searchContext.entityName ))),format.raw/*178.50*/("""_confimationDialog)=='function')"""),format.raw/*178.82*/("""{"""),format.raw/*178.83*/("""
				   				if("""),_display_(Seq[Any](/*179.16*/(_searchContext.entityName))),format.raw/*179.43*/("""_confimationDialog(_url))"""),format.raw/*179.68*/("""{"""),format.raw/*179.69*/("""
				   					bootbox.confirm("Do You Want to Continue?", function(result) """),format.raw/*180.74*/("""{"""),format.raw/*180.75*/("""
				   						 if(result == true)"""),format.raw/*181.33*/("""{"""),format.raw/*181.34*/("""
								          """),_display_(Seq[Any](/*182.20*/(_searchContext.entityName  + mode +  "_SearchGrid"))),format.raw/*182.72*/(""".ajaxCaller(_url,s);
								        """),format.raw/*183.17*/("""}"""),format.raw/*183.18*/("""else"""),format.raw/*183.22*/("""{"""),format.raw/*183.23*/("""
								         	    return true;
								        """),format.raw/*185.17*/("""}"""),format.raw/*185.18*/(""" 
								 	"""),format.raw/*186.11*/("""}"""),format.raw/*186.12*/(""");
								
								"""),format.raw/*188.9*/("""}"""),format.raw/*188.10*/("""else"""),format.raw/*188.14*/("""{"""),format.raw/*188.15*/("""
									if(_action == 'EDIT_TYPE')"""),format.raw/*189.36*/("""{"""),format.raw/*189.37*/("""
										"""),_display_(Seq[Any](/*190.12*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*190.60*/(""".doEdit(s);					
									"""),format.raw/*191.10*/("""}"""),format.raw/*191.11*/("""else"""),format.raw/*191.15*/("""{"""),format.raw/*191.16*/("""
										"""),_display_(Seq[Any](/*192.12*/(_searchContext.entityName  + mode +  "_SearchGrid"))),format.raw/*192.64*/(""".ajaxCaller(_url,s);
									"""),format.raw/*193.10*/("""}"""),format.raw/*193.11*/("""
								"""),format.raw/*194.9*/("""}"""),format.raw/*194.10*/("""
							
							"""),format.raw/*196.8*/("""}"""),format.raw/*196.9*/("""		
				   		"""),format.raw/*197.10*/("""}"""),format.raw/*197.11*/(""");
				   	 """),format.raw/*198.10*/("""}"""),format.raw/*198.11*/(""");
			   		"""),_display_(Seq[Any](/*199.10*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*199.58*/(""".resizeGrid();
			   	"""),format.raw/*200.8*/("""}"""),format.raw/*200.9*/("""	   
			"""),format.raw/*201.4*/("""}"""),format.raw/*201.5*/(""");
			jQuery('#"""),_display_(Seq[Any](/*202.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*202.67*/("""').jqGrid('bindKeys');
			jQuery('#"""),_display_(Seq[Any](/*203.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*203.67*/("""').jqGrid('navGrid','#"""),_display_(Seq[Any](/*203.90*/(_searchContext.entityName  + mode +  "_jqGrid_pager"))),format.raw/*203.144*/("""',"""),format.raw/*203.146*/("""{"""),format.raw/*203.147*/("""del:false,add:false,edit:false,search:false,refresh:false"""),format.raw/*203.204*/("""}"""),format.raw/*203.205*/(""");
			jQuery('#"""),_display_(Seq[Any](/*204.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*204.67*/("""').jqGrid('navButtonAdd','#"""),_display_(Seq[Any](/*204.95*/(_searchContext.entityName  + mode +  "_jqGrid_pager"))),format.raw/*204.149*/("""',
					"""),format.raw/*205.6*/("""{"""),format.raw/*205.7*/("""
				onClickButton:function()"""),format.raw/*206.29*/("""{"""),format.raw/*206.30*/("""
					"""),_display_(Seq[Any](/*207.7*/(_searchContext.entityName + "_squrl"))),format.raw/*207.45*/("""='';
					"""),_display_(Seq[Any](/*208.7*/if(_searchContext.getFilter != null)/*208.43*/{_display_(Seq[Any](format.raw/*208.44*/("""
						"""),_display_(Seq[Any](/*209.8*/for(fieldType<-_searchContext.getFilter) yield /*209.48*/{_display_(Seq[Any](format.raw/*209.49*/("""
							"""),_display_(Seq[Any](/*210.9*/(_searchContext.entityName + "_squrl"))),format.raw/*210.47*/(""" = """),_display_(Seq[Any](/*210.51*/(_searchContext.entityName + "_squrl"))),format.raw/*210.89*/(""" + '"""),_display_(Seq[Any](/*210.94*/fieldType/*210.103*/.name)),format.raw/*210.108*/("""' +'='+ $('#"""),_display_(Seq[Any](/*210.121*/(_searchContext.entityName  + mode +  fieldType.name))),format.raw/*210.174*/("""').val() +'&'
						""")))})),format.raw/*211.8*/("""
					""")))})),format.raw/*212.7*/("""
					"""),_display_(Seq[Any](/*213.7*/(_searchContext.entityName + "_squrl"))),format.raw/*213.45*/(""" = """),_display_(Seq[Any](/*213.49*/(_searchContext.entityName + "_squrl"))),format.raw/*213.87*/(""" + '1=1';
					window.open('"""),_display_(Seq[Any](/*214.20*/_searchContext/*214.34*/.generateExcel)),format.raw/*214.48*/("""?'+"""),_display_(Seq[Any](/*214.52*/(_searchContext.entityName + "_squrl"))),format.raw/*214.90*/(""",'','');
				"""),format.raw/*215.5*/("""}"""),format.raw/*215.6*/(""",
				caption:"",
				position: "last", 
				title:"Excel", 
				cursor: "pointer""""),format.raw/*219.22*/("""}"""),format.raw/*219.23*/(""");
			
			jQuery('#"""),_display_(Seq[Any](/*221.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*221.67*/("""').on('reloadGrid',function ()"""),format.raw/*221.97*/("""{"""),format.raw/*221.98*/("""
				//TODO
			"""),format.raw/*223.4*/("""}"""),format.raw/*223.5*/(""");	
			this.bindButtons();
						
		"""),format.raw/*226.3*/("""}"""),format.raw/*226.4*/(""",
		actionFormatter:function(cellvalue, options, rowObject)"""),format.raw/*227.58*/("""{"""),format.raw/*227.59*/("""
			
			var show ="";
			_actionSize  = """),_display_(Seq[Any](/*230.20*/_searchContext/*230.34*/.getGridActions.size)),format.raw/*230.54*/(""";
			"""),_display_(Seq[Any](/*231.5*/for(gridAction<-_searchContext.getGridActions.iterator) yield /*231.60*/{_display_(Seq[Any](format.raw/*231.61*/("""
				_image = '"""),_display_(Seq[Any](/*232.16*/routes/*232.22*/.Assets.at("images/"+gridAction.icon.name +".png"))),format.raw/*232.72*/("""';
				
				show = show + "<a id='"""),_display_(Seq[Any](/*234.28*/(_searchContext.entityName + mode))),format.raw/*234.62*/("""_gridAction' action='"""),_display_(Seq[Any](/*234.84*/gridAction/*234.94*/.target)),format.raw/*234.101*/("""' class='tooltipShow' title='"""),_display_(Seq[Any](/*234.131*/gridAction/*234.141*/.tooltip)),format.raw/*234.149*/("""' href='#' type='"""),_display_(Seq[Any](/*234.167*/gridAction/*234.177*/.icon.name)),format.raw/*234.187*/("""' url='"""),_display_(Seq[Any](/*234.195*/gridAction/*234.205*/.url)),format.raw/*234.209*/("""' cell="+cellvalue+" ><img style='max-width:24px; margin-left:-1px;'src='"+_image+"'></a>"
			""")))})),format.raw/*235.5*/("""
			return show;
		"""),format.raw/*237.3*/("""}"""),format.raw/*237.4*/(""",
		
		doSearch: function()"""),format.raw/*239.23*/("""{"""),format.raw/*239.24*/("""
			$('#"""),_display_(Seq[Any](/*240.9*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*240.62*/("""').setGridWidth($('#"""),_display_(Seq[Any](/*240.83*/(_searchContext.entityName + mode + "_search"))),format.raw/*240.129*/("""').width()+40);
			"""),_display_(Seq[Any](/*241.5*/(_searchContext.entityName + "_squrl"))),format.raw/*241.43*/("""='';
			"""),_display_(Seq[Any](/*242.5*/if(_searchContext.getFilter != null)/*242.41*/{_display_(Seq[Any](format.raw/*242.42*/("""
				"""),_display_(Seq[Any](/*243.6*/for(fieldType<-_searchContext.getFilter) yield /*243.46*/{_display_(Seq[Any](format.raw/*243.47*/("""
					"""),_display_(Seq[Any](/*244.7*/(_searchContext.entityName + "_squrl"))),format.raw/*244.45*/(""" = """),_display_(Seq[Any](/*244.49*/(_searchContext.entityName + "_squrl"))),format.raw/*244.87*/(""" + '"""),_display_(Seq[Any](/*244.92*/fieldType/*244.101*/.name)),format.raw/*244.106*/("""' +'='+ $('#"""),_display_(Seq[Any](/*244.119*/(_searchContext.entityName  + mode +  fieldType.name))),format.raw/*244.172*/("""').val() +'&'
				""")))})),format.raw/*245.6*/("""
			""")))})),format.raw/*246.5*/("""
			"""),_display_(Seq[Any](/*247.5*/(_searchContext.entityName + "_squrl"))),format.raw/*247.43*/(""" = """),_display_(Seq[Any](/*247.47*/(_searchContext.entityName + "_squrl"))),format.raw/*247.85*/(""" + '1=1';
			
			jQuery('#"""),_display_(Seq[Any](/*249.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*249.67*/("""').setGridParam("""),format.raw/*249.83*/("""{"""),format.raw/*249.84*/("""
				mtype:'GET',
				url:'"""),_display_(Seq[Any](/*251.11*/_searchContext/*251.25*/.searchUrl)),format.raw/*251.35*/("""' +"?"+"""),_display_(Seq[Any](/*251.43*/(_searchContext.entityName + "_squrl"))),format.raw/*251.81*/("""
			"""),format.raw/*252.4*/("""}"""),format.raw/*252.5*/(""").trigger('reloadGrid');
			
			return false;
			
		"""),format.raw/*256.3*/("""}"""),format.raw/*256.4*/(""",
		doCustomAction:function(_url)"""),format.raw/*257.32*/("""{"""),format.raw/*257.33*/("""
			s = this.selectedItem();
			_this = this;
			if(s.length == 0 )"""),format.raw/*260.22*/("""{"""),format.raw/*260.23*/("""
				bootbox.confirm("Please Mark Selection From Grid", function(result) """),format.raw/*261.73*/("""{"""),format.raw/*261.74*/("""
					if(result == true)"""),format.raw/*262.24*/("""{"""),format.raw/*262.25*/("""
						return;
			        """),format.raw/*264.12*/("""}"""),format.raw/*264.13*/("""else"""),format.raw/*264.17*/("""{"""),format.raw/*264.18*/("""
			        	return;
			        """),format.raw/*266.12*/("""}"""),format.raw/*266.13*/("""
				"""),format.raw/*267.5*/("""}"""),format.raw/*267.6*/(""");
				return;					
					
			"""),format.raw/*270.4*/("""}"""),format.raw/*270.5*/("""
			if(typeof("""),_display_(Seq[Any](/*271.15*/(_searchContext.entityName ))),format.raw/*271.43*/("""_confimationDialog)=='function')"""),format.raw/*271.75*/("""{"""),format.raw/*271.76*/("""
				if("""),_display_(Seq[Any](/*272.9*/(_searchContext.entityName))),format.raw/*272.36*/("""_confimationDialog(_url))"""),format.raw/*272.61*/("""{"""),format.raw/*272.62*/("""
					bootbox.confirm("Do You Want to Continue?", function(result) """),format.raw/*273.67*/("""{"""),format.raw/*273.68*/("""
  						 if(result == true)"""),format.raw/*274.28*/("""{"""),format.raw/*274.29*/("""
  							_this.ajaxCaller(_url,s);
				        """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/("""else"""),format.raw/*276.18*/("""{"""),format.raw/*276.19*/("""
				         	    return true;
				        """),format.raw/*278.13*/("""}"""),format.raw/*278.14*/(""" 
				 """),format.raw/*279.6*/("""}"""),format.raw/*279.7*/(""");
				
				"""),format.raw/*281.5*/("""}"""),format.raw/*281.6*/("""else"""),format.raw/*281.10*/("""{"""),format.raw/*281.11*/("""
					this.ajaxCaller(_url,s);
					
				"""),format.raw/*284.5*/("""}"""),format.raw/*284.6*/("""
			
			"""),format.raw/*286.4*/("""}"""),format.raw/*286.5*/("""else"""),format.raw/*286.9*/("""{"""),format.raw/*286.10*/("""
				this.ajaxCaller(_url,s);
			"""),format.raw/*288.4*/("""}"""),format.raw/*288.5*/("""
			
		"""),format.raw/*290.3*/("""}"""),format.raw/*290.4*/(""",
		ajaxCaller: function(_url,s)"""),format.raw/*291.31*/("""{"""),format.raw/*291.32*/("""
			$.ajax("""),format.raw/*292.11*/("""{"""),format.raw/*292.12*/("""
				url:_url,
				data: """),format.raw/*294.11*/("""{"""),format.raw/*294.12*/("""query: s.toString()"""),format.raw/*294.31*/("""}"""),format.raw/*294.32*/(""",
				success: function(data) """),format.raw/*295.29*/("""{"""),format.raw/*295.30*/("""
					_dataType = JSON.parse(data);
					$.pnotify("""),format.raw/*297.16*/("""{"""),format.raw/*297.17*/("""
						history:false,
				        text: _dataType.message
				    """),format.raw/*300.9*/("""}"""),format.raw/*300.10*/(""");
					if(_dataType.count !=0)
						$(".noti_bubble").html(_dataType.count);
					else
						$(".noti_bubble").remove();
					"""),_display_(Seq[Any](/*305.7*/(_searchContext.entityName +"_this"))),format.raw/*305.43*/(""".doSearch();	
				"""),format.raw/*306.5*/("""}"""),format.raw/*306.6*/(""",
				error: function(data) """),format.raw/*307.27*/("""{"""),format.raw/*307.28*/("""
					$.pnotify("""),format.raw/*308.16*/("""{"""),format.raw/*308.17*/("""
						history:false,
				        text: "We are unable to process your Request Please contact Admin "
				    """),format.raw/*311.9*/("""}"""),format.raw/*311.10*/(""");		
				"""),format.raw/*312.5*/("""}"""),format.raw/*312.6*/("""
			"""),format.raw/*313.4*/("""}"""),format.raw/*313.5*/(""")
		"""),format.raw/*314.3*/("""}"""),format.raw/*314.4*/(""",
		selectedItem: function()"""),format.raw/*315.27*/("""{"""),format.raw/*315.28*/("""
			var s=[];
			"""),_display_(Seq[Any](/*317.5*/if(_searchContext.isMultiSelectSearch)/*317.43*/{_display_(Seq[Any](format.raw/*317.44*/("""
				s = jQuery('#"""),_display_(Seq[Any](/*318.19*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*318.72*/("""').jqGrid('getGridParam','selarrrow');
					
			""")))}/*320.5*/else/*320.9*/{_display_(Seq[Any](format.raw/*320.10*/("""
				_s = jQuery('#"""),_display_(Seq[Any](/*321.20*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*321.73*/("""').jqGrid('getGridParam','selrow');
				if(_s!=null)
					s[0] = _s;
				
			""")))})),format.raw/*325.5*/("""
			return s;
		"""),format.raw/*327.3*/("""}"""),format.raw/*327.4*/(""",
		doEdit:function(_s)"""),format.raw/*328.22*/("""{"""),format.raw/*328.23*/("""
			s = [];
			if (typeof(_s) != "undefined")"""),format.raw/*330.34*/("""{"""),format.raw/*330.35*/("""
				s[0] = _s;	
			"""),format.raw/*332.4*/("""}"""),format.raw/*332.5*/("""else"""),format.raw/*332.9*/("""{"""),format.raw/*332.10*/("""
				s = this.selectedItem();
			"""),format.raw/*334.4*/("""}"""),format.raw/*334.5*/("""
			if('"""),_display_(Seq[Any](/*335.9*/(_searchContext.showEditButton.target))),format.raw/*335.47*/("""' == 'NEW')"""),format.raw/*335.58*/("""{"""),format.raw/*335.59*/("""
				if(s.length != 0 )"""),format.raw/*336.23*/("""{"""),format.raw/*336.24*/("""
					var rowData = jQuery('#"""),_display_(Seq[Any](/*337.30*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*337.83*/("""').getRowData(s[0]);
					window.location.href = """"),_display_(Seq[Any](/*338.31*/(_searchContext.showEditButton.url))),format.raw/*338.66*/(""""+"/"+s;
				"""),format.raw/*339.5*/("""}"""),format.raw/*339.6*/("""	
				
			"""),format.raw/*341.4*/("""}"""),format.raw/*341.5*/("""else"""),format.raw/*341.9*/("""{"""),format.raw/*341.10*/("""
				if(s.length == 0 )"""),format.raw/*342.23*/("""{"""),format.raw/*342.24*/("""
					bootbox.confirm("Please Mark Selection From Grid", function(result) """),format.raw/*343.74*/("""{"""),format.raw/*343.75*/("""
						if(result == true)"""),format.raw/*344.25*/("""{"""),format.raw/*344.26*/("""
							return;
				        """),format.raw/*346.13*/("""}"""),format.raw/*346.14*/("""else"""),format.raw/*346.18*/("""{"""),format.raw/*346.19*/("""
				        	return;
				        """),format.raw/*348.13*/("""}"""),format.raw/*348.14*/("""
					"""),format.raw/*349.6*/("""}"""),format.raw/*349.7*/(""");
					return;
				"""),format.raw/*351.5*/("""}"""),format.raw/*351.6*/("""
				$.ajax("""),format.raw/*352.12*/("""{"""),format.raw/*352.13*/("""
					url:'"""),_display_(Seq[Any](/*353.12*/(_searchContext.showEditUrl()))),format.raw/*353.42*/("""',
					data: """),format.raw/*354.12*/("""{"""),format.raw/*354.13*/("""query: s[0]"""),format.raw/*354.24*/("""}"""),format.raw/*354.25*/(""",
					success: function(data) """),format.raw/*355.30*/("""{"""),format.raw/*355.31*/("""
								
						if(jQuery('#"""),_display_(Seq[Any](/*357.20*/(_searchContext.entityName  +   "_edit-wizard"))),format.raw/*357.67*/("""'))"""),format.raw/*357.70*/("""{"""),format.raw/*357.71*/("""
							jQuery('#"""),_display_(Seq[Any](/*358.18*/(_searchContext.entityName  +   "_edit-wizard"))),format.raw/*358.65*/("""').remove();
						"""),format.raw/*359.7*/("""}"""),format.raw/*359.8*/("""
						
			        	$('#wizard-core-container').html(data);
			        	var options = """),format.raw/*362.27*/("""{"""),format.raw/*362.28*/("""
			        			width:window.innerWidth * 0.8,
			        			increaseHeight:100,
			        			leftPanelWidthPercent:20,
			        			submitUrl:'"""),_display_(Seq[Any](/*366.27*/_searchContext/*366.41*/.editUrl)),format.raw/*366.49*/("""',
			        			id:'"""),_display_(Seq[Any](/*367.20*/(_searchContext.entityName + "_edit-wizard"))),format.raw/*367.64*/("""',
			        			onCardReady: function(_currentCard)"""),format.raw/*368.50*/("""{"""),format.raw/*368.51*/("""
			        					
			        					if(typeof("""),_display_(Seq[Any](/*370.28*/(_searchContext.entityName + "edit"))),format.raw/*370.64*/("""_onCardReady)=='function')"""),format.raw/*370.90*/("""{"""),format.raw/*370.91*/("""
			        						"""),_display_(Seq[Any](/*371.19*/(_searchContext.entityName + "edit"))),format.raw/*371.55*/("""_onCardReady(_currentCard);
			        					"""),format.raw/*372.17*/("""}"""),format.raw/*372.18*/("""
			        					
			        				"""),format.raw/*374.16*/("""}"""),format.raw/*374.17*/(""",
			        				onSuccess: function()"""),format.raw/*375.37*/("""{"""),format.raw/*375.38*/("""
			        					"""),_display_(Seq[Any](/*376.18*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*376.66*/(""".doSearch();
			        				"""),format.raw/*377.16*/("""}"""),format.raw/*377.17*/("""
			        			"""),format.raw/*378.15*/("""}"""),format.raw/*378.16*/(""";
			        	var  """),_display_(Seq[Any](/*379.19*/(_searchContext.entityName + "_wizard"))),format.raw/*379.58*/(""" = $('#"""),_display_(Seq[Any](/*379.66*/(_searchContext.entityName + "_edit-wizard"))),format.raw/*379.110*/("""').wizard(options);
			        	$('.wizard-title').html('Edit """),_display_(Seq[Any](/*380.44*/(_searchContext.entityName))),format.raw/*380.71*/("""');
			        	"""),_display_(Seq[Any](/*381.14*/(_searchContext.entityName + "_wizard"))),format.raw/*381.53*/(""".show();
			        	$('#wizard-core-container').empty();
					"""),format.raw/*383.6*/("""}"""),format.raw/*383.7*/(""",
					error : function(response) """),format.raw/*384.33*/("""{"""),format.raw/*384.34*/("""
						if(response.responseText != "")
						"""),format.raw/*386.7*/("""{"""),format.raw/*386.8*/("""	
							$.pnotify("""),format.raw/*387.18*/("""{"""),format.raw/*387.19*/("""
								history:false,
						        text: response.responseText
						    """),format.raw/*390.11*/("""}"""),format.raw/*390.12*/(""");
						"""),format.raw/*391.7*/("""}"""),format.raw/*391.8*/("""
					"""),format.raw/*392.6*/("""}"""),format.raw/*392.7*/("""
				"""),format.raw/*393.5*/("""}"""),format.raw/*393.6*/(""");
			"""),format.raw/*394.4*/("""}"""),format.raw/*394.5*/("""
			
		"""),format.raw/*396.3*/("""}"""),format.raw/*396.4*/(""",
		doCreate: function()"""),format.raw/*397.23*/("""{"""),format.raw/*397.24*/("""
			var _qurl='';
			"""),_display_(Seq[Any](/*399.5*/if(_searchContext.getFilter != null)/*399.41*/{_display_(Seq[Any](format.raw/*399.42*/("""
			"""),_display_(Seq[Any](/*400.5*/for(fieldType<-_searchContext.getFilter) yield /*400.45*/{_display_(Seq[Any](format.raw/*400.46*/("""
				_qurl = _qurl + '"""),_display_(Seq[Any](/*401.23*/fieldType/*401.32*/.name)),format.raw/*401.37*/("""' +'='+ $('#"""),_display_(Seq[Any](/*401.50*/fieldType/*401.59*/.name)),format.raw/*401.64*/("""').val() +'&'
			""")))})),format.raw/*402.5*/("""
			""")))})),format.raw/*403.5*/("""
			_qurl = _qurl + '1=1';
			jQuery('#"""),_display_(Seq[Any](/*405.14*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*405.67*/("""').setGridParam("""),format.raw/*405.83*/("""{"""),format.raw/*405.84*/("""
				mtype:'GET',
				url:this._searchURL +"?"+_qurl
			"""),format.raw/*408.4*/("""}"""),format.raw/*408.5*/(""").trigger("reloadGrid");
			
		"""),format.raw/*410.3*/("""}"""),format.raw/*410.4*/(""",
		resizeGrid:function()"""),format.raw/*411.24*/("""{"""),format.raw/*411.25*/("""
			$('#"""),_display_(Seq[Any](/*412.9*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*412.62*/("""').setGridWidth($('#"""),_display_(Seq[Any](/*412.83*/(_searchContext.entityName + mode + "_search"))),format.raw/*412.129*/("""').width()+40);
		"""),format.raw/*413.3*/("""}"""),format.raw/*413.4*/(""",
		addToBucket: function()"""),format.raw/*414.26*/("""{"""),format.raw/*414.27*/("""
			s = this.selectedItem();
			//$('#"""),_display_(Seq[Any](/*416.11*/(_searchContext.entityName + "_Pillbox ul"))),format.raw/*416.54*/("""').empty();
			jQuery.each(s,function(i,e)"""),format.raw/*417.31*/("""{"""),format.raw/*417.32*/("""
				val_1 = jQuery('#"""),_display_(Seq[Any](/*418.23*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*418.76*/("""').jqGrid ('getCell', e, 1);
				val_2 = jQuery('#"""),_display_(Seq[Any](/*419.23*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*419.76*/("""').jqGrid ('getCell', e, 2);
				val_3 = jQuery('#"""),_display_(Seq[Any](/*420.23*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*420.76*/("""').jqGrid ('getCell', e, 3);
				$('#"""),_display_(Seq[Any](/*421.10*/(_searchContext.entityName  + mode +  "_Pillbox ul"))),format.raw/*421.62*/("""').append("<li data-id='"+e+"' class='status-info'>"+val_1+"-"+val_2+"("+val_3+")</li>");
			"""),format.raw/*422.4*/("""}"""),format.raw/*422.5*/(""");
			$('.OneToMany').each(function()"""),format.raw/*423.35*/("""{"""),format.raw/*423.36*/("""
				if($(this).attr('entity') == '"""),_display_(Seq[Any](/*424.36*/(_parentSearchCtx))),format.raw/*424.54*/("""')"""),format.raw/*424.56*/("""{"""),format.raw/*424.57*/("""
					_this = this;
					ids = [];
					jQuery.each($('#"""),_display_(Seq[Any](/*427.23*/(_searchContext.entityName  + mode +  "_Pillbox ul"))),format.raw/*427.75*/("""').pillbox('items'),function(i,e)"""),format.raw/*427.108*/("""{"""),format.raw/*427.109*/("""
						ids.push(e.id);	
					"""),format.raw/*429.6*/("""}"""),format.raw/*429.7*/(""");
					$(_this).val(ids)
					
					
				"""),format.raw/*433.5*/("""}"""),format.raw/*433.6*/(""";
			"""),format.raw/*434.4*/("""}"""),format.raw/*434.5*/(""");
			
		"""),format.raw/*436.3*/("""}"""),format.raw/*436.4*/(""",
		
		
		
		bindButtons: function()"""),format.raw/*440.26*/("""{"""),format.raw/*440.27*/("""
			"""),_display_(Seq[Any](/*441.5*/(_searchContext.entityName +"_this"))),format.raw/*441.41*/(""" = """),_display_(Seq[Any](/*441.45*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*441.93*/(""";
			$('#"""),_display_(Seq[Any](/*442.9*/(_searchContext.entityName  + mode +  "_searchButton"))),format.raw/*442.63*/("""').click(function()"""),format.raw/*442.82*/("""{"""),format.raw/*442.83*/("""
				"""),_display_(Seq[Any](/*443.6*/(_searchContext.entityName +"_this"))),format.raw/*443.42*/(""".doSearch();
			"""),format.raw/*444.4*/("""}"""),format.raw/*444.5*/(""");
			$('#"""),_display_(Seq[Any](/*445.9*/(_searchContext.entityName  + mode +  "_addToButton"))),format.raw/*445.62*/("""').click(function()"""),format.raw/*445.81*/("""{"""),format.raw/*445.82*/("""
				"""),_display_(Seq[Any](/*446.6*/(_searchContext.entityName +"_this"))),format.raw/*446.42*/(""".addToBucket();
			"""),format.raw/*447.4*/("""}"""),format.raw/*447.5*/(""");
			$('#"""),_display_(Seq[Any](/*448.9*/(_searchContext.entityName  + mode +  "_addButton"))),format.raw/*448.60*/("""').click(function()"""),format.raw/*448.79*/("""{"""),format.raw/*448.80*/("""
				$('.wizard-title').html('Create """),_display_(Seq[Any](/*449.38*/(_searchContext.entityName))),format.raw/*449.65*/("""');
				$('#"""),_display_(Seq[Any](/*450.10*/(_searchContext.entityName + "_add-wizard"))),format.raw/*450.53*/("""').find('input[type=text],input[type=hidden], textarea').val('');
				"""),_display_(Seq[Any](/*451.6*/("form_"+_searchContext.entityName + "_add_wizard_reset"))),format.raw/*451.63*/("""();
				
				"""),_display_(Seq[Any](/*453.6*/(_searchContext.entityName + "_wizard"))),format.raw/*453.45*/(""".show();
				"""),_display_(Seq[Any](/*454.6*/(_searchContext.entityName + "_wizard"))),format.raw/*454.45*/(""".reset();
			    
			"""),format.raw/*456.4*/("""}"""),format.raw/*456.5*/(""");
			$('#"""),_display_(Seq[Any](/*457.9*/(_searchContext.entityName  + mode +  "_editButton"))),format.raw/*457.61*/("""').click(function()"""),format.raw/*457.80*/("""{"""),format.raw/*457.81*/("""
				"""),_display_(Seq[Any](/*458.6*/(_searchContext.entityName + "_this"))),format.raw/*458.43*/(""".doEdit();
			"""),format.raw/*459.4*/("""}"""),format.raw/*459.5*/(""");
			
			"""),_display_(Seq[Any](/*461.5*/for(button <- _searchContext.getButtonActions) yield /*461.51*/{_display_(Seq[Any](format.raw/*461.52*/("""
				"""),_display_(Seq[Any](/*462.6*/if(_parentSearchCtx == null && button.visibility)/*462.55*/{_display_(Seq[Any](format.raw/*462.56*/("""
			  		"""),_display_(Seq[Any](/*463.9*/button/*463.15*/.target.name/*463.27*/ match/*463.33*/{/*464.7*/case "ACTION" =>/*464.23*/ {_display_(Seq[Any](format.raw/*464.25*/("""
							$('#"""),_display_(Seq[Any](/*465.13*/(_searchContext.entityName  + mode +  button.id))),format.raw/*465.61*/("""').click(function()"""),format.raw/*465.80*/("""{"""),format.raw/*465.81*/("""
								"""),_display_(Seq[Any](/*466.10*/(_searchContext.entityName + "_this"))),format.raw/*466.47*/(""".doCustomAction(""""),_display_(Seq[Any](/*466.65*/button/*466.71*/.url)),format.raw/*466.75*/("""");	
				  			"""),format.raw/*467.10*/("""}"""),format.raw/*467.11*/(""");
				  		""")))}/*469.7*/case "MODAL" =>/*469.22*/ {_display_(Seq[Any](format.raw/*469.24*/("""
							$('#"""),_display_(Seq[Any](/*470.13*/(_searchContext.entityName  + mode +  button.id))),format.raw/*470.61*/("""').click(function()"""),format.raw/*470.80*/("""{"""),format.raw/*470.81*/("""
								// 	
								s =  """),_display_(Seq[Any](/*472.15*/(_searchContext.entityName + "_this"))),format.raw/*472.52*/(""".selectedItem();
								if(s.length == 0 )"""),format.raw/*473.27*/("""{"""),format.raw/*473.28*/("""
									bootbox.confirm("Please Mark Selection From Grid", function(result) """),format.raw/*474.78*/("""{"""),format.raw/*474.79*/("""
										if(result == true)"""),format.raw/*475.29*/("""{"""),format.raw/*475.30*/("""
											return;
								        """),format.raw/*477.17*/("""}"""),format.raw/*477.18*/("""else"""),format.raw/*477.22*/("""{"""),format.raw/*477.23*/("""
								        	return;
								        """),format.raw/*479.17*/("""}"""),format.raw/*479.18*/("""
									"""),format.raw/*480.10*/("""}"""),format.raw/*480.11*/(""");
									return;
								"""),format.raw/*482.9*/("""}"""),format.raw/*482.10*/("""
								$.ajax("""),format.raw/*483.16*/("""{"""),format.raw/*483.17*/("""
									url:'"""),_display_(Seq[Any](/*484.16*/button/*484.22*/.url)),format.raw/*484.26*/("""',
									data: """),format.raw/*485.16*/("""{"""),format.raw/*485.17*/("""query: s[0]"""),format.raw/*485.28*/("""}"""),format.raw/*485.29*/(""",
									success: function(data) """),format.raw/*486.34*/("""{"""),format.raw/*486.35*/("""
										$('#custom-modal-container').empty();
										$('#custom-modal-container').html(data);
										$('#custom-modal-container').modal('show').css("""),format.raw/*489.58*/("""{"""),format.raw/*489.59*/("""
											width: window.innerWidth * 0.9,
											position: 'absolute',
											left:'25%'"""),format.raw/*492.22*/("""}"""),format.raw/*492.23*/(""");
										if(typeof("""),_display_(Seq[Any](/*493.22*/(_searchContext.entityName + mode + button.id))),format.raw/*493.68*/("""_onReady)=='function')"""),format.raw/*493.90*/("""{"""),format.raw/*493.91*/("""
											"""),_display_(Seq[Any](/*494.13*/(_searchContext.entityName + mode + button.id))),format.raw/*494.59*/("""_onReady();
										"""),format.raw/*495.11*/("""}"""),format.raw/*495.12*/("""
							        """),format.raw/*496.16*/("""}"""),format.raw/*496.17*/("""
							    """),format.raw/*497.12*/("""}"""),format.raw/*497.13*/(""");
				  			"""),format.raw/*498.10*/("""}"""),format.raw/*498.11*/(""");
						""")))}/*500.7*/case "NEW" =>/*500.20*/ {_display_(Seq[Any](format.raw/*500.22*/("""
							
				  		""")))}})),format.raw/*503.9*/("""
		  		""")))})),format.raw/*504.8*/("""
			""")))})),format.raw/*505.5*/("""
			
			$(".search-query").keypress(function(event)"""),format.raw/*507.47*/("""{"""),format.raw/*507.48*/("""
				if(event.which == "13")"""),format.raw/*508.28*/("""{"""),format.raw/*508.29*/("""
					"""),_display_(Seq[Any](/*509.7*/(_searchContext.entityName +"_this"))),format.raw/*509.43*/(""".doSearch();
				"""),format.raw/*510.5*/("""}"""),format.raw/*510.6*/("""
			"""),format.raw/*511.4*/("""}"""),format.raw/*511.5*/(""");
			$(".search-on-select").change(function(event)"""),format.raw/*512.49*/("""{"""),format.raw/*512.50*/("""
				"""),_display_(Seq[Any](/*513.6*/(_searchContext.entityName +"_this"))),format.raw/*513.42*/(""".doSearch();
			"""),format.raw/*514.4*/("""}"""),format.raw/*514.5*/(""");
		"""),format.raw/*515.3*/("""}"""),format.raw/*515.4*/("""
	"""),format.raw/*516.2*/("""}"""),format.raw/*516.3*/("""
	
	"""),_display_(Seq[Any](/*518.3*/(_searchContext.entityName + mode +"_SearchGrid"))),format.raw/*518.52*/(""".initialise();
	"""),_display_(Seq[Any](/*519.3*/if(_parentSearchCtx == null)/*519.31*/{_display_(Seq[Any](format.raw/*519.32*/("""
		var options = """),format.raw/*520.17*/("""{"""),format.raw/*520.18*/("""width:window.innerWidth * 0.8 ,
				increaseHeight:100,leftPanelWidthPercent:20,
				submitUrl:'"""),_display_(Seq[Any](/*522.17*/_searchContext/*522.31*/.createUrl)),format.raw/*522.41*/("""',
				id:'"""),_display_(Seq[Any](/*523.10*/(_searchContext.entityName + "_add-wizard"))),format.raw/*523.53*/("""',
				onCardReady: function(_currentCard)"""),format.raw/*524.40*/("""{"""),format.raw/*524.41*/("""
					
					if(typeof("""),_display_(Seq[Any](/*526.17*/(_searchContext.entityName + mode))),format.raw/*526.51*/("""_onCardReady)=='function')"""),format.raw/*526.77*/("""{"""),format.raw/*526.78*/("""
						"""),_display_(Seq[Any](/*527.8*/(_searchContext.entityName + mode))),format.raw/*527.42*/("""_onCardReady(_currentCard);
					"""),format.raw/*528.6*/("""}"""),format.raw/*528.7*/("""
					
				"""),format.raw/*530.5*/("""}"""),format.raw/*530.6*/(""",
				onSuccess: function()"""),format.raw/*531.26*/("""{"""),format.raw/*531.27*/("""
					"""),_display_(Seq[Any](/*532.7*/(_searchContext.entityName + mode+"_SearchGrid"))),format.raw/*532.55*/(""".doSearch();
				"""),format.raw/*533.5*/("""}"""),format.raw/*533.6*/("""
				"""),format.raw/*534.5*/("""}"""),format.raw/*534.6*/(""";
		var  """),_display_(Seq[Any](/*535.9*/(_searchContext.entityName + "_wizard"))),format.raw/*535.48*/(""" = $('#"""),_display_(Seq[Any](/*535.56*/(_searchContext.entityName + "_some-wizard"))),format.raw/*535.100*/("""').wizard(options);
	""")))})),format.raw/*536.3*/("""
	
	$(window).bind('resize', function() """),format.raw/*538.38*/("""{"""),format.raw/*538.39*/("""
 		$('#"""),_display_(Seq[Any](/*539.9*/(_searchContext.entityName  + mode +  "_jqGrid_list"))),format.raw/*539.62*/("""').setGridWidth($('#"""),_display_(Seq[Any](/*539.83*/(_searchContext.entityName + mode + "_search"))),format.raw/*539.129*/("""').width()+40);
 	"""),format.raw/*540.3*/("""}"""),format.raw/*540.4*/(""").trigger('resize');
	$('.ui-icon-newwin').css(
			"""),format.raw/*542.4*/("""{"""),format.raw/*542.5*/("""
    			"background-image":"url('"""),_display_(Seq[Any](/*543.34*/routes/*543.40*/.Assets.at("images/excel.png"))),format.raw/*543.70*/("""')",
    			"background-position":"0"
    		"""),format.raw/*545.7*/("""}"""),format.raw/*545.8*/(""");
	
	
	
	</script>
 """))}
    }
    
    def render(_searchContext:com.mnt.core.helper.SearchContext,_parentSearchCtx:String,mode:String): play.api.templates.Html = apply(_searchContext,_parentSearchCtx,mode)
    
    def f:((com.mnt.core.helper.SearchContext,String,String) => play.api.templates.Html) = (_searchContext,_parentSearchCtx,mode) => apply(_searchContext,_parentSearchCtx,mode)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/searchContext.scala.html
                    HASH: 1138e8cfc8feaaa97ee7fd8d86a3bbf5407f1d52
                    MATRIX: 772->1|936->88|985->102|1052->148|1125->187|1169->223|1207->224|1252->235|1318->286|1356->287|1396->293|1413->302|1432->313|1446->319|1454->326|1477->341|1516->343|1571->362|1644->413|1689->422|1707->431|1734->436|1787->452|1806->461|1835->467|1908->528|1940->551|1980->553|2080->617|2098->626|2126->632|2193->663|2268->716|2313->725|2331->734|2358->739|2446->791|2492->821|2531->822|2595->850|2623->856|2662->859|2677->865|2707->873|2760->894|2802->924|2825->938|2865->940|2958->997|2976->1006|3004->1012|3189->1161|3262->1212|3348->1261|3387->1277|3498->1369|3534->1374|3655->1459|3731->1513|3840->1591|4051->1766|4126->1819|4205->1862|4281->1916|4483->2083|4563->2154|4602->2155|4677->2194|4750->2245|4848->2306|4912->2347|4976->2379|5024->2391|5105->2463|5144->2464|5192->2476|5215->2490|5251->2517|5266->2523|5275->2534|5299->2549|5339->2551|5415->2591|5489->2643|5587->2704|5652->2746|5692->2749|5716->2763|5760->2784|5801->2818|5823->2831|5863->2833|5939->2873|6013->2925|6078->2953|6102->2967|6146->2988|6201->3022|6244->3033|6291->3044|6328->3072|6367->3073|6441->3111|6516->3164|6599->3215|6646->3226|6708->3272|6747->3273|6795->3285|6853->3334|6892->3335|6941->3348|6956->3354|6977->3366|6992->3372|7002->3384|7026->3399|7066->3401|7143->3442|7213->3490|7278->3518|7294->3524|7323->3530|7365->3566|7387->3579|7427->3581|7504->3622|7574->3670|7639->3698|7655->3704|7684->3710|7726->3746|7751->3762|7791->3764|7868->3805|7938->3853|8003->3881|8019->3887|8048->3893|8104->3929|8148->3941|8191->3952|8352->4077|8423->4126|8607->4275|8704->4363|8743->4364|8783->4369|8827->4391|8868->4401|9084->4581|9159->4633|9191->4636|9221->4637|9277->4656|9301->4670|9334->4680|9392->4709|9422->4710|9470->4721|9546->4774|9585->4784|9615->4785|9672->4805|9696->4819|9729->4829|9809->4872|9878->4918|10017->5020|10089->5075|10129->5076|10186->5096|10210->5110|10250->5111|10308->5132|10321->5135|10352->5143|10393->5164|10407->5168|10447->5169|10506->5191|10519->5194|10550->5202|10604->5223|10656->5242|10712->5261|10803->5342|10844->5343|10917->5383|11003->5433|11075->5488|11115->5489|11161->5499|11185->5513|11225->5514|11263->5524|11293->5525|11337->5532|11350->5535|11378->5540|11426->5551|11454->5556|11502->5567|11515->5570|11544->5576|11590->5593|11620->5594|11649->5604|11663->5608|11703->5609|11743->5620|11773->5621|11817->5628|11830->5631|11858->5636|11906->5647|11934->5652|11982->5663|11995->5666|12024->5672|12069->5688|12099->5689|12141->5699|12182->5708|12227->5717|12318->5798|12358->5799|12396->5809|12426->5810|12568->5922|12599->5923|12640->5932|12734->5989|12811->6043|12971->6166|12995->6180|13038->6200|13097->6222|13155->6257|13228->6301|13258->6302|13295->6311|13324->6312|13394->6353|13424->6354|13472->6365|13526->6409|13566->6410|13615->6422|13686->6470|13740->6491|13798->6512|13858->6562|13898->6563|13951->6579|14050->6655|14105->6677|14152->6696|14181->6697|14248->6735|14278->6736|14336->6757|14393->6791|14457->6826|14487->6827|14546->6849|14603->6883|14672->6923|14702->6924|14752->6937|14809->6971|14929->7062|14959->7063|15059->7134|15089->7135|15306->7315|15357->7343|15418->7375|15448->7376|15502->7393|15552->7420|15606->7445|15636->7446|15740->7521|15770->7522|15833->7556|15863->7557|15921->7578|15996->7630|16063->7668|16093->7669|16126->7673|16156->7674|16239->7728|16269->7729|16311->7742|16341->7743|16391->7765|16421->7766|16454->7770|16484->7771|16550->7808|16580->7809|16630->7822|16701->7870|16757->7897|16787->7898|16820->7902|16850->7903|16900->7916|16975->7968|17035->7999|17065->8000|17103->8010|17133->8011|17179->8029|17208->8030|17250->8043|17280->8044|17322->8057|17352->8058|17402->8071|17473->8119|17524->8142|17553->8143|17590->8152|17619->8153|17673->8170|17749->8223|17823->8260|17899->8313|17959->8336|18037->8390|18069->8392|18100->8393|18187->8450|18218->8451|18272->8468|18348->8521|18413->8549|18491->8603|18528->8612|18557->8613|18616->8643|18646->8644|18690->8652|18751->8690|18799->8702|18845->8738|18885->8739|18930->8748|18987->8788|19027->8789|19073->8799|19134->8837|19175->8841|19236->8879|19278->8884|19298->8893|19327->8898|19378->8911|19455->8964|19509->8986|19549->8994|19593->9002|19654->9040|19695->9044|19756->9082|19823->9112|19847->9126|19884->9140|19925->9144|19986->9182|20028->9196|20057->9197|20172->9283|20202->9284|20261->9306|20337->9359|20396->9389|20426->9390|20471->9407|20500->9408|20567->9447|20596->9448|20685->9508|20715->9509|20796->9553|20820->9567|20863->9587|20906->9594|20978->9649|21018->9650|21072->9667|21088->9673|21161->9723|21235->9760|21292->9794|21351->9816|21371->9826|21402->9833|21470->9863|21491->9873|21523->9881|21579->9899|21600->9909|21634->9919|21680->9927|21701->9937|21729->9941|21857->10037|21906->10058|21935->10059|21993->10088|22023->10089|22069->10099|22145->10152|22203->10173|22273->10219|22330->10240|22391->10278|22437->10288|22483->10324|22523->10325|22566->10332|22623->10372|22663->10373|22707->10381|22768->10419|22809->10423|22870->10461|22912->10466|22932->10475|22961->10480|23012->10493|23089->10546|23141->10566|23179->10572|23221->10578|23282->10616|23323->10620|23384->10658|23450->10687|23526->10740|23571->10756|23601->10757|23668->10787|23692->10801|23725->10811|23770->10819|23831->10857|23864->10862|23893->10863|23977->10919|24006->10920|24069->10954|24099->10955|24198->11025|24228->11026|24331->11100|24361->11101|24415->11126|24445->11127|24502->11155|24532->11156|24565->11160|24595->11161|24658->11195|24688->11196|24722->11202|24751->11203|24811->11235|24840->11236|24893->11252|24944->11280|25005->11312|25035->11313|25081->11323|25131->11350|25185->11375|25215->11376|25312->11444|25342->11445|25400->11474|25430->11475|25509->11525|25539->11526|25572->11530|25602->11531|25677->11577|25707->11578|25743->11586|25772->11587|25814->11601|25843->11602|25876->11606|25906->11607|25978->11651|26007->11652|26045->11662|26074->11663|26106->11667|26136->11668|26199->11703|26228->11704|26265->11713|26294->11714|26356->11747|26386->11748|26427->11760|26457->11761|26513->11788|26543->11789|26591->11808|26621->11809|26681->11840|26711->11841|26793->11894|26823->11895|26920->11964|26950->11965|27120->12099|27179->12135|27226->12154|27255->12155|27313->12184|27343->12185|27389->12202|27419->12203|27560->12316|27590->12317|27628->12327|27657->12328|27690->12333|27719->12334|27752->12339|27781->12340|27839->12369|27869->12370|27925->12390|27973->12428|28013->12429|28070->12449|28146->12502|28216->12553|28229->12557|28269->12558|28327->12579|28403->12632|28517->12714|28563->12732|28592->12733|28645->12757|28675->12758|28751->12805|28781->12806|28831->12828|28860->12829|28892->12833|28922->12834|28985->12869|29014->12870|29060->12880|29121->12918|29161->12929|29191->12930|29244->12954|29274->12955|29342->12986|29418->13039|29507->13091|29565->13126|29607->13140|29636->13141|29676->13153|29705->13154|29737->13158|29767->13159|29820->13183|29850->13184|29954->13259|29984->13260|30039->13286|30069->13287|30128->13317|30158->13318|30191->13322|30221->13323|30286->13359|30316->13360|30351->13367|30380->13368|30430->13390|30459->13391|30501->13404|30531->13405|30581->13418|30634->13448|30678->13463|30708->13464|30748->13475|30778->13476|30839->13508|30869->13509|30937->13540|31007->13587|31039->13590|31069->13591|31125->13610|31195->13657|31243->13677|31272->13678|31390->13767|31420->13768|31607->13918|31631->13932|31662->13940|31722->13963|31789->14007|31871->14060|31901->14061|31985->14108|32044->14144|32099->14170|32129->14171|32186->14191|32245->14227|32319->14272|32349->14273|32413->14308|32443->14309|32511->14348|32541->14349|32597->14368|32668->14416|32726->14445|32756->14446|32801->14462|32831->14463|32889->14484|32951->14523|32996->14531|33064->14575|33165->14639|33215->14666|33270->14684|33332->14723|33425->14788|33454->14789|33518->14824|33548->14825|33623->14872|33652->14873|33701->14893|33731->14894|33839->14973|33869->14974|33907->14984|33936->14985|33971->14992|34000->14993|34034->14999|34063->15000|34098->15007|34127->15008|34164->15017|34193->15018|34247->15043|34277->15044|34337->15068|34383->15104|34423->15105|34465->15111|34522->15151|34562->15152|34623->15176|34642->15185|34670->15190|34720->15203|34739->15212|34767->15217|34818->15236|34856->15242|34935->15284|35011->15337|35056->15353|35086->15354|35173->15413|35202->15414|35263->15447|35292->15448|35347->15474|35377->15475|35423->15485|35499->15538|35557->15559|35627->15605|35674->15624|35703->15625|35760->15653|35790->15654|35868->15695|35934->15738|36006->15781|36036->15782|36097->15806|36173->15859|36262->15911|36338->15964|36427->16016|36503->16069|36579->16108|36654->16160|36776->16254|36805->16255|36872->16293|36902->16294|36976->16331|37017->16349|37048->16351|37078->16352|37175->16412|37250->16464|37313->16497|37344->16498|37403->16529|37432->16530|37506->16576|37535->16577|37569->16583|37598->16584|37637->16595|37666->16596|37735->16636|37765->16637|37807->16643|37866->16679|37907->16683|37978->16731|38025->16742|38102->16796|38150->16815|38180->16816|38223->16823|38282->16859|38327->16876|38356->16877|38404->16889|38480->16942|38528->16961|38558->16962|38601->16969|38660->17005|38708->17025|38737->17026|38785->17038|38859->17089|38907->17108|38937->17109|39013->17148|39063->17175|39114->17189|39180->17232|39288->17304|39368->17361|39420->17377|39482->17416|39533->17431|39595->17470|39646->17493|39675->17494|39723->17506|39798->17558|39846->17577|39876->17578|39919->17585|39979->17622|40022->17637|40051->17638|40100->17651|40163->17697|40203->17698|40246->17705|40305->17754|40345->17755|40391->17765|40407->17771|40429->17783|40445->17789|40455->17798|40481->17814|40522->17816|40573->17830|40644->17878|40692->17897|40722->17898|40770->17909|40830->17946|40885->17964|40901->17970|40928->17974|40972->17989|41002->17990|41034->18011|41059->18026|41100->18028|41151->18042|41222->18090|41270->18109|41300->18110|41367->18140|41427->18177|41500->18221|41530->18222|41638->18301|41668->18302|41727->18332|41757->18333|41824->18371|41854->18372|41887->18376|41917->18377|41990->18421|42020->18422|42060->18433|42090->18434|42148->18464|42178->18465|42224->18482|42254->18483|42308->18500|42324->18506|42351->18510|42399->18529|42429->18530|42469->18541|42499->18542|42564->18578|42594->18579|42783->18739|42813->18740|42943->18841|42973->18842|43035->18867|43104->18913|43155->18935|43185->18936|43236->18950|43305->18996|43357->19019|43387->19020|43433->19037|43463->19038|43505->19051|43535->19052|43577->19065|43607->19066|43637->19085|43660->19098|43701->19100|43754->19130|43795->19139|43833->19145|43915->19198|43945->19199|44003->19228|44033->19229|44077->19237|44136->19273|44182->19291|44211->19292|44244->19297|44273->19298|44354->19350|44384->19351|44427->19358|44486->19394|44531->19411|44560->19412|44594->19418|44623->19419|44654->19422|44683->19423|44726->19430|44798->19479|44852->19497|44890->19525|44930->19526|44977->19544|45007->19545|45143->19644|45167->19658|45200->19668|45250->19681|45316->19724|45388->19767|45418->19768|45480->19793|45537->19827|45592->19853|45622->19854|45667->19863|45724->19897|45786->19931|45815->19932|45856->19945|45885->19946|45942->19974|45972->19975|46016->19983|46087->20031|46133->20049|46162->20050|46196->20056|46225->20057|46272->20068|46334->20107|46379->20115|46447->20159|46502->20182|46573->20224|46603->20225|46649->20235|46725->20288|46783->20309|46853->20355|46900->20374|46929->20375|47010->20428|47039->20429|47111->20464|47127->20470|47180->20500|47254->20546|47283->20547
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|36->8|36->9|36->9|36->9|37->10|37->10|37->10|37->10|37->10|37->10|37->10|37->10|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|42->16|42->16|43->17|45->20|45->20|45->20|46->21|46->21|46->21|48->23|48->23|48->23|48->23|50->27|51->28|53->30|53->30|54->31|65->42|65->42|66->43|66->43|72->49|72->49|72->49|73->50|73->50|73->50|73->50|74->51|75->52|75->52|75->52|76->53|76->53|76->53|76->53|76->54|76->54|76->54|77->55|77->55|77->55|77->55|77->55|77->55|77->55|78->57|78->57|78->57|79->58|79->58|79->58|79->58|79->58|80->60|81->61|82->62|82->62|82->62|83->63|83->63|84->64|85->65|85->65|85->65|86->66|86->66|86->66|87->67|87->67|87->67|87->67|87->68|87->68|87->68|88->69|88->69|88->69|88->69|88->69|89->71|89->71|89->71|90->72|90->72|90->72|90->72|90->72|91->74|91->74|91->74|92->75|92->75|92->75|92->75|92->75|93->77|94->78|95->79|100->84|100->84|111->95|111->95|111->95|112->96|112->96|113->97|127->111|127->111|127->111|127->111|128->112|128->112|128->112|129->113|129->113|130->114|130->114|130->114|130->114|132->116|132->116|132->116|134->118|134->118|138->122|138->122|138->122|139->123|139->123|139->123|140->124|140->124|140->124|141->125|141->125|141->125|142->126|142->126|142->126|143->127|144->128|145->129|145->129|145->129|147->131|150->134|150->134|150->134|151->135|151->135|151->135|152->136|152->136|152->136|152->136|152->136|152->136|152->136|152->136|152->136|152->136|152->136|152->136|153->137|153->137|153->137|154->138|154->138|154->138|154->138|154->138|154->138|154->138|154->138|154->138|154->138|154->138|154->138|155->139|156->140|157->141|157->141|157->141|158->142|158->142|158->142|158->142|159->143|162->146|162->146|167->151|167->151|167->151|168->152|168->152|170->154|170->154|171->155|171->155|172->156|172->156|173->157|173->157|173->157|174->158|174->158|175->159|177->161|177->161|177->161|178->162|178->162|179->163|181->165|181->165|182->166|182->166|183->167|183->167|183->167|183->167|184->168|184->168|184->168|184->168|185->169|185->169|186->170|186->170|189->173|189->173|194->178|194->178|194->178|194->178|195->179|195->179|195->179|195->179|196->180|196->180|197->181|197->181|198->182|198->182|199->183|199->183|199->183|199->183|201->185|201->185|202->186|202->186|204->188|204->188|204->188|204->188|205->189|205->189|206->190|206->190|207->191|207->191|207->191|207->191|208->192|208->192|209->193|209->193|210->194|210->194|212->196|212->196|213->197|213->197|214->198|214->198|215->199|215->199|216->200|216->200|217->201|217->201|218->202|218->202|219->203|219->203|219->203|219->203|219->203|219->203|219->203|219->203|220->204|220->204|220->204|220->204|221->205|221->205|222->206|222->206|223->207|223->207|224->208|224->208|224->208|225->209|225->209|225->209|226->210|226->210|226->210|226->210|226->210|226->210|226->210|226->210|226->210|227->211|228->212|229->213|229->213|229->213|229->213|230->214|230->214|230->214|230->214|230->214|231->215|231->215|235->219|235->219|237->221|237->221|237->221|237->221|239->223|239->223|242->226|242->226|243->227|243->227|246->230|246->230|246->230|247->231|247->231|247->231|248->232|248->232|248->232|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|250->234|251->235|253->237|253->237|255->239|255->239|256->240|256->240|256->240|256->240|257->241|257->241|258->242|258->242|258->242|259->243|259->243|259->243|260->244|260->244|260->244|260->244|260->244|260->244|260->244|260->244|260->244|261->245|262->246|263->247|263->247|263->247|263->247|265->249|265->249|265->249|265->249|267->251|267->251|267->251|267->251|267->251|268->252|268->252|272->256|272->256|273->257|273->257|276->260|276->260|277->261|277->261|278->262|278->262|280->264|280->264|280->264|280->264|282->266|282->266|283->267|283->267|286->270|286->270|287->271|287->271|287->271|287->271|288->272|288->272|288->272|288->272|289->273|289->273|290->274|290->274|292->276|292->276|292->276|292->276|294->278|294->278|295->279|295->279|297->281|297->281|297->281|297->281|300->284|300->284|302->286|302->286|302->286|302->286|304->288|304->288|306->290|306->290|307->291|307->291|308->292|308->292|310->294|310->294|310->294|310->294|311->295|311->295|313->297|313->297|316->300|316->300|321->305|321->305|322->306|322->306|323->307|323->307|324->308|324->308|327->311|327->311|328->312|328->312|329->313|329->313|330->314|330->314|331->315|331->315|333->317|333->317|333->317|334->318|334->318|336->320|336->320|336->320|337->321|337->321|341->325|343->327|343->327|344->328|344->328|346->330|346->330|348->332|348->332|348->332|348->332|350->334|350->334|351->335|351->335|351->335|351->335|352->336|352->336|353->337|353->337|354->338|354->338|355->339|355->339|357->341|357->341|357->341|357->341|358->342|358->342|359->343|359->343|360->344|360->344|362->346|362->346|362->346|362->346|364->348|364->348|365->349|365->349|367->351|367->351|368->352|368->352|369->353|369->353|370->354|370->354|370->354|370->354|371->355|371->355|373->357|373->357|373->357|373->357|374->358|374->358|375->359|375->359|378->362|378->362|382->366|382->366|382->366|383->367|383->367|384->368|384->368|386->370|386->370|386->370|386->370|387->371|387->371|388->372|388->372|390->374|390->374|391->375|391->375|392->376|392->376|393->377|393->377|394->378|394->378|395->379|395->379|395->379|395->379|396->380|396->380|397->381|397->381|399->383|399->383|400->384|400->384|402->386|402->386|403->387|403->387|406->390|406->390|407->391|407->391|408->392|408->392|409->393|409->393|410->394|410->394|412->396|412->396|413->397|413->397|415->399|415->399|415->399|416->400|416->400|416->400|417->401|417->401|417->401|417->401|417->401|417->401|418->402|419->403|421->405|421->405|421->405|421->405|424->408|424->408|426->410|426->410|427->411|427->411|428->412|428->412|428->412|428->412|429->413|429->413|430->414|430->414|432->416|432->416|433->417|433->417|434->418|434->418|435->419|435->419|436->420|436->420|437->421|437->421|438->422|438->422|439->423|439->423|440->424|440->424|440->424|440->424|443->427|443->427|443->427|443->427|445->429|445->429|449->433|449->433|450->434|450->434|452->436|452->436|456->440|456->440|457->441|457->441|457->441|457->441|458->442|458->442|458->442|458->442|459->443|459->443|460->444|460->444|461->445|461->445|461->445|461->445|462->446|462->446|463->447|463->447|464->448|464->448|464->448|464->448|465->449|465->449|466->450|466->450|467->451|467->451|469->453|469->453|470->454|470->454|472->456|472->456|473->457|473->457|473->457|473->457|474->458|474->458|475->459|475->459|477->461|477->461|477->461|478->462|478->462|478->462|479->463|479->463|479->463|479->463|479->464|479->464|479->464|480->465|480->465|480->465|480->465|481->466|481->466|481->466|481->466|481->466|482->467|482->467|483->469|483->469|483->469|484->470|484->470|484->470|484->470|486->472|486->472|487->473|487->473|488->474|488->474|489->475|489->475|491->477|491->477|491->477|491->477|493->479|493->479|494->480|494->480|496->482|496->482|497->483|497->483|498->484|498->484|498->484|499->485|499->485|499->485|499->485|500->486|500->486|503->489|503->489|506->492|506->492|507->493|507->493|507->493|507->493|508->494|508->494|509->495|509->495|510->496|510->496|511->497|511->497|512->498|512->498|513->500|513->500|513->500|515->503|516->504|517->505|519->507|519->507|520->508|520->508|521->509|521->509|522->510|522->510|523->511|523->511|524->512|524->512|525->513|525->513|526->514|526->514|527->515|527->515|528->516|528->516|530->518|530->518|531->519|531->519|531->519|532->520|532->520|534->522|534->522|534->522|535->523|535->523|536->524|536->524|538->526|538->526|538->526|538->526|539->527|539->527|540->528|540->528|542->530|542->530|543->531|543->531|544->532|544->532|545->533|545->533|546->534|546->534|547->535|547->535|547->535|547->535|548->536|550->538|550->538|551->539|551->539|551->539|551->539|552->540|552->540|554->542|554->542|555->543|555->543|555->543|557->545|557->545
                    -- GENERATED --
                */
            