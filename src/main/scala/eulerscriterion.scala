

object eulerscriterion {
  
    def powModulo(a: Int, powers:Int, modulus: Int): Long = {
        var result = 1L
        var temp = 1L*a
        var povar = powers
        
        while (povar != 0) {
            if (povar%2 == 1) {
                result *= temp
                result %= modulus
            }
            temp *= temp
            temp %= modulus
            povar /= 2
        }        
        result
    }
    
    // Complete the solve function below.
    def solve(a: Int, m: Int): String = {
        print(Int.MaxValue)
        val yes = "YES"
        val no = "NO"
        if ((a == 0) || (powModulo(a, (m-1)/2, m) == 1))
            yes
        else
            no
    }

}