//package chapter06
//
//object Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//  }
//}

// 第二种定义方式
package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}


//package ccc {
//  package ddd {
//    object Test02_PackageObject {
//      def main(args: Array[String]): Unit = {
//        println(sch)
//      }
//    }
//  }
//
//  // 必须放在同一级下才能访问到sch
//  // 定义一个包对象ddd
//  package object ddd {
//    val sch: String = "sch"
//  }
//}

package ccc {
  package ddd {
    object Test02_PackageObject {
      def main(args: Array[String]): Unit = {
        println(sch)
      }
    }
  }
}

// 必须放在同一级下才能访问到sch
// 定义一个包对象ddd
package object ccc {
  val sch: String = "sch"
}