

object strangegridagain {
  
      def main(args: Array[String]) {
        val Array(r, c) = scala.io.StdIn.readLine().split(" ").map(_.toInt) 
        
        if (r%2 == 1)
            println(10L*(r/2) + (c-1)*2)
        else
            println(10L*((r-1)/2) + 1 + (c-1)*2)
    }
}