
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
object roleMainPermission extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main("Role Permissions")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

	<div id="role_permission_search_accordion">
	"""),_display_(Seq[Any](/*6.3*/menuContext(_menuContext,user))),format.raw/*6.33*/("""
	<h4 class="heading"><i>Manage Role Permissions :</i></h4>
	<div class="searchContainer">
		<div id="searchRolePermission" class="well form-inline" >
	
			<table>
				<tr>
					<td><input type="text" id="role_name" placeholder="Role Name" class="input-medium search-query" /></td>
					<td><input type="text" id="role_description" placeholder="Role Description" class="input-medium search-query"/></td>
					<td><button name="Search" class="btn" id="role_permission_search" >Search</button></td>
				</tr>
			</table>
		</div>
		
		<div id="permissionSearchResult">
				"""),_display_(Seq[Any](/*21.6*/views/*21.11*/.html.userPermission.roleSearchPermission())),format.raw/*21.54*/("""
		</div>
	</div>
	</div>
""")))})),format.raw/*25.2*/("""
"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (_menuContext,user) => apply(_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/roleMainPermission.scala.html
                    HASH: 0340d3f8fe3ccc92e9a56775101fc0e5dfd1a5c4
                    MATRIX: 773->1|901->52|940->57|972->81|1011->83|1097->135|1148->165|1770->752|1784->757|1849->800|1911->831
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|49->21|49->21|49->21|53->25
                    -- GENERATED --
                */
            