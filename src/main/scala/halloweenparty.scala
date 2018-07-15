

object halloweenparty {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt
        for (i <- 1 to T) {
            val num = scala.io.StdIn.readInt
            val maxChoc = (1L * num/2) * (num - num/2)
            println(maxChoc)
        }
    }
}