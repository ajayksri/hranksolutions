

object armygame {
  
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        
        var numDrops = (n/2) * (m/2)
        if (n%2 == 1) {
            if (m%2 == 0)
                numDrops += m/2
            else
                numDrops += m/2 +1                
        }
        if (m%2 == 1) {
            if (n%2 == 0)
                numDrops += n/2
            else
                numDrops += n/2 +1                
        }
        if ((n%2 == 1) && (m%2 == 1))
            numDrops -= 1
        println(s"$numDrops")
    }
}