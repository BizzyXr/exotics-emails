// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abanda/Desktop/pons-projects/colorado-shop-api/conf/routes
// @DATE:Sat Dec 24 11:01:25 WAT 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:6
  class ReverseApiHelpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def getResources(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "swagger.json")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def checkout(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/checkout")
    }
  
    // @LINE:16
    def contact(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/contact")
    }
  
  }


}
