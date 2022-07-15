object T3Q4 {
  def main(args:Array[String]): Unit ={
    println("Wholesale cost = RS "+ total_wholesalecost(60))

  }

  def costofcopies(x: Int): Double = {
    x*24.95
  }

  def discount_forcopies(x: Int): Double = {
    costofcopies(x)*40/100
  }

  def cost_afterdiscount(x: Int): Double = {
    costofcopies(x) - discount_forcopies(x)
  }

  def shippingcost(x: Int): Double = {
    if(x<=50) x*3.00 else x*3.00 + (x-50)*0.75
  }

  def total_wholesalecost(x: Int): Double = {
    cost_afterdiscount(x) + shippingcost(x)
  }

}
