

object littleashishshugedonation {
  
      def main(args: Array[String]) {
        val N = scala.io.StdIn.readInt()
        
        for (i <- 1 to N) {
            val numCandies = scala.io.StdIn.readLong()
            var numKids = math.cbrt(numCandies*3).floor.toLong
            var loop = true
            while (loop) {
                if ((numKids*(numKids+1)*(2*numKids+1)) > (6*numCandies))
                    numKids -= 1
                else
                    loop = false
            }
            println(s"$numKids")
        }
    }
}