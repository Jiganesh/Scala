object ArrayDec {

    def main (args: Array[String]) {
        var arraya = Array[Int](6) //Makes an array with six in it
        var arrayfixedsize = Array.ofDim[Int](3) // One D array Array (0,0,0)
        var arrayb = Array.fill(5){0} //Makes an array with five 0's in it
        arraya.foreach(println)
        arrayb.foreach(println)
        println(arraya);
        println(arraya.toBuffer)

        //Multidimensional arrays

        var Multidimensionalarray = Array.ofDim[Int](3,3)

    
}