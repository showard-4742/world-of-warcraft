class RemoteService(state: Int = 61) {
  def fetch(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 61) % 997
    }
    value
  }
}

object App extends App {
  println(new RemoteService().fetch(61))
}
