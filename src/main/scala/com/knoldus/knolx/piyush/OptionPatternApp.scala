package com.knoldus.knolx.piyush

object OptionPatternApp extends App {

  val result = divide(2, 0).getOrElse(0)
  println(result)

  def divide(x: Double, y: Double): Option[Double] = {
    try {
      Option(errorProneMethod(x, y))
    } catch {
      case ex => None
    }
  }

  def errorProneMethod(x: Double, y: Double): Double = {
    if (y == 0) throw new Exception
    else {
      x / y
    }
  }

}