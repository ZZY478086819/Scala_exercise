package com.zy.scala

trait MyLogger{
  def log(message:String){}
}
trait Logger_A extends MyLogger{
  override def log(message:String)={
    println("test:"+message)
  }
}
trait Logger_B extends MyLogger{
  override def log(message:String)={
    println("log:"+message)
  }
}
class Mysql(name:String) extends  Logger_A{
  def sayLog()={
    println("mysql")
    log("mysql")
  }
}

class TraitTest03 {
  def main(args: Array[String]): Unit = {
  var mysql01 =new Mysql("tomcat")
    mysql01.sayLog()
    val mysql02=new Mysql("apache") with Logger_B
    mysql02.sayLog()
  }
}

