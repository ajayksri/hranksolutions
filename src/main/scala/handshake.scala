

object handshake {
  
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var T = sc.nextInt();
        var a0 = 0;
        while(a0 < T){
            val N = sc.nextInt();
            val handShakes = ((1L*N)*(N-1))/2
            println(s"$handShakes")
            a0+=1;
        }
    }
}