
package views.html.report

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
object reportIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(context:com.mnt.core.helper.SearchContext,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Reports")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
    """),_display_(Seq[Any](/*3.6*/menuContext(_menuContext,user))),format.raw/*3.36*/("""
	<h4><b style=" width: 1051px; margin-left: 20px;"><i>Reports</i></b></h4>
    """),_display_(Seq[Any](/*5.6*/searchContext(context,null,"add"))),format.raw/*5.39*/("""
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(context:com.mnt.core.helper.SearchContext,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(context,_menuContext,user)
    
    def f:((com.mnt.core.helper.SearchContext,dto.MenuBar,models.user.User) => play.api.templates.Html) = (context,_menuContext,user) => apply(context,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/report/reportIndex.scala.html
                    HASH: 5a35d6569dba33b6f3f72b5bb25e745cedd4cce0
                    MATRIX: 792->1|962->94|999->97|1033->123|1072->125|1113->132|1164->162|1281->245|1335->278|1368->281
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5|34->6
                    -- GENERATED --
                */
            