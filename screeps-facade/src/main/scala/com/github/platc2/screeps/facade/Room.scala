package com.github.platc2.screeps.facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Room extends js.Object {

  @JSName("find")
  def find_(`type`: Int): js.Array[js.Any] = js.native
}

object Room {
  extension (room: Room) {
    def find[T](`type`: Int): js.Array[T] = room.find_(`type`)
      .map(_.asInstanceOf)
  }
}
