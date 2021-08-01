package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    // 调用的是最右边的一个特征
    student.increase()

    // 钻石问题特征叠加
    val myFootBall = new MyFootBall
    // my ball is a red-foot-ball
    // MyFootBall的super是ColorBall
    // ColorBall的super是CategoryBall
    // CategoryBall的super是Ball
    println(myFootBall.describe())
  }
}

// 定义球类特征
trait Ball {
  def describe(): String = "ball"
}

// 定义颜色特征
trait ColorBall extends Ball {
  val color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

// 定义种类特征
trait CategoryBall extends Ball {
  val category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

// 定义一个自定义球的类
class MyFootBall extends CategoryBall with ColorBall {
  // 指定调用CategoryBall的方法
  override def describe(): String = "my ball is a " + super[CategoryBall].describe()
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

  override def increase(): Unit = {
    // 具体指定调用哪个父类/特质的方法
    super[Person13].increase()
  }
}