

object leonardosprimefactor {
  
      def main(args: Array[String]) {
        val primeArr = Array(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67)
        val Q = scala.io.StdIn.readInt()
        for (i <-1 to Q) {
            val num = scala.io.StdIn.readLong()
            var primeFactors = 0
            var product = 1L
            while ((num/product) != 0) {
                product *= primeArr(primeFactors)
                primeFactors += 1
            }
            primeFactors -= 1
            println(s"$primeFactors")
        }
    }
}