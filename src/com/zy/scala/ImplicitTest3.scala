package com.zy.scala

object ImplicitTest3 {
  def main(args: Array[String]): Unit = {
    import ObjectImplicit._
    def m1(worker: Worker) = println("person:" + worker.name)
    m1(new Older("older"))
    m1(new Worker("worker"))
    m1(new Adult("adult"))
    m1(new Young("young"))
  }
}

class Older(val name: String)

class Young(val name: String)

class Worker(val name: String)

class Adult(val name: String)

object ObjectImplicit {
  implicit def objectworker(obj: AnyRef): Worker = {
    if (obj.getClass == classOf[Older]) {
      val old = obj.asInstanceOf[Older]
      new Worker(old.name)
    } else if (obj.getClass == classOf[Young]) {
      val young = obj.asInstanceOf[Young]
      new Worker(young.name)
    } else if (obj.getClass == classOf[Adult]) {
      val adult = obj.asInstanceOf[Adult]
      new Worker(adult.name)
    }else{
      new Worker("Null")
    }

  }
}