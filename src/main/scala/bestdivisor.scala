

object bestdivisor {
  
      def digitSum(num : Int) : Int = {        
        if (num <= 9)
            num
        else
            num%10 + digitSum(num/10)
    }
    
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val sqrt = scala.math.sqrt(n).toInt
        var bestDiv = 1
        var bestDivSumDig = 1
        
        for (i <- 1 to sqrt) {
            if ((n%i) == 0) {
                val sumDig1 = digitSum(i)
                val sumDig2 = digitSum(n/i)
//                println(s"$sumDig1 $sumDig2")
                if (sumDig1 >= sumDig2) {
                     if (bestDivSumDig < sumDig1) {
                        bestDiv = i
                        bestDivSumDig = sumDig1
                     } else if ((bestDivSumDig == sumDig1) && (bestDiv > i)) {
                         bestDiv = i
                     }
                } else if (bestDivSumDig < sumDig2) {
                    bestDiv = n/i
                    bestDivSumDig = sumDig2
                } else if ((bestDivSumDig == sumDig2) && (bestDiv > n/i)) {
                    bestDiv = n/i
                }
            }
        }
        println(s"$bestDiv")
    }
}