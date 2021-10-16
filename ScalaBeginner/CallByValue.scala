object CallByValue{
    def main(args : Array[String]){

        def cbv (x: Int){
            println("Using x 1st time : "+x)
            println("Using x 2nd time : "+x)
            println("Using x 3rd time : "+x)
        }

        var number = 5
        cbv{number+=5; number}
    }
}