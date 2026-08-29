class AsyncContext(state: Int = 90) {
  def build(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 90) % 997
    }
    total
  }
}

object App extends App {
  println(new AsyncContext().build(90))
}
