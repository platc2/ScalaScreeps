package com.github.platc2.screeps.facade

import scala.scalajs.js

@js.native
trait CPU extends js.Object {

  def limit: Int = js.native

  def tickLimit: Int = js.native

  def bucket: Int = js.native

  def shardLimits: Int = js.native

  def unlocked: Boolean = js.native

  def unlockedTime: js.UndefOr[Int] = js.native
}
