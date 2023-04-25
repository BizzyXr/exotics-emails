
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
/*1.2*/import play.twirl.api.Html

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.order.Checkout,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(checkout: models.order.Checkout):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html style="width:100%;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;">
 <head> 
  <meta charset="UTF-8"> 
  <meta content="width=device-width, initial-scale=1" name="viewport"> 
  <meta name="x-apple-disable-message-reformatting"> 
  <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
  <meta content="telephone=no" name="format-detection"> 
  <title>New Order</title>
  <!--[if (mso 16)]>
  """),_display_(/*15.4*/Html("""
    <style type="text/css">
    a {text-decoration: none;}
    </style>
  """)),format.raw/*19.7*/("""
    """),format.raw/*20.5*/("""<![endif]--> 
  <!--[if gte mso 9]><style>sup """),format.raw/*21.33*/("""{"""),format.raw/*21.34*/(""" """),format.raw/*21.35*/("""font-size: 100% !important; """),format.raw/*21.63*/("""}"""),format.raw/*21.64*/("""</style><![endif]--> 
  <!--[if !mso]><!- -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700,700i" rel="stylesheet"> 
  <!--<![endif]-->
  """),_display_(/*25.4*/Html("""
  <style type="text/css">
@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important } h1 { font-size:32px!important; text-align:center } h2 { font-size:26px!important; text-align:center } h3 { font-size:20px!important; text-align:center } h1 a { font-size:32px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class="gmail-fix"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:inline-block!important } .es-button { font-size:16px!important; display:inline-block!important; border-width:15px 30px 15px 30px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }
#outlook a {
	padding:0;
}
.ExternalClass {
	width:100%;
}
.ExternalClass,
.ExternalClass p,
.ExternalClass span,
.ExternalClass font,
.ExternalClass td,
.ExternalClass div {
	line-height:100%;
}
.es-button {
	mso-style-priority:100!important;
	text-decoration:none!important;
}
a[x-apple-data-detectors] {
	color:inherit!important;
	text-decoration:none!important;
	font-size:inherit!important;
	font-family:inherit!important;
	font-weight:inherit!important;
	line-height:inherit!important;
}
.es-desk-hidden {
	display:none;
	float:left;
	overflow:hidden;
	width:0;
	max-height:0;
	line-height:0;
	mso-hide:all;
}
  </style>
