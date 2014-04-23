
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
object restrictedPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PROHIBITED SECTION</title>
</head>
<body>
<h1>Sorry You are not Allowed Access to This Page</h1>
<a href=""""),_display_(Seq[Any](/*9.11*/routes/*9.17*/.Application.index())),format.raw/*9.37*/(""""><h4>Back</h4></a>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:22 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/userPermission/restrictedPage.scala.html
                    HASH: 4499588281503b5e760a1f45c1db96214b9d3038
                    MATRIX: 811->0|1026->180|1040->186|1081->206
                    LINES: 29->1|37->9|37->9|37->9
                    -- GENERATED --
                */
            