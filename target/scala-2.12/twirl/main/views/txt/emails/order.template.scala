
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

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template1[models.order.Checkout,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*2.2*/(checkout: models.order.Checkout):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(checkout:models.order.Checkout): play.twirl.api.TxtFormat.Appendable = apply(checkout)

  def f:((models.order.Checkout) => play.twirl.api.TxtFormat.Appendable) = (checkout) => apply(checkout)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:31:27 WAT 2022
                  SOURCE: /Users/abanda/khalif-natures-backend/app/views/emails/order.scala.txt
                  HASH: 58b5bb85de28cd735a410a21d08950ba62d026ab
                  MATRIX: 745->2
                  LINES: 21->2
                  -- GENERATED --
              */
          