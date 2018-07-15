

object diwalilights {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val num = scala.io.StdIn.readInt()
            var combinations = 1
            for (j <- 1 to num) {
                combinations *= 2
                combinations %= 100000
            }
            println(combinations - 1)
        }
    }
}