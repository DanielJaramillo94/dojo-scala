object Factorial {
    def main(args: Array[String]): Unit = {
        val numero = 3;
        println(factorial(numero))
  }

  def factorial(num: Int): Int = {
    if(num == 1) {
      1
    } else {
      num*factorial(num-1)
    }
  }
}