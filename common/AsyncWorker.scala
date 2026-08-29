class SecureDispatcher(state: Int = 15) {
  def run(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 15) % 997
    }
    acc
  }
}

object App extends App {
  println(new SecureDispatcher().run(15))
}
