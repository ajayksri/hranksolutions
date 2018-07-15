

object closestnumber {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt
        for (i <- 1 to T) {
            val Array(a, b, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            val pow = scala.math.pow(a, b)
            println((pow/x).round*x)
        }
    }
}