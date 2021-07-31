// 用嵌套风格定义包

package com {

  // 导入内层包
  import com.liuxiaocs.scala.Inner

  // 在外层包中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package liuxiaocs {
    package scala {
      // 在内层包中定义单例兑现
      object Inner {
        val in: String = "in"
        def main(args: Array[String]): Unit = {
          // 直接访问外层包里面的对象
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

// 在同一文件中定义多个包
package aaa {
  package bbb {

    object Test01_Package {
      def main(args: Array[String]): Unit = {

        // 导入Inner包，只有main方法中能使用
        import com.liuxiaocs.scala.Inner
        println(Inner.in)
      }
    }
  }
}
