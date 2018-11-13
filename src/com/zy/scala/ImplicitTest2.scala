package com.zy.scala

import java.io.File

import scala.io.Source


class ImplicitTest2 {
  def main(args: Array[String]): Unit = {
    //导入MyFile的任意方法
    import MyFile._
    var file:File=new File("c:/word.txt")
    //调用了file没有的readAll发生了隐式转化
    val content = file.readAll()
  }
}
object MyFile{
  //将File转换为RichFile
  implicit def m1(file:File):RichFile = new RichFile(file)
}
class RichFile(file:File){
  def readAll():String={
    Source.fromFile(file).mkString
  }
}
