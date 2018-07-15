

object sumarandthefloatingrocks {
  
      def hcf (num1 : Int, num2 : Int) : Int = {
        if (num2 == 0) num1 else hcf(num2, num1%num2)    
    }
    
    def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt
        for (i <- 1 to T) {
            val Array(x1, y1, x2, y2) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            var xDiff = x2-x1
            var yDiff = y2-y1
            
            xDiff = if (xDiff > 0) xDiff else -xDiff
            yDiff = if (yDiff > 0) yDiff else -yDiff
            
            println(hcf(xDiff, yDiff) - 1)
        }
    }
}