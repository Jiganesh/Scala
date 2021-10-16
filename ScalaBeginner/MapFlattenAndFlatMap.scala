object FlattenAndFlatMap{
    def main(args: Array[String]){

        var x = List("This is list of string1", "This is list of string2","This is list of string3", "This is list of string4")
        println(x)

        println(x.map(_.split(" ") flatten))
        println(x flatMap (_.split(" ")))

        //Difference between Map and FlattenMap
        val pets=Seq("cat", "dog", "parrot")
        println("map", pets.map(_.toUpperCase))
        println("flatMap", pets flatMap(_.toUpperCase))

        val strings = Seq("1", "2", "foo", "3", "bar")
        val mapRes=strings.map(toInt)   
        println("Using Map: "+strings.map(toInt)) 
        println("Using flatMap: "+strings.flatMap(toInt))
        println("Using flatmap: "+strings.flatMap(toInt).sum)
    }
    def toInt(in: String): Option[Int] = {
        try {
            Some(Integer.parseInt(in.trim))
        } catch {
            case e: Exception => None    }
    }
    

}