
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
object mainPermission extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main("User Permissions")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

	<div id="permission_search_accordion">
	"""),_display_(Seq[Any](/*6.3*/menuContext(_menuContext,user))),format.raw/*6.33*/("""
	<h4 class="heading"><i>Manage User Permissions :</i></h4>
	<div class="searchContainer">
		<div id="searchPermission" class="well form-inline" >
	
			<table>
				<tr>
					<td><input type="text" id="user_first_name" placeholder="First Name" class="input-medium search-query" /></td>
					<td><input type="text" id="user_last_name" placeholder="Last Name" class="input-medium search-query"/></td>
					
					<td><button name="Search" class="btn" id="permission_search" >Search</button></td>
				</tr>
			</table>
		</div>
		
		<div id="permissionSearchResult">
				"""),_display_(Seq[Any](/*22.6*/views/*22.11*/.html.userPermission.searchPermission())),format.raw/*22.50*/("""
		</div>
	</div>
	</div>
""")))})))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (_menuContext,user) => apply(_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/mainPermission.scala.html
                    HASH: 25c388e25ef191f81334259d08accbc4adc64e1c
                    MATRIX: 769->1|897->52|936->57|968->81|1007->83|1088->130|1139->160|1757->743|1771->748|1832->787
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|50->22|50->22|50->22
                    -- GENERATED --
                */
            