package algorithms


class BinarySearch {

    fun binarySearchMethod(array: Array<Int>, item: Int): Int? {
        var lowest = 0
        var highest = array.size

        while (lowest < highest) {

            val middle = (lowest + highest) / 2
            val guess = array[middle]
            if(guess == item) {
                return middle
            } else if (guess > item) {
                highest = middle
            } else {
                lowest = middle + 1
            }
        }
        return null
    }
}