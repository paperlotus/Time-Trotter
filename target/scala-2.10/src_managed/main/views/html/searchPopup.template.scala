
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
object searchPopup extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.mnt.core.helper.SearchUI,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(_searchContext: com.mnt.core.helper.SearchUI):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""
"""),_display_(Seq[Any](/*2.2*/main("Welcome to Time")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(Seq[Any](/*3.6*/UISearch(_searchContext))),format.raw/*3.30*/("""
""")))})),format.raw/*4.2*/("""
"""))}
    }
    
    def render(_searchContext:com.mnt.core.helper.SearchUI): play.api.templates.Html = apply(_searchContext)
    
    def f:((com.mnt.core.helper.SearchUI) => play.api.templates.Html) = (_searchContext) => apply(_searchContext)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/searchPopup.scala.html
                    HASH: f9ba7ebb48aee5425c07832dfa2829afbd365f94
                    MATRIX: 751->1|874->47|911->50|942->73|981->75|1022->82|1067->106|1100->109
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|32->4
                    -- GENERATED --
                */
            