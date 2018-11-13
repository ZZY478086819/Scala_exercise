package com.zy.scala

object WordCount {
  def main(args:Array[String]): Unit ={
    //定义一个数组
    val arr=Array("zzy,zs,ww,zl","zy,jj,ww,cl","zzy,jj,ww","jj,cl,ww")
    //1.第一步，将数组中的每一个元素按，切分
    val arraytotuple = arr.map(line=>line.split(","))
    println(arraytotuple.mkString(" ")) //((zzy,zs,ww,zl),(zy,jj,ww,cl),(zzy,jj,ww),(jj,cl,ww))
    //2.将数组元素为元组的，数组，压平成一个全是字符串的数组
    val arr2=arraytotuple.flatten
    println(arr2.mkString(" ")) //zzy zs ww zl zy jj ww cl zzy jj ww jj cl ww
    //对数组元素进行分类输出
    val arr3=arr2.map(x=>(x,1))
    println(arr3.mkString(" ")) //(zzy,1) (zs,1) (ww,1) (zl,1) (zy,1) (jj,1) (ww,1) (cl,1) (zzy,1) (jj,1) (ww,1) (jj,1) (cl,1) (ww,1)
    //4.将元素进行分组
    val map=arr3.groupBy(x=>x._1) //map(ww,(1,1,1,1)),(zzy,(1,1))....
    println(map) //
    //5.对每个分组的元素进行聚合
    val result  = map.map(x=>(x._1,x._2.length))
    println(result) //map(ww -> 4, zzy -> 2, zy -> 1, zl -> 1, zs -> 1, cl -> 2, jj -> 3)


    //第二种方法
    val tupleToInt = arr.map(x=>x.split(",")).flatten.map(x=>(x,1)).groupBy(x=>x).map(x=>(x._1,x._2.length))
    println(tupleToInt.toArray.sortWith((x,y)=>x._2>y._2).reverse)
  }
}