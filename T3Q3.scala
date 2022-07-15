object T3Q3 {
  def main(args: Array[String]): Unit = {
    println("Volume of the sphere = " + volumeof_sphere(5))
  }

  def volumeof_sphere(r: Int): Double = {
    4 / 3 * math.Pi * r * r * r
  }
}