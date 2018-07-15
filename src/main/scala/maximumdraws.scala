

object maximumdraws {
  
      def main(args: Array[String]) {
        val N = scala.io.StdIn.readInt()
        
        for (i <- 1 to N) {
            val maxDraws = scala.io.StdIn.readInt() + 1
            println(s"$maxDraws")
        }
    }
}