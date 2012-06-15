package com.knoldus.knolx.piyush

class Number1(a:Int) extends Ordered[Number1]
{
val number=a
def compare(that:Number1) = this.number- that.number
}


object Number1 extends App
{
val num1= new Number1(10)
val num2= new Number1(20)

 println("Is less than --->" +( num1 < num2))
 println("Is greater than --->"+(num1 > num2))
 println("Is greater or equal" + (num1 <= num2))
 println("Is less or equal" + (num1 >= num2))

}