object MapCollection{
    def main(args: Array[String]){

        var MappedkeyAndValue : Map[Char, Int] = Map()

        var EmployeeMap : Map[String, String] = Map("EmpId"->"DummyId","EmpName"-> "DummyName","EmpLocation"-> "DummyLocation")

        
        println(EmployeeMap.isEmpty)

        //Appending into Map

        EmployeeMap+= ("EmployeeRole"->"DSE")

        for (i <- EmployeeMap.keys){
            print(i + " : ")
            println (EmployeeMap (i))
        }
        // .keys, .values

        var ExtendedEmployeeMap = EmployeeMap ++ Map("EmployeeDomain"->4)
        println(ExtendedEmployeeMap.getClass)




    }
}