import java.util.*


    fun main(arg: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val m = sc.nextInt()
        val v = sc.nextInt()
        val visited = BooleanArray(n + 1)
        val visited1 = BooleanArray(n + 1)
        val adjList: Array<LinkedList<Int>?> = arrayOfNulls<LinkedList<Int>>(n + 1)
        for (i in 0..n) {
            adjList[i] = LinkedList()
        }
        for (i in 0 until m) {
            val v1 = sc.nextInt()
            val v2 = sc.nextInt()
            adjList[v1]!!.add(v2)
            adjList[v2]!!.add(v1)
        }
        for (i in 0..n) {
            Collections.sort(adjList[i])
        }
        dfs_list(v, adjList, visited)
        println("")
        bfs_list(v, adjList, visited1)
    }

    fun bfs_list(v: Int, adjList: Array<LinkedList<Int>?>, visited: BooleanArray) {
        var v = v
        val q: Queue<Int> = LinkedList()
        visited[v] = true
        q.add(v)
        while (q.size != 0) {
            v = q.poll()
            print("$v ")
            val iter: Iterator<Int> = adjList[v]!!.listIterator()
            while (iter.hasNext()) {
                val w = iter.next()
                if (!visited[w]) {
                    visited[w] = true
                    q.add(w)
                }
            }
        }
    }

    fun dfs_list(v: Int, adjList: Array<LinkedList<Int>?>, visited: BooleanArray) {
        visited[v] = true
        print("$v ")
        val iter: Iterator<Int> = adjList[v]!!.listIterator()
        while (iter.hasNext()) {
            val w = iter.next()
            if (!visited[w]) dfs_list(w, adjList, visited)
        }
    }

