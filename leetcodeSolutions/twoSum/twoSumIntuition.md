val nums1 = intArrayOf(2,7,11,15)
val target1 = 9


currentValue = 2
currentIndex = 0
cache = {
  7: 0
}

currentValue = 7
currentIndex = 1
cache = {
  7: 0
}

-> return [0, 1]


val nums1 = intArrayOf(1,2,3,4)
val target1 = 4

cache = {}

currentValue = 1
currentIndex = 0
cache = {
  3: 0
}
currentValue = 2
currentIndex = 1
cache = {
  3: 0,
  2: 1
}
currentValue = 3
currentIndex = 2
cache = {
  3: 0,
  2: 1
}

-> return [0, 2]
