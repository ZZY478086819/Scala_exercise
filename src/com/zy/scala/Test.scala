package com.zy.scala

class Test {
  def main(args: Array[String]): Unit = {
    //定义一个父类
    var per = new Person
    //定义一个子类
    var emp = new Employee
    //父类引用指向子类对象
    var emp2: Person = new Employee

    //类型判断
    println(emp.isInstanceOf[Person])
    //类型获取
    println(classOf[Person])
    //类型转换
    println(emp2.asInstanceOf[Employee])
  }
}
//定义一个父类
class Person {
  var name = "zs"
  var age = 15

  def run() = {
    println("running")
  }
}
class Employee extends Person {
  var salary = 10000

  //Scala 中，如果子类要重写一个父类中的非抽象方法，则必须使用 override 关键字
  override def run(): Unit = {
    //可以使用 super 关键字，显式地指定要调用父类的方法
    super.run()
    println("hadppy runnging!")
  }
}