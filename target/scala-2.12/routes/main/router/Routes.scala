// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abanda/Desktop/pons-projects/colorado-shop-api/conf/routes
// @DATE:Sat Dec 24 11:01:25 WAT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ApiHelpController_2: controllers.ApiHelpController,
  // @LINE:9
  ApplicationController_1: controllers.ApplicationController,
  // @LINE:13
  OrderController_3: controllers.OrderController,
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ApiHelpController_2: controllers.ApiHelpController,
    // @LINE:9
    ApplicationController_1: controllers.ApplicationController,
    // @LINE:13
    OrderController_3: controllers.OrderController,
    // @LINE:19
    Assets_0: controllers.Assets
  ) = this(errorHandler, ApiHelpController_2, ApplicationController_1, OrderController_3, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApiHelpController_2, ApplicationController_1, OrderController_3, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/checkout""", """controllers.OrderController.checkout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/contact""", """controllers.OrderController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ApiHelpController_getResources0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources0_invoker = createInvoker(
    ApiHelpController_2.getResources,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      this.prefix + """swagger.json""",
      """ Swagger API""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index1_invoker = createInvoker(
    ApplicationController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_OrderController_checkout2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/checkout")))
  )
  private[this] lazy val controllers_OrderController_checkout2_invoker = createInvoker(
    OrderController_3.checkout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "checkout",
      Nil,
      "POST",
      this.prefix + """api/v1/checkout""",
      """ Order""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:16
  private[this] lazy val controllers_OrderController_contact3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/contact")))
  )
  private[this] lazy val controllers_OrderController_contact3_invoker = createInvoker(
    OrderController_3.contact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "contact",
      Nil,
      "POST",
      this.prefix + """api/v1/contact""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ApiHelpController_getResources0_route(params@_) =>
      call { 
        controllers_ApiHelpController_getResources0_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:9
    case controllers_ApplicationController_index1_route(params@_) =>
      call { 
        controllers_ApplicationController_index1_invoker.call(ApplicationController_1.index)
      }
  
    // @LINE:13
    case controllers_OrderController_checkout2_route(params@_) =>
      call { 
        controllers_OrderController_checkout2_invoker.call(OrderController_3.checkout)
      }
  
    // @LINE:16
    case controllers_OrderController_contact3_route(params@_) =>
      call { 
        controllers_OrderController_contact3_invoker.call(OrderController_3.contact)
      }
  
    // @LINE:19
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
