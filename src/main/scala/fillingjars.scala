

object fillingjars {
  
      def main(args: Array[String]) {
        val nm = scala.io.StdIn.readLine.split(" ").map(_.toInt)
        var candies = 0L
        for (i <- 1 to nm(1)) {
            val abk = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            candies += (1L *(abk(1)-abk(0)+1))*abk(2)
        }
        println(candies/nm(0))
    }
}