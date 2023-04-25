
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template1[models.core.Contact,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*2.2*/(checkout: models.core.Contact):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(checkout:models.core.Contact): play.twirl.api.TxtFormat.Appendable = apply(checkout)

  def f:((models.core.Contact) => play.twirl.api.TxtFormat.Appendable) = (checkout) => apply(checkout)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:31:27 WAT 2022
                  SOURCE: /Users/abanda/khalif-natures-backend/app/views/emails/contact.scala.txt
                  HASH: 34924be6518dd64c3036d793fef1b156757de46f
                  MATRIX: 745->2
                  LINES: 21->2
                  -- GENERATED --
              */
          