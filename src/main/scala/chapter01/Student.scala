package chapter01

/**
 * 将需要定义的属性放到类名后面的括号中
 * 一个类型为String的属性name
 * 一个类型为Int的属性age
 * 这样写已经将构造方法定义好了
 *
 * 伴生类和伴生对象名称必须一样并且必须定义在同一个文件中
 * 伴生类的所有东西都会在入口类Student中，伴生对象的所有有关东西都会在Student$这个类中
 */
class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象(全局只有一份)，与当前的Student类相伴相生，两者各自所有私有成员都是可以互相访问的
object Student {
  // 共有属性，全局
  val school: String = "shcool"

  // main方法必须放在object中才能执行，class中没有static，无法像Java那样public static void main(){}，无法定义main()方法执行
  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 23)

    alice.printInfo()
    bob.printInfo()
  }
}

