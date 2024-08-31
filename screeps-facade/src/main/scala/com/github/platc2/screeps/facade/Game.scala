package com.github.platc2.screeps.facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
object Game extends js.Object {

  def constructionSites: Map[String, Any] = js.native

  def cpu: CPU = js.native

  def creeps: js.Dictionary[Creep] = js.native

  def spawns: js.Dictionary[StructureSpawn] = js.native

  def time: Int = js.native
}
