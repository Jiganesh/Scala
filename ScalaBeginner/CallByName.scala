object CallByName {
    def main (args : Array[String]){

        def cbn( x : => Int)={
            println("Using x 1st time : "+x)
            println("Using x 2nd time : "+x)
            println("Using x 3rd time : "+x)
        }
         
        var number = 10
        cbn{number= number-1; number}
    }
}