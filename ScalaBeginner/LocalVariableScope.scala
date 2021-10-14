object LocalVariableScope {
    def main(args: Array[String]): Unit = {
        
        def add (x: Int , y: Int) = x + y

        println(add(3,4))
    }
}
// Local variables are not visible outside the function and defined only inside the function
