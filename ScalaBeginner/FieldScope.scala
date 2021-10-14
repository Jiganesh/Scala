object Scope {
    def main(args: Array[String]): Unit = {

        //Fields - classes can be written outside object also
        class Employee (empSal :Int, empName :String) {
            var salary = empSal
            var name = empName
            def display() = {
                println("Name : " + name)
                println("Salary : " + salary)
            }
        }


        var  emp = new Employee(12500, "John");
        emp.display();
    }
}           





// Scala has three types of scopes 
// Fields
// Method Parameters
// Local Variables