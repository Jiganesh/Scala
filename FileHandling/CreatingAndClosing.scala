import java.io._

object CreatingAndClosing{
    def main(args: Array[String]){
        val writer = new PrintWriter(new File("D:/GITHUB/Scala/FileHandling/test.txt"))
        writer.write("Scala is a scalable language and I love scala")
        writer.close()

    }
}
