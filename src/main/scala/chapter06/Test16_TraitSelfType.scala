package chapter06

object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "123456")
    user.insert()
  }
}

// 用户类
class User(val name: String, val password: String) {

}

trait UserDao {
  // 定义自身类型
  // 将UserDao的自身类型定义为User，可以认为UserDao里面就有一个User了，就相当于外部插入了一个User对象一样
  // 前面的下划线_就表示一个别名，使用诸如abc的也是可以的
  _: User =>

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao {

}
