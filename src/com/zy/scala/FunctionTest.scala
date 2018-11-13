package com.zy.scala

object FunctionTest {
  def main(args: Array[String]): Unit = {
    /**
      * 1.高阶函数的写法
      */
    //(1)函数作为参数
    def sum1(f:(Int,Int)=>Int,x:Int,y:Int):Int ={
      f(x,y)
    }
    //(2)函数作为返回值
    def sum2(x:Int) = {
      (y:Int) => x+y
    }

    /**
      * 1.柯里化
      * 2.隐式参数的函数
      */
    //(1)柯里化写法
    def sum3(x:Int)(y:Int)= x+y
    //(2)隐式参数的函数
    def sum4(x:Int)(implicit y:Int =10) =x+y


    //普通函数传参
    def func1(x:Int,y:Int) = x+y
    println(func1(1,2))

    //高阶函数传入参数
    def func2(x:Int) = (y:Int) => x+y
    val func22=func2(5)
    println(func22(6))
    println(func2(5)(6))

    //高阶函数改写成柯里化方式传入参数
    def func3(x:Int)(y:Int) = x+y
    println(func3(5)(6))
    val func33=func3(3) _
    println(func33(6))

    /**
      * 高阶函数是分布式调用的。如果第一个调用完成之后，得到一个函数进行了多次的重复调用，
      * 其实这个第一步调用的时候传入的参数就可以作为默认参数值
      */
    def func4(x:Int)(y:Int =10) =x+ y  //y有默认的值
    //调用时，必须使用()()
    println(func4(5)())
    //下面的方式，默认值将会被覆盖
    println(func4(5)(5))

    //使用隐式参数
//    def func5(x:Int)(implicit y:Int = 10) = x+y
    //调用时：只需要传入一个参数即可
//    println(func5(5))


    /**
      * 如果在某个方法的定义中，有某个参数使用了implicit修饰：
      * 1.如果代码运行的全局环境中不存在一个同类型的隐式变量，而且调用的时候，也没有参入参数，
      * 那么就使用方法定义的时候所指定的隐式变量值
      * def sum(x:Int)(implicit y:Int =5) = x+y
      * println(sum(5))
      *
      * 2.如果全局环境中，存在一个同类型的隐式变量，那么这个全局的隐式变量值会替换方法定义中指定
      * 的默认的隐式变量值
      * implicit val abc:Int =6
      * def sum(x:Int)(implicit y:Int =5) = x+y   y的值会被替换成6
      *
      * 3.可以忽略所有的隐式变量值，可以由用户直接传入新的参数
      * 如果这样做，那么所有的隐式变量值，全部不生效
      * implicit val abc:Int =6
      * def sum(x:Int)(implicit y:Int =5) = x+y
      *  println(sum(5)(7))  忽略所有的隐式变量
      */
    implicit val abc:Int =6
   // implicit val aaa:Int =6
    def sum(x:Int)(implicit y:Int =5) = x+y
    println(sum(5))  //打印11

  }
}
