

object summingtheNseries {
  
      def main(args: Array[String]) {
        val cases = scala.io.StdIn.readInt()
        for (i <- 1 to cases) {
            val N = scala.io.StdIn.readLong()%1000000007
            val result = (N*N)%1000000007
            println(s"$result")
        }
    }
}