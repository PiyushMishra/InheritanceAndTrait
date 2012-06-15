package com.knoldus.knolx.piyush

class Number(a:Int) {
val number =a
def < (that: Number) =this.number  <  that.number
def > (that: Number) = this.number  >  that.number
def <= (that: Number) = (this < that) || (this == that)
def >= (that: Number) = (this > that) || (this == that)
}


object Number extends App
{
val num1= new Number(10)
val num2= new Number(20)

 println("Is less than --->" +( num1 < num2))
 println("Is greater than --->"+(num1 > num2))
 println("Is greater or equal" + (num1 <= num2))
 println("Is less or equal" + (num1 >= num2))

}