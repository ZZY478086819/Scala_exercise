package com.zy.scala

object OptionDeom {
  def main(args: Array[String]): Unit = {
    val map=Map("name"->"zs","age"->18,"address"->"beijing")
    val v=map.get("name")
    val reslut=v match{
      case Some(i) => i
      case None => 0
    }
    println(reslut)
    //上述方式可以使用其他方法代替
    val id = map.getOrElse("id",0)
    println(id)
  }

  //普通的模式匹配
  def func2(name:String) ={
    name match{
      case "zs" =>18
      case "ls"=>18
      case "ww"=>20
      case _ =>100
    }

    /**
      * 偏函数：
      * func1:PartialFunction[input,output]
      * input:表示输入类型
      * output：输出的类型
      */
    def func1:PartialFunction[String,Int] = {
      case "zs" =>18
      case "ls"=>18
      case "ww"=>20
      case _ =>100
    }
  }
}
