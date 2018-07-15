

object restaurant {
  
      def hcf (num1 : Int, num2 : Int) : Int = {
        if (num2 == 0) num1 else hcf(num2, num1%num2)    
    }
    
    def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val Array(x, y) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
            val z = hcf(x,y)
            println((x*y)/(z*z))
        }
    }
}