package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    // 私有属性无法访问
    // person.idCard    // error

    // protected是只有在当前类或当前类的子类中可以访问到
    // person.name      // error

    println(person.age)
    println(person.sex)
    person.printInfo()

    val worker: Worker = new Worker()
    // 更改之后的参数
    worker.printInfo()
  }
}

// 定义一个子类
// extends 表示继承
class Worker extends Person {

  // 重写父类中的printInfo()方法
  override def printInfo(): Unit = {
    // 私有属性无法访问，只能在该类或该类的伴生对象中可以访问
    // println(idCard)

    name = "bob"
    age = 25
    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}