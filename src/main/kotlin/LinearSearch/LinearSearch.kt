package LinearSearch

import Search.Search

class LinearSearch: Search() {
    init{
        searchType = "Linear search"
    }

    override fun find(target: Int): Int {
        setStart()
        for(i in 0 until data.size){
            if(data[i] == target){
                setEnd()
                return i
            }
        }
        setEnd()
        return -1
    }

}
