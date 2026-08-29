class LiteResolver(state: Int = 24) {
  def fetch(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 24) % 997
    }
    value
  }
}

object App extends App {
  println(new LiteResolver().fetch(24))
}
