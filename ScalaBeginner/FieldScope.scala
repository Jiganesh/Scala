object Scope {
    def main(args: Array[String]): Unit = {


        var  emp = new Employee(12500, "John");
        emp.display();
        

    }
}           

        class Employee (empSal :Int, empName :String) {
            var salary = empSal
            var name = empName
            def display() = {
                println("Name : " + name)
                println("Salary : " + salary)
            }
        }



// Scala has three types of scopes 
// Fields
// Method Parameters
// Local Variables