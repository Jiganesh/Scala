object VariableArguments{
    def main (args: Array[String]){

        def multipleParam(args: Any*){
            args.foreach(println)
        }

        multipleParam("Jiganesh","Ramesh","Patil","Pyyhacker")
    }
}