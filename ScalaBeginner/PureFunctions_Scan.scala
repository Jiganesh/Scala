object PureFunctionScan{
    def main(args: Array[String]){
        val marks: Seq[Int] = Seq(40, 20, 10, 60, 90) 
        println(s"Values = $marks") 
  
        //Sum using scan function 
        val iterMarks: Seq[Int] = marks.scan(0)(_ + _) 
        println(iterMarks)
        
    }
}