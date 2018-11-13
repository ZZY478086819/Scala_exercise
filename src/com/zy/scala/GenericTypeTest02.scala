package com.zy.scala

object GenericTypeTest02 {
  def main(args: Array[String]): Unit = {
    var generic=new Generic1
    val result = generic.compare[String]("zs","ww")
    println(result)
  }
}
class Generic1{
  /**
    * 当调用泛型的方法是，但是不知道这个泛型是否有这个方法，
    * 此时使用泛型的类型变量界定，缩写范围，使得，泛型中有这个方法
    * T<:Comparable[T]：表示T是Comparable本身或者子类
    */
  def compare[T<:Comparable[T]](first:T,second:T)={
    if(first.compareTo(second)>0){
      0
    }else{
      1
    }
  }
}
