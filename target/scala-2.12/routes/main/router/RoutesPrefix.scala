// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abanda/Desktop/pons-projects/colorado-shop-api/conf/routes
// @DATE:Sat Dec 24 11:01:25 WAT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
