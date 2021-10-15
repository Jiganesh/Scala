import scala.collection.mutable.ArrayBuffer

object ArrayBufferDec{
    def main(args: Array[String]): Unit{

        var arraya = ArrayBuffer[Int]()
        var arrayb = ArrayBuffer[Char]('a','b','c','d','e','f','g','h','i')

        //Things that will work
        arrayb-('b')
        arrayb--Array('b')
        arrayb++Array('z')
        arrayb + "a" // unexpected result you cannot use it concatenates like string ArrayBuffer(4,3,2)a
        
        arrayc:+ "a" //  ArrayBuffer(3, 2, 5, 3, 6, 2, 1, 5, 7, a)
        "A" +:arrayc //   ArrayBuffer(A, 3, 2, 5, 3, 6, 2, 1, 5, 7)
        



    }
}