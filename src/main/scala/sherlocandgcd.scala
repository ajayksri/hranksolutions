import scala.util.control.Breaks._

object sherlocandgcd {
  
    def gcd(num1 : Int, num2 : Int) : Int = {
        if (num2 == 0) num1 else gcd(num2, num1%num2)
    }
    
    def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt
        for (i <- 1 to T) {
            val numSize = scala.io.StdIn.readInt
            val nums = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            
            var oneFound = false
            for (i <- 0 to numSize-1) {
                if (nums(i) == 1)
                    oneFound = true
            }
            
            if (oneFound)
                println("YES")
            else {
                var relativePrime = false
                var previousGcd = nums(0)
                breakable {
                    for (i <- 1 to numSize-1) {
                        previousGcd = gcd(previousGcd, nums(i)) 
                        if (previousGcd == 1) {
                            relativePrime = true
                            break
                        }                    
                    }
                }
                if (relativePrime)
                    println("YES")
                else
                    println("NO")
            }
        }
    }
}