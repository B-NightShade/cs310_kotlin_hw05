package Search

open class Search {
    var startTime: Long = 0
    var endTime: Long = 0
    var data: IntArray = IntArray(0)
    var searchType: String = ""


    open fun find(target: Int) :Int{
        return -1
    }

    fun setStart(){
        startTime = System.currentTimeMillis()
    }

    fun setEnd(){
        endTime = System.currentTimeMillis()
    }

    fun totalTime():Long{
        return endTime - startTime
    }

    fun grabArray(dataArray: IntArray){
        data = dataArray
    }

    open fun printMessage(index :Int, target: Int){
        if(index == -1){
            println("$searchType did not find target $target")
        }else{
            var searchTime = totalTime()
            println("$searchType found target $target at index $index. Search took $searchTime ms")
        }
    }
}
