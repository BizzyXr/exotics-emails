
package views.txt.emails

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import play.api.i18n.Messages

object activateAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template3[models.security.User,String,Messages,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.security.User, url: String)(implicit messages: Messages):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/messages("email.activate.account.hello", user.firstName)),format.raw/*4.58*/("""

"""),_display_(/*6.2*/messages("email.activate.account.txt.text", url)),format.raw/*6.50*/("""
"""))
      }
    }
  }

  def render(user:models.security.User,url:String,messages:Messages): play.twirl.api.TxtFormat.Appendable = apply(user,url)(messages)

  def f:((models.security.User,String) => (Messages) => play.twirl.api.TxtFormat.Appendable) = (user,url) => (messages) => apply(user,url)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:31:27 WAT 2022
                  SOURCE: /Users/abanda/khalif-natures-backend/app/views/emails/activateAccount.scala.txt
                  HASH: 143fe3673312bac55a2f48789d307918e1325b1a
                  MATRIX: 437->1|807->33|970->105|1046->161|1074->164|1142->212
                  LINES: 17->1|22->3|27->4|27->4|29->6|29->6
                  -- GENERATED --
              */
          