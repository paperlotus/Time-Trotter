
package views.html.userPermission

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
object searchPermission extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<style type="text/css">
.fontSize"""),format.raw/*2.10*/("""{"""),format.raw/*2.11*/("""
	font-size: 10px;
"""),format.raw/*4.1*/("""}"""),format.raw/*4.2*/("""

#permission_search"""),format.raw/*6.19*/("""{"""),format.raw/*6.20*/("""
	padding: 6px 10px;
	border-radius: 5px;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

#permission_search:hover"""),format.raw/*11.25*/("""{"""),format.raw/*11.26*/("""
	background: #333;
	color: #fff;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
.margin"""),format.raw/*15.8*/("""{"""),format.raw/*15.9*/("""
	margin-left:19%;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
.space"""),format.raw/*18.7*/("""{"""),format.raw/*18.8*/("""
	margin-left:7%;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

.permissions"""),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""
	margin-right: 20px;
	padding-top:1%;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
</style>

<table id="permission_list"><tr><td/></tr></table> 
<div id="permission_pager" ></div> 

<form id="modal-form">
<div id="update-modal" title="Basic Modal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
		<h3 id="myModalLabel">Permissions</h3>
		<h7><strong style = "color : red;">Click the Permission which should NOT be accessed</strong></h7>
	</div>
	<div class="modal-body">
		<ul style="list-style-type: none;"></ul>
	</div>
	<div class="modal-footer">
		<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
		<button id="addPermissions" class="btn btn-primary">Save changes</button>
	</div>
	<input type="hidden" id="selectedUserId" name="id">
</div>
</form>
<!-- <p id="lastSelectedAgentID" style="display: none;">0</p> -->

<script>

$(document).ready(function()"""),format.raw/*52.29*/("""{"""),format.raw/*52.30*/("""
		permissionSearch = PermissionSearch.initialise(""""),_display_(Seq[Any](/*53.52*/routes/*53.58*/.UserPermissions.getUserList)),format.raw/*53.86*/("""");
	 	$("#permission_search").click(function()"""),format.raw/*54.44*/("""{"""),format.raw/*54.45*/("""
	 		permissionSearch.doSearch();
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/(""");	 
	 	
	 	
	 	$(".search-query").keypress(function(event)"""),format.raw/*59.47*/("""{"""),format.raw/*59.48*/("""
			if(event.which == "13")"""),format.raw/*60.27*/("""{"""),format.raw/*60.28*/("""
				permissionSearch.doSearch();
			"""),format.raw/*62.4*/("""}"""),format.raw/*62.5*/("""
		"""),format.raw/*63.3*/("""}"""),format.raw/*63.4*/(""");
	 	
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/(""");

var PermissionSearch = """),format.raw/*67.24*/("""{"""),format.raw/*67.25*/("""
		_searchURL: "",
		initialise: function (searchUrl)"""),format.raw/*69.35*/("""{"""),format.raw/*69.36*/("""
			this._searchURL = searchUrl;
			$("#permission_list").jqGrid("""),format.raw/*71.33*/("""{"""),format.raw/*71.34*/("""
				   url:this._searchURL,
				   height:231,
				   width: $('#searchPermission').width()+40,
				   datatype: 'json',
				   mtype: 'GET',
				   colNames:['Emp ID','First Name','Last Name','Designation','Permissions','Action'],
				   colModel :[ 
					 """),format.raw/*79.7*/("""{"""),format.raw/*79.8*/("""name:'employeeId', index:'employeeId', width:10, searchoptions:"""),format.raw/*79.71*/("""{"""),format.raw/*79.72*/("""sopt:['eq']"""),format.raw/*79.83*/("""}"""),format.raw/*79.84*/("""}"""),format.raw/*79.85*/(""",         
				     """),format.raw/*80.10*/("""{"""),format.raw/*80.11*/("""name:'firstName', index:'firstName', width:20, searchoptions:"""),format.raw/*80.72*/("""{"""),format.raw/*80.73*/("""sopt:['eq']"""),format.raw/*80.84*/("""}"""),format.raw/*80.85*/("""}"""),format.raw/*80.86*/(""",
				     """),format.raw/*81.10*/("""{"""),format.raw/*81.11*/("""name:'lastName', index:'lastName', width:20, searchoptions:"""),format.raw/*81.70*/("""{"""),format.raw/*81.71*/("""sopt:['eq']"""),format.raw/*81.82*/("""}"""),format.raw/*81.83*/("""}"""),format.raw/*81.84*/(""",
				     """),format.raw/*82.10*/("""{"""),format.raw/*82.11*/("""name:'designation', index:'designation', width:20, searchoptions:"""),format.raw/*82.76*/("""{"""),format.raw/*82.77*/("""sopt:['eq']"""),format.raw/*82.88*/("""}"""),format.raw/*82.89*/("""}"""),format.raw/*82.90*/(""",
				     """),format.raw/*83.10*/("""{"""),format.raw/*83.11*/("""name:'permissionList', index:'permissionList', width:100, searchoptions:"""),format.raw/*83.83*/("""{"""),format.raw/*83.84*/("""sopt:['eq']"""),format.raw/*83.95*/("""}"""),format.raw/*83.96*/("""}"""),format.raw/*83.97*/(""",
				     """),format.raw/*84.10*/("""{"""),format.raw/*84.11*/("""name:'action', index:'action', width:8,formatter:this.actionFormatter, search:false, title:false"""),format.raw/*84.107*/("""}"""),format.raw/*84.108*/("""
				   ],
				   pagination : true,
				   pager: '#permission_pager',
				   
				   rowNum:10,
				   rowList:[10,20,30],
				   sortname: 'firstName',
				   sortorder: 'desc',
				   viewrecords: true,
				   gridview: true,
				   caption: 'Manage Permissions',
				   
				   onSelectRow: function(id)"""),format.raw/*97.33*/("""{"""),format.raw/*97.34*/("""
				   """),format.raw/*98.8*/("""}"""),format.raw/*98.9*/(""",
				   ondblClickRow: function(rowid) """),format.raw/*99.39*/("""{"""),format.raw/*99.40*/("""
				   """),format.raw/*100.8*/("""}"""),format.raw/*100.9*/(""",
				   
				   
				   loadComplete:function (data)"""),format.raw/*103.36*/("""{"""),format.raw/*103.37*/("""
					   if(data.records == 0)
					   """),format.raw/*105.9*/("""{"""),format.raw/*105.10*/("""alert("Search result not found!")"""),format.raw/*105.43*/("""}"""),format.raw/*105.44*/("""
				   
					   $('a[id^="edit-link"]').each(function() """),format.raw/*107.49*/("""{"""),format.raw/*107.50*/("""
						   $(this).click(function()"""),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
							   var id = $(this).attr('cell');
							   $('#selectedUserId').val(id);
								$.ajax("""),format.raw/*111.16*/("""{"""),format.raw/*111.17*/("""
									type: "POST",
									url: "/permission/update",
									data: """),format.raw/*114.16*/("""{"""),format.raw/*114.17*/("""id: id"""),format.raw/*114.23*/("""}"""),format.raw/*114.24*/(""",
									success: function(data)"""),format.raw/*115.33*/("""{"""),format.raw/*115.34*/("""
										console.log(data);
										handleData(data);
									"""),format.raw/*118.10*/("""}"""),format.raw/*118.11*/(""",
									complete: function(jqXHR,status)"""),format.raw/*119.42*/("""{"""),format.raw/*119.43*/("""
										$('#update-modal').modal();
									"""),format.raw/*121.10*/("""}"""),format.raw/*121.11*/("""
								"""),format.raw/*122.9*/("""}"""),format.raw/*122.10*/(""");
								return false;
						   """),format.raw/*124.10*/("""}"""),format.raw/*124.11*/(""");
					   """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""");
					   PermissionSearch.resizeGrid();
				   """),format.raw/*127.8*/("""}"""),format.raw/*127.9*/(""",	   
				"""),format.raw/*128.5*/("""}"""),format.raw/*128.6*/(""");
			
			function handleData(data)"""),format.raw/*130.29*/("""{"""),format.raw/*130.30*/("""
				$('#update-modal .modal-body ul').empty();
		 		for(var i=0;i<data.length;i++)"""),format.raw/*132.36*/("""{"""),format.raw/*132.37*/("""
					if(data[i].state== false)"""),format.raw/*133.31*/("""{"""),format.raw/*133.32*/("""
						if(data[i].parentPresent == false)"""),format.raw/*134.41*/("""{"""),format.raw/*134.42*/("""
							if(data[i].urlPresent == false)
							$('#update-modal .modal-body ul').append('<label class="permissions space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#update-modal .modal-body ul').append('<input type="checkbox" class="permissions" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
						"""),format.raw/*139.7*/("""}"""),format.raw/*139.8*/("""
						else"""),format.raw/*140.11*/("""{"""),format.raw/*140.12*/("""
							if(data[i].urlPresent == false)
							$('#update-modal .modal-body ul').append('<label  class="permissions margin space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#update-modal .modal-body ul').append('<input type="checkbox" class="permissions margin" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');	
						"""),format.raw/*145.7*/("""}"""),format.raw/*145.8*/("""
					"""),format.raw/*146.6*/("""}"""),format.raw/*146.7*/("""
					else"""),format.raw/*147.10*/("""{"""),format.raw/*147.11*/("""
						if(data[i].parentPresent == false)"""),format.raw/*148.41*/("""{"""),format.raw/*148.42*/("""
							if(data[i].urlPresent == false)
							$('#update-modal .modal-body ul').append('<label class="permissions space" name="permissions" value="'+data[i].permissionKey+'" >'+data[i].permissionName+'<br/>');
							else
							$('#update-modal .modal-body ul').append('<input type="checkbox" class="permissions" name="permissions" value="'+data[i].permissionKey+'" checked>'+data[i].permissionName+'<br/>');	
						"""),format.raw/*153.7*/("""}"""),format.raw/*153.8*/("""else"""),format.raw/*153.12*/("""{"""),format.raw/*153.13*/("""
							if(data[i].urlPresent == false)
							$('#update-modal .modal-body ul').append('<label class="permissions margin space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#update-modal .modal-body ul').append('<input type="checkbox" class="permissions margin" name="permissions" value="'+data[i].permissionKey+'" checked>'+data[i].permissionName+'<br/>');	
						"""),format.raw/*158.7*/("""}"""),format.raw/*158.8*/("""
					"""),format.raw/*159.6*/("""}"""),format.raw/*159.7*/("""
				"""),format.raw/*160.5*/("""}"""),format.raw/*160.6*/("""
				$('#update-modal').modal();
				
				
				$('#addPermissions').click(function()"""),format.raw/*164.42*/("""{"""),format.raw/*164.43*/("""
					/* var values = $('input:checkbox:checked.permissions').map(function () """),format.raw/*165.78*/("""{"""),format.raw/*165.79*/("""
						  return this.value;
					"""),format.raw/*167.6*/("""}"""),format.raw/*167.7*/("""); */

					$.ajax("""),format.raw/*169.13*/("""{"""),format.raw/*169.14*/("""
						type: "POST",
						url: "/permission/save",
						dataType : "text",
						data: $("#modal-form").serialize(),
						success: function(data)"""),format.raw/*174.30*/("""{"""),format.raw/*174.31*/("""
							$('#update-modal').modal('hide');
							$.pnotify("""),format.raw/*176.18*/("""{"""),format.raw/*176.19*/("""
								history:false,
						        text: data
						    """),format.raw/*179.11*/("""}"""),format.raw/*179.12*/(""");
							permissionSearch.doSearch();
							
						"""),format.raw/*182.7*/("""}"""),format.raw/*182.8*/(""",
						error: function(data)"""),format.raw/*183.28*/("""{"""),format.raw/*183.29*/("""
							console.log(data);
						"""),format.raw/*185.7*/("""}"""),format.raw/*185.8*/(""",
						complete: function(jqXHR,status)"""),format.raw/*186.39*/("""{"""),format.raw/*186.40*/("""
							console.log(status);
							console.log(jqXHR);
							permissionSearch.doSearch();
						"""),format.raw/*190.7*/("""}"""),format.raw/*190.8*/("""
					"""),format.raw/*191.6*/("""}"""),format.raw/*191.7*/(""");
					return false;
				"""),format.raw/*193.5*/("""}"""),format.raw/*193.6*/(""")
		 	"""),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
			
				jQuery("#permission_list").jqGrid('bindKeys');
				jQuery("#permission_list").jqGrid('navGrid','#permission_pager',"""),format.raw/*197.69*/("""{"""),format.raw/*197.70*/("""del:false,add:false,edit:false,search:false,refresh:false"""),format.raw/*197.127*/("""}"""),format.raw/*197.128*/(""");
				return this;
			"""),format.raw/*199.4*/("""}"""),format.raw/*199.5*/(""",
			
			actionFormatter: function(cellvalue, options, rowObject)"""),format.raw/*201.60*/("""{"""),format.raw/*201.61*/("""
				var retVal = "";
				
				var show = "<span class='action-buttons' id='permission-edit'>" +
  								"<a href='#' cell='"+cellvalue+"' id='edit-link-"+cellvalue+"' " +
  									"class='show-link'>"+""+"</a></span>"; 
	          return show;
			"""),format.raw/*208.4*/("""}"""),format.raw/*208.5*/(""",
			resizeGrid:function()"""),format.raw/*209.25*/("""{"""),format.raw/*209.26*/("""
				   $("#permission_list").setGridWidth($('#searchPermission').width()+40);
			"""),format.raw/*211.4*/("""}"""),format.raw/*211.5*/(""",
			
			doSearch: function()"""),format.raw/*213.24*/("""{"""),format.raw/*213.25*/("""
				
				var firstName = $("#user_first_name").val();
				var lastName = $("#user_last_name").val();
				
				jQuery("#permission_list").setGridParam("""),format.raw/*218.45*/("""{"""),format.raw/*218.46*/("""
					mtype:'GET',
					url:this._searchURL +"?"+"firstName="+firstName+"&lastName="+lastName
				"""),format.raw/*221.5*/("""}"""),format.raw/*221.6*/(""").trigger("reloadGrid");
			"""),format.raw/*222.4*/("""}"""),format.raw/*222.5*/("""
	
"""),format.raw/*224.1*/("""}"""),format.raw/*224.2*/("""
</script>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/searchPermission.scala.html
                    HASH: 47f5d92283b87f354f103b2bd6cbeaf69b103dbf
                    MATRIX: 813->0|874->34|902->35|949->56|976->57|1025->79|1053->80|1124->125|1151->126|1207->154|1236->155|1300->192|1328->193|1364->202|1392->203|1440->224|1468->225|1503->233|1531->234|1578->254|1606->255|1650->271|1679->272|1748->314|1776->315|2806->1317|2835->1318|2924->1371|2939->1377|2989->1405|3065->1453|3094->1454|3159->1492|3187->1493|3277->1555|3306->1556|3362->1584|3391->1585|3457->1624|3485->1625|3516->1629|3544->1630|3580->1639|3608->1640|3665->1669|3694->1670|3777->1725|3806->1726|3901->1793|3930->1794|4224->2061|4252->2062|4343->2125|4372->2126|4411->2137|4440->2138|4469->2139|4518->2160|4547->2161|4636->2222|4665->2223|4704->2234|4733->2235|4762->2236|4802->2248|4831->2249|4918->2308|4947->2309|4986->2320|5015->2321|5044->2322|5084->2334|5113->2335|5206->2400|5235->2401|5274->2412|5303->2413|5332->2414|5372->2426|5401->2427|5501->2499|5530->2500|5569->2511|5598->2512|5627->2513|5667->2525|5696->2526|5821->2622|5851->2623|6200->2944|6229->2945|6265->2954|6293->2955|6362->2996|6391->2997|6428->3006|6457->3007|6542->3063|6572->3064|6641->3105|6671->3106|6733->3139|6763->3140|6851->3199|6881->3200|6945->3235|6975->3236|7104->3336|7134->3337|7241->3415|7271->3416|7306->3422|7336->3423|7400->3458|7430->3459|7529->3529|7559->3530|7632->3574|7662->3575|7741->3625|7771->3626|7809->3636|7839->3637|7904->3673|7934->3674|7974->3686|8004->3687|8083->3738|8112->3739|8151->3750|8180->3751|8246->3788|8276->3789|8390->3874|8420->3875|8481->3907|8511->3908|8582->3950|8612->3951|9053->4364|9082->4365|9123->4377|9153->4378|9610->4807|9639->4808|9674->4815|9703->4816|9743->4827|9773->4828|9844->4870|9874->4871|10325->5294|10354->5295|10387->5299|10417->5300|10881->5736|10910->5737|10945->5744|10974->5745|11008->5751|11037->5752|11154->5840|11184->5841|11292->5920|11322->5921|11385->5956|11414->5957|11464->5978|11494->5979|11676->6132|11706->6133|11796->6194|11826->6195|11917->6257|11947->6258|12031->6314|12060->6315|12119->6345|12149->6346|12212->6381|12241->6382|12311->6423|12341->6424|12471->6526|12500->6527|12535->6534|12564->6535|12620->6563|12649->6564|12684->6571|12713->6572|12869->6699|12899->6700|12986->6757|13017->6758|13070->6783|13099->6784|13195->6851|13225->6852|13512->7111|13541->7112|13597->7139|13627->7140|13739->7224|13768->7225|13828->7256|13858->7257|14043->7413|14073->7414|14202->7515|14231->7516|14288->7545|14317->7546|14350->7551|14379->7552
                    LINES: 29->1|30->2|30->2|32->4|32->4|34->6|34->6|37->9|37->9|39->11|39->11|42->14|42->14|43->15|43->15|45->17|45->17|46->18|46->18|48->20|48->20|50->22|50->22|53->25|53->25|80->52|80->52|81->53|81->53|81->53|82->54|82->54|84->56|84->56|87->59|87->59|88->60|88->60|90->62|90->62|91->63|91->63|93->65|93->65|95->67|95->67|97->69|97->69|99->71|99->71|107->79|107->79|107->79|107->79|107->79|107->79|107->79|108->80|108->80|108->80|108->80|108->80|108->80|108->80|109->81|109->81|109->81|109->81|109->81|109->81|109->81|110->82|110->82|110->82|110->82|110->82|110->82|110->82|111->83|111->83|111->83|111->83|111->83|111->83|111->83|112->84|112->84|112->84|112->84|125->97|125->97|126->98|126->98|127->99|127->99|128->100|128->100|131->103|131->103|133->105|133->105|133->105|133->105|135->107|135->107|136->108|136->108|139->111|139->111|142->114|142->114|142->114|142->114|143->115|143->115|146->118|146->118|147->119|147->119|149->121|149->121|150->122|150->122|152->124|152->124|153->125|153->125|155->127|155->127|156->128|156->128|158->130|158->130|160->132|160->132|161->133|161->133|162->134|162->134|167->139|167->139|168->140|168->140|173->145|173->145|174->146|174->146|175->147|175->147|176->148|176->148|181->153|181->153|181->153|181->153|186->158|186->158|187->159|187->159|188->160|188->160|192->164|192->164|193->165|193->165|195->167|195->167|197->169|197->169|202->174|202->174|204->176|204->176|207->179|207->179|210->182|210->182|211->183|211->183|213->185|213->185|214->186|214->186|218->190|218->190|219->191|219->191|221->193|221->193|222->194|222->194|225->197|225->197|225->197|225->197|227->199|227->199|229->201|229->201|236->208|236->208|237->209|237->209|239->211|239->211|241->213|241->213|246->218|246->218|249->221|249->221|250->222|250->222|252->224|252->224
                    -- GENERATED --
                */
            