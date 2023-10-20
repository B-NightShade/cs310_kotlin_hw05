package KotlinSearch

import Search.Search

class KotlinSearch: Search() {
    init{
        searchType = "Kotlin search"
    }

    override fun find(target: Int): Int {
        setStart()
        var index = data.find { it == target }
        if(index == null){
            setEnd()
            return -1
        }
        setEnd()
        return data.indexOf(target);
    }
}
