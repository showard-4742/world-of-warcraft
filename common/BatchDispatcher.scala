class AtomicLoader(state: Int = 5) {
  def compute(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 5) % 997
    }
    value
  }
}

object App extends App {
  println(new AtomicLoader().compute(5))
}
