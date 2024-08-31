package com.github.platc2.screeps.facade

import scala.scalajs.js

@js.native
trait RoomPosition extends js.Object {

  val x: Int = js.native
  val y: Int = js.native
  val roomName: String = js.native
}
