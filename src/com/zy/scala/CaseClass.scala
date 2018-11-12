package com.zy.scala

import scala.util.Random

object CaseDemo04 extends App{
  val arr = Array(CheckTimeOutTask, HeartBeat(123), SubmitTask("0001", "task1"))
  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(id + "---" + name)
    }
    case HeartBeat(time) =>{
      println(time)
    }
    case CheckTimeOutTask =>{
      println("check")
    }
  }
}
//多例样例类
case class SubmitTask(id: String, name: String)
//多例样例类
case class HeartBeat(time: Long)
//单例样例类
case object CheckTimeOutTask
