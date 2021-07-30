package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    // (1) 可变参数
    // 如果可以有多个，在参数类型后面添加星号*
    def f1(str: String*): Unit = {
      println(str)
    }
    // WrappedArray(alice)，WrappedArray(aaa, bbb, ccc)
    // Scala中一个抽象的集合类型；使用包装起来的数组来接收
    f1("alice")
    f1("aaa", "bbb", "ccc")

    // (2) 如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    // str1: alice str2: WrappedArray()
    f2("alice")
    // str1: aaa str2: WrappedArray(bbb, ccc)
    f2("aaa", "bbb", "ccc")

    // (3) 参数默认值，一般将带有默认值的参数放置在参数列表后面
    def f3(name: String = "school"): Unit = {
      println("My school is " + name)
    }
    // 传递参数
    f3("sch")
    // 使用参数默认值
    f3()

    // (4) 带名参数
    def f4(name: String = "school", age: Int): Unit = {
      println(s"${age}岁的${name}在学校学习")
    }
    // 常规传参方式(按照已有顺序赋值)
    f4("alice", 20)
    // 调用时指定参数名称(参数很多时可以打乱顺序)
    f4(age = 23, name = "bob")
    // 只给age赋值，name使用默认值
    f4(age = 18)
  }
}
