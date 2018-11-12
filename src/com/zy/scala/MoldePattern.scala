package com.zy.scala

import scala.util.Random


object MoldePattern {
  def main(args: Array[String]): Unit = {
    //匹配字符串
    val arr1 = Array("aa", "bb", "cc", "dd")
    val value1 = arr1(Random.nextInt(arr1.length))
    value1 match {
      case "aa" => println("1")
      case "bb" => println("2")
      case "cc" => println("3")
      case "dd" => println("4")
      case _ => println("nothing")
    }
    //匹配类型
    val arr2=Array(1,2,"aaa",true,2.0)
    val value2 = arr2(Random.nextInt(arr2.length))
    value2 match{
      case x:Int =>println("int")
      case y:Boolean =>println("Boolean")
      case z:Double =>println("Double")
      case _:Boolean =>println("nothin")
    }
    //匹配数组
    val arr3=Array(0,1,2,3,4,5)
    arr3 match{
      case Array(0,x,y) =>println(x+"--"+y) //匹配以0开头，后面两个元素的数组
      case Array(0) =>println(0)    //匹配只有一个元素的数组
      case Array(0,_*) =>println(0)  //匹配以0开头的数组,_表示任意元素，*表示一到多个元素
      case _ =>println("nothing")
    }
    //匹配序列
    val lst1=List(3,1,-1)
    lst1 match{
      case 0::Nil =>println("only 0")  //匹配只有一个元素0的序列
      case x::y::Nil =>println(x+"---"+y)  //匹配有两个元素的序列
      case x::tail =>println("0...")  //匹配以0开头的序列
      case _ =>println("nothing")
    }
    //匹配元组
    val tup=(2,3,5)
    tup match{
      case (1,x,y) =>println(x+"---"+y)
      case (_,z,5) =>println(z+"---")
      case _ =>println("nothing")
    }
  }
}
