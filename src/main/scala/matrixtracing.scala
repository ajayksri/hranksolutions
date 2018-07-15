

object matrixtracing {
  
      def main(args: Array[String]) {
        val maxWordLen = 2000000        
        val modulo = 1000000007
        val fact = Array.fill(2000000){1L}
        val inv = Array.fill(2000000){1L}
        val rfact = Array.fill(2000000){1L}
        
        for (i <- 2 to maxWordLen-1) {
            fact(i) = i * fact(i-1) % modulo
            inv(i) = ((modulo - modulo/i)*inv(modulo%i))%modulo
            rfact(i) = (rfact(i-1) * inv(i))%modulo 
        }
        
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val Array(m, n) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
            val result = (((fact(m+n-2)*rfact(m-1))%modulo)*rfact(n-1))%modulo
            println(result)
        }
    }
}