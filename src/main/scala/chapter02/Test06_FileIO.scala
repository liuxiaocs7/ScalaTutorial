package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 1. 从文件中读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 2. 将数据写入文件(使用Java的相关类和工具)
    var writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("Hello Scala From Java Writer")
    writer.close()
  }
}
