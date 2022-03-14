package leetCodeQuestions


fun answer(nums: IntArray): MutableList<Int> {
    val array = mutableListOf<Int>()
    for (index in nums.indices) {
        array.add(nums[nums[index]])
    }
    return array
}


fun main() {
    val array = intArrayOf(0, 2, 1, 5, 3, 4)
    val result = answer(array)
    for(item in result) {
        println(item)
    }

}