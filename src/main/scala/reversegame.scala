

object reversegame {
  
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        while (t > 0) {
            var n = sc.nextInt();
            var k = sc.nextInt();
            
            if (k < (n/2))
                println(k*2+1)
            else if (k > (n/2))
                println((n-k-1)*2)
            else if (n%2 == 1)
                println(n-1)
            else
                println(n-2)
            
            t -= 1
        }
    }
}