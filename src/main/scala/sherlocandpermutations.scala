

object sherlocandpermutations {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val Array(n, m) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
            var product : BigInt = 1
            for (p <- m to m+n-1)
                product *= p
            for (p <- 2 to n)
                product /= p
            println((product%1000000007).toInt)            
        }
    }
}