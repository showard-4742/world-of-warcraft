class SecureCollector(state: Int = 53) {
  def compute(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 53) % 997
    }
    value
  }
}

object App extends App {
  println(new SecureCollector().compute(53))
}
