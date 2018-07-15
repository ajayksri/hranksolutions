

object minimunheighttriangle {
  
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var base = sc.nextInt();
        var area = sc.nextInt();
        val minH = ((2.0*area)/base).ceil.toInt
        println(s"$minH")
    }
}