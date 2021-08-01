package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    // class scala.collection.immutable.Map$Map3
    println(map1.getClass)

    println("=" * 50)

    // 2. 遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))

    // 3. 取map中所有key或者value
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}")
    }

    // 4. 访问某一个key的value
    // map.get(key)  返回的是一个Option类型  None表示没有值，Some表示有值
    println("a: " + map1.get("a").get)
    // 不会报空指针异常
    println("c: " + map1.get("c"))
    // map中如果没有这个key就返回默认的值
    println("c: " + map1.getOrElse("c", 0))

    println("a: " + map1("a"))
    // 没有的key会报异常
    // println("c: " + map1("c"))
  }
}
