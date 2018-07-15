

object russianpeasantexponentiation {
  
      def multComplex(t1 : (Long, Long), t2 : (Long, Long), modulus : Long) : (Long, Long) = {
        ((t1._1*t2._1 - t1._2*t2._2)%modulus, (t1._1*t2._2 + t1._2*t2._1)%modulus)
    }
    
    def powerModulo(t1 : (Long, Long), pow : Long, modulus : Long) : (Long, Long) = {
        var power = pow
        var value = t1
        
        while (power%2 == 0) {
            value = multComplex(value, value, modulus)
//            println(s"v1 = $value")
            power /= 2
        }
        
        var product = value
        power /= 2
        
        while (power > 0) {
            value = multComplex(value, value, modulus)
//            println(s"v2 = $value")
            if (power%2 == 1) {
                product = multComplex(product, value, modulus)
//                println(s"product = $product")
            }
            power /= 2
        }
        var c = product._1
        var d = product._2
        if (c < 0)
            c = modulus + c
        
        if (d < 0)
            d = modulus + d
        
        (c, d)
    }
    
    def main(args: Array[String]) {
      
        val T = scala.io.StdIn.readInt
        
        for (i <- 1 to T) {
            val Array(a, b, k, m) = scala.io.StdIn.readLine.split(" ").map(_.toLong)
            val out = powerModulo((a, b), k , m)
            val c = out._1
            val d = out._2
            println(s"$c $d")
//            println(-119667200%(1000000000))
        }
    }
}