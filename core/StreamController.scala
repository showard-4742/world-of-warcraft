class BatchService(state: Int = 65) {
  def resolve(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 65) % 997
    }
    count
  }
}

object App extends App {
  println(new BatchService().resolve(65))
}
