
package views.html.role

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
object defineOrgHierarchy extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[dto.MenuBar,models.user.User,Form[models.role.RoleX],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User, rolexForm : Form[models.role.RoleX]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/roleGroup/*6.11*/(field: Field, className: String = "roleLevel"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.62*/("""
    <div class="twipsies well """),_display_(Seq[Any](/*7.32*/className)),format.raw/*7.41*/("""">
        
       """),_display_(Seq[Any](/*9.9*/inputText(
			field("role_name"),
			args = '_label -> "Role Name",
			'placeholder -> "Role Name",
			'class -> "roleDivs roleDivsInput readonlycls"
		))),format.raw/*14.4*/("""
		
		"""),_display_(Seq[Any](/*16.4*/select(
			field("reporting_to"),
			options(controllers.Roles.getAllRoles()),
			args = '_label -> "Reporting To",
			'class -> "roleDivs"
		))),format.raw/*21.4*/("""
		
		"""),_display_(Seq[Any](/*23.4*/select(
			field("final_approval"),
			options(controllers.Roles.getAllRoles()),
			args = '_label -> "Final Approval To",
			'class -> "roleDivs"
		))),format.raw/*28.4*/("""
		
		 """),_display_(Seq[Any](/*30.5*/select(
			field("role_level"),
			options(controllers.Roles.getRoleLevels()),
			args = '_label -> "",
			'class -> "roleDivs hidden"
		))),format.raw/*35.4*/("""
		
		"""),_display_(Seq[Any](/*37.4*/inputText(
			field("id"),
			args = '_label -> "",
			'type -> "hidden"
		))),format.raw/*41.4*/("""		
		
		"""),_display_(Seq[Any](/*43.4*/inputText(
			field("permissions"),
			args = '_label -> "",
			'type -> "hidden" 
		))),format.raw/*47.4*/("""
    </div>
""")))};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*49.2*/("""


"""),_display_(Seq[Any](/*52.2*/main("Define Roles")/*52.22*/ {_display_(Seq[Any](format.raw/*52.24*/("""

	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*54.47*/routes/*54.53*/.Assets.at("stylesheets/customRoleX.css"))),format.raw/*54.94*/("""">
	<script src=""""),_display_(Seq[Any](/*55.16*/routes/*55.22*/.Assets.at("customScripts/roleScript.js"))),format.raw/*55.63*/("""" type="text/javascript"></script>
	
	<script>
		$(document).ready(function()"""),format.raw/*58.31*/("""{"""),format.raw/*58.32*/("""
			$(".readonlycls").attr("readonly","readonly");
		"""),format.raw/*60.3*/("""}"""),format.raw/*60.4*/(""");
	</script>
    """),_display_(Seq[Any](/*62.6*/menuContext(_menuContext,user))),format.raw/*62.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>Define Roles</i></b></h4>
    
    """),_display_(Seq[Any](/*65.6*/helper/*65.12*/.form(action = routes.Roles.saveRole, 'id -> "form")/*65.64*/ {_display_(Seq[Any](format.raw/*65.66*/("""
        
        <fieldset>
            <div id="rolex">
            
            	"""),_display_(Seq[Any](/*70.15*/inputText(
					rolexForm("id"),
					args = '_label -> "",
					'type -> "hidden"
				))),format.raw/*74.6*/("""
				
				"""),_display_(Seq[Any](/*76.6*/repeat(rolexForm("roleLevels"))/*76.37*/ { roleLevel =>_display_(Seq[Any](format.raw/*76.52*/("""
                    """),_display_(Seq[Any](/*77.22*/roleGroup(roleLevel))),format.raw/*77.42*/("""
                """)))})),format.raw/*78.18*/("""
                
                """),_display_(Seq[Any](/*80.18*/roleGroup(
                    rolexForm("roleLevels[x]"),
                    className = "roleLevel_template"
                ))),format.raw/*83.18*/("""
                
            </div>
        </fieldset>
        
        <div class="actions" style="margin-top: 1%;">
            <input type="button" class="btn btn-info" id="submitButton" value="Submit" style="margin:1% 2%;width: 8%;"">
        </div>
        
    """)))})),format.raw/*92.6*/("""
    
""")))})),format.raw/*94.2*/("""

<script>
$(document).ready(function()"""),format.raw/*97.29*/("""{"""),format.raw/*97.30*/("""

	$("#submitButton").click(function()"""),format.raw/*99.37*/("""{"""),format.raw/*99.38*/("""
		if(customValidation())"""),format.raw/*100.25*/("""{"""),format.raw/*100.26*/("""
			$('.roleLevel_template').remove()
			$.ajax("""),format.raw/*102.11*/("""{"""),format.raw/*102.12*/("""
				type: "POST",
				data : $("#form").serialize(),
				url: "/saveOrg",
				success: function(data)"""),format.raw/*106.28*/("""{"""),format.raw/*106.29*/("""
					$.pnotify("""),format.raw/*107.16*/("""{"""),format.raw/*107.17*/("""
						history:false,
				        text: data
				    """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/(""");
				"""),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/(""");
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/("""else"""),format.raw/*113.8*/("""{"""),format.raw/*113.9*/("""
			bootbox.alert("Please define roles first.");
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/("""
	"""),format.raw/*116.2*/("""}"""),format.raw/*116.3*/(""");
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/(""");

function customValidation()"""),format.raw/*119.28*/("""{"""),format.raw/*119.29*/("""
	if($('div.roleLevel').length == 0)"""),format.raw/*120.36*/("""{"""),format.raw/*120.37*/("""
		return false;	
	"""),format.raw/*122.2*/("""}"""),format.raw/*122.3*/("""else if($('div.roleLevel').length == 1 )"""),format.raw/*122.43*/("""{"""),format.raw/*122.44*/("""
		if($(".readonlycls").val() == "")"""),format.raw/*123.36*/("""{"""),format.raw/*123.37*/("""
			return false;
		"""),format.raw/*125.3*/("""}"""),format.raw/*125.4*/("""
	"""),format.raw/*126.2*/("""}"""),format.raw/*126.3*/("""
	return true;
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/("""

</script>"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User,rolexForm:Form[models.role.RoleX]): play.api.templates.Html = apply(_menuContext,user,rolexForm)
    
    def f:((dto.MenuBar,models.user.User,Form[models.role.RoleX]) => play.api.templates.Html) = (_menuContext,user,rolexForm) => apply(_menuContext,user,rolexForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/role/defineOrgHierarchy.scala.html
                    HASH: 26ec4763ee5574e4f25ac50a9bb16ebe4f042640
                    MATRIX: 787->1|987->149|1004->158|1118->209|1186->242|1216->251|1272->273|1451->431|1495->440|1664->588|1708->597|1884->752|1929->762|2093->905|2137->914|2238->994|2284->1005|2395->1095|2449->89|2479->146|2508->1110|2550->1117|2579->1137|2619->1139|2705->1189|2720->1195|2783->1236|2838->1255|2853->1261|2916->1302|3024->1382|3053->1383|3135->1438|3163->1439|3219->1460|3271->1490|3403->1587|3418->1593|3479->1645|3519->1647|3645->1737|3758->1829|3806->1842|3846->1873|3899->1888|3958->1911|4000->1931|4051->1950|4124->1987|4278->2119|4588->2398|4628->2407|4698->2449|4727->2450|4795->2490|4824->2491|4879->2517|4909->2518|4988->2568|5018->2569|5153->2675|5183->2676|5229->2693|5259->2694|5343->2750|5373->2751|5409->2759|5438->2760|5471->2765|5500->2766|5534->2772|5563->2773|5595->2777|5624->2778|5705->2831|5734->2832|5765->2835|5794->2836|5826->2840|5855->2841|5917->2874|5947->2875|6013->2912|6043->2913|6092->2934|6121->2935|6190->2975|6220->2976|6286->3013|6316->3014|6366->3036|6395->3037|6426->3040|6455->3041|6500->3058|6529->3059
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|36->9|41->14|43->16|48->21|50->23|55->28|57->30|62->35|64->37|68->41|70->43|74->47|77->1|79->5|80->49|83->52|83->52|83->52|85->54|85->54|85->54|86->55|86->55|86->55|89->58|89->58|91->60|91->60|93->62|93->62|96->65|96->65|96->65|96->65|101->70|105->74|107->76|107->76|107->76|108->77|108->77|109->78|111->80|114->83|123->92|125->94|128->97|128->97|130->99|130->99|131->100|131->100|133->102|133->102|137->106|137->106|138->107|138->107|141->110|141->110|142->111|142->111|143->112|143->112|144->113|144->113|144->113|144->113|146->115|146->115|147->116|147->116|148->117|148->117|150->119|150->119|151->120|151->120|153->122|153->122|153->122|153->122|154->123|154->123|156->125|156->125|157->126|157->126|159->128|159->128
                    -- GENERATED --
                */
            