package BinarySearch

import Search.Search

class BinarySearch: Search() {
    init{
        searchType = "Binary search"
    }

    var sortStart: Long = 0
    var sortEnd: Long = 0

    fun getsortTime():Long{
        return sortEnd - sortStart
    }

    override fun find(target: Int): Int {
        sortStart = System.currentTimeMillis()
        data.sort()
        sortEnd = System.currentTimeMillis()
        setStart()
        var low = 0
        var high = data.size -1
        var mid: Int
        while(low <= high) {
            mid = (low + high)/2
            if (data[mid] == target){
                setEnd()
                return mid
            }else if(data[mid]< target){
                low = mid + 1
            }else{
                high = mid -1
            }
        }
        setEnd()
        return -1
    }

    override fun printMessage(index: Int, target: Int) {
        if(index == -1){
            println("$searchType did not find target $target")
        }else{
            var searchTime = totalTime()
            var sortTime = getsortTime()
            println("$searchType found target $target at index $index. Search took $searchTime ms (sort took $sortTime ms)")
        }
    }
}
