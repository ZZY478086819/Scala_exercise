package com.zy.scala

object GenericTypeTest03 {
  def main(args: Array[String]): Unit = {
    var ann1 = new Animals("zs", "18")
    var ann2 = new Animals("zs", 18)

  }
}
case class Animals[T, S <% Comparable[S]](var name: T, var age: S)
