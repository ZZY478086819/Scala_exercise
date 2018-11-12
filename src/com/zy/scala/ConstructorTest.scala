package com.zy.scala

class ConstructorTest {
  def main(args:Array[String]):Unit= {

  }
}

/**
  *主构造器：在类上定义的构造器称为主构造器
  *1.主构造器包含了整个所有的类的代码块，所以，默认的定义的类中的所有能执行的代码都会执行
  *2.主构造器中的参数如果没有使用任何修饰符，默认的就是 private[this] val
  *3.主构造器中的参数如果使用val或者var修饰，就相当于一个普通的成员变量
  *4.私有化主构造器：class private Student(),这样的话，就不能创建外部实例，但是使用伴生对象可以，
  * 如果想让伴生对象都不能创建该类的实例，可以使用：class private[this] Student{}
  */
class HH(val name:String,val age:Int){
  /**
    *这里是辅助构造器：
    * 1.当主构造器被class private Student()修饰了，可以使用辅助构造器创建该类对象
    * 2.辅助构造器必须使用def修饰，并且方法名为this。
    * 3.辅助构造器中的参数不能使用var或者val 修饰
    * 4.辅助构造器中的第一行代码必须是：调用其他的构造器
    */
 // def this(name:String,age:Int){
   // this(name,age)
  //}
}
