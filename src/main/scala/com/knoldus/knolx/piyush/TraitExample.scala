package com.knoldus.knolx.piyush

class Maths {
  def sub(x: Int, y: Int) = println("diff---> " + (x - y))
}

trait EnhanceMaths extends Maths {
  def sum(x: Int, y: Int) = println("sum---->" + (x + y))
}

class TestMaths extends EnhanceMaths {
  def compute = println("I can compute")

}

object Test extends App {
  val test = new TestMaths
  test.compute
  test.sub(20, 10)
  test.sum(20, 10)
}
