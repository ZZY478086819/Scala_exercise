package com.zy.scala_dome

case class Student1234[T,S <% Comparable[S]](var name:T,var height:S)

/**
  * 作者： 马中华：http://blog.csdn.net/zhongqi2513
  */
object GenericTypeTest3{

  def main(args: Array[String]): Unit = {

    // 这是合法的语句
    val s= Student1234("john","170")
    println(s.name, s.height)

    //下面这条语句不合法，这是因为,Int类型没有实现Comparable接口
    val s2= Student1234("john",170)
    println(s2.name, s2.height.isInstanceOf[Int])
  }
}
