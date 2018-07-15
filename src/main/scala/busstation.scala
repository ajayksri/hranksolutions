import scala.util.control.Breaks._

object busstation {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        var sum = 0
        val cumSumHashSet = scala.collection.mutable.HashSet[Int]()
        val resultFirstHalf = scala.collection.mutable.ArrayBuffer[Int]()
        val resultSecondHalf = scala.collection.mutable.ArrayBuffer[Int]()
        
        val numArray = scala.io.StdIn.readLine.split(" ").map(_.toInt)
        
        for (i <- 0 to T-1) {
            sum += numArray(i)
            cumSumHashSet += sum
        }
        
        var factor = 1
        while (factor*factor <= sum) {
            if (sum%factor == 0) {
                var allMatch = true
                breakable {
                    for (j <- 1 to sum/factor) {
                        if (!cumSumHashSet(factor*j)) {
                            allMatch = false
                            break
                        }
                    }
                }
                if (allMatch)
                    resultFirstHalf += factor
                
                val otherHalfFactor = sum/factor
                if (factor != otherHalfFactor) {
                    allMatch = true
                    breakable {
                        for (j <- 1 to sum/otherHalfFactor) {
                            if (!cumSumHashSet(otherHalfFactor*j)) {
                                allMatch = false
                                break
                            }
                        }
                    }
                    if (allMatch)
                        resultSecondHalf += otherHalfFactor
                }
            }
            factor += 1
        }
        
        for (i <- 0 until resultFirstHalf.size)
            printf("%d ", resultFirstHalf(i))
        for (i <- resultSecondHalf.size-1 to 0 by -1)
            printf("%d ", resultSecondHalf(i))
    }
}