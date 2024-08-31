package com.github.platc2.screeps.facade

import scala.scalajs.js

@js.native
trait Creep extends RoomObject {

  def memory: Memory = js.native

  def store: Store = js.native

  def harvest(target: Source): Int = js.native

  def moveTo[T](target: T): Int = js.native

  def transfer(traget: Structure, resourceType: String): Int = js.native

  def transfer(traget: Structure, resourceType: String, amount: Int): Int = js.native
}
