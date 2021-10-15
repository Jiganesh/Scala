object ListMethods{
    def main(args: Array[String]){

        var colors = List("red","green","blue")
        println(colors)

        val OddandEvens = List(List(0,2,4),List(1,3,5))
        println(OddandEvens)

        val keyValues = List(('A', 65),('B',34),('C',56))
        println(keyValues)

        var appendedList =  List(10,20)++List(30,40)
        println("Appending List :"+ appendedList.tail)

        println(appendedList.head, appendedList.tail, appendedList.last)
        println(appendedList take 3) // Take first three
        println(appendedList drop 2) // Drop first two
        println(appendedList filter (_>=20)) // filter

        println(appendedList slice(1,2)) // inclusive, exclusive

        //Partition
        println(appendedList splitAt 2) // Gives tuple of 2 lists splits on 2
        println(appendedList partition(_<20)) // Gives two filter lists

        //Elements Tests
        println(appendedList exists (_ <=25))
        println(appendedList forall (_ <100))

        //size
        println(appendedList size)

        //isEmpty
        println(appendedList isEmpty)

        //Determine finite size
        //checks if the collection is of finite size. Usually Stream collection has infinite size
        println(appendedList hasDefiniteSize)
        println(Stream(10,20,30,40,50) hasDefiniteSize)

    }
}