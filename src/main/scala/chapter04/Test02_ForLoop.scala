package chapter04

import scala.language.postfixOps

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for 语法：for(int i = 0; i < 10; i++) { System.out.println(i + ". hello world"); }

    // 1. 范围遍历(从范围中取值赋值给当前的循环变量i)
    // 1 to 10 表示1和10都包含
    // 默认步长是1
    for (i <- 1 to 10) {
      println(i + ". hello world")
    }
    // 本质上是使用方法调用的方式
    // Int类型对象1调用了to()方法
    // 省略点.，中间空一格，空一格再写参数，如果只有一个参数，括号也可以省略
    // 隐式转换: 如果写的代码能直接调用Int里面的方法就直接调用，如果Int里面没有to这个方法，不能调用，
    // 那么编译器就会自动找到有关的隐式定义里面看，能不能把这个Int做一个包装转换调用对应的to()方法
    // 这里最终调用的是RichInt中的to()方法，最终返回得到的是一个Range.Inclusive
    for (i: Int <- 1.to(10)) {
      println(i + ". hello world")
    }

    println("=" * 30)
    // 不包含右边端点
    /*for (i <- Range(1, 10)) {
      println(i + ". hello world")
    }*/
    // 不包邮右边端点
    for (i <- 1 until 10) {
      println(i + ". hello world")
    }

    println("=" * 30)

    // 2. 集合遍历
    for (i <- Array(12, 34, 53)) {
      println(i)
    }
    for (i <- List(12, 34, 53)) {
      println(i)
    }
    for (i <- Set(12, 34, 53)) {
      println(i)
    }

    println("=" * 30)

    // 3. 循环守卫
    /*for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }*/
    // 将for循环中的判断提取到推导式中，等同上面的写法，省略掉了continue关键字
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    println("=" * 30)

    // 4. 循环步长
    // 从1到10，步长为2，即取到所有奇数
    // by是Range中的方法
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    println("*" * 30)

    for (i <- 13 to 30 by 3) {
      println(i)
    }

    println("*" * 30)

    // 倒序遍历
    for (i <- 30 to 13 by -2) {
      println(i)
    }

    println("*" * 30)

    // 10 到 1，每次-1
    for (i <- 10 to 1 by -1) {
      println(i)
    }

    println("*" * 30)

    // reverse 表示反转的含义
    // Range.Inclusive(last, start, -step)
    for (i <- 1 to 10 reverse) {
      println(i)
    }

    println("*" * 30)

    // error step cannot be 0. step不能为0
    /*for (i <- 30 to 13 by 0) {
      println(i)
    }*/

    // 步长给浮点数
    // 有可能存在精度缺失 推荐使用BigDecimal
    for (data <- 1.0 to 10.0 by 0.3) {
      println(data)
    }

    println("*" * 30)

    // 5. 循环嵌套
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        print("i = " + i + ", j = " + j + "\t")
      }
      println()
    }

    println("*" * 30)

    // 体现i和j的同等地位
    // 两个维度的遍历
    for (i <- 1 to 4; j <- 1 to 5) {
      println("i = " + i + ", j = " + j + "\t")
    }

    println("*" * 30)


  }
}
