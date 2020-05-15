class Solution {
  fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size)
    var leftProduct = IntArray(nums.size)
    var rightProduct = IntArray(nums.size)

    for (index in 0..nums.size-1) {
      if (index == 0) {
        leftProduct[0] = 1
        rightProduct[nums.size - 1] = 1
      } else {
        leftProduct[index] = leftProduct[index-1] * nums[index - 1]
        rightProduct[nums.size - 1 - index] = rightProduct[nums.size - index] *
        nums[nums.size - index]
      }
    }
    for (index in 0..nums.size - 1) {
      output[index] = leftProduct[index] * rightProduct[index]
    }
    return output

  }

}
fun tests() {

  val test = Solution()

  val input1 = intArrayOf(1,2,3,4)
  val actual1 = test.productExceptSelf(input1)
  val expected1 = intArrayOf(24,12,8,6)
  assert(isEqual(actual1, expected1))
}
fun isEqual(array: IntArray, other: IntArray): Boolean {
  return array.size == other.size && array.filter { it !in other }.isEmpty()
}
fun main() {
  tests()
}
