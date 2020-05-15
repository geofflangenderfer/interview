class MergeSort {
  fun sort(array: IntArray): IntArray {
  }
}
fun tests() {
  val test = MergeSort()

  val input1 = intArrayOf(12,11,13,5,6,7)
  val actual1 = test.sort(input1)
  val expected1 = intArrayOf(5,6,7,11,12,13)
  assert(isEqual(actual1, expected1))
}
fun isEqual(array: IntArray, other: IntArray): Boolean {
  return array.size == other.size && array.filter { it !in other }.isEmpty()
}
fun main() {
  tests()
}
