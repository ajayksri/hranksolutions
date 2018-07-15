

object kcandystore {
  
      def main(args: Array[String]) {
        val combn = Array.ofDim[Int](2001, 2001)
        for (i <- 1 to 2000) {
            combn(i)(0) = 1
            combn(i)(i) = 1
            for (j <- 1 to i-1) {
                combn(i)(j) = (combn(i-1)(j-1) + combn(i-1)(j))%1000000000
            }
        }
        
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val N = scala.io.StdIn.readInt
            val K = scala.io.StdIn.readInt
            println(combn(N+K-1)(K))
        }
    }
}