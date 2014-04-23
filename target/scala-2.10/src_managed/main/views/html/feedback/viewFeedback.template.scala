
package views.html.feedback

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
object viewFeedback extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.feedback.Feedback,models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(feedback: models.feedback.Feedback,user : models.user.User):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*5.1*/("""
<style>
	#custom-modal-container"""),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
		width: 500px !important;
		left: 50% !important;
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""

	.formClass"""),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
		padding: 0 30px;
	"""),format.raw/*14.2*/("""}"""),format.raw/*14.3*/("""
	
	.modal-footer"""),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""
		padding: 15px 15px 5px !important;
		text-align: left;
		background-color: none !important;
		margin-top: 15px;
	"""),format.raw/*21.2*/("""}"""),format.raw/*21.3*/("""
	
	.modal-header .close"""),format.raw/*23.22*/("""{"""),format.raw/*23.23*/("""
		margin-right: -25px;
	"""),format.raw/*25.2*/("""}"""),format.raw/*25.3*/("""
</style>

<div class="formClass">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<h4>Feedback For """),_display_(Seq[Any](/*31.21*/user/*31.25*/.firstName)),format.raw/*31.35*/(""" """),_display_(Seq[Any](/*31.37*/user/*31.41*/.lastName)),format.raw/*31.50*/("""</h4>
	</div>

	<br>
	
	<p><b>Feedback :</b> """),_display_(Seq[Any](/*36.24*/feedback/*36.32*/.feedback)),format.raw/*36.41*/("""</p>

	<p><b>Rating :</b> """),_display_(Seq[Any](/*38.22*/feedback/*38.30*/.rating)),format.raw/*38.37*/("""</p>
	
	<p><b>Feedback From :</b> """),_display_(Seq[Any](/*40.29*/feedback/*40.37*/.manager.firstName)),format.raw/*40.55*/(""" """),_display_(Seq[Any](/*40.57*/feedback/*40.65*/.manager.lastName)),format.raw/*40.82*/(""" on """),_display_(Seq[Any](/*40.87*/feedback/*40.95*/.feedbackDateDisplay)),format.raw/*40.115*/("""</p>
	
	
</div>"""))}
    }
    
    def render(feedback:models.feedback.Feedback,user:models.user.User): play.api.templates.Html = apply(feedback,user)
    
    def f:((models.feedback.Feedback,models.user.User) => play.api.templates.Html) = (feedback,user) => apply(feedback,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/feedback/viewFeedback.scala.html
                    HASH: ac37f528daa4889f244f0d1550c976a0317bee59
                    MATRIX: 774->1|963->61|993->118|1055->153|1083->154|1166->210|1194->211|1237->226|1266->227|1316->250|1344->251|1391->270|1420->271|1568->392|1596->393|1650->419|1679->420|1733->447|1761->448|1962->613|1975->617|2007->627|2045->629|2058->633|2089->642|2176->693|2193->701|2224->710|2289->739|2306->747|2335->754|2408->791|2425->799|2465->817|2503->819|2520->827|2559->844|2600->849|2617->857|2660->877
                    LINES: 26->1|32->1|34->5|36->7|36->7|39->10|39->10|41->12|41->12|43->14|43->14|45->16|45->16|50->21|50->21|52->23|52->23|54->25|54->25|60->31|60->31|60->31|60->31|60->31|60->31|65->36|65->36|65->36|67->38|67->38|67->38|69->40|69->40|69->40|69->40|69->40|69->40|69->40|69->40|69->40
                    -- GENERATED --
                */
            