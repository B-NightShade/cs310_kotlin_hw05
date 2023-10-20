import BinarySearch.BinarySearch
import KotlinSearch.KotlinSearch
import LinearSearch.LinearSearch

fun main(args: Array<String>) {
    print("Enter size of array: ")
    var size = readLine()!!.toInt()
    print("Enter target value: ")
    var target = readLine()!!.toInt()

    var integerArray = IntArray(size)
    for(i in 0 until size){
        integerArray[i] = i
    }

    integerArray.shuffle()

    var Lsearch = LinearSearch()
    var Ksearch = KotlinSearch()
    var Bsearch = BinarySearch()

    var searches = arrayOf(Lsearch, Bsearch, Ksearch)
    for(s in searches){
        s.grabArray(integerArray.copyOf())
        var index = s.find(target)
        s.printMessage(index, target)
    }
}