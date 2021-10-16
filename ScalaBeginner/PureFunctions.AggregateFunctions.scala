object AggreFunction {
  def main(arg:Array[String]) 
    { 
    println("1-Step: Initialize a Set of type String to represent Stationary elements")
    val item: Set[String] = Set("Pen", "Pencil", "Pen", "Rubber")
    println(s"Elements of item = $item")
    
    println("\n2-Step: Define an variable to find length of the item elements")
    val staLengthAcc: (Int, String) => Int = (acc, staName) => acc + staName.length
    
    
    println("\n3-Step: Call aggregate() with the variable used in Step 2")
    val totLength = item.aggregate(0)(staLengthAcc, _ + _)
    println(s"Length of stationary elements in item = $totLength")
    }
}