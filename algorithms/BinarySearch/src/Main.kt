fun binarySearch(arr: IntArray, value: Int): Int {
  // O(n) to look through all elements
  // O(log n) to cut search space in half each iteration
  val midIndex = arr.size / 2
  if (arr[midIndex] == value) return midIndex
  else if (arr[midIndex] > value) {
    binarySearch(arr.sliceArray(midIndex+1 until arr.size), value)
  } else {
    binarySearch(arr.sliceArray(0 until midIndex), value)
  }
  return -1

}
