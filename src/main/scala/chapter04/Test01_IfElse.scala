package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    // 1. 单分支
    if (age >= 18) {
      println("成年")
    }
    println("=" * 20)

    // 2. 双分支
    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }
    println("=" * 20)

    // 3. 多分支
    if (age <= 6) {
      println("童年")
    } else if (age < 18) {
      println("青少年")
    } else if (age < 35) {
      println("青年")
    } else if (age < 60) {
      println("中年")
    } else {
      println("老年")
    }
    println("=" * 20)

    // 分支语句的返回值
    // 每个分支中定义想要返回的值
    // 这里返回值是String，就表示一定需要返回值
    val result: String = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      "青年"
    } else if (age < 60) {
      println("中年")
      "中年"
    } else {
      println("老年")
      "老年"
    }
    println("result: " + result)

    println("=" * 20)
    // 不需要返回值，即使最后一行是String也不影响
    val result1: Unit = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      "青年"
    } else if (age < 60) {
      println("中年")
      "中年"
    } else {
      println("老年")
      "老年"
    }
    // ()
    println("result1: " + result1)

    println("=" * 20)
    // 多个分支中返回不同的类型
    // String: 引用类型
    // Int: 值类型
    // 因此需要使用一个公共的Any作为整体返回值类型
    val result2: Any = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      "青年"
    } else if (age < 60) {
      println("中年")
      age
    } else {
      println("老年")
      age
    }
    println("result2: " + result2)

    // Java中三元运算符 a ? b : c  String res = (age >= 18) ? "成年" : "未成年";
    val res: String = if (age >= 18) {
      "成年"
    } else {
      "未成年"
    }
    println("=" * 20)

    // 进一步缩减
    // 如果{}中只有一行代码就可以省略并且Scala中可以将所有代码写在同一行
    val res1 = if (age >= 18) "成年" else "未成年"
    println(res1)

    println("=" * 20)
    // 5. 嵌套分支
    if (age >= 18) {
      println("成年")
      if (age >= 35) {
        if (age >= 60) {
          println("老年")
        } else {
          println("中年")
        }
      } else {
        println("青年")
      }
    } else {
      println("未成年")
      if(age <= 6) {
        println("同年")
      } else {
        println("青少年")
      }
    }
  }
}
