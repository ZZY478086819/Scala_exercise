package com.zy.scala

class ObjectAndClass {
  def main(args: Array[String]): Unit = {
    //创建一个类的实例
    val ann1=new Annimal
    //创建一个单例
    val ann2=Annimal
    //类调用成员变量和属性必须通过实例对象
    ann1.name
    ann1.running()
    //单例调用成员变量和属性,直接使用类名调用。
    Annimal.address
  }
}

//一个伴生类
class Annimal{
   var name="zs"
   val age =18
  private[this] val country="China"
   def running(): Unit ={
    println("runing...")
  }
}
//Annimal的伴生对象
object Annimal{
  var address="beijing"
  def main(args:Array[String]):Unit={
  }
}
