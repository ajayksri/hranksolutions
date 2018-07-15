

object cuttingpapersquares {
  
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        
        val minCuts = ((1L*n)*m)-1
        println(s"$minCuts")
    }
}