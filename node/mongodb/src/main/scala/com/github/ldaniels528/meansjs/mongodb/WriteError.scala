package com.github.ldaniels528.meansjs.mongodb

import scala.scalajs.js

/**
  * Write Error
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait WriteError extends js.Object {
  /** Write concern error code */
  var code: Integer = js.native

  /** Write concern error original bulk operation index. */
  var index: Integer = js.native

  /** Write concern error message. */
  var errmsg: String = js.native

}
