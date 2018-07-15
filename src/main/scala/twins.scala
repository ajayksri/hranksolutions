import scala.collection.mutable.ListBuffer
import scala.math

object twins {

    def findPrimes(max: Int): List[Int] = {
        var primes = new ListBuffer[Int]()
        val sqrtmax = math.sqrt(max).toInt
        val visited = Array.fill(sqrtmax+1)(true)
        
        for (i <- 2 to sqrtmax ) {
            if (visited(i)) {
                for (j <- i*2 to sqrtmax by i)
                    visited(j) = false
            }
        }
         
        for (i <- 2 to sqrtmax) {
            if (visited(i))
                primes += i
        }
        primes.toList
    }
    
    def findStart(min: Int, prime: Int): Int = {        
        if (min%prime == 0) {
          if (min/prime == 1)
            2*min
          else
            min
        } else {
          if (min/prime == 0)
            ((min/prime)*prime)+2*prime
          else
            ((min/prime)*prime)+prime
        }
    }
                
    // Complete the solve function below.
    def solve(nOrig: Int, m: Int): Int = {
        val n = if (nOrig < 2) 2 else nOrig
        val visited = Array.fill(m-n+1)(true)
        val primes = findPrimes(m)
//        println(primes)
        
        for (i <- primes) {
            val startNum = findStart(n, i)
            for (j <- startNum to m by i)
                visited(j-n) = false
        }
        
        var countTwins = 0
        for (i <- 2 to m-n) {
            if (visited(i-2) && visited(i)) {
//                println(i)
                countTwins += 1
            }
        }
        countTwins
    }
}