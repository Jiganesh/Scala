object TestRecur {
  def main(args: Array[String]): Unit = {
     println(sumAll(List.range(1, 10)))
    }
    
    def sumAll(listRec: List[Int]): Int = {
        def sumWithAcc(listRec: List[Int], curSum: Int): Int = {
            listRec match {
                case Nil => curSum
                case tot :: totVal => sumWithAcc(totVal, curSum + tot)
            }
        }
        sumWithAcc(listRec, 0)
    }
}