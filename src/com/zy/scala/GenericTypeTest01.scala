package com.zy.scala

import com.zy.scala_dome.Student11

object GenericTypeTest01 {
  def main(args: Array[String]): Unit = {
    println(new Student11[String,Int]("黄渤",33).name)
    println(new Student12[String,Int]("zs",18).name)
    println(new Student22[String,Int]("zs",8).age)
  }
}
class Student12[T,S](var name:T,var age:S){}
class Student11[T,S](var name:T, var age:S){}
class Person11[T](var name:T)
class Student22[T,S](name:T,var age:S) extends Person11(name) {}

