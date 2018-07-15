

object mostdistant {
  
      def main(args: Array[String]) {
        val N = scala.io.StdIn.readInt
        var xMax = 0
        var xMin = 0
        var yMax = 0
        var yMin = 0
        var maxDistance = 0.0
        var dis = 0.0
        
        for (i <- 1 to N) {
            val Array(x, y) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            if (xMax == 0 && xMin == 0 && x != 0) {
                xMax = x
                xMin = x
            }
            if (yMax == 0 && yMin == 0 && y != 0) {
                yMax = y
                yMin = y
            }
            if (xMax < x)
                xMax = x
            if (xMin > x)
                xMin = x
            if (yMax < y)
                yMax = y
            if (yMin > y)
                yMin = y
        }
        
        dis = xMax - xMin
        if (dis < 0)
            dis = -dis        
        if (maxDistance < dis)
            maxDistance = dis
        
        dis = yMax - yMin
        if (dis < 0)
            dis = -dis        
        if (maxDistance < dis)
            maxDistance = dis
        
        dis = scala.math.sqrt((1L*yMax)*yMax + (1L*xMax)*xMax)
        if (maxDistance < dis)
            maxDistance = dis
        
        dis = scala.math.sqrt((1L*xMax)*xMax + (1L*yMin)*yMin)
        if (maxDistance < dis)
            maxDistance = dis
        
        dis = scala.math.sqrt((1L*yMin)*yMin + (1L*xMin)*xMin)
        if (maxDistance < dis)
            maxDistance = dis
        
        dis = scala.math.sqrt((1L*xMin)*xMin + (1L*yMax)*yMax)
        if (maxDistance < dis)
            maxDistance = dis
        
        println(maxDistance)
    }
}