val guestLists = List(

    List("Mr. Sharma","Mrs. Sharma"),
    List("Mr. Roshan","Mrs. Roshan"),
    List("Mr. Kumar","Mrs. Kumar")
)

println(guestLists.flatten)
println(guestLists.flatten.partition(x => x.contains("Mr.")))