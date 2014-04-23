
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
object defineRoles extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[dto.MenuBar,models.user.User,Form[models.role.RoleX],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User, rolexForm : Form[models.role.RoleX]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/roleGroup/*6.11*/(field: Field, className: String = "roleLevel"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.62*/("""
    <div class="twipsies well """),_display_(Seq[Any](/*7.32*/className)),format.raw/*7.41*/("""">
        
        """),_display_(Seq[Any](/*9.10*/select(
			field("role_level"),
			options(controllers.Roles.getRoleLevels()),
			args = '_label -> "Role Level",
			'class -> "roleDivs"
		))),format.raw/*14.4*/("""
		
		"""),_display_(Seq[Any](/*16.4*/inputText(
			field("role_name"),
			args = '_label -> "Role Name",
			'placeholder -> "Role Name",
			'class -> "roleDivs roleDivsInput"
		))),format.raw/*21.4*/("""
		
		<a class="removeRole btn danger pull-right">Remove</a>
		
		"""),_display_(Seq[Any](/*25.4*/select(
			field("reporting_to"),
			options(controllers.Roles.getAllRoles()),
			args = '_label -> "",
			'class -> "roleDivs hidden"
		))),format.raw/*30.4*/("""
		
		"""),_display_(Seq[Any](/*32.4*/select(
			field("final_approval"),
			options(controllers.Roles.getAllRoles()),
			args = '_label -> "",
			'class -> "roleDivs hidden"
		))),format.raw/*37.4*/("""
		
		"""),_display_(Seq[Any](/*39.4*/inputText(
			field("permissions"),
			args = '_label -> "",
			'type -> "hidden" 
		))),format.raw/*43.4*/("""
		
		"""),_display_(Seq[Any](/*45.4*/inputText(
			field("id"),
			args = '_label -> "",
			'type -> "hidden"
		))),format.raw/*49.4*/("""
		
    </div>
""")))};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*52.2*/("""


"""),_display_(Seq[Any](/*55.2*/main("Define Roles")/*55.22*/ {_display_(Seq[Any](format.raw/*55.24*/("""

	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*57.47*/routes/*57.53*/.Assets.at("stylesheets/customRoleX.css"))),format.raw/*57.94*/("""">
	<script src=""""),_display_(Seq[Any](/*58.16*/routes/*58.22*/.Assets.at("customScripts/roleScript.js"))),format.raw/*58.63*/("""" type="text/javascript"></script>

    """),_display_(Seq[Any](/*60.6*/menuContext(_menuContext,user))),format.raw/*60.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>Define Roles</i></b></h4>
    
    """),_display_(Seq[Any](/*63.6*/helper/*63.12*/.form(action = routes.Roles.saveRole(), 'id -> "form")/*63.66*/ {_display_(Seq[Any](format.raw/*63.68*/("""
        
        <fieldset>
            <div id="rolex">
            
            	"""),_display_(Seq[Any](/*68.15*/if(rolexForm != null)/*68.36*/{_display_(Seq[Any](format.raw/*68.37*/("""
					"""),_display_(Seq[Any](/*69.7*/inputText(
						rolexForm("id"),
						args = '_label -> "",
						'type -> "hidden"
					))),format.raw/*73.7*/("""
				""")))})),format.raw/*74.6*/("""
            
                """),_display_(Seq[Any](/*76.18*/repeat(rolexForm("roleLevels"))/*76.49*/ { roleLevel =>_display_(Seq[Any](format.raw/*76.64*/("""
                    """),_display_(Seq[Any](/*77.22*/roleGroup(roleLevel))),format.raw/*77.42*/("""
                """)))})),format.raw/*78.18*/("""
                
                """),_display_(Seq[Any](/*80.18*/roleGroup(
                    rolexForm("roleLevels[x]"),
                    className = "roleLevel_template"
                ))),format.raw/*83.18*/("""
                
            </div>
        </fieldset>
        
        <div class="actions buttonPosition">
        	<a class="addMore btn btn-success">Add More</a>
            <input type="button" class="btn btn-info" id="submitButton" value="Submit" style="width: 9%;">
        </div>
        
    """)))})),format.raw/*93.6*/("""
    
""")))})),format.raw/*95.2*/("""

<script>
$(document).ready(function()"""),format.raw/*98.29*/("""{"""),format.raw/*98.30*/("""

	$("#submitButton").click(function()"""),format.raw/*100.37*/("""{"""),format.raw/*100.38*/("""
		$('.roleLevel_template').remove()
		$.ajax("""),format.raw/*102.10*/("""{"""),format.raw/*102.11*/("""
			type: "POST",
			data : $("#form").serialize(),
			url: "/saveRole",
			success: function(data)"""),format.raw/*106.27*/("""{"""),format.raw/*106.28*/("""
				$.pnotify("""),format.raw/*107.15*/("""{"""),format.raw/*107.16*/("""
					history:false,
			        text: data
			    """),format.raw/*110.8*/("""}"""),format.raw/*110.9*/(""");
			"""),format.raw/*111.4*/("""}"""),format.raw/*111.5*/("""
		"""),format.raw/*112.3*/("""}"""),format.raw/*112.4*/(""");
	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/(""");
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/(""");


</script>

<style>
.buttonPosition
"""),format.raw/*121.1*/("""{"""),format.raw/*121.2*/("""
margin-left: 18%;
margin-top: 1%;
"""),format.raw/*124.1*/("""}"""),format.raw/*124.2*/("""
</style>"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User,rolexForm:Form[models.role.RoleX]): play.api.templates.Html = apply(_menuContext,user,rolexForm)
    
    def f:((dto.MenuBar,models.user.User,Form[models.role.RoleX]) => play.api.templates.Html) = (_menuContext,user,rolexForm) => apply(_menuContext,user,rolexForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/role/defineRoles.scala.html
                    HASH: ad50a9862cdc4f9972700248178235736da222f5
                    MATRIX: 780->1|980->149|997->158|1111->209|1179->242|1209->251|1267->274|1434->420|1478->429|1645->575|1751->646|1915->789|1959->798|2125->943|2169->952|2280->1042|2324->1051|2425->1131|2483->89|2513->146|2542->1150|2584->1157|2613->1177|2653->1179|2739->1229|2754->1235|2817->1276|2872->1295|2887->1301|2950->1342|3028->1385|3080->1415|3212->1512|3227->1518|3290->1572|3330->1574|3456->1664|3486->1685|3525->1686|3568->1694|3685->1790|3723->1797|3792->1830|3832->1861|3885->1876|3944->1899|3986->1919|4037->1938|4110->1975|4264->2107|4609->2421|4649->2430|4719->2472|4748->2473|4817->2513|4847->2514|4924->2562|4954->2563|5086->2666|5116->2667|5161->2683|5191->2684|5272->2737|5301->2738|5336->2745|5365->2746|5397->2750|5426->2751|5459->2756|5488->2757|5520->2761|5549->2762|5624->2809|5653->2810|5719->2848|5748->2849
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|36->9|41->14|43->16|48->21|52->25|57->30|59->32|64->37|66->39|70->43|72->45|76->49|80->1|82->5|83->52|86->55|86->55|86->55|88->57|88->57|88->57|89->58|89->58|89->58|91->60|91->60|94->63|94->63|94->63|94->63|99->68|99->68|99->68|100->69|104->73|105->74|107->76|107->76|107->76|108->77|108->77|109->78|111->80|114->83|124->93|126->95|129->98|129->98|131->100|131->100|133->102|133->102|137->106|137->106|138->107|138->107|141->110|141->110|142->111|142->111|143->112|143->112|144->113|144->113|145->114|145->114|152->121|152->121|155->124|155->124
                    -- GENERATED --
                */
            