package chapter01

/**
 * object: 关键字，声明一个单例对象(伴生对象，和另一个类相伴相生)
 *
 * HelloWorld到底是哪个类的对象？
 * 所谓的单例对象object,其实是HelloWorld$中的Module$，而Module$就是HelloWorld$类的一个实例
 * HelloWorld$类是当前伴生对象的一个所属类
 * HelloWorld对象和同名的HelloWorld类相伴相生(伴生类也是程序执行的入口类、伴生对象)
 *
 * 为了解决删除静态static关键字之后而我们又要实现对应的静态功能而设计出来的object，基于一个对象
 */
object HelloWorld {
  /*
    main方法：从外部可以直接调用执行的方法
    def 方法名称(参数名称: 参数类型): 返回值类型 = { 方法体 }
    Array[String] Array表示一种集合类型，[String]表示泛型，即参数是String类型的数组Array
    Unit 相当于 void
   */
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    // 调用Java中的方法
    System.out.println("hello scala from java")
  }
}
