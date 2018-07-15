

object sherlocanddivisors {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            var evenFs = 0
            val num = scala.io.StdIn.readInt()
            if (num%2 == 0) {
                val sqrt = scala.math.sqrt(num).toInt
                for (factor <- 2 to sqrt) {
                    if (num%factor == 0) {
                        if (factor%2 == 0)
                            evenFs += 1
                        if (((num/factor)%2 == 0) && (num/factor != factor))
                            evenFs += 1
                    }
                }
                evenFs +=1 // number itself
            }
            println(evenFs)
        }
    }
}