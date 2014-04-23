
package views.html.leaves

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
object leaveIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Leave")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
    <h4><b style=" width: 1051px; margin-left: 20px;"><i>My Leaves</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""


<h5 id="Leave_caution" style="display:none;"> WILL YOU LIKE TO CONTINUE AND RETRACT ??</h5>

<script>

	function Leave_confimationDialog(_url)
	"""),format.raw/*14.2*/("""{"""),format.raw/*14.3*/("""
		 if(_url == '/leave/retractLeave')"""),format.raw/*15.37*/("""{"""),format.raw/*15.38*/("""
			 return true;
		 """),format.raw/*17.4*/("""}"""),format.raw/*17.5*/("""
		 return false;
		
	"""),format.raw/*20.2*/("""}"""),format.raw/*20.3*/("""
	
</script>

"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/leaves/leaveIndex.scala.html
                    HASH: 59148f4a17fc6c5eddad039d863eb43da3701945
                    MATRIX: 791->1|961->94|998->97|1019->110|1058->112|1099->119|1150->149|1272->237|1326->270|1359->273|1541->428|1569->429|1635->467|1664->468|1714->491|1742->492|1794->517|1822->518
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6|42->14|42->14|43->15|43->15|45->17|45->17|48->20|48->20
                    -- GENERATED --
                */
            