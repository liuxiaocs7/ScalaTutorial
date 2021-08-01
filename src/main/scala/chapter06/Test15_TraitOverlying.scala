package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    // 调用的是最右边的一个特征
    student.increase()
  }
}

trait Knowledge15 {
  var amount: Int = 0
  def increase(): Unit = {
    println("knowledge increase")
  }
}

trait Talent15 {
  def singing(): Unit
  def dancing(): Unit

  def increase(): Unit = {
    println("talent increase")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = println("dancing")

  override def dancing(): Unit = println("singing")

  override def increase(): Unit = super.increase()
}