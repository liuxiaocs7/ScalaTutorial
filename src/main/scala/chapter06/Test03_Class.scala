package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()
    // private私有的属性name访问不到
    // println(student.name)
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性
  // 前面如果不加修饰符默认就是public公有的(类、属性、方法)
  // Scala底层将属性确实是包装成private私有的
  private val name: String = "alice"

  // 初始值为0
  @BeanProperty
  var age: Int = _

  // 当前定义的sex初始值为空，可变类型var，初始值为null
  var sex: String = _
}
