
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
object footer extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="container footer">
	<p>
		&copy; 2014 Time Trotter &middot; <a href="#myModal" data-toggle="modal">Privacy & Terms</a>
	</p>
</div>	

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<h3 id="myModalLabel">Privacy & Terms</h3>
			</div>
			<div class="modal-body">
				<p><h4>Time Trotter Website Privacy Policy</h4>
In this Website Privacy Statement ("statement"), we, Orlov Trotter Inc., provide information about how we collect, use and transfer personally identifiable data from you, an individual person and website visitor, through Orlov Trotter's publicly accessible websites (any of our websites such as www.orlovtrotter.com that can be accessed without a password) and on which we post a direct link to this statement (collectively the "site").
<br>
<h4>Scope</h4>
This statement covers only data collected through the site and not any other data collection or processing, including, without limitation, data collection practices of webpages to which the site links, or data that we or our affiliates collect offline or through webpages that do not display a direct link to this statement, for example the Orlov Trotter applications on which we host data for registered customers. The scope of our Safe Harbor Certification is defined by our General EEA Safe Harbor Notice.
<br>
<h4>Types of Data and Collection Methods</h4>
Through the site, we receive data that you actively submit as well as data that we track:

Actively Submitted Data: When you request information, subscribe to a mailing list or for a service, respond to an online survey or otherwise actively send us data, we usually collect data such as your name, e-mail address(es), mailing address(es), telephone number(s), and certain information related to the business you represent such as number of employees and industry type. You can opt out of providing information by not entering it when asked and, if such information is required in order to allow us to respond to your inquiry, you will receive a notice advising you of this. In each such instance, you will know what data we collect through the site, because you actively submit it.

Passively Tracked Data: When you visit the site, we also passively track information on your computer and Internet connection, such as the IP address of your computer and/or Internet service provider, the date and time you access the site, the Internet address of websites from which you link to our site, the computer technology you are using and your movements and preferences on our site. We use technology that many other websites employ, including, without limitation, "cookies" or small data files stored on your computer's hard drive, to collect such information. In some instances, we also use cookies to collect information in connection with future visits from that website, to recognize you as a previous visitor, or to track your activity on our site. If you follow a link to the site from an affiliate or promotion, we store information about your arrival from that affiliate or promotion in a session cookie. You do not need to have cookies turned on to visit our site. You can refuse cookies by turning them off on your browser. But, if you want to access webpages that require registration, you need to accept a mandatory session cookie, which you can delete after you leave the site.

Combinations: Unless you also actively submit personal information such as your name or address, passively tracked data does not typically allow us to identify you personally (even though it can theoretically be done, we do not have the means or an interest to find out who you are, unless you identify yourself voluntarily through an active submission of data). To the extent permitted by applicable law, we reserve the right to combine passively tracked data with personal data that you actively submit.
<br>
<h4>Collection Purposes, Use of Data</h4>
We collect passively tracked data primarily for purposes of administering, protecting and improving our site and our systems, to better understand the preferences of our site visitors, to identify server problems, to compile aggregated statistics about site usage, and to help personalize your experience on our site. We do not deliver third party online advertisements on our sites but we advertise our products and services on others' Web sites. We work with service providers to deliver retargeting advertisements and other advertisements on our behalf to visitors of our timetrotter.com site.

We collect actively submitted data primarily for two purposes: Firstly, for the purpose for which you originally sent us the data (e.g., to provide information to you or sign you up for a free trial); and secondly, for purposes of contacting you to further discuss your interest in our company, the services we provide and ways we can improve them to provide information on services, promotions and events. You can opt out of receiving marketing emails as explained below.
<br>
<h4>Disclosures of Personal Information</h4>
We are not in the business of selling or renting your information to telemarketers and we do not share your personally identifiable information with others, except as follows: We freely share your information within the Orlov Trotter group of companies. We also may share information with trusted business partners, such as system integrators, distributors, and referral partners and any other party specifically identified on the page on which you submit your information. We engage agents and service providers who process data only on our behalf and for our purposes under confidentiality agreements. We may share your information as required by law or in the interest of protecting or exercising our or others' legal rights, e.g., without limitation, in connection with requests from law enforcement officials and in connection with court proceedings. We may share or transfer your information in connection with a prospective or actual sale, merger, transfer or other reorganization of all or parts of our business. Also, we reserve the right to fully use and disclose any information that is not in personally identifiable form (such as statistics and survey results that do not identify you individually by name).
<br>
<h4>Opt-Out</h4>
In connection with promotions or other projects, we may ask you specifically whether you have objections against a certain kind of data use or sharing. If you opt-out under such circumstances, we will respect your decision. To opt out of receiving commercial communications from Orlov Trotter, please click on the "opt-out" link in the communication or, , please contact us at support@timetrotter.com. Please note that our affiliates and other data recipients have their own data privacy policies, which may differ from ours and you would have to contact them separately with respect to opt-out requests.
<br>
<h4>Access</h4>
If personal information you have submitted through the site is no longer accurate, current, or complete, and you wish to update it, please send an e-mail to support@timetrotter.com. Upon appropriate request we will usually be glad to update or amend your information, but we reserve the right to use information obtained previously to verify your identity or take other actions that we believe are appropriate.
<br>
<h4>Security</h4>
Transmissions over the Internet are never 100% secure or error-free. However, we take reasonable steps to protect your personal information from loss, misuse, and unauthorized access, disclosure, alteration, and destruction.
<br>
<h4>Effective Date, Amendments</h4>
This statement is effective as of April 13, 2013. We reserve the right to change, modify, add or remove portions of this statement from time to time and in our sole discretion, but will alert you that changes have been made by indicating on the statement the date it was last updated. When you visit the site, you are accepting the current version of this statement as posted on the site at that time. We recommend that users revisit this statement on occasion to learn of any changes.
<br>
<h4>Contact Us</h4>
Please feel free to contact us with any comments, questions, complaints or suggestions you might have regarding the information practices described in this statement. You may send us an e-mail at support@timetrotter.com or write to us Orlov Trotter LLC., telephone: 732-406-8023. </p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
			</div>
		</div>
		
		<script>$('.dropdown-toggle').dropdown();</script>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:34:02 EDT 2014
                    SOURCE: /Users/Secret/Technology/play-2.1.0/Time_Trotter/app/views/footer.scala.html
                    HASH: 31dd7011e4972ab9ad309562da60b56dd9746f24
                    MATRIX: 788->0
                    LINES: 29->1
                    -- GENERATED --
                */
            