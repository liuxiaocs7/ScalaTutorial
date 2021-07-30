package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    // (1) 可变参数
    // 如果可以有多个，在后面添加星号*
    def f1(str: String*): Unit = {
      println(str)
    }
    // WrappedArray(alice):Scala中一个抽象的集合类型；使用包装起来的数组来接收
    f1("alice")
    f1("aaa", "bbb", "ccc")

    // (2) 如果参数列表中存在多个参数，那么可变参数一定放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println(str1)
    }
    // (3) 参数默认值，一般将带有默认值的参数放置在参数列表后面
    // (4) 带名参数
  }
}
