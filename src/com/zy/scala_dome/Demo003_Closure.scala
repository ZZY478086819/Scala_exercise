package com.zy.scala_dome

/**
  * 作者： 马中华   https://blog.csdn.net/zhongqi2513
  * 时间： 2017/7/16 13:11
  *
  * 描述： Scala编程语言的闭包测试
  */
object Demo003_Closure {

  def main(args: Array[String]): Unit = {

    val result = bibao
    result(2)
    result(2)
    result(2)
    result(2)
  }

  val bibao = {
    var sum = 0
    val add_sum = (x:Int) => {
      sum += x
      println(sum)
    }
    add_sum
  }
}
