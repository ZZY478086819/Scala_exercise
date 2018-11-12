package com.zy.scala

trait TraitTest01 {
  val id:Int
  val name="zs"
  def delete()
  def add(address:String):String ={
    println(name)
    address
  }
}
trait TraitTest02{
  val name:String
  def update(num1:String,num2:String):Boolean
}
class TraitTest extends TraitTest01 with TraitTest02{
   val id: Int = 18

  override def delete(): Unit = {}
  override def update(num1: String, num2: String): Boolean = {
    true
  }
}

