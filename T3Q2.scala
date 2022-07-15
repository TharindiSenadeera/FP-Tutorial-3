object T3Q2 {
  def main(args:Array[String]): Unit ={
    println("Temperature in Fahrenheit = "+ celsius_to_fahrenheit(35))

  }

  def celsius_to_fahrenheit(t: Int): Double = {
    t*1.8000 + 32.00
  }

}
