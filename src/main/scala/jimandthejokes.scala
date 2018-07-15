

object jimandthejokes {
  
      def main(args: Array[String]) {
        val baseTenValue = Array.ofDim[Int](38)
        for (i <- 0 to 37)
            baseTenValue(i) = 0
        
        val N = scala.io.StdIn.readInt
        
        for (i <- 1 to N) {
//            println("hi")
            val Array(month, day) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            if ((day/10) < month && (day%10) < month) {
                   baseTenValue((day/10)*month+(day%10)) += 1
            }
        }
        
        var result = 0L
        for (i <- 1 to 37) {
            result += (1L*baseTenValue(i)*(baseTenValue(i)-1))/2
        }
        println(result)
    }
}