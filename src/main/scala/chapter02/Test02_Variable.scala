package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a: Int = 10

    // (1) 声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    // 定义一个常量
    val b1 = 23

    // (2) 类型确定后，就不能修改，说明Scala是强数据类型语言
    // a2的类型为Int
    var a2 = 15
    // 将String类型的值赋给Int类型的变量是不行的
    // a2 = "hello"

    // (3) 变量声明时，必须要有初始值
    // 以下未负值是错误的
    // var a3: Int

    // (4) 在声明/定义一个变量时，可以使用var或者val来修改，var修饰的变量可以改变，val修饰的变量不可改变。
    a1 = 12
    // b1是常量无法进行修改
    // b1 = 25

    // 对于引用数据类型
    val alice = new Student("alice", 20)
    // 因为alice是一个常量，无法修改值，以下赋值代码错误
    // alice = new Student("Alice", 20)

    var mary = new Student("mary", 25)
    mary = new Student("Mary", 25)
    // var类型的变量可以直接修改
    mary = null

    // bob是一个引用类型，其指向的对象不能变(即指向的地址不变)，但是这个对象的属性是可以变的(指向另外的地址)，具体需要看这个属性是val类型(不可变)还是var类型(可变)
    val bob = new Student("bob", 20)
    bob.age = 24
    bob.printInfo()
    // 无法直接修改bob
    // bob = new Student("bob", 24)
  }
}
