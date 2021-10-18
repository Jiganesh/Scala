val emp = sc.textFile("Input File Path")
val emp1 = emp.map(_.split(","))

case class empClass(empId: int , ename:String, eCity:String, eOrg:String, job:String, contact: Long, experience: Int)
val emp2 = emp1.map(r => (r(4),  empClass(r(0).toInt, r(1), r(2), r(3), r(4),r(5).toLong, r(6).toInt)))
//                       (<Key>, <value (class)>)

val pay = sc.textFile("Input File Path")
val pay1 = pay.map(_.split(","))

case class payClass(job : String, jobLevel: Int, Salary : Long)
val pay2 = pay1.map(r => (r(0), payClass(r(0), r(1).Int, r(2).toLong)))
//                       (<Key>, <value (class)>)

val result = emp2.join(pay2)
