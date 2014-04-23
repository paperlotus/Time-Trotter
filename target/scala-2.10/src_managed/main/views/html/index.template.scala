
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[dto.MenuBar,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_menuContext: dto.MenuBar,user : models.user.User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to TimeTrotter")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
     """),_display_(Seq[Any](/*4.7*/home(_menuContext,user))),format.raw/*4.30*/("""
""")))})),format.raw/*5.2*/("""
"""))}
    }
    
    def render(_menuContext:dto.MenuBar,user:models.user.User): play.api.templates.Html = apply(_menuContext,user)
    
    def f:((dto.MenuBar,models.user.User) => play.api.templates.Html) = (_menuContext,user) => apply(_menuContext,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/index.scala.html
                    HASH: c2a65771bdd8feb266e2e5f1d8fef2abfc5962c6
                    MATRIX: 745->1|873->52|910->55|948->85|987->87|1028->94|1072->117|1104->119
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5
                    -- GENERATED --
                */
            