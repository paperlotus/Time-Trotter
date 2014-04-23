
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
object createFeedback extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[models.feedback.Feedback],models.user.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(feedbackForm: Form[models.feedback.Feedback],user : models.user.User):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""
<style>
	#custom-modal-container"""),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
		width: 580px !important;
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
	
</style>

<div class="modal-header">
	<button type="button" class="close" data-dismiss="modal">&times;</button>
	<h4>Feedback For """),_display_(Seq[Any](/*27.20*/user/*27.24*/.firstName)),format.raw/*27.34*/(""" """),_display_(Seq[Any](/*27.36*/user/*27.40*/.lastName)),format.raw/*27.49*/("""</h4>
</div>

"""),_display_(Seq[Any](/*30.2*/helper/*30.8*/.form(action = routes.Feedbacks.create, 'id -> "createFeedbackForm",  'class -> "formClass", 'enctype -> "multipart/form-data")/*30.135*/ {_display_(Seq[Any](format.raw/*30.137*/("""
	
	<input type="hidden" value=""""),_display_(Seq[Any](/*32.31*/user/*32.35*/.id)),format.raw/*32.38*/("""" name="employeeID">
	<br>
	"""),_display_(Seq[Any](/*34.3*/textarea(
		feedbackForm("feedback"),
		args = '_label -> "Remark",
		'placeholder -> "Provide your valuable feedback here.",
		'class -> "customTextArea"
	))),format.raw/*39.3*/("""
	
	"""),_display_(Seq[Any](/*41.3*/select(
		feedbackForm("rating"),
		options(controllers.Feedbacks.getRatingOptions()),
		args = '_label -> "Rating", 
		'class -> "largeInput"
	))),format.raw/*46.3*/("""
	
	<div class="modal-footer">
		<a href="#" data-dismiss="modal" class="btn">Cancel</a> 
		<a href="#" class="btn btn-primary" id="feedbackSubmitBtn">Submit</a>
	</div>	
""")))})),format.raw/*52.2*/("""

<script>
	$("#feedbackSubmitBtn").click(function()"""),format.raw/*55.42*/("""{"""),format.raw/*55.43*/("""
		$.post("/submitFeedback",$('#createFeedbackForm').serialize(), function(response) """),format.raw/*56.85*/("""{"""),format.raw/*56.86*/("""
			$('#custom-modal-container').modal('hide');
			$.pnotify("""),format.raw/*58.14*/("""{"""),format.raw/*58.15*/("""
				history:false,
		        text: response
		    """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/(""");
		"""),format.raw/*62.3*/("""}"""),format.raw/*62.4*/(""");
	"""),format.raw/*63.2*/("""}"""),format.raw/*63.3*/(""");
</script>"""))}
    }
    
    def render(feedbackForm:Form[models.feedback.Feedback],user:models.user.User): play.api.templates.Html = apply(feedbackForm,user)
    
    def f:((Form[models.feedback.Feedback],models.user.User) => play.api.templates.Html) = (feedbackForm,user) => apply(feedbackForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 21 14:16:21 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/feedback/createFeedback.scala.html
                    HASH: c72aa52efe600c047ce8f965d1d4c2c08c57140a
                    MATRIX: 782->1|981->71|1011->128|1073->163|1101->164|1184->220|1212->221|1255->236|1284->237|1334->260|1362->261|1409->280|1438->281|1586->402|1614->403|1790->543|1803->547|1835->557|1873->559|1886->563|1917->572|1970->590|1984->596|2121->723|2162->725|2233->760|2246->764|2271->767|2337->798|2520->960|2562->967|2733->1117|2942->1295|3025->1350|3054->1351|3168->1437|3197->1438|3288->1501|3317->1502|3398->1556|3426->1557|3459->1563|3487->1564|3519->1569|3547->1570
                    LINES: 26->1|32->1|34->5|36->7|36->7|39->10|39->10|41->12|41->12|43->14|43->14|45->16|45->16|50->21|50->21|56->27|56->27|56->27|56->27|56->27|56->27|59->30|59->30|59->30|59->30|61->32|61->32|61->32|63->34|68->39|70->41|75->46|81->52|84->55|84->55|85->56|85->56|87->58|87->58|90->61|90->61|91->62|91->62|92->63|92->63
                    -- GENERATED --
                */
            