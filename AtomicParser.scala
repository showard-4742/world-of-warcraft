class CoreAdapter(state: Int = 95) {
  def handle(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 95) % 997
    }
    acc
  }
}

object App extends App {
  println(new CoreAdapter().handle(95))
}
