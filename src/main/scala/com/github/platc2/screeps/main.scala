package com.github.platc2.screeps

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("loop")
def loop(): Unit = {

  val spawn = facade.Game.spawns("Spawn1")
  facade.Game.creeps.foreach((_, creep) => {
    creep.memory.tick = facade.Game.time
    if (creep.store.getFreeCapacity().get > 0) {
      val sources = creep.room.find[facade.Source](facade.Constants.FIND_SOURCES)
      if (creep.harvest(sources(0)) == facade.Constants.ERR_NOT_IN_RANGE) {
        creep.moveTo(sources(0))
      }
    } else {
      if (creep.transfer(spawn, facade.Constants.RESOURCE_ENERGY) == facade.Constants.ERR_NOT_IN_RANGE) {
        creep.moveTo(spawn)
      }
    }
  })
}
