package com.github.platc2.screeps.facade

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@js.native
trait Store extends js.Object {

  def getFreeCapacity(resource: String): UndefOr[Int] = js.native

  def getFreeCapacity(): UndefOr[Int] = js.native
}
