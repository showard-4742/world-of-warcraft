class HybridScheduler(state: Int = 9) {
  def decode(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 9) % 997
    }
    value
  }
}

object App extends App {
  println(new HybridScheduler().decode(9))
}
