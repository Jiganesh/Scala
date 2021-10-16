object PureFunctionsReduceZip{
    def main(args: Array[String]){

        // reduce
        var x = List(100,200,300,400,500)
        println(x.reduce((z,i)=> z+i))
        println(x.reduce(_ * _))


        //zip
        val empGrade = List("a", "b", "c")
        val empId = List(101, 201, 301)
        println("Zipped Vaues: "+empGrade.zip(empId))
        
        var empScore = List(40, 50, 60, 70)
        println("Zipped Vaues arr1 and arr3: "+empGrade.zip(empScore))
        
        val products = Array("breadsticks", "pizza", "soft drink")
        val prices = Array(4,8)
        val productsWithPrice = products.zip(prices)
        //Unizip
        val (a,b) = productsWithPrice.unzip
        a.toBuffer.foreach(println)
        b.toBuffer.foreach(println)

        //partition
        val empList = List(15, 10, 5, 8, 20, 12)
        println("Partition: "+empList.partition(_ > 10))
    }
}