object FlattenAndFlatMap{
    def main(args: Array[String]){

        var x = List("This is list of string1", "This is list of string2","This is list of string3", "This is list of string4")
        println(x)

        println(x.map(_.split(" ") flatten))
        println(x flatMap (_.split(" ")))


    }
}