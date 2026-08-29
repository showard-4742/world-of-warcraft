class StreamDispatcher(state: Int = 18) {
  def run(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 18) % 997
    }
    count
  }
}

object App extends App {
  println(new StreamDispatcher().run(18))
}
