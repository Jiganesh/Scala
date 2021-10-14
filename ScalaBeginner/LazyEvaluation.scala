object LazyEvaluation{
    def main (args: Array[String]){
        val lazyEvaluation = "Employee"
        println(lazyEvaluation)
    }
}
// Initialization of these variables that is deferred until they are first accessed.
//accessing lazy values calls which is a method that implicitly checks if the value has been already initialized

