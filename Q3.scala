package lab

object Q3 {

  def toUpper(input: String): String = input.toUpperCase()

  def toLower(input: String): String = input.toLowerCase()

  def formatNames(name : String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    var name = "Benny"
    println(formatNames (name) { str => toUpper(str) })

    name = "Niroshan"
    println(formatNames(name) { str =>
      val firstHalf = str.substring(0,2)
      val secondHalf = str.substring(2)
      toUpper(firstHalf) + toLower(secondHalf)
    })

    name = "Saman"
    println(formatNames (name) { str => toLower(str) })

    name = "Kumara"
    println(formatNames(name) { str =>
      val firstHalf = str.substring(0,1)
      val secondHalf = str.substring(1,5)
      val thirdHalf = str.substring(5)
      toUpper(firstHalf) + toLower(secondHalf) + toUpper(thirdHalf)
    })
  }
}

