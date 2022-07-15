object T3Q5 {
  def main(args: Array[String]): Unit = {
    println("Total running time = " + (easypace(2)+tempo(3)+easypace(2)) + " min")
  }

  def easypace(x: Int): Int = {
    x*8
  }

  def tempo(x : Int): Int = {
    x*7
  }

}
