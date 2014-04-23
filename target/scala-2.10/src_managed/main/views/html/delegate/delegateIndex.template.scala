
package views.html.delegate

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
object delegateIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[com.mnt.core.helper.UIModel,dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_pageContext:com.mnt.core.helper.UIModel,_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.94*/(""" 
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Timesheet")/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
	"""),_display_(Seq[Any](/*3.3*/menuContext(_menuContext,user))),format.raw/*3.33*/("""
	
	"""),_display_(Seq[Any](/*5.3*/UIPageGenerator(_pageContext,false))),format.raw/*5.38*/("""
""")))})))}
    }
    
    def render(_pageContext:com.mnt.core.helper.UIModel,_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_pageContext,_menuContext,user)
    
    def f:((com.mnt.core.helper.UIModel,dto.MenuBar,models.user.User) => play.api.templates.Html) = (_pageContext,_menuContext,user) => apply(_pageContext,_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/delegate/delegateIndex.scala.html
                    HASH: 2b5e78ee3a432b5dc035370914579cf9abc82cc3
                    MATRIX: 790->1|959->93|997->97|1033->125|1072->127|1110->131|1161->161|1202->168|1258->203
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|33->5|33->5
                    -- GENERATED --
                */
            