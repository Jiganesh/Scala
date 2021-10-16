import scala.collections.mutable.List
object List{
    def main (args: Array[String]){

        var week : List [String] = List("Sunday", "Monday",
        "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        
        println(week)
        println("head :"+  week.head)
        println("tail :"+ week.tail)
        println("isEmpty :"+ week.isEmpty)
        println("reverse :"+ week.reverse)

        // List is the immutable version of List
        val iList1: List[Int] = List(1, 2, 3)
        val iList2: List[Int] = List(4, 5, 6)
        val iListNew = iList1 ++ iList2     // ++ creates a new list
        println(iList1)
        println(iList2)
        println(iListNew)
        // ListBuffer is the mutable version of List
        val mList1: ListBuffer[Int] = ListBuffer(1, 2, 3)
        val mList2: ListBuffer[Int] = ListBuffer(4, 5, 6)
        mList1 ++= mList2           // ++= appends to a mutable list
        println(mList1)
        println(mList2)

    }
}

// scala.collections.mutable.ListBuffer

// list1 ++= List2