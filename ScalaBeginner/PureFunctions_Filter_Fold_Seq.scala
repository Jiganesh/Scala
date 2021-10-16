// Pure Functions are like pipe with Inputs flowing in and coming out with no leaks

object PureFunctions{
    def main(args: Array[String]){


        val collection  = List(2,6,3,6,9,7,1,8,10,1,34,31,23,67)

        //filter
        println(collection.filter( _<=10))

        //fold
        println(collection.foldRight(209) ((z,i) => i-z)) 
        println(collection.foldLeft(List[Int]()) ((z,i)=> i :: z)) 
        
        //seq

        var seqcollection: Seq[Int] = Seq(2,6,3,6,9,7,1,8,10,1,34,31,23,67)
        println("contains",seqcollection.contains(3))

        var xs:Array[Int]= Array.ofDim(10)
        xs =  Array(100,200,300) ++ xs
        xs.foreach(println)

        println("---------------------------")

        seqcollection.copyToArray(xs,1,10)
        var xsbuffer = xs.toBuffer
        xsbuffer.foreach(println)

        println("head",seqcollection.head)
        println("tail",seqcollection.tail)
        println("last",seqcollection.last)

        println("indexOf",seqcollection.indexOf(2))
        println("lastIndexOf", seqcollection.lastIndexOf(6))

        println("isEmpty",seqcollection.isEmpty)
        println("endsWith", seqcollection.endsWith(Seq(23,67)))

        println("reverse",seqcollection.reverse)
        println(seqcollection)

        
    }
}
