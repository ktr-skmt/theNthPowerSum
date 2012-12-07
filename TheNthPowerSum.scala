object TheNthPowerSum {
  var y = 0D
  def main(args : Array[String]) {
    printExecutionTime {calc(20, 10, 2)}
    println("= " + y.toLong)
  }
  def calc(x : Int, n : Int, p : Int) : Unit =
    if (n >= 0) for (i <- 0 to x) calc(i, n - 1, p)
    else y += math.pow(x, p)
  def printExecutionTime(proc : => Unit) = {
    val start = System.currentTimeMillis
    proc
    println("[total " + (System.currentTimeMillis - start) + "ms]")
  }
}
