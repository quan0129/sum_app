object Sum {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      System.err.println("Usage: java -jar sum-app-assembly-0.1.0.jar <a> <b>")
      sys.exit(1)
    }
    val a = args(0).toDouble
    val b = args(1).toDouble
    println(s"Result = ${a + b}")
  }
}
