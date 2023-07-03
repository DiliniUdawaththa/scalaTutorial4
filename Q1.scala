package lab

import scala.io.StdIn

object Q1 {
  def main(args : Array[String]): Unit = {
    println("Enter your income: ")
    val income = StdIn.readInt() //Take income as a user input

    val annualInterest = interest(income) //call function
    println("Your annual interest is: " + annualInterest)
  }

  def interest(money:Int):Double = money match{
    case x if x <= 0 => 0
    case x if x <= 20000 => x*0.02
    case x if x <= 200000 => x*0.04
    case x if x <= 2000000 => x*0.035
    case x if x > 2000000 => x*0.065
  }

}
