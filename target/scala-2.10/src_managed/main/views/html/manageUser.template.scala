
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
object manageUser extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<table id="user_list"><tr><td/></tr></table> 
<div id="user_pager" ></div>
 """))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:20 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/manageUser.scala.html
                    HASH: 8ec790db28815dcc384a3ea92369ef4860c14be0
                    MATRIX: 792->0
                    LINES: 29->1
                    -- GENERATED --
                */
            