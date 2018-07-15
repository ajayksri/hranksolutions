import scala.collection.mutable.ArrayBuffer

object isfibo {
  
      def main(args: Array[String]) {
        var arBuffer = ArrayBuffer[Long]()
        var cache = ArrayBuffer[Int]()
        cache += 0
        arBuffer += 0L
        arBuffer += 1L
        var prevP = 0L
        var prev = 1L
        var next = prevP + prev
        var limit = 10L
        while (next <= 10000000000L) {
            arBuffer += next
            prevP = prev
            prev = next
            next = prevP + prev
            if (next > (limit-1)) {
                limit *= 10
                cache += (arBuffer.size-1)
            }
        }
        cache += (arBuffer.size-1)
        cache += (arBuffer.size-1)
        
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val num = scala.io.StdIn.readLong()
            var zeros = 0
            var numZ = num
            while (numZ/10 != 0) {
                zeros += 1
                numZ /= 10
            }
            var found = false
            for (j <- cache(zeros) to cache(zeros+1)) {
                if (arBuffer(j) == num)
                    found = true
            }
            if (found)
                println("IsFibo")
            else
                println("IsNotFibo")
        }
    }
}