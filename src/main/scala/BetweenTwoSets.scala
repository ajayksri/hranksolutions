object BetweenTwoSets {
  
    def hcf (num1 : Int, num2 : Int) : Int = {
        if (num2 == 0) num1 else hcf(num2, num1%num2)    
    }

    def lcm(a: Array[Int]): Int = {
        var lcmOfAll = a(0)
        
        a.foreach { x => { lcmOfAll = (lcmOfAll*x)/hcf(lcmOfAll, x)} }
        
        lcmOfAll
    }
    
    def min(a: Array[Int]): Int = {
        var min = a(0)
        a.foreach { x => { min = if (min < x) min else x } }
        min
    }
      
    def getTotalX(a: Array[Int], b: Array[Int]): Int = {
        /*
         * Write your code here.
         */
        val lcmOfFirst = lcm(a)
        println(lcmOfFirst)
        val minOfSecond = min(b)
        
        var divisor = lcmOfFirst
        var count = 0
        while (divisor <= minOfSecond) {
            var dividesAll = true
            b.foreach { x => {val divides = if (x%divisor == 0) true else false
                             dividesAll &&= divides } }
            if(b.size > 0 && dividesAll)
                count += 1
            divisor += lcmOfFirst
        }
        count
    }

    def main(args: Array[String]) {
        val a = Array(2, 4)
        val b = Array(16, 32, 96)
        print(getTotalX(a, b))
    }
}