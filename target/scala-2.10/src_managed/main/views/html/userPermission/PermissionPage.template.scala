
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
object PermissionPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main("User Permissions")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
"""),_display_(Seq[Any](/*4.2*/menuContext(_menuContext,user))),format.raw/*4.32*/("""
	<div class="permissionRadio">
		<input id="user" type="radio" name="somevalue" value="user" checked>User
		<input id="role" type="radio" name="somevalue" value="role">Role<br>
	</div>
	<div id="userPermission">
		"""),_display_(Seq[Any](/*10.4*/views/*10.9*/.html.userPermission.mainPermission(_menuContext,user))),format.raw/*10.63*/("""
	</div>

	<div id="rolePermission" style="display:none;">
		"""),_display_(Seq[Any](/*14.4*/views/*14.9*/.html.userPermission.roleMainPermission(_menuContext,user))),format.raw/*14.67*/("""
	</div>

<script type="text/javascript">

$(document).ready(function() """),format.raw/*19.30*/("""{"""),format.raw/*19.31*/(""" 
	$('input[id=user]').change(function()"""),format.raw/*20.39*/("""{"""),format.raw/*20.40*/("""
		$("#rolePermission").css("display","none");
		$("#userPermission").css("display","block");
	"""),format.raw/*23.2*/("""}"""),format.raw/*23.3*/(""");
	
	$('input[id=role]').change(function()"""),format.raw/*25.39*/("""{"""),format.raw/*25.40*/("""
		$("#userPermission").css("display","none");
		$("#rolePermission").css("display","block");
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/(""");
</script>
""")))})))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (_menuContext,user) => apply(_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/PermissionPage.scala.html
                    HASH: c2ae79c91a273879dc5bd374cba43aa2490bcc20
                    MATRIX: 769->1|897->52|936->57|968->81|1007->83|1044->86|1095->116|1352->338|1365->343|1441->397|1542->463|1555->468|1635->526|1739->602|1768->603|1837->644|1866->645|1991->743|2019->744|2092->789|2121->790|2246->888|2274->889|2305->893|2333->894
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|38->10|38->10|38->10|42->14|42->14|42->14|47->19|47->19|48->20|48->20|51->23|51->23|53->25|53->25|56->28|56->28|57->29|57->29
                    -- GENERATED --
                */
            