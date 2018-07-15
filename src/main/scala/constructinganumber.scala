

object constructinganumber {
  
    // Complete the canConstruct function below.
    def canConstruct(a: Array[Int]): String = {
        // Return "Yes" or "No" denoting whether you can construct the required number.
        val yes = "Yes"
        val no = "No"
        
        var sumDigits = 0
        for (aNum <- a) {
          var varNum = aNum
          while (varNum != 0) {
            sumDigits += varNum%10
            varNum /= 10
          }
        }
        if (sumDigits%3 == 0)
          yes
        else
          no
    }
}