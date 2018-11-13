package com.zy.scala

object ClosureTest {
  def main(args: Array[String]): Unit = {
    //定义一个方法
    def bibao()={
      //方法中的变量
      var num:Int = 0
      //定义一个函数，用add接收
      val add=(x:Int) => {
        num+=x
        num
      }
      //方法的返回值为这个函数
      add
    }
    val result=bibao()
    println(result(1))  //1
    println(result(2))  //3
    println(result(3))  //6
    /**
      * 通过上面的案例我们了解到：
      * 每一次在调用result实际上是调用bibao方法中的add函数，
      * 然后对bibao方法中的num变量进行叠加，实现了使用另一个函数，访问其他方法中的局部变量
      * 的功能，这个就是闭包
      */

  }
}
