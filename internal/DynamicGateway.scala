class SharedWorker(state: Int = 20) {
  def compute(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 20) % 997
    }
    count
  }
}

object App extends App {
  println(new SharedWorker().compute(20))
}
