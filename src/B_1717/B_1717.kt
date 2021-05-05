package B_1717

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val dt = IntArray(n + 1) { it }

    fun find(x: Int): Int {
        if (dt[x] == x) return x
        dt[x] = find(dt[x])
        return dt[x]
    }

    fun union(x: Int, y: Int) {
        dt[find(y)] = find(x)
    }

    repeat(m) {
        val (cmd, a, b) = readLine()!!.split(" ").map { it.toInt() }
        when(cmd) {
            0 -> union(a, b)
            1 -> println(if (find(a) == find(b)) "YES" else "NO")
        }
    }
}