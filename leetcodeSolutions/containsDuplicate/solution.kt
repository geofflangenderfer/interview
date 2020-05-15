class Solution(
  val cache: HashMap<Int, Int> = HashMap<Int, Int>()
) {
  fun containsDuplicate(nums: IntArray): Boolean {
    for (num in nums) {
      if (cache.containsKey(num)) return true
      cache.put(num, 1)
      println(cache)
    }
    return false
  }
}
fun main() {
  val test = Solution()
  val actual = test.containsDuplicate(intArrayOf(1,2,3,1))
  println(actual)
}

n! / (n-2)!*2
n(n-1) / 2
