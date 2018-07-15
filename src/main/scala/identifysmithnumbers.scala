

object identifysmithnumbers {
  
    def findPrimeFactorsSum(n: Int): Int = {
        var sum = 0
        var number = n
        for (i <- 2 to math.sqrt(n).toInt) {
            while(number%i == 0) {
                sum += findDigitsSum(i)
                number /= i
            }
        }
        if (number > 1)
            sum += findDigitsSum(number)        
        sum
    }
    
    def findDigitsSum(n: Int): Int = {
        var sum = 0
        var number = n
        while (number > 0) {
            sum += number%10
            number /= 10
        }
        sum
    }
    
    // Complete the solve function below.
    def solve(n: Int): Int = {
        if (findDigitsSum(n) == findPrimeFactorsSum(n))
            1
        else
            0
    }
}