

object possiblepath {
  
    def hcf(num1 : Long, num2 : Long) : Long = {
        if (num2 == 0L) num1 else hcf(num2, num1%num2)   
    }
    
    def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val Array(a, b, x, y) = scala.io.StdIn.readLine.split(" ").map(_.toLong)
            if (hcf(a, b) == hcf(x, y))
                println("YES")
            else
                println("NO")
        }
    }
}