
class matrixModulo(val modulus : Int) {
    def mult(matrix : Array[Array[Int]], initialVals: Array[Int]) : Array[Int] = {
      val rows = matrix.size
      val cols = 1
      val result = new Array[Int](rows)
     
      for (i <- 1 to rows) {
          var cellValue = 0L
          for (j <- 1 to rows) {
            cellValue += (matrix(i-1)(j-1).toLong*initialVals(j-1))%modulus
            cellValue %= modulus
          }
          result(i-1) = cellValue.toInt 
      }
      result
    }
    
    def square(matrix : Array[Array[Int]]): Array[Array[Int]] = {
      val rows = matrix.size
      val cols = rows
      val result = new Array[Array[Int]](rows)
      for (i <- 0 to rows-1)
        result(i) = new Array[Int](cols)
     
      for (i <- 1 to rows) {
          for (j <- 1 to rows) {
            var cellValue = 0L
            for (k <- 1 to rows) {
              cellValue += (matrix(i-1)(k-1).toLong*matrix(k-1)(j-1))%modulus
              cellValue %= modulus
              result(i-1)(j-1) = cellValue.toInt
            }
          }
           
      }
      result
    }
}

object fibonaccifinding {
  
    // Complete the solve function below.
    def solve(a: Int, b: Int, n: Int): Int = {
      val initialValues = Array(a, b)
      val transformationMatrix = Array (Array(0, 1), Array(1, 1))
      val modulus = 1000000007
      var tm = transformationMatrix
      var result = initialValues
      
      val fibCalc = new matrixModulo(modulus)
      var power = n
      while (power != 0) {
        if (power%2 == 1) {
          result = fibCalc.mult(tm, result)
        }
        tm = fibCalc.square(tm)
        power /= 2
      }
   
      result(0)
    }
}