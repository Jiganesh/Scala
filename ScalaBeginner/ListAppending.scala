var a = List(1,2,3,4)
var b = List(5,6,7,8)
println(a.::(b)) // List(List(5, 6, 7, 8), 1, 2, 3, 4)
println(a::b) // List(List(1, 2, 3, 4), 5, 6, 7, 8)
println(a:::b) // List(1, 2, 3, 4, 5, 6, 7, 8)
println(a.++:(b)) //List(5, 6, 7, 8, 1, 2, 3, 4)
println(b++:a) //List(5, 6, 7, 8, 1, 2, 3, 4)


