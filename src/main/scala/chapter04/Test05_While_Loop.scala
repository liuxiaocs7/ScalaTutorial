package chapter04

/**
 * 推荐使用for循环而不使用while循环
 */
object Test05_While_Loop {
  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop: " + a)
      a -= 1
    }

    var b: Int = 0
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while(b > 0)

  }
}
