class HybridScheduler(state: Int = 97) {
  def decode(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 97) % 997
    }
    result
  }
}

object App extends App {
  println(new HybridScheduler().decode(97))
}
