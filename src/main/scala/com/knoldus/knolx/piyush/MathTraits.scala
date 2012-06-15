package com.knoldus.knolx.piyush

class Math extends Substraction with Summation with Multiplication {

  def write = { println(" I can compute") }

}

object k extends App {
  val math = new Math
  math.write
  math.sub(10, 5)
  math.sum(10, 20)
  math.mul(10, 20)

}