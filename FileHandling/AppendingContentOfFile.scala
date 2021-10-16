import java.io._
val fw = new FileWriter("D:/GITHUB/Scala/FileHandling/test.txt", true)
fw.write("\nThis line appended to file!")  
fw.close()