package io.strongtyped.funcqrs.akka

import io.strongtyped.funcqrs.{ AggregateAliases, AggregateLike }

trait AutoGeneratedAggregateId {
  this: AggregateManager =>

  def generateId(): Id

  override def processCreation: Receive = {
    case cmd: Command => processAggregateCommand(generateId(), cmd)
  }
}
