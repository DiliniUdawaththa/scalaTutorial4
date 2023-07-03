package lab

import scala.io.StdIn

object Q2 {
  def main(args:Array[String]): Unit = {
    print("Enter the num: ")
    val num = StdIn.readInt() //takes the integer input from commandline

    //call function and print the output
    println(patternMatching(num))
  }

  def patternMatching(number : Int): String = number match{
    case x if x < 0 => "NEGATIVE NUMBER"
    case x if x == 0 => "ZERO"
    case x if x%2 == 0 => "EVEN NUMBER"
    case x if x%2 != 0 =>"ODD NUMBER"
  }
}
