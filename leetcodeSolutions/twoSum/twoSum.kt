class Solution(
  // {target - value: indexOfValue}
  val cache: HashMap<Int, Int> = HashMap<Int, Int>()
) {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    for (index: Int in 0..nums.size - 1) {
      val currentComplement: Int = target - nums[index]
      if (cache.containsKey(nums[index])) {
        //println("currentComplement: $currentComplement")
        //println("cache: $cache\n")
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
fun main() {
  val test = Solution()
  val actual = test.twoSum(intArrayOf(2,7,11,15), 9)
  println(actual.contentToString())
  val expected = intArrayOf(0, 1)
  assert(actual contentEquals expected)
  assert(isEqual(actual, expected))
}
