

object sherlocandmovingtiles {
  
      def main(args: Array[String]) {
        val lss = scala.io.StdIn.readLine().split(" ").map(_.toInt)
        val diff = if (lss(1) > lss(2)) lss(1)-lss(2) else lss(2)-lss(1)
        val cases = scala.io.StdIn.readInt()
        for (i <- 1 to cases) {
            val areaCovered = scala.io.StdIn.readLong()
            val time = ((lss(0) - scala.math.sqrt(areaCovered))*scala.math.sqrt(2))/diff
            println(s"$time")
        }
    }
}