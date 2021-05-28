package subtask2

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        return when((bill.sum() - bill[k])/2) {
            b -> "Bon Appetit"
            else -> ((b - (bill.sum() - bill[k])/2)).toString()
        }
    }
}
