

object specialmultiple {
  
      def main(args: Array[String]) {
        val T = scala.io.StdIn.readInt()
        for (i <- 1 to T) {
            val num = scala.io.StdIn.readInt()
            
            val q = new scala.collection.mutable.Queue[Long]
            q.enqueue(9)            
            var continueFlag = true
            var currentNum = 0L
            while (continueFlag) {
                currentNum = q.dequeue
                if ((currentNum%num) == 0)
                    continueFlag = false
                else {
                    q.enqueue(currentNum*10)
                    q.enqueue(currentNum*10+9)
                }
            }
            println(currentNum)
        }        
    }
}