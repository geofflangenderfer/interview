class MergeSort {
  fun mergesort(array: IntArray): IntArray {
    if (array.size < 2) return array

    // integer division
    val middleIndex = array.size / 2
    // copyOfRange 2nd argument is exclusive
    val left = array.copyOfRange(0, middleIndex)
    val right = array.copyOfRange(middleIndex, array.size)

    return merge(mergesort(left), mergesort(right))
  }
  fun merge(left: IntArray, right: IntArray): IntArray {
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0
    val merged = IntArray(left.size + right.size)
    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
          merged[mergedIndex] = left[leftIndex]
          leftIndex++
        } else {
          merged[mergedIndex] = right[rightIndex]
          rightIndex++
        }
        mergedIndex++
    }
    while (leftIndex < left.size) {
      merged[mergedIndex] = left[leftIndex]
      mergedIndex++
      leftIndex++
    }
    while (rightIndex < right.size) {
      merged[mergedIndex] = right[rightIndex]
      mergedIndex++
      rightIndex++
    }

    return merged
  }
}



