fun testBasic() {
  val input1 = intArrayOf(2, 3, 4, 10, 40)
  val input2 = 10
  assert(binarySearch(input1, input2) == 3)
}
fun testSmall() {
  val input1 = intArrayOf(1,2,3)
  val input2 = 2
  assert(binarySearch(input1, input2) == 1)
}
fun main() {
  testSmall()
  println("poop")
  //testBasic()

}
