package com.github.platc2.screeps.facade

import scala.scalajs.js

@js.native
trait StructureSpawn extends Structure {

  def store: Store = js.native

  def spawnCreep(body: js.Array[String], name: String): Int = js.native
}
