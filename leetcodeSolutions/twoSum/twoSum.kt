class Solution(
  // {target - value: indexOfValue}
  val cache: HashMap<Int, Int> = HashMap<Int, Int>()
) {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    for (index: Int in 0..nums.size - 1) {
      val currentComplement: Int = target - nums[index]
      if (cache.containsKey(nums[index])) {
        return intArrayOf(
          cache.get(nums[index])!!,
          index
        )
      }
      cache.put(currentComplement, index)
    }
    return intArrayOf()
  }

}
fun isEqual(array: IntArray, other: IntArray): Boolean {
  return array.size == other.size && array.filter { it !in other}.isEmpty()
}
fun tests() {
  val test = Solution()

  val nums1 = intArrayOf(2,7,11,15)
  val target1 = 9
  val expected1 = intArrayOf(0, 1)
  val actual1 = test.twoSum(nums1, target1)
  assert(isEqual(actual1, expected1))

  val nums2 = intArrayOf(1,2,3,4)
  val target2 = 4
  val expected2 = intArrayOf(0, 2)
  val actual2 = test.twoSum(nums2, target2)
  assert(isEqual(actual2, expected2))
}
fun main() {
  tests()
}
