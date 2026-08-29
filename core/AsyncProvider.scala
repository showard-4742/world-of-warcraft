class LocalBuffer(state: Int = 71) {
  def dispatch(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 71) % 997
    }
    result
  }
}

object App extends App {
  println(new LocalBuffer().dispatch(71))
}
