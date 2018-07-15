

object findthepoint {
  
      def main(args: Array[String]) {
     
        val N = scala.io.StdIn.readInt()
        var loopCnt = 0
        
        while (loopCnt < N) {
            val Array(x1, y1, x2, y2) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
            val Rx = x2 + (x2-x1)
            val Ry = y2 + (y2-y1)
            printf("%d %d\n", Rx, Ry)
            loopCnt += 1
        }
    }
}