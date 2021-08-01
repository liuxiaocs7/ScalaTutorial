package chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.study()
    student.increase()

    student.play()
    student.increase()

    student.dating()
    student.increase()

    println("=" * 40)
    // 动态混入
    // 在使用时才额外添加
    val studentWithTalent = new Student14 with Talent{
      override def singing(): Unit = println("student is good at dancing")

      override def dancing(): Unit = println("student is good at singing")
    }

    studentWithTalent.sayHello()
    studentWithTalent.play()
    studentWithTalent.study()
    studentWithTalent.dating()
    studentWithTalent.dancing()
    studentWithTalent.singing()
  }
}

// 再定义一个特质
trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}

class Student14 extends Person13 with Young with Knowledge {
  // 重写冲突的属性
  override val name: String = "student"

  // 这里写不写override都是可以的
  // 实现抽象方法
  override def dating(): Unit = println(s"student $name is dating")

  // 学生类特有的方法
  def study(): Unit = println(s"student $name is studying")

  // 重写父类的方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

  // 实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased: $amount")
  }
}