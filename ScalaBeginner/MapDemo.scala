object MapDemo{
    def main(args: Array[String]){

        var r = 1 to 10
        
        var arr = r.map( _ * _ )
        arr.foreach(println)
    }
}