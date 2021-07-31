/**
 * 包对象
 * 包对象名称和当前的包名完全一致
 * 在包对象中声明的属性和方法在包下的所有类和对象中都可以使用
 */
package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "school"

  def commonMethod(): Unit = {
    println(s"我们在${commonValue}学习")
  }
}
