package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray = sadArray
        var happyArray = arrayListOf<Int>()
        var makingArrayHappy = true
        while (makingArrayHappy){
            for (i in sadArray.indices) {
                if (i == 0 || i == sadArray.lastIndex) {
                    happyArray.add(sadArray[i])
                } else if (sadArray[i] <= (sadArray[i - 1] + sadArray[i + 1])) {
                    happyArray.add(sadArray[i])
                }
            }
                if (happyArray.size == sadArray.size) {
                    makingArrayHappy = false
                    return happyArray.toIntArray()
                }
                sadArray = happyArray.toIntArray()
                happyArray = arrayListOf()

        }
        return sadArray
    }
}


