
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
object UISearch extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.mnt.core.helper.SearchUI,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_searchContext: com.mnt.core.helper.SearchUI):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""


<div class="well form-inline" style=" width: 1172px; margin-left: 20px;">  
				
				"""),_display_(Seq[Any](/*6.6*/for(fieldType <- _searchContext.getFilter.iterator) yield /*6.57*/{_display_(Seq[Any](format.raw/*6.58*/("""
					"""),_display_(Seq[Any](/*7.7*/fieldType/*7.16*/.ctype.name/*7.27*/ match/*7.33*/{/*8.7*/case "INPUT" =>/*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
								  <input id=""""),_display_(Seq[Any](/*9.23*/(_searchContext.entityName +  fieldType.name))),format.raw/*9.68*/("""" name=""""),_display_(Seq[Any](/*9.77*/fieldType/*9.86*/.name)),format.raw/*9.91*/("""" placeholder=""""),_display_(Seq[Any](/*9.107*/fieldType/*9.116*/.label)),format.raw/*9.122*/("""" class="input-medium search-query" type="text">
								    
						""")))}/*12.7*/case "SELECT_OPTION" =>/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
							  <label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*13.58*/fieldType/*13.67*/.label)),format.raw/*13.73*/("""</label>
							    <select id=""""),_display_(Seq[Any](/*14.25*/(_searchContext.entityName  +   fieldType.name))),format.raw/*14.72*/("""" name=""""),_display_(Seq[Any](/*14.81*/fieldType/*14.90*/.name)),format.raw/*14.95*/("""" class="input-xlarge search-on-select">
								    """),_display_(Seq[Any](/*15.14*/for(option<-fieldType.options) yield /*15.44*/{_display_(Seq[Any](format.raw/*15.45*/("""
								    	<option>"""),_display_(Seq[Any](/*16.23*/option)),format.raw/*16.29*/("""</option>
								    """)))})),format.raw/*17.14*/("""	
							      
							    </select>
						""")))}/*21.7*/case "DATE" =>/*21.21*/ {_display_(Seq[Any](format.raw/*21.23*/("""
									  	<label class="control-label" for="selectbasic">"""),_display_(Seq[Any](/*22.61*/fieldType/*22.70*/.label)),format.raw/*22.76*/("""</label>
										<div data-provide="datepicker" class="input-append date datepicker" data-date="" data-date-format="dd-mm-yyyy">
	    									<input id=""""),_display_(Seq[Any](/*24.27*/(_searchContext.entityName +  fieldType.name))),format.raw/*24.72*/("""" size="16" type="text" value="" readonly name=""""),_display_(Seq[Any](/*24.121*/(fieldType.name))),format.raw/*24.137*/(""""><span class="add-on"><i class="icon-calendar"></i></span>
										</div>
						""")))}})),format.raw/*28.7*/("""
					
					
				""")))})),format.raw/*31.6*/("""			
					  <label class="control-label" for="singlebutton">&nbsp;</label>
					  <button id='"""),_display_(Seq[Any](/*33.21*/(_searchContext.entityName  +   "_searchButton"))),format.raw/*33.69*/("""' onclick="return false;" name="searchButton" class="btn">Search</button>
</div>
<fieldset>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="row-fluid">
					<div class="control-group">
					  <table id='"""),_display_(Seq[Any](/*42.20*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*42.67*/("""'><tr><td/></tr></table> 
						<div id='"""),_display_(Seq[Any](/*43.17*/(_searchContext.entityName  +   "_jqGrid_pager"))),format.raw/*43.65*/("""' ></div> 

					</div>
					<div class="control-group">
					  <label class="control-label" for="button1id">&nbsp;</label>
					  <div class="controls">
						"""),_display_(Seq[Any](/*49.8*/for(button <- _searchContext.getButtonActions.iterator) yield /*49.63*/{_display_(Seq[Any](format.raw/*49.64*/("""
						
					  		"""),_display_(Seq[Any](/*51.11*/if(button.visibility)/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/("""
						  		"""),_display_(Seq[Any](/*52.12*/button/*52.18*/.target.name/*52.30*/ match/*52.36*/{/*53.10*/case "MODAL" =>/*53.25*/ {_display_(Seq[Any](format.raw/*53.27*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*54.40*/(_searchContext.entityName  +   button.id))),format.raw/*54.82*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*54.110*/button/*54.116*/.label)),format.raw/*54.122*/("""</button>
							  		""")))}/*56.12*/case "NEW" =>/*56.25*/ {_display_(Seq[Any](format.raw/*56.27*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*57.40*/(_searchContext.entityName  +   button.id))),format.raw/*57.82*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*57.110*/button/*57.116*/.label)),format.raw/*57.122*/("""</button>
							  		""")))}/*59.12*/case "ACTION" =>/*59.28*/ {_display_(Seq[Any](format.raw/*59.30*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*60.40*/(_searchContext.entityName  +   button.id))),format.raw/*60.82*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*60.110*/button/*60.116*/.label)),format.raw/*60.122*/("""</button>
							  		""")))}/*62.12*/case "POPUP" =>/*62.27*/ {_display_(Seq[Any](format.raw/*62.29*/("""
							  			<button type="button" id='"""),_display_(Seq[Any](/*63.40*/(_searchContext.entityName  +   button.id))),format.raw/*63.82*/("""' class="btn btn-warning" >"""),_display_(Seq[Any](/*63.110*/button/*63.116*/.label)),format.raw/*63.122*/("""</button>
							  		""")))}})),format.raw/*65.12*/("""
					  		""")))})),format.raw/*66.11*/("""
					  	""")))})),format.raw/*67.10*/("""
					  </div>
					</div>
					
				</div>
			</div>
		</div>
	</div>
</fieldset>

 
 
 
 	<script type="text/javascript">
	var """),_display_(Seq[Any](/*81.7*/(_searchContext.entityName  +   "_SearchGrid"))),format.raw/*81.53*/(""" = """),format.raw/*81.56*/("""{"""),format.raw/*81.57*/("""
			_searchURL: """"),_display_(Seq[Any](/*82.18*/_searchContext/*82.32*/.searchUrl)),format.raw/*82.42*/("""",
			initialise: function ()"""),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
				$('#"""),_display_(Seq[Any](/*84.10*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*84.57*/("""').jqGrid("""),format.raw/*84.67*/("""{"""),format.raw/*84.68*/("""
			
			   	url:'"""),_display_(Seq[Any](/*86.14*/_searchContext/*86.28*/.searchUrl)),format.raw/*86.38*/("""',
			   	height:121,
			   	width: window.innerWidth*0.8,
			   	datatype: 'json',
			   	mtype: '',
			   	colNames:[
			             """),_display_(Seq[Any](/*92.18*/for(col<-_searchContext.getColumn) yield /*92.52*/{_display_(Seq[Any](format.raw/*92.53*/("""
			            	 '"""),_display_(Seq[Any](/*93.20*/col/*93.23*/.colName)),format.raw/*93.31*/("""' ,
			             """)))})),format.raw/*94.18*/("""
			             """),_display_(Seq[Any](/*95.18*/if(_searchContext.getGridActions !=null && _searchContext.getGridActions.size!=0)/*95.99*/{_display_(Seq[Any](format.raw/*95.100*/("""
			             	'Action'
						 """)))})),format.raw/*97.9*/("""	
			             ],
			   	colModel :[
						"""),_display_(Seq[Any](/*100.8*/for((col,index)<-_searchContext.getColumn.zipWithIndex) yield /*100.63*/{_display_(Seq[Any](format.raw/*100.64*/("""
							"""),format.raw/*101.8*/("""{"""),format.raw/*101.9*/("""name:'"""),_display_(Seq[Any](/*101.16*/col/*101.19*/.name)),format.raw/*101.24*/("""', index:'"""),_display_(Seq[Any](/*101.35*/index)),format.raw/*101.40*/("""', width:200"""),format.raw/*101.52*/("""}"""),format.raw/*101.53*/(""",
						""")))})),format.raw/*102.8*/("""
						"""),_display_(Seq[Any](/*103.8*/if(_searchContext.getGridActions !=null && _searchContext.getGridActions.size!=0)/*103.89*/{_display_(Seq[Any](format.raw/*103.90*/("""
							"""),format.raw/*104.8*/("""{"""),format.raw/*104.9*/("""name:'action', index:'action', width:40,formatter:this.actionFormatter1, search:false, title:false"""),format.raw/*104.107*/("""}"""),format.raw/*104.108*/("""
						""")))})),format.raw/*105.8*/("""
			     //"""),format.raw/*106.11*/("""{"""),format.raw/*106.12*/("""name:'action', index:'action', width:40,formatter:this.actionFormatter, search:false, title:false"""),format.raw/*106.109*/("""}"""),format.raw/*106.110*/("""
			   	],
			   	pagination : true,
			   	pager: '#"""),_display_(Seq[Any](/*109.18*/(_searchContext.entityName  +   "_jqGrid_pager"))),format.raw/*109.66*/("""',
			   	rowNum:5,
			   	rowList:[5,10,15],
			   	viewrecords: true,
			   	gridview: true,
			   	multiselect: """),_display_(Seq[Any](/*114.22*/_searchContext/*114.36*/.isMultiSelectSearch)),format.raw/*114.56*/(""",
			   	caption:  '"""),_display_(Seq[Any](/*115.20*/("Search " +  _searchContext.entityName))),format.raw/*115.60*/("""',
			   
			   	onSelectRow: function(id)"""),format.raw/*117.33*/("""{"""),format.raw/*117.34*/("""
			   	"""),format.raw/*118.8*/("""}"""),format.raw/*118.9*/(""",
			   	ondblClickRow: function(rowid) """),format.raw/*119.39*/("""{"""),format.raw/*119.40*/("""
			   	"""),format.raw/*120.8*/("""}"""),format.raw/*120.9*/(""",
			   	loadComplete:function (data)"""),format.raw/*121.36*/("""{"""),format.raw/*121.37*/("""
				   	 $('a[id^=""""),_display_(Seq[Any](/*122.21*/(_searchContext.entityName))),format.raw/*122.48*/("""+_gridAction"]').each(function() """),format.raw/*122.81*/("""{"""),format.raw/*122.82*/("""
				   		$(this).click(function(e)"""),format.raw/*123.35*/("""{"""),format.raw/*123.36*/("""
				   			var id = $(this).attr('cell');
				   			var _url = $(this).attr('url');
				   			$.ajax("""),format.raw/*126.18*/("""{"""),format.raw/*126.19*/("""
								type: "POST",
								url: _url,
								data: """),format.raw/*129.15*/("""{"""),format.raw/*129.16*/("""query: id"""),format.raw/*129.25*/("""}"""),format.raw/*129.26*/(""",
								success: function(data)"""),format.raw/*130.32*/("""{"""),format.raw/*130.33*/("""
									
								"""),format.raw/*132.9*/("""}"""),format.raw/*132.10*/(""",
								complete: function(jqXHR,status)"""),format.raw/*133.41*/("""{"""),format.raw/*133.42*/("""
									
								"""),format.raw/*135.9*/("""}"""),format.raw/*135.10*/("""
							"""),format.raw/*136.8*/("""}"""),format.raw/*136.9*/(""");
				   		"""),format.raw/*137.10*/("""}"""),format.raw/*137.11*/(""");
				   	 """),format.raw/*138.10*/("""}"""),format.raw/*138.11*/(""");
			   	"""),format.raw/*139.8*/("""}"""),format.raw/*139.9*/("""	   
			"""),format.raw/*140.4*/("""}"""),format.raw/*140.5*/(""");
			jQuery('#"""),_display_(Seq[Any](/*141.14*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*141.61*/("""').jqGrid('bindKeys');
			jQuery('#"""),_display_(Seq[Any](/*142.14*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*142.61*/("""').jqGrid('navGrid','#"""),_display_(Seq[Any](/*142.84*/(_searchContext.entityName  +   "_jqGrid_pager"))),format.raw/*142.132*/("""',"""),format.raw/*142.134*/("""{"""),format.raw/*142.135*/("""del:false,add:false,edit:false,search:false,refresh:false"""),format.raw/*142.192*/("""}"""),format.raw/*142.193*/(""");
			jQuery('#"""),_display_(Seq[Any](/*143.14*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*143.61*/("""').on('reloadGrid',function ()"""),format.raw/*143.91*/("""{"""),format.raw/*143.92*/("""
				//TODO
			"""),format.raw/*145.4*/("""}"""),format.raw/*145.5*/(""");	
			this.bindButtons();
						
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/(""",
		
		actionformater:function(cellvalue, options, rowObject)"""),format.raw/*150.57*/("""{"""),format.raw/*150.58*/("""
			alert(cellvalue);
			var show ="";
			"""),_display_(Seq[Any](/*153.5*/for(gridAction<-_searchContext.getGridActions.iterator) yield /*153.60*/{_display_(Seq[Any](format.raw/*153.61*/("""
				show = show + "<a id='"""),_display_(Seq[Any](/*154.28*/(_searchContext.entityName))),format.raw/*154.55*/("""' + '_gridAction' href='#' url='"""),_display_(Seq[Any](/*154.88*/gridAction/*154.98*/.url)),format.raw/*154.102*/("""' cell="+cellvalue+" ><img src='"""),_display_(Seq[Any](/*154.135*/gridAction/*154.145*/.label)),format.raw/*154.151*/("""'></a>"
			""")))})),format.raw/*155.5*/("""
			return show;
		"""),format.raw/*157.3*/("""}"""),format.raw/*157.4*/(""",
		doSearch: function()"""),format.raw/*158.23*/("""{"""),format.raw/*158.24*/("""
			"""),_display_(Seq[Any](/*159.5*/(_searchContext.entityName + "_squrl"))),format.raw/*159.43*/("""='';
			"""),_display_(Seq[Any](/*160.5*/for(fieldType<-_searchContext.getFilter) yield /*160.45*/{_display_(Seq[Any](format.raw/*160.46*/("""
				"""),_display_(Seq[Any](/*161.6*/(_searchContext.entityName + "_squrl"))),format.raw/*161.44*/(""" = """),_display_(Seq[Any](/*161.48*/(_searchContext.entityName + "_squrl"))),format.raw/*161.86*/(""" + '"""),_display_(Seq[Any](/*161.91*/fieldType/*161.100*/.name)),format.raw/*161.105*/("""' +'='+ $('#"""),_display_(Seq[Any](/*161.118*/(_searchContext.entityName  +   fieldType.name))),format.raw/*161.165*/("""').val() +'&'
			""")))})),format.raw/*162.5*/("""
			"""),_display_(Seq[Any](/*163.5*/(_searchContext.entityName + "_squrl"))),format.raw/*163.43*/(""" = """),_display_(Seq[Any](/*163.47*/(_searchContext.entityName + "_squrl"))),format.raw/*163.85*/(""" + '1=1';
			
			jQuery('#"""),_display_(Seq[Any](/*165.14*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*165.61*/("""').setGridParam("""),format.raw/*165.77*/("""{"""),format.raw/*165.78*/("""
				mtype:'GET',
				url:'"""),_display_(Seq[Any](/*167.11*/_searchContext/*167.25*/.searchUrl)),format.raw/*167.35*/("""' +"?"+"""),_display_(Seq[Any](/*167.43*/(_searchContext.entityName + "_squrl"))),format.raw/*167.81*/("""
			"""),format.raw/*168.4*/("""}"""),format.raw/*168.5*/(""").trigger('reloadGrid');
			return false;
			
		"""),format.raw/*171.3*/("""}"""),format.raw/*171.4*/(""",
		selectedItem: function()"""),format.raw/*172.27*/("""{"""),format.raw/*172.28*/("""
			var s=[];
			"""),_display_(Seq[Any](/*174.5*/if(_searchContext.isMultiSelectSearch)/*174.43*/{_display_(Seq[Any](format.raw/*174.44*/("""
				s = jQuery('#"""),_display_(Seq[Any](/*175.19*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*175.66*/("""').jqGrid('getGridParam','selarrrow');
					
			""")))}/*177.5*/else/*177.9*/{_display_(Seq[Any](format.raw/*177.10*/("""
				s[0] = jQuery('#"""),_display_(Seq[Any](/*178.22*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*178.69*/("""').jqGrid('getGridParam','selrow')
			""")))})),format.raw/*179.5*/("""
			return s;
		"""),format.raw/*181.3*/("""}"""),format.raw/*181.4*/(""",
		doCustomAction:function(_url)"""),format.raw/*182.32*/("""{"""),format.raw/*182.33*/("""
			s = this.selectedItem();
			if(s.length == 0 )"""),format.raw/*184.22*/("""{"""),format.raw/*184.23*/("""
				alert("Please mark selection from Grid");
				return;
			"""),format.raw/*187.4*/("""}"""),format.raw/*187.5*/("""
			
			$.ajax("""),format.raw/*189.11*/("""{"""),format.raw/*189.12*/("""
				url:_url,
				data: """),format.raw/*191.11*/("""{"""),format.raw/*191.12*/("""query: s.toString()"""),format.raw/*191.31*/("""}"""),format.raw/*191.32*/(""",
				success: function(data) """),format.raw/*192.29*/("""{"""),format.raw/*192.30*/("""
					jQuery('#"""),_display_(Seq[Any](/*193.16*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*193.63*/("""').setGridParam("""),format.raw/*193.79*/("""{"""),format.raw/*193.80*/("""
						mtype:'GET',
						url:'"""),_display_(Seq[Any](/*195.13*/_searchContext/*195.27*/.searchUrl)),format.raw/*195.37*/("""' +"?"+"""),_display_(Seq[Any](/*195.45*/(_searchContext.entityName + "_squrl"))),format.raw/*195.83*/("""
					"""),format.raw/*196.6*/("""}"""),format.raw/*196.7*/(""").trigger('reloadGrid');	
				"""),format.raw/*197.5*/("""}"""),format.raw/*197.6*/(""",
				error: function(data) """),format.raw/*198.27*/("""{"""),format.raw/*198.28*/("""
					
				"""),format.raw/*200.5*/("""}"""),format.raw/*200.6*/("""
			"""),format.raw/*201.4*/("""}"""),format.raw/*201.5*/(""")
		"""),format.raw/*202.3*/("""}"""),format.raw/*202.4*/(""",
		
		getParameterByName: function(name) """),format.raw/*204.38*/("""{"""),format.raw/*204.39*/("""
		    var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
		    return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
		"""),format.raw/*207.3*/("""}"""),format.raw/*207.4*/(""",
		
		bindButtons: function()"""),format.raw/*209.26*/("""{"""),format.raw/*209.27*/("""
			"""),_display_(Seq[Any](/*210.5*/(_searchContext.entityName +"_this"))),format.raw/*210.41*/(""" = """),_display_(Seq[Any](/*210.45*/(_searchContext.entityName + "_SearchGrid"))),format.raw/*210.88*/(""";
			$('#"""),_display_(Seq[Any](/*211.9*/(_searchContext.entityName  +   "_searchButton"))),format.raw/*211.57*/("""').click(function()"""),format.raw/*211.76*/("""{"""),format.raw/*211.77*/("""
				"""),_display_(Seq[Any](/*212.6*/(_searchContext.entityName +"_this"))),format.raw/*212.42*/(""".doSearch();
			"""),format.raw/*213.4*/("""}"""),format.raw/*213.5*/(""");
			
			
			"""),_display_(Seq[Any](/*216.5*/for(button <- _searchContext.getButtonActions) yield /*216.51*/{_display_(Seq[Any](format.raw/*216.52*/("""
				"""),_display_(Seq[Any](/*217.6*/if(button.visibility)/*217.27*/{_display_(Seq[Any](format.raw/*217.28*/("""
			  		"""),_display_(Seq[Any](/*218.9*/button/*218.15*/.target.name/*218.27*/ match/*218.33*/{/*219.7*/case "ACTION" =>/*219.23*/ {_display_(Seq[Any](format.raw/*219.25*/("""
							$('#"""),_display_(Seq[Any](/*220.13*/(_searchContext.entityName  +   button.id))),format.raw/*220.55*/("""').click(function()"""),format.raw/*220.74*/("""{"""),format.raw/*220.75*/("""
								"""),_display_(Seq[Any](/*221.10*/(_searchContext.entityName + "_this"))),format.raw/*221.47*/(""".doCustomAction(""""),_display_(Seq[Any](/*221.65*/button/*221.71*/.url)),format.raw/*221.75*/("""");	
				  			"""),format.raw/*222.10*/("""}"""),format.raw/*222.11*/(""");
				  		""")))}/*224.7*/case "POPUP" =>/*224.22*/ {_display_(Seq[Any](format.raw/*224.24*/("""
							
							$('#"""),_display_(Seq[Any](/*226.13*/(_searchContext.entityName  +   button.id))),format.raw/*226.55*/("""').click(function()"""),format.raw/*226.74*/("""{"""),format.raw/*226.75*/("""
								s = """),_display_(Seq[Any](/*227.14*/(_searchContext.entityName+"_this"))),format.raw/*227.49*/(""".selectedItem();
								if(s.length == 0 )"""),format.raw/*228.27*/("""{"""),format.raw/*228.28*/("""
									alert("Please mark selection from Grid");
									return;
								"""),format.raw/*231.9*/("""}"""),format.raw/*231.10*/("""
								_val = jQuery('#"""),_display_(Seq[Any](/*232.26*/(_searchContext.entityName  +   "_jqGrid_list"))),format.raw/*232.73*/("""').jqGrid('getCell',s[0],0);
								_id = """),_display_(Seq[Any](/*233.16*/(_searchContext.entityName + "_this"))),format.raw/*233.53*/(""".getParameterByName("id");
								_nameId = """),_display_(Seq[Any](/*234.20*/(_searchContext.entityName + "_this"))),format.raw/*234.57*/(""".getParameterByName("name");
								
								window.opener.$("#"+_id).val(s[0]);
								window.opener.$("#"+_nameId).val(_val);
								window.close();
				  			"""),format.raw/*239.10*/("""}"""),format.raw/*239.11*/(""");
				  		""")))}})),format.raw/*241.9*/("""
		  		""")))})),format.raw/*242.8*/("""
			""")))})),format.raw/*243.5*/("""
			
			$(".search-query").keypress(function(event)"""),format.raw/*245.47*/("""{"""),format.raw/*245.48*/("""
				if(event.which == "13")"""),format.raw/*246.28*/("""{"""),format.raw/*246.29*/("""
					"""),_display_(Seq[Any](/*247.7*/(_searchContext.entityName +"_this"))),format.raw/*247.43*/(""".doSearch();
				"""),format.raw/*248.5*/("""}"""),format.raw/*248.6*/("""
			"""),format.raw/*249.4*/("""}"""),format.raw/*249.5*/(""");
			$(".search-on-select").change(function(event)"""),format.raw/*250.49*/("""{"""),format.raw/*250.50*/("""
				"""),_display_(Seq[Any](/*251.6*/(_searchContext.entityName +"_this"))),format.raw/*251.42*/(""".doSearch();
			"""),format.raw/*252.4*/("""}"""),format.raw/*252.5*/(""");
		"""),format.raw/*253.3*/("""}"""),format.raw/*253.4*/("""
	"""),format.raw/*254.2*/("""}"""),format.raw/*254.3*/("""
	
	"""),_display_(Seq[Any](/*256.3*/(_searchContext.entityName + "_SearchGrid"))),format.raw/*256.46*/(""".initialise();
	
	
	</script>
 """))}
    }
    
    def render(_searchContext:com.mnt.core.helper.SearchUI): play.api.templates.Html = apply(_searchContext)
    
    def f:((com.mnt.core.helper.SearchUI) => play.api.templates.Html) = (_searchContext) => apply(_searchContext)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/UISearch.scala.html
                    HASH: 8ee65a8fa394e11bd0e8ba77a5901dcc47a044bc
                    MATRIX: 748->1|871->47|999->141|1065->192|1103->193|1145->201|1162->210|1181->221|1195->227|1203->236|1226->251|1265->253|1324->277|1390->322|1434->331|1451->340|1477->345|1529->361|1547->370|1575->376|1664->455|1696->478|1736->480|1831->539|1849->548|1877->554|1947->588|2016->635|2061->644|2079->653|2106->658|2197->713|2243->743|2282->744|2342->768|2370->774|2426->798|2491->853|2514->867|2554->869|2652->931|2670->940|2698->946|2893->1105|2960->1150|3046->1199|3085->1215|3203->1316|3255->1337|3387->1433|3457->1481|3756->1744|3825->1791|3904->1834|3974->1882|4176->2049|4247->2104|4286->2105|4342->2125|4372->2146|4411->2147|4460->2160|4475->2166|4496->2178|4511->2184|4521->2196|4545->2211|4585->2213|4662->2254|4726->2296|4791->2324|4807->2330|4836->2336|4878->2372|4900->2385|4940->2387|5017->2428|5081->2470|5146->2498|5162->2504|5191->2510|5233->2546|5258->2562|5298->2564|5375->2605|5439->2647|5504->2675|5520->2681|5549->2687|5591->2723|5615->2738|5655->2740|5732->2781|5796->2823|5861->2851|5877->2857|5906->2863|5962->2899|6006->2911|6049->2922|6228->3066|6296->3112|6327->3115|6356->3116|6411->3135|6434->3149|6466->3159|6523->3188|6552->3189|6599->3200|6668->3247|6706->3257|6735->3258|6791->3278|6814->3292|6846->3302|7025->3445|7075->3479|7114->3480|7171->3501|7183->3504|7213->3512|7267->3534|7322->3553|7412->3634|7452->3635|7520->3672|7606->3722|7678->3777|7718->3778|7755->3787|7784->3788|7828->3795|7841->3798|7869->3803|7917->3814|7945->3819|7986->3831|8016->3832|8058->3842|8103->3851|8194->3932|8234->3933|8271->3942|8300->3943|8428->4041|8459->4042|8500->4051|8541->4063|8571->4064|8698->4161|8729->4162|8823->4219|8894->4267|9052->4388|9076->4402|9119->4422|9178->4444|9241->4484|9314->4528|9344->4529|9381->4538|9410->4539|9480->4580|9510->4581|9547->4590|9576->4591|9643->4629|9673->4630|9732->4652|9782->4679|9844->4712|9874->4713|9939->4749|9969->4750|10102->4854|10132->4855|10220->4914|10250->4915|10288->4924|10318->4925|10381->4959|10411->4960|10460->4981|10490->4982|10562->5025|10592->5026|10641->5047|10671->5048|10708->5057|10737->5058|10779->5071|10809->5072|10851->5085|10881->5086|10920->5097|10949->5098|10986->5107|11015->5108|11069->5125|11139->5172|11213->5209|11283->5256|11343->5279|11415->5327|11447->5329|11478->5330|11565->5387|11596->5388|11650->5405|11720->5452|11779->5482|11809->5483|11854->5500|11883->5501|11950->5540|11979->5541|12071->5604|12101->5605|12183->5651|12255->5706|12295->5707|12361->5736|12411->5763|12481->5796|12501->5806|12529->5810|12600->5843|12621->5853|12651->5859|12696->5872|12745->5893|12774->5894|12828->5919|12858->5920|12900->5926|12961->5964|13007->5974|13064->6014|13104->6015|13147->6022|13208->6060|13249->6064|13310->6102|13352->6107|13372->6116|13401->6121|13452->6134|13523->6181|13574->6200|13616->6206|13677->6244|13718->6248|13779->6286|13845->6315|13915->6362|13960->6378|13990->6379|14057->6409|14081->6423|14114->6433|14159->6441|14220->6479|14253->6484|14282->6485|14361->6536|14390->6537|14448->6566|14478->6567|14534->6587|14582->6625|14622->6626|14679->6646|14749->6693|14819->6744|14832->6748|14872->6749|14932->6772|15002->6819|15074->6859|15120->6877|15149->6878|15212->6912|15242->6913|15323->6965|15353->6966|15446->7031|15475->7032|15521->7049|15551->7050|15607->7077|15637->7078|15685->7097|15715->7098|15775->7129|15805->7130|15859->7147|15929->7194|15974->7210|16004->7211|16075->7245|16099->7259|16132->7269|16177->7277|16238->7315|16273->7322|16302->7323|16361->7354|16390->7355|16448->7384|16478->7385|16519->7398|16548->7399|16581->7404|16610->7405|16643->7410|16672->7411|16745->7455|16775->7456|16964->7617|16993->7618|17054->7650|17084->7651|17126->7657|17185->7693|17226->7697|17292->7740|17339->7751|17410->7799|17458->7818|17488->7819|17531->7826|17590->7862|17635->7879|17664->7880|17718->7898|17781->7944|17821->7945|17864->7952|17895->7973|17935->7974|17981->7984|17997->7990|18019->8002|18035->8008|18045->8017|18071->8033|18112->8035|18163->8049|18228->8091|18276->8110|18306->8111|18354->8122|18414->8159|18469->8177|18485->8183|18512->8187|18556->8202|18586->8203|18618->8224|18643->8239|18684->8241|18744->8264|18809->8306|18857->8325|18887->8326|18939->8341|18997->8376|19070->8420|19100->8421|19208->8501|19238->8502|19302->8529|19372->8576|19454->8621|19514->8658|19598->8705|19658->8742|19855->8910|19885->8911|19931->8934|19972->8943|20010->8949|20092->9002|20122->9003|20180->9032|20210->9033|20254->9041|20313->9077|20359->9095|20388->9096|20421->9101|20450->9102|20531->9154|20561->9155|20604->9162|20663->9198|20708->9215|20737->9216|20771->9222|20800->9223|20831->9226|20860->9227|20903->9234|20969->9277
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|35->7|35->8|35->8|35->8|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|43->17|46->21|46->21|46->21|47->22|47->22|47->22|49->24|49->24|49->24|49->24|51->28|54->31|56->33|56->33|65->42|65->42|66->43|66->43|72->49|72->49|72->49|74->51|74->51|74->51|75->52|75->52|75->52|75->52|75->53|75->53|75->53|76->54|76->54|76->54|76->54|76->54|77->56|77->56|77->56|78->57|78->57|78->57|78->57|78->57|79->59|79->59|79->59|80->60|80->60|80->60|80->60|80->60|81->62|81->62|81->62|82->63|82->63|82->63|82->63|82->63|83->65|84->66|85->67|99->81|99->81|99->81|99->81|100->82|100->82|100->82|101->83|101->83|102->84|102->84|102->84|102->84|104->86|104->86|104->86|110->92|110->92|110->92|111->93|111->93|111->93|112->94|113->95|113->95|113->95|115->97|118->100|118->100|118->100|119->101|119->101|119->101|119->101|119->101|119->101|119->101|119->101|119->101|120->102|121->103|121->103|121->103|122->104|122->104|122->104|122->104|123->105|124->106|124->106|124->106|124->106|127->109|127->109|132->114|132->114|132->114|133->115|133->115|135->117|135->117|136->118|136->118|137->119|137->119|138->120|138->120|139->121|139->121|140->122|140->122|140->122|140->122|141->123|141->123|144->126|144->126|147->129|147->129|147->129|147->129|148->130|148->130|150->132|150->132|151->133|151->133|153->135|153->135|154->136|154->136|155->137|155->137|156->138|156->138|157->139|157->139|158->140|158->140|159->141|159->141|160->142|160->142|160->142|160->142|160->142|160->142|160->142|160->142|161->143|161->143|161->143|161->143|163->145|163->145|166->148|166->148|168->150|168->150|171->153|171->153|171->153|172->154|172->154|172->154|172->154|172->154|172->154|172->154|172->154|173->155|175->157|175->157|176->158|176->158|177->159|177->159|178->160|178->160|178->160|179->161|179->161|179->161|179->161|179->161|179->161|179->161|179->161|179->161|180->162|181->163|181->163|181->163|181->163|183->165|183->165|183->165|183->165|185->167|185->167|185->167|185->167|185->167|186->168|186->168|189->171|189->171|190->172|190->172|192->174|192->174|192->174|193->175|193->175|195->177|195->177|195->177|196->178|196->178|197->179|199->181|199->181|200->182|200->182|202->184|202->184|205->187|205->187|207->189|207->189|209->191|209->191|209->191|209->191|210->192|210->192|211->193|211->193|211->193|211->193|213->195|213->195|213->195|213->195|213->195|214->196|214->196|215->197|215->197|216->198|216->198|218->200|218->200|219->201|219->201|220->202|220->202|222->204|222->204|225->207|225->207|227->209|227->209|228->210|228->210|228->210|228->210|229->211|229->211|229->211|229->211|230->212|230->212|231->213|231->213|234->216|234->216|234->216|235->217|235->217|235->217|236->218|236->218|236->218|236->218|236->219|236->219|236->219|237->220|237->220|237->220|237->220|238->221|238->221|238->221|238->221|238->221|239->222|239->222|240->224|240->224|240->224|242->226|242->226|242->226|242->226|243->227|243->227|244->228|244->228|247->231|247->231|248->232|248->232|249->233|249->233|250->234|250->234|255->239|255->239|256->241|257->242|258->243|260->245|260->245|261->246|261->246|262->247|262->247|263->248|263->248|264->249|264->249|265->250|265->250|266->251|266->251|267->252|267->252|268->253|268->253|269->254|269->254|271->256|271->256
                    -- GENERATED --
                */
            