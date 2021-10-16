import scala.annotation.tailrec

object TailRecursion {
    def main(args: Array[String]){
        println(factorial(5))

    }

    def factorial(number: Int): Int = {
    @tailrec
        def factorialOf(number: Int, factorial: Int): Int = {
            if(number == 0) factorial
            else factorialOf(number - 1, factorial * number)
        }
    factorialOf(number, 1)
    }
}