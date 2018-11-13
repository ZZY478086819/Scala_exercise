package com.zy.scala

object ImplicitTest1 {
  def main(args: Array[String]): Unit = {
    def m1(x:Int,y:Int):Int ={
      x+y
    }
    //println(m1(2.0,3.2))  这句话在执行的时候报错。
    implicit  def m2(x:Double) = x.toInt
    println(m1(2.0,3.2))

    implicit val num=5
    //implicit val nums=5  如果在定义一个相同类型的隐式参数，此时会报错
    //定义一个带有隐式参数的方法
    def f1(x:Int)(implicit y:Int = 10)= {
      x+y
    }
    println(f1(1))  //打印6，并且此时方法只需要参入一个参数即可
  }
}
