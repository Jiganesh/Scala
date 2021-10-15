object HOF{
    
    def Area (ShapeFunction: Int => Int , side : Int)={
        ShapeFunction(side)
    }

    def square (side :Int)= side*side;

    def main (args: Array [String]){
         println(Area(square , 5))
    }
}

// scalac filename
// scala objectname
// class files are created in /  directory where statement is runned from