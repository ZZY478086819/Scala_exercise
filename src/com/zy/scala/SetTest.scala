package com.zy.scala

object SetTest {
  def main(args:Array[String]):Unit = {
    val set1=Set(1,2,3,4)
    val set2=Set(3,4,5,6)
    //1.交集
    val set_temp1=set1.intersect(set2)
    println(set_temp1) //Set(3, 4)

    //2.并集
    val set_temp2=set1.union(set2)
    println(set_temp2) //Set(5, 1, 6, 2, 3, 4)

    //3.差集
    val set_temp3=set1.diff(set2)
    println(set_temp3) //Set(1, 2)
  }
}
