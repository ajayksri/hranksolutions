

object connectingtowns {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val numTowns = scala.io.StdIn.readInt()
            val routes = scala.io.StdIn.readLine().split(" ").map(_.toInt)
            var totalRoutes = 1L
            routes.map {route => totalRoutes = (totalRoutes%1234567)*route}
            totalRoutes = totalRoutes%1234567
            println(s"$totalRoutes")
        }
    }
}