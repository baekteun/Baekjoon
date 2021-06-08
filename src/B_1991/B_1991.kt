package B_1991

import java.io.*


internal class Edge(data: Char) {
    var data: Int
    var left: Edge? = null
    var right: Edge? = null

    init {
        this.data = data.toInt()
    }
}

internal class Tree1 {
    var root: Edge? = null
    fun create(data: Char, left: Char, right: Char) {
        if (root == null) {
            root = Edge(data)
            if (left != '.') {
                root!!.left = Edge(left)
            }
            if (right != '.') {
                root!!.right = Edge(right)
            }
        } else {
            search(root, data, left, right)
        }
    }

    fun search(root: Edge?, data: Char, left: Char, right: Char) {
        if (root == null) {
            return
        } else if (root.data == data.toInt()) {
            if (left != '.') {
                root.left = Edge(left)
            }
            if (right != '.') {
                root.right = Edge(right)
            }
        } else {
            search(root.left, data, left, right)
            search(root.right, data, left, right)
        }
    }

    fun preOrder(root: Edge?) {
        print(root!!.data.toChar())
        if (root.left != null) preOrder(root.left)
        if (root.right != null) preOrder(root.right)
    }

    fun inOrder(root: Edge?) {
        if (root!!.left != null) inOrder(root.left)
        print(root.data.toChar())
        if (root.right != null) inOrder(root.right)
    }

    fun postOrder(root: Edge?) {
        if (root!!.left != null) postOrder(root.left)
        if (root.right != null) postOrder(root.right)
        print(root.data.toChar())
    }
}

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tree = Tree1()
    val N = br.readLine().toInt()
    for (i in 0 until N) {
        var data: CharArray = br.readLine().replace(" ".toRegex(), "").toCharArray()
        tree.create(data[0], data[1], data[2])
    }
    tree.preOrder(tree.root)
    println()
    tree.inOrder(tree.root)
    println()
    tree.postOrder(tree.root)
}

