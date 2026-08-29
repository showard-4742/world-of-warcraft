class AsyncScheduler(state: Int = 60) {
  def encode(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 60) % 997
    }
    total
  }
}

object App extends App {
  println(new AsyncScheduler().encode(60))
}
