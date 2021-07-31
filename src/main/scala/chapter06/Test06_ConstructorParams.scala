package chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "alice"
    student2.age = 18
    println(s"student2: name = ${student2.name}, age = ${student2.age}")

    val student3 = new Student3("bob", 20)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    val student4 = new Student4("cary", 25)
    // println(s"student4: name = ${student4.name}, age = ${student4.age}")
    student4.printInfo()

    val student5 = new Student5("bob", 20)
    println(s"student5: name = ${student5.name}, age = ${student5.age}")
    // 因为age是常量无法进行修改
    // student5.age = 21

    val student6 = new Student6("bob", 20, "sch")
    println(s"student6: name = ${student6.name}, age = ${student6.age}, school = ${student6.school}")
    student6.printInfo()
  }
}

// 定义类
// 无参构造器
class Student2 {
  // 单独定义属性
  // 初始值为空值
  var name: String = _
  var age: Int = _
}

// 上面定义等价于，相当于给类添加了属性。最推荐的写法
class Student3(var name: String, var age: Int)

// 主构造器参数无修饰，这里的name和age只是变量，而不是类的属性。只是一个形参，局部变量
class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"student4: name = ${name}, age = ${age}")
  }
}

class Student44(_name: String, _age: Int) {
  // 声明类的属性
  var name: String = _name
  var age: Int = _age

  def printInfo(): Unit = {
    println(s"student4: name = ${name}, age = ${age}")
  }
}

// val表示无法修改这个值了，相当于是一个类的常量了
class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int) {

  // 可选属性
  var school: String = _

  // 定义辅助构造器
  def this(name: String, age: Int, school: String) {
    // 调用主构造器，传入name和age
    this(name, age)
    // 设置特有的school属性
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${school}")
  }
}