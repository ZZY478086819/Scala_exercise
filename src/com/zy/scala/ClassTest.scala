package com.zy.scala

object ClassTest {

}

//定义一个类
class Student {
  //使用var修饰的表示可变的成员变量
  var name = "zy"
  //使用val修饰的表示不可变的成员变量
  val id = 1001

  //被private 修饰的表示只能在本类中访问变量（有例外：伴生对象仍然可以访问）
  private var age = 10

  //被private[this]修饰的表示只能在本类中访问变量，伴生对象也不能访问
  private[this] var country = "China"

  //定义一个成员方法
  def runing():Unit = {println("runing...")}
}
