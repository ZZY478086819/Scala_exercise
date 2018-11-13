package com.zy.scala_dome

/**
  * 作者： 马中华：http://blog.csdn.net/zhongqi2513
  */
object Demo013_GenericType_XiaJie {

  def getIDCard[R >: Son](person:R): Unit ={
    println("好吧，他的身份证就交给你保管了");
  }

  def main(args: Array[String]): Unit = {

    getIDCard[GranderFather](new GranderFather)
    getIDCard[Father](new Father)
    getIDCard[Son](new Son)

    // 这句代码会报错
//    getIDCard[Tongzhuo](new Tongzhuo)
  }
}


class GranderFather
class Father extends GranderFather
class Son extends Father
class Tongzhuo