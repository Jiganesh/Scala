object MapMethods{
    def main (args: Array[String]){


        val mutableAlphaNum :Map[Char, Int]=Map('a'->1, 'b'->2,'c'->3)

        val immutableAlphaNum =  scala.collection.mutable.Map('d'-> 4,'e'-> 5,'f'->6)
        val immutableAlternative = scala.collection.mutable.Map(("A","Apple"),("B","Ball"),("C","Cat"))

        for (i <- immutableAlternative.keys){
            println(i, immutableAlternative(i))
        }

        println(immutableAlphaNum.keys)
        println(immutableAlphaNum.values)

        println(mutableAlphaNum.getClass, immutableAlphaNum.getClass)

        println(immutableAlphaNum.get('e'))// always store if you use get else it will give none

        println(immutableAlphaNum.contains('d'))  
    }
}