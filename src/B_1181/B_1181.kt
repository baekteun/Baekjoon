fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val list = mutableListOf<String>()
    for (i in 0 until N) {
        list.add(readLine()!!)
    }
    val set = list.toSortedSet()
    val sortedSet = set.sortedWith(compareBy { it.length })
    for (element in sortedSet) {
        println(element)
    }
}