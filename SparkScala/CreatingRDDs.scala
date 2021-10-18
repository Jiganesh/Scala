val PCRDD = spark.sparkContext.parallelize(Array("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"),2)
// using parallelize method

val Sparkfile = spark.read.textFile("/user/spark.txt")
// using file systems

// third method is using RDD

