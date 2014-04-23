
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
object roleSearchPermission extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<style type="text/css">
.fontSize """),format.raw/*2.11*/("""{"""),format.raw/*2.12*/("""
	font-size: 10px;
"""),format.raw/*4.1*/("""}"""),format.raw/*4.2*/("""

.heading """),format.raw/*6.10*/("""{"""),format.raw/*6.11*/("""
	margin-left: 25px;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""

.permissions"""),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""
	margin-right: 20px;
	padding-top:1%;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

.margin"""),format.raw/*15.8*/("""{"""),format.raw/*15.9*/("""
	margin-left:19%;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
.space"""),format.raw/*18.7*/("""{"""),format.raw/*18.8*/("""
	margin-left:7%;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

#role_permission_search """),format.raw/*22.25*/("""{"""),format.raw/*22.26*/("""
	padding: 6px 10px;
	border-radius: 5px;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

#role_permission_search:hover """),format.raw/*27.31*/("""{"""),format.raw/*27.32*/("""
	background: #333;
	color: #fff;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
</style>

<table id="role_permission_list">
	<tr>
		<td />
	</tr>
</table>
<div id="role_permission_pager"></div>

<form id="role-modal-form">
	<div id="role-update-modal" title="Basic Modal" class="modal hide fade"
		tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
		aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">X</button>
			<h3 id="myModalLabel">Permissions</h3>
			<h7>
			<strong style="color: red;">Click the Permission which
				should NOT be accessed</strong></h7>
		</div>
		<div class="modal-body">
			<ul style="list-style-type: none;"></ul>
		</div>
		<div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
			<button id="addRolePermissions" class="btn btn-primary">Save
				changes</button>
		</div>
		<input type="hidden" id="selectedRoleId" name="id">
	</div>
</form>
<!-- <p id="lastSelectedAgentID" style="display: none;">0</p> -->

<script>
	$(document).ready(
			function() """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""
				rolePermissionSearch = RolePermissionSearch
						.initialise(""""),_display_(Seq[Any](/*69.21*/routes/*69.27*/.RolePermissions.getRoleList)),format.raw/*69.55*/("""");
				$("#role_permission_search").click(function() """),format.raw/*70.51*/("""{"""),format.raw/*70.52*/("""
					rolePermissionSearch.doSearch();
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""");

				$(".search-query").keypress(function(event) """),format.raw/*74.49*/("""{"""),format.raw/*74.50*/("""
					if (event.which == "13") """),format.raw/*75.31*/("""{"""),format.raw/*75.32*/("""
						rolePermissionSearch.doSearch();
					"""),format.raw/*77.6*/("""}"""),format.raw/*77.7*/("""
				"""),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""");

			"""),format.raw/*80.4*/("""}"""),format.raw/*80.5*/(""");

	var RolePermissionSearch = """),format.raw/*82.29*/("""{"""),format.raw/*82.30*/("""
		_searchURL : "",
		initialise : function(searchUrl) """),format.raw/*84.36*/("""{"""),format.raw/*84.37*/("""
			this._searchURL = searchUrl;
			$("#role_permission_list").jqGrid(
					"""),format.raw/*87.6*/("""{"""),format.raw/*87.7*/("""
						url : this._searchURL,
						height : 231,
						width : $('#permissionSearchResult').width(),
						datatype : 'json',
						mtype : 'GET',
						colNames : ['Role','Permissions','Action'],
						colModel : [ """),format.raw/*94.20*/("""{"""),format.raw/*94.21*/("""
							name : 'role_name',
							index : 'role_name',
							width : 30,
							searchoptions : """),format.raw/*98.24*/("""{"""),format.raw/*98.25*/("""
								sopt : [ 'eq' ]
							"""),format.raw/*100.8*/("""}"""),format.raw/*100.9*/("""
						"""),format.raw/*101.7*/("""}"""),format.raw/*101.8*/(""", """),format.raw/*101.10*/("""{"""),format.raw/*101.11*/("""
							name : 'permissions',
							index : 'permissions',
							width : 150,
							searchoptions : """),format.raw/*105.24*/("""{"""),format.raw/*105.25*/("""
								sopt : [ 'eq' ]
							"""),format.raw/*107.8*/("""}"""),format.raw/*107.9*/("""
						"""),format.raw/*108.7*/("""}"""),format.raw/*108.8*/(""", """),format.raw/*108.10*/("""{"""),format.raw/*108.11*/("""
							name : 'action',
							index : 'action',
							width : 8,
							formatter : this.actionFormatter,
							search : false,
							title : false
						"""),format.raw/*115.7*/("""}"""),format.raw/*115.8*/(""", ],
						pagination : true,
						pager : '#role_permission_pager',

						rowNum : 10,
						rowList : [ 10, 20, 30 ],
						sortname : 'role',
						sortorder : 'desc',
						viewrecords : true,
						gridview : true,
						caption : 'Manage Permissions',

						onSelectRow : function(id) """),format.raw/*127.34*/("""{"""),format.raw/*127.35*/("""
						"""),format.raw/*128.7*/("""}"""),format.raw/*128.8*/(""",
						ondblClickRow : function(rowid) """),format.raw/*129.39*/("""{"""),format.raw/*129.40*/("""
						"""),format.raw/*130.7*/("""}"""),format.raw/*130.8*/(""",

						loadComplete : function(data) """),format.raw/*132.37*/("""{"""),format.raw/*132.38*/("""
							/* if (data.records == 0) """),format.raw/*133.34*/("""{"""),format.raw/*133.35*/("""
								alert("Search result not found!")
							"""),format.raw/*135.8*/("""}"""),format.raw/*135.9*/(""" */

							$('a[id^="edit-link"]').each(function() """),format.raw/*137.48*/("""{"""),format.raw/*137.49*/("""
								$(this).click(function() """),format.raw/*138.34*/("""{"""),format.raw/*138.35*/("""

									var id = $(this).attr('cell');
									$('#selectedRoleId').val(id);

									$.ajax("""),format.raw/*143.17*/("""{"""),format.raw/*143.18*/("""
										type : "POST",
										url : "/rolepermission/update",
										data : """),format.raw/*146.18*/("""{"""),format.raw/*146.19*/("""
											id : id
										"""),format.raw/*148.11*/("""}"""),format.raw/*148.12*/(""",
										success : function(data) """),format.raw/*149.36*/("""{"""),format.raw/*149.37*/("""
											console.log(data);
											handleData(data);
										"""),format.raw/*152.11*/("""}"""),format.raw/*152.12*/(""",
										complete : function(jqXHR, status) """),format.raw/*153.46*/("""{"""),format.raw/*153.47*/("""

										"""),format.raw/*155.11*/("""}"""),format.raw/*155.12*/("""
									"""),format.raw/*156.10*/("""}"""),format.raw/*156.11*/(""");
									return false;
								"""),format.raw/*158.9*/("""}"""),format.raw/*158.10*/(""");
							"""),format.raw/*159.8*/("""}"""),format.raw/*159.9*/(""");
							RolePermissionSearch.resizeGrid();
						"""),format.raw/*161.7*/("""}"""),format.raw/*161.8*/(""",
					"""),format.raw/*162.6*/("""}"""),format.raw/*162.7*/(""");

			function handleData(data) """),format.raw/*164.30*/("""{"""),format.raw/*164.31*/("""
				$('#role-update-modal .modal-body ul').empty();
				for ( var i = 0; i < data.length; i++) """),format.raw/*166.44*/("""{"""),format.raw/*166.45*/("""
					if(data[i].state== false)"""),format.raw/*167.31*/("""{"""),format.raw/*167.32*/("""
						if(data[i].parentPresent == false)"""),format.raw/*168.41*/("""{"""),format.raw/*168.42*/("""
							if(data[i].urlPresent == false)
							$('#role-update-modal .modal-body ul').append('<label class="permissions space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#role-update-modal .modal-body ul').append('<input type="checkbox" class="permissions" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
						"""),format.raw/*173.7*/("""}"""),format.raw/*173.8*/("""
						else"""),format.raw/*174.11*/("""{"""),format.raw/*174.12*/("""
							if(data[i].urlPresent == false)
							$('#role-update-modal .modal-body ul').append('<label  class="permissions margin space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#role-update-modal .modal-body ul').append('<input type="checkbox" class="permissions margin" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');	
						"""),format.raw/*179.7*/("""}"""),format.raw/*179.8*/("""
					"""),format.raw/*180.6*/("""}"""),format.raw/*180.7*/("""
					else"""),format.raw/*181.10*/("""{"""),format.raw/*181.11*/("""
						if(data[i].parentPresent == false)"""),format.raw/*182.41*/("""{"""),format.raw/*182.42*/("""
							if(data[i].urlPresent == false)
							$('#role-update-modal .modal-body ul').append('<label class="permissions space" name="permissions" value="'+data[i].permissionKey+'" >'+data[i].permissionName+'<br/>');
							else
							$('#role-update-modal .modal-body ul').append('<input type="checkbox" class="permissions" name="permissions" value="'+data[i].permissionKey+'" checked>'+data[i].permissionName+'<br/>');	
						"""),format.raw/*187.7*/("""}"""),format.raw/*187.8*/("""else"""),format.raw/*187.12*/("""{"""),format.raw/*187.13*/("""
							if(data[i].urlPresent == false)
							$('#role-update-modal .modal-body ul').append('<label class="permissions margin space" name="permissions" value="'+data[i].permissionKey+'">'+data[i].permissionName+'<br/>');
							else
							$('#role-update-modal .modal-body ul').append('<input type="checkbox" class="permissions margin" name="permissions" value="'+data[i].permissionKey+'" checked>'+data[i].permissionName+'<br/>');	
						"""),format.raw/*192.7*/("""}"""),format.raw/*192.8*/("""
					"""),format.raw/*193.6*/("""}"""),format.raw/*193.7*/("""
				"""),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
				$('#role-update-modal').modal();

				$('#addRolePermissions').click(function() """),format.raw/*197.47*/("""{"""),format.raw/*197.48*/("""
					/* var values = $('input:checkbox:checked.permissions').map(function () """),format.raw/*198.78*/("""{"""),format.raw/*198.79*/("""
						  return this.value;
					"""),format.raw/*200.6*/("""}"""),format.raw/*200.7*/("""); */

					$.ajax("""),format.raw/*202.13*/("""{"""),format.raw/*202.14*/("""
						type : "POST",
						url : "/rolepermission/save",
						data : $("#role-modal-form").serialize(),
						success : function(data) """),format.raw/*206.32*/("""{"""),format.raw/*206.33*/("""
							$('#role-update-modal').modal('hide');
							$.pnotify("""),format.raw/*208.18*/("""{"""),format.raw/*208.19*/("""
								history:false,
						        text: data
						    """),format.raw/*211.11*/("""}"""),format.raw/*211.12*/(""");
							rolePermissionSearch.doSearch();
						"""),format.raw/*213.7*/("""}"""),format.raw/*213.8*/(""",
						error : function(data) """),format.raw/*214.30*/("""{"""),format.raw/*214.31*/("""
							//console.log(data);
						"""),format.raw/*216.7*/("""}"""),format.raw/*216.8*/(""",
						complete : function(jqXHR, status) """),format.raw/*217.42*/("""{"""),format.raw/*217.43*/("""
							//console.log(status);
							//console.log(jqXHR);
							rolePermissionSearch.doSearch();
						"""),format.raw/*221.7*/("""}"""),format.raw/*221.8*/("""
					"""),format.raw/*222.6*/("""}"""),format.raw/*222.7*/(""");
					return false;
				"""),format.raw/*224.5*/("""}"""),format.raw/*224.6*/(""")
			"""),format.raw/*225.4*/("""}"""),format.raw/*225.5*/("""

			jQuery("#role_permission_list").jqGrid('bindKeys');
			jQuery("#role_permission_list").jqGrid('navGrid',
					'#role_permission_pager', """),format.raw/*229.32*/("""{"""),format.raw/*229.33*/("""
						del : false,
						add : false,
						edit : false,
						search : false,
						refresh : false
					"""),format.raw/*235.6*/("""}"""),format.raw/*235.7*/(""");
			return this;
		"""),format.raw/*237.3*/("""}"""),format.raw/*237.4*/(""",

		actionFormatter : function(cellvalue, options, rowObject) """),format.raw/*239.61*/("""{"""),format.raw/*239.62*/("""
			var retVal = "";

			var show = "<span class='action-buttons' id='role_permission-edit'>"
					+ "<a href='#' cell='"+cellvalue+"' id='edit-link-"+cellvalue+"' " +
  									"class='show-link'>"
					+ "" + "</a></span>";
			return show;
		"""),format.raw/*247.3*/("""}"""),format.raw/*247.4*/(""",
		resizeGrid : function() """),format.raw/*248.27*/("""{"""),format.raw/*248.28*/("""
			$("#role_permission_list").setGridWidth(
					$('#permissionSearchResult').width());
		"""),format.raw/*251.3*/("""}"""),format.raw/*251.4*/(""",

		doSearch : function() """),format.raw/*253.25*/("""{"""),format.raw/*253.26*/("""

			var role = $("#role_name").val();
			var description = $("#role_description").val();

			jQuery("#role_permission_list").setGridParam(
					"""),format.raw/*259.6*/("""{"""),format.raw/*259.7*/("""
						mtype : 'GET',
						url : this._searchURL + "?" + "role=" + role
								+ "&description=" + description
					"""),format.raw/*263.6*/("""}"""),format.raw/*263.7*/(""").trigger("reloadGrid");
		"""),format.raw/*264.3*/("""}"""),format.raw/*264.4*/("""

	"""),format.raw/*266.2*/("""}"""),format.raw/*266.3*/("""
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
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/roleSearchPermission.scala.html
                    HASH: e69b8d854489342d84be282368bbace107f68521
                    MATRIX: 817->0|879->35|907->36|954->57|981->58|1021->71|1049->72|1098->95|1125->96|1169->112|1198->113|1267->155|1295->156|1333->167|1361->168|1409->189|1437->190|1472->198|1500->199|1547->219|1575->220|1631->248|1660->249|1732->294|1760->295|1822->329|1851->330|1915->367|1943->368|3050->1447|3079->1448|3186->1519|3201->1525|3251->1553|3334->1608|3363->1609|3435->1654|3463->1655|3545->1709|3574->1710|3634->1742|3663->1743|3737->1790|3765->1791|3798->1797|3826->1798|3862->1807|3890->1808|3952->1842|3981->1843|4066->1900|4095->1901|4201->1980|4229->1981|4481->2205|4510->2206|4640->2308|4669->2309|4731->2343|4760->2344|4796->2352|4825->2353|4856->2355|4886->2356|5022->2463|5052->2464|5114->2498|5143->2499|5179->2507|5208->2508|5239->2510|5269->2511|5463->2677|5492->2678|5827->2984|5857->2985|5893->2993|5922->2994|5992->3035|6022->3036|6058->3044|6087->3045|6157->3086|6187->3087|6251->3122|6281->3123|6361->3175|6390->3176|6473->3230|6503->3231|6567->3266|6597->3267|6729->3370|6759->3371|6876->3459|6906->3460|6967->3492|6997->3493|7064->3531|7094->3532|7196->3605|7226->3606|7303->3654|7333->3655|7376->3669|7406->3670|7446->3681|7476->3682|7540->3718|7570->3719|7609->3730|7638->3731|7719->3784|7748->3785|7784->3793|7813->3794|7877->3829|7907->3830|8034->3928|8064->3929|8125->3961|8155->3962|8226->4004|8256->4005|8707->4428|8736->4429|8777->4441|8807->4442|9274->4881|9303->4882|9338->4889|9367->4890|9407->4901|9437->4902|9508->4944|9538->4945|9999->5378|10028->5379|10061->5383|10091->5384|10565->5830|10594->5831|10629->5838|10658->5839|10692->5845|10721->5846|10838->5934|10868->5935|10976->6014|11006->6015|11069->6050|11098->6051|11148->6072|11178->6073|11348->6214|11378->6215|11473->6281|11503->6282|11594->6344|11624->6345|11703->6396|11732->6397|11793->6429|11823->6430|11888->6467|11917->6468|11990->6512|12020->6513|12158->6623|12187->6624|12222->6631|12251->6632|12307->6660|12336->6661|12370->6667|12399->6668|12573->6813|12603->6814|12745->6928|12774->6929|12825->6952|12854->6953|12948->7018|12978->7019|13259->7272|13288->7273|13346->7302|13376->7303|13498->7397|13527->7398|13585->7427|13615->7428|13794->7579|13823->7580|13973->7702|14002->7703|14058->7731|14087->7732|14120->7737|14149->7738
                    LINES: 29->1|30->2|30->2|32->4|32->4|34->6|34->6|36->8|36->8|38->10|38->10|41->13|41->13|43->15|43->15|45->17|45->17|46->18|46->18|48->20|48->20|50->22|50->22|53->25|53->25|55->27|55->27|58->30|58->30|95->67|95->67|97->69|97->69|97->69|98->70|98->70|100->72|100->72|102->74|102->74|103->75|103->75|105->77|105->77|106->78|106->78|108->80|108->80|110->82|110->82|112->84|112->84|115->87|115->87|122->94|122->94|126->98|126->98|128->100|128->100|129->101|129->101|129->101|129->101|133->105|133->105|135->107|135->107|136->108|136->108|136->108|136->108|143->115|143->115|155->127|155->127|156->128|156->128|157->129|157->129|158->130|158->130|160->132|160->132|161->133|161->133|163->135|163->135|165->137|165->137|166->138|166->138|171->143|171->143|174->146|174->146|176->148|176->148|177->149|177->149|180->152|180->152|181->153|181->153|183->155|183->155|184->156|184->156|186->158|186->158|187->159|187->159|189->161|189->161|190->162|190->162|192->164|192->164|194->166|194->166|195->167|195->167|196->168|196->168|201->173|201->173|202->174|202->174|207->179|207->179|208->180|208->180|209->181|209->181|210->182|210->182|215->187|215->187|215->187|215->187|220->192|220->192|221->193|221->193|222->194|222->194|225->197|225->197|226->198|226->198|228->200|228->200|230->202|230->202|234->206|234->206|236->208|236->208|239->211|239->211|241->213|241->213|242->214|242->214|244->216|244->216|245->217|245->217|249->221|249->221|250->222|250->222|252->224|252->224|253->225|253->225|257->229|257->229|263->235|263->235|265->237|265->237|267->239|267->239|275->247|275->247|276->248|276->248|279->251|279->251|281->253|281->253|287->259|287->259|291->263|291->263|292->264|292->264|294->266|294->266
                    -- GENERATED --
                */
            