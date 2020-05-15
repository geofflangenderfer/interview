import java.lang.Integer

class Solution {
  fun maxProfit(prices: IntArray): Int {
    var minPrice = Integer.MAX_VALUE
    var maxProfit = 0
    var loops = 0
    for (price in prices) {
      loops++
      if (price < minPrice) {
        minPrice = price
      } else if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice
      }

    }
    println("$loops loops for n of ${prices.size}")
    return maxProfit
  }
  fun tests() {
    val test = Solution()

    val input1 = intArrayOf(7,1,5,3,6,4)
    val actual1 = test.maxProfit(input1)
    val expected1 = 5
    assert(actual1 == expected1)

    val input2 = intArrayOf(7,6,4,3,1)
    val actual2 = test.maxProfit(input2)
    println("actual2 $actual2")
    val expected2 = 0
    assert(actual2 == expected2)

  }
}
fun main() {
  Solution().tests()
}