""")),format.raw/*64.5*/("""
 """),format.raw/*65.2*/("""</head> 
 <body style="width:100%;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;"> 
  <div class="es-wrapper-color" style="background-color:#EEEEEE;"> 
   <!--[if gte mso 9]>
			<v:background xmlns:v="urn:schemas-microsoft-com:vml" fill="t">
				<v:fill type="tile" color="#eeeeee"></v:fill>
			</v:background>
		<![endif]--> 
   <table class="es-wrapper" width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;"> 
     <tr style="border-collapse:collapse;"> 
      <td valign="top" style="padding:0;Margin:0;">
       <table class="es-content" cellspacing="0" cellpadding="0" align="center" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;"> 
         <tr style="border-collapse:collapse;"> 
          <td align="center" style="padding:0;Margin:0;"> 
           <table class="es-content-body" width="600" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;"> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="padding:0;Margin:0;padding-left:35px;padding-right:35px;padding-top:40px;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="center" style="Margin:0;padding-top:25px;padding-bottom:25px;padding-left:35px;padding-right:35px;"> <a target="_blank" href="https://www.brimweb.online/" style="-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;font-size:16px;text-decoration:none;color:#ED8E20;"> <img src="https://oebfe.stripocdn.email/content/guids/CABINET_824474e564556543a9b7eb24ead4dabd/images/67721544881386414.png" alt="" style="display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;" width="120"> </a> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="center" style="padding:0;Margin:0;padding-bottom:10px;"> <h2 style="Margin:0;line-height:36px;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;font-size:30px;font-style:normal;font-weight:bold;color:#333333;">New Order!</h2> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="padding:0;Margin:0;padding-top:15px;padding-bottom:20px;"> <p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#777777;text-align:center;">You just received a new order! Please respond to the client as soon as possible</p> </td> 
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
           </table> </td> 
         </tr> 
       </table> 
       <table class="es-content" cellspacing="0" cellpadding="0" align="center" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;"> 
         <tr style="border-collapse:collapse;"> 
          <td align="center" style="padding:0;Margin:0;"> 
           <table class="es-content-body" width="600" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;"> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="padding:0;Margin:0;padding-top:20px;padding-left:35px;padding-right:35px;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td bgcolor="#eeeeee" align="left" style="Margin:0;padding-top:10px;padding-bottom:10px;padding-left:10px;padding-right:10px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left"> 
                         <tr style="border-collapse:collapse;"> 
                          <td width="40%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Order Information</h4></td> 
                          <td width="60%" align="right" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Total items = """),_display_(/*117.240*/checkout/*117.248*/.cart.cartItems.size),format.raw/*117.268*/("""</h4></td>
                         </tr> 
                       </table> </td> 
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="padding:0;Margin:0;padding-top:20px;padding-left:35px;padding-right:35px;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td bgcolor="#eeeeee" align="left" style="Margin:0;padding-top:10px;padding-bottom:10px;padding-left:10px;padding-right:10px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left"> 
                         <tr style="border-collapse:collapse;"> 
                          <td width="40%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Item name</h4></td> 
                          <td width="40%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Quantities</h4></td> 
                          <td width="20%" align="right" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Total</h4></td> 
                         </tr> 
                       </table> </td> 
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="padding:0;Margin:0;padding-left:35px;padding-right:35px;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="Margin:0;padding-top:10px;padding-bottom:10px;padding-left:10px;padding-right:10px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left">
                           """),_display_(/*154.29*/for(index <- 0 until checkout.cart.cartItems.size) yield /*154.79*/{_display_(Seq[Any](format.raw/*154.80*/("""
                               """),format.raw/*155.32*/("""<tr style="border-collapse:collapse;">
                                   <td width="40%" align="left" style="padding:0;Margin:0;"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;"></p>"""),_display_(/*156.322*/checkout/*156.330*/.cart.cartItems(index).productName),format.raw/*156.364*/("""</td>
                                   <td width="40%" style="padding:0;Margin:0;padding-left:5px;" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*157.335*/checkout/*157.343*/.cart.cartItems(index).productQuantities),format.raw/*157.383*/("""</p></td>
                                   <td width="20%" style="padding:0;Margin:0;padding-left:5px;" align="right"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">$"""),_display_(/*158.337*/checkout/*158.345*/.cart.cartItems(index).productTotal),format.raw/*158.380*/("""</p></td>
                               </tr>
                           """)))}),format.raw/*160.29*/("""
                       """),format.raw/*161.24*/("""</table> </td> 
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="padding:0;Margin:0;padding-top:10px;padding-left:35px;padding-right:35px;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;border-top:3px solid #EEEEEE;border-bottom:3px solid #EEEEEE;" width="100%" cellspacing="0" cellpadding="0"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="Margin:0;padding-left:10px;padding-right:10px;padding-top:15px;padding-bottom:15px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left"> 
                         <tr style="border-collapse:collapse;"> 
                          <td width="80%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">TOTAL</h4></td> 
                          <td width="20%" style="padding:0;Margin:0;" align="right"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">$"""),_display_(/*178.227*/checkout/*178.235*/.cart.grandTotal),format.raw/*178.251*/("""</h4></td>
                         </tr> 
                       </table> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td bgcolor="#eeeeee" align="left" style="Margin:0;padding-top:10px;padding-bottom:10px;padding-left:10px;padding-right:10px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left"> 
                         <tr style="border-collapse:collapse;"> 
                          <td width="80%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Shipping Information</h4></td> 
                          <td width="20%" style="padding:0;Margin:0;"><h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;"><br></h4></td> 
                         </tr> 
                       </table> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="Margin:0;padding-left:5px;padding-right:5px;padding-top:10px;padding-bottom:10px;"> 
                       <table style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:500px;" class="cke_show_border" cellspacing="1" cellpadding="1" border="0" align="left"> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Name</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*196.318*/checkout/*196.326*/.shippingDetails.firstName),format.raw/*196.352*/("""  """),_display_(/*196.355*/checkout/*196.363*/.shippingDetails.lastName),format.raw/*196.388*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Email</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*200.318*/checkout/*200.326*/.shippingDetails.email),format.raw/*200.348*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Phone</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*204.318*/checkout/*204.326*/.shippingDetails.phone),format.raw/*204.348*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Country</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*208.318*/checkout/*208.326*/.shippingDetails.country),format.raw/*208.350*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">State/Provice/Region</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*212.318*/checkout/*212.326*/.shippingDetails.state),format.raw/*212.348*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">City</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*216.318*/checkout/*216.326*/.shippingDetails.city),format.raw/*216.347*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Postal/ZIP</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*220.318*/checkout/*220.326*/.shippingDetails.zip),format.raw/*220.346*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Street Address 1</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*224.318*/checkout/*224.326*/.shippingDetails.address1),format.raw/*224.351*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Street Address 2</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*228.318*/checkout/*228.326*/.shippingDetails.address2),format.raw/*228.351*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Contact Option</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*232.318*/checkout/*232.326*/.shippingDetails.contactOption),format.raw/*232.356*/("""</p></td>
                         </tr> 
                         <tr style="border-collapse:collapse;"> 
                          <td style="padding:5px 5px 0;Margin:0;" width="20%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">Payment Option</p></td> 
                          <td style="padding:5px 10px 0;Margin:0;" width="80%" align="left"><p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*236.318*/checkout/*236.326*/.shippingDetails.paymentOption),format.raw/*236.356*/("""</p></td>
                         </tr> 
                       </table></td> 
                     </tr> 

                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" style="Margin:0;padding-left:35px;padding-right:35px;padding-top:40px;padding-bottom:40px;"> 
               <!--[if mso]><table width="530" cellpadding="0" cellspacing="0"><tr><td width="255" valign="top"><![endif]--> 
               <table class="es-left" cellspacing="0" cellpadding="0" align="left" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td class="es-m-p20b" width="255" align="left" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="padding:0;Margin:0;padding-bottom:15px;"> <h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Delivery Address</h4> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="padding:0;Margin:0;padding-bottom:10px;"> <p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*256.314*/checkout/*256.322*/.shippingDetails.address1),format.raw/*256.347*/("""  """),_display_(/*256.350*/checkout/*256.358*/.shippingDetails.zip),format.raw/*256.378*/("""</p> <p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*256.608*/checkout/*256.616*/.shippingDetails.city),format.raw/*256.637*/("""</p> <p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*256.867*/checkout/*256.875*/.shippingDetails.state),format.raw/*256.897*/(""" """),format.raw/*256.898*/(""", """),_display_(/*256.901*/checkout/*256.909*/.shippingDetails.country),format.raw/*256.933*/("""</p> </td>
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> 
               <!--[if mso]></td><td width="20"></td><td width="255" valign="top"><![endif]--> 
               <table class="es-right" cellspacing="0" cellpadding="0" align="right" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="255" align="left" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="padding:0;Margin:0;padding-bottom:15px;"> <h4 style="Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;">Order Note</h4> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="left" style="padding:0;Margin:0;"> <p style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:16px;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;line-height:24px;color:#333333;">"""),_display_(/*270.294*/checkout/*270.302*/.shippingDetails.notes),format.raw/*270.324*/("""</p> </td>
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> 
               <!--[if mso]></td></tr></table><![endif]--> </td> 
             </tr> 
           </table> </td> 
         </tr> 
       </table> 
       <table class="es-content" cellspacing="0" cellpadding="0" align="center" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;"> 
         <tr style="border-collapse:collapse;"> 
          <td align="center" style="padding:0;Margin:0;"> 
           <table class="es-content-body" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#1B9BA3;" width="600" cellspacing="0" cellpadding="0" bgcolor="#1b9ba3" align="center"> 
             <tr style="border-collapse:collapse;"> 
              <td align="left" bgcolor="#cfe2f3" style="Margin:0;padding-top:35px;padding-bottom:35px;padding-left:35px;padding-right:35px;background-color:#CFE2F3;"> 
               <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                 <tr style="border-collapse:collapse;"> 
                  <td width="530" valign="top" align="center" style="padding:0;Margin:0;"> 
                   <table width="100%" cellspacing="0" cellpadding="0" style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;"> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="center" style="padding:0;Margin:0;padding-top:25px;"> <h2 style="Margin:0;line-height:29px;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;font-size:24px;font-style:normal;font-weight:bold;color:#FFFFFF;">Powered by</h2> </td> 
                     </tr> 
                     <tr style="border-collapse:collapse;"> 
                      <td align="center" style="padding:0;Margin:0;"> <a target="_blank" href="http://www.brimweb.online" style="-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'open sans', 'helvetica neue', helvetica, arial, sans-serif;font-size:16px;text-decoration:none;color:#ED8E20;"> <img class="adapt-img" src="https://oebfe.stripocdn.email/content/guids/CABINET_824474e564556543a9b7eb24ead4dabd/images/67721544881386414.png" alt="" style="display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;" width="264"> </a> </td> 
                     </tr> 
                   </table> </td> 
                 </tr> 
               </table> </td> 
             </tr> 
           </table> </td> 
         </tr> 
       </table> </td> 
     </tr> 
   </table> 
  </div>  
 </body>
</html>"""))
      }
    }
  }

  def render(checkout:models.order.Checkout): play.twirl.api.HtmlFormat.Appendable = apply(checkout)

  def f:((models.order.Checkout) => play.twirl.api.HtmlFormat.Appendable) = (checkout) => apply(checkout)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:58:41 WAT 2022
                  SOURCE: /Users/abanda/khalif-natures-backend/app/views/emails/order.scala.html
                  HASH: 2496c24bed1ebfaaba45d3f94651ad0b7d6aff40
                  MATRIX: 439->1|785->30|912->64|939->65|1587->687|1694->774|1726->779|1800->825|1829->826|1858->827|1914->855|1943->856|2139->1026|5261->4128|5290->4130|11370->10181|11389->10189|11432->10209|14810->13559|14877->13609|14917->13610|14978->13642|15367->14002|15386->14010|15443->14044|15812->14384|15831->14392|15894->14432|16269->14778|16288->14786|16346->14821|16453->14896|16506->14920|18330->16715|18349->16723|18388->16739|20713->19035|20732->19043|20781->19069|20813->19072|20832->19080|20880->19105|21664->19860|21683->19868|21728->19890|22512->20645|22531->20653|22576->20675|23362->21432|23381->21440|23428->21464|24227->22234|24246->22242|24291->22264|25074->23018|25093->23026|25137->23047|25926->23807|25945->23815|25988->23835|26783->24601|26802->24609|26850->24634|27645->25400|27664->25408|27712->25433|28505->26197|28524->26205|28577->26235|29370->26999|29389->27007|29442->27037|31225->28791|31244->28799|31292->28824|31324->28827|31343->28835|31386->28855|31645->29085|31664->29093|31708->29114|31967->29344|31986->29352|32031->29374|32062->29375|32094->29378|32113->29386|32160->29410|33598->30819|33617->30827|33662->30849
                  LINES: 17->1|22->3|27->4|28->5|38->15|42->19|43->20|44->21|44->21|44->21|44->21|44->21|48->25|87->64|88->65|140->117|140->117|140->117|177->154|177->154|177->154|178->155|179->156|179->156|179->156|180->157|180->157|180->157|181->158|181->158|181->158|183->160|184->161|201->178|201->178|201->178|219->196|219->196|219->196|219->196|219->196|219->196|223->200|223->200|223->200|227->204|227->204|227->204|231->208|231->208|231->208|235->212|235->212|235->212|239->216|239->216|239->216|243->220|243->220|243->220|247->224|247->224|247->224|251->228|251->228|251->228|255->232|255->232|255->232|259->236|259->236|259->236|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|279->256|293->270|293->270|293->270
                  -- GENERATED --
              */
          