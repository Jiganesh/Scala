object PHF{
    def main(args: Array[String]){

        def equation (x:Int ,y: Int , z: Int, func : (Int ,Int, Int) =>Int) = func(x,y,z)
        
        println(equation(10,20,30, _*_+_))

    }
}

