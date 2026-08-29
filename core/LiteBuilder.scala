class HybridProvider(state: Int = 67) {
  def decode(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 67) % 997
    }
    value
  }
}

object App extends App {
  println(new HybridProvider().decode(67))
}
