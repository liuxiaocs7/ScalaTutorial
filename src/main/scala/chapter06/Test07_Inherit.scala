package chapter06


object Test07_Inherit {
  def main(args: Array[String]): Unit = {

    val student1 = new Student7("alice", 18)

    println("=" * 50)

    val student2 = new Student7("bob", 20, "std001")

    // 调用的是子类的方法
    student1.printInfo()
    student2.printInfo()

    val teacher = new Teacher
    // 调用的是子类的方法
    teacher.printInfo()

    // 多态：要把一个子类或者实现类的对象实例传给一个父类或者接口的引用，这样就可以实现同一接口有多种不同的状态，多种不同的实现
    // 动态绑定
    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    println("*" * 50)

    val person = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

// 定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) {
    // 必须先调用主构造器
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: ${name}, ${age}")
  }
}

// 定义子类
// 这里调用了父类的主构造器
// 如果父类的主构造器由参数，那么这里继承的Person7(name: String)也必须有参数
// 这个参数从子类Student7的参数列表获取
// 这两个属性name和age继承了Person7已经有了，这里只需要作为参数即可
class Student7(name: String, age: Int) extends Person7(name, age) {

  // 学号
  var stdNo: String = _
  println("3. 子类的主构造器被调用")

  def this(name: String, age: Int, stdNo: String) {
    // 相当于调用了父类的主构造方法和自己的主构造方法
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: ${name}, ${age}, ${stdNo}")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}
