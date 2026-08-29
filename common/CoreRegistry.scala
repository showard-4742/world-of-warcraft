class AtomicAdapter(state: Int = 3) {
  def build(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 3) % 997
    }
    value
  }
}

object App extends App {
  println(new AtomicAdapter().build(3))
}
