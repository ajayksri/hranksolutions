

object evenoddquery {
  
      def main(args: Array[String]) {
        val N = scala.io.StdIn.readInt()
        val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
        val cases = scala.io.StdIn.readInt()
        
        for (i <- 1 to cases) {
            val xy = scala.io.StdIn.readLine().split(" ").map(_.toInt)            
            if (xy(0) > xy(1))
                println("Odd")
            else if (arr(xy(0)-1)%2 == 1)
                println("Odd")
            else {
                if (((xy(0)+1) <= xy(1)) && (arr(xy(0)) == 0))
                    println("Odd")
                else
                    println("Even")
            }
        }
    }
}