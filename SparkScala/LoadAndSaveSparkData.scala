val filedatardd = sc.textFile("Input File Path")

filedatardd.saveAsTextFile("Target File Path")

// Again to see data of that file 
sc.textFile("Input File Path").foreach(println)