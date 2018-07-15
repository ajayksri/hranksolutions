

object diehard3 {
  
      def hcf (num1 : Int, num2 : Int) : Int = {
        if (num2 == 0) num1 else hcf(num2, num1%num2)    
    }
    
    def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt
        for (i <- 1 to T) {
            var Array(a, b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            if (a < b) {
                val tmp = a
                a = b
                b = tmp
            }
            
            val hcfAB = hcf(a, b)
            if (((c%hcfAB) == 0) && (c <= a))
                println("YES")
            else
                println("NO")
        }
    }
}