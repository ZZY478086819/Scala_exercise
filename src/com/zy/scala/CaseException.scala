package com.zy.scala
import java.io.IOException

object CaseException {
  def main(args: Array[String]): Unit = {
    try{
      println(3/0)
      throw new IOException("异常")
    }catch{
      case e:IOException =>println("IOException")
      case e:Exception=>println("Exception")
    }finally {
      println("程序结束！")
    }
  }
}
