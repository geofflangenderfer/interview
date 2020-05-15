class Solution {
  fun maxSubarray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    for (index in 0..nums.size-1) {
      if (nums[index] > 0) max = max + nums[index]
      //else if ()
    }
    return max
  }
  fun tests() {
    val test = Solution()

    val input1 = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    val actual1 = test.maxSubarray(input1)
    val expected1 = 6
    //assert(actual1 == expected1)

    val input2 = intArrayOf(7,6,4,3,1)
    val actual2 = test.maxSubarray(input2)
    val expected2 = 21
    //assert(actual2 == expected2)

    val input3 = intArrayOf(-1,1,2,-1)
    val actual3 = test.maxSubarray(input3)
    val expected3 = 3
    assert(actual3 == expected3)

    val input4 = intArrayOf(-1,1,2,-1, 1, 1)
    val actual4 = test.maxSubarray(input4)
    val expected4 = 5
    assert(actual4 == expected4)

  }
}
fun main() {
  Solution().tests()
}
