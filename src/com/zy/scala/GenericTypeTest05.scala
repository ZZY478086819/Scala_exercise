package com.zy.scala

import java.util

object GenericTypeTest05 {
  def main(args: Array[String]): Unit = {
    var list1: MyList[Parents] = new MyList(new Parents)
    var list2: MyList[Son] = new MyList(new Son)
    list2=list1
  }
}
class Parents {}
class Son extends Parents {}
class MyList[-T](ele: T) {}