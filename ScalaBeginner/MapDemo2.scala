object MapDemo2 {
    def main(args : Array[String ]){

        def r (x : Int):Int={
            return x * x
        }

        var c : List [Int] =  List(1,2,3,4,5)

        println(c)
        var squares = c.map(r(_))
        squares.foreach(println)        
    }
}