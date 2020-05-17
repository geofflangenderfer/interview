fun fullTests() {
  val test = MergeSort()

  val input1 = intArrayOf(12,11,13,5,6,7)
  val actual1 = test.mergesort(input1)
  println("input1 is ${input1.contentToString()}")
  println("actual1 is ${actual1.contentToString()}")
  val expected1 = intArrayOf(5,6,7,11,12,13)
  assert(isEqual(actual1, expected1))

  val input2 = intArrayOf(3,2,1)
  val actual2 = test.mergesort(input2)
  println("input2 is ${input2.contentToString()}")
  println("actual2 is ${actual2.contentToString()}")
  val expected2 = intArrayOf(1,2,3)
  assert(isEqual(actual2, expected2))
}
fun isEqual(array: IntArray, other: IntArray): Boolean {
  return array.size == other.size
         && array.zip(other).filter { it.first != it.second }.isEmpty()
}
fun testIsEqual() {

  val input1 = intArrayOf(2,1)
  val input2 = intArrayOf(2,1)
  assert(isEqual(input1, input2))


  val inpu3 = intArrayOf(2,1)
  val inpu4 = intArrayOf(1,2)
  assert(!isEqual(inpu3, inpu4))

}
fun testLeftRight() {
  val test = MergeSort()


}
fun testBaseCase() {
  val test = MergeSort()

  val input1 = intArrayOf()
  val actual1 = test.mergesort(input1)
  val expected1 = intArrayOf()
  assert(isEqual(actual1, expected1))

  val input2 = intArrayOf(1)
  val actual2 = test.mergesort(input2)
  val expected2 = intArrayOf(1)
  assert(isEqual(actual2, expected2))
}
fun testMiddleIndex() {
  val input1 = intArrayOf(2,1)
  // integer division
  val middleIndex = input1.size / 2
  val left = input1.copyOfRange(0, middleIndex)
  val right = input1.copyOfRange(middleIndex, input1.size)
  assert(isEqual(left, intArrayOf(2)))
  assert(isEqual(right, intArrayOf(1)))
}
fun testMerge() {
  val test = MergeSort()

  val length1 = test.merge(intArrayOf(1), intArrayOf(2))
  assert(isEqual(length1, intArrayOf(1, 2)))

  val length2 = test.merge(intArrayOf(1,2), intArrayOf(3,4))
  assert(isEqual(length2, intArrayOf(1, 2, 3, 4)))

  val length4 = test.merge(intArrayOf(5,6, 7, 8), intArrayOf(5,6,10,11))
  assert(isEqual(length4, intArrayOf(5,5,6,6,7,8,10,11)))

}

fun testMergesort() {
  val test = MergeSort()

  val input1 = intArrayOf(10,2,1,20,4)
  val actual1 = test.mergesort(input1)
  assert(isEqual(actual1, intArrayOf(1,2,4,10,20)))

}

fun main() {
  testMergesort()
  //testMerge()
  //testMiddleIndex()
  //testIsEqual()
  //testBaseCase()
  //testIsEqual()
  //testBaseCase()
  //tests()
  //val test = MergeSort()
  //test.mergesort(intArrayOf(5,4,3,2,1))
  //val test = intArrayOf(1)
  //val midIndex = test.size / 2
  //println(midIndex)

}
