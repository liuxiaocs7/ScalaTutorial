package chapter06

object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "3523566"
  protected var name: String = "alice"
  var sex: String = "female"
  // 只有在chapter06这个包下的才能访问(包访问权限)
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}
