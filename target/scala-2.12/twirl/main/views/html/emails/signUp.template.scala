
package views.html.emails

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.twirl.api.Html

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.security.User,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: models.security.User, url: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
    <body>
        <p>"""),_display_(/*8.13*/messages("email.sign.up.hello", user.firstName)),format.raw/*8.60*/("""</p>
        <p>"""),_display_(/*9.13*/Html(messages("email.sign.up.html.text", url))),format.raw/*9.59*/("""</p>
    </body>
</html>
"""))
      }
    }
  }

  def render(user:models.security.User,url:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,url)(messages)

  def f:((models.security.User,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,url) => (messages) => apply(user,url)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:31:27 WAT 2022
                  SOURCE: /Users/abanda/khalif-natures-backend/app/views/emails/signUp.scala.html
                  HASH: 1283ff17f1a37275b7f0b0b4f9fc23e52b607590
                  MATRIX: 439->1|476->32|838->61|1002->132|1029->133|1085->163|1152->210|1195->227|1261->273
                  LINES: 17->1|18->2|23->4|28->5|29->6|31->8|31->8|32->9|32->9
                  -- GENERATED --
              */
          