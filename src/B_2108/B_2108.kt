package B_2108

import java.io.*
import java.lang.StringBuilder
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val num = br.readLine().toInt()
    val arr = IntArray(num)
    var sum = 0
    for (i in 0 until num) {
        arr[i] = br.readLine().toInt()
        sum += arr[i]
    }
    val countArr = IntArray(8001)
    for (n in arr) {
        countArr[n + 4000]++
    }
    val ansArr = IntArray(num)
    var tempMax = 0
    var tempNum = 0
    var index = 0
    for (i in countArr.indices) {
        tempNum = countArr[i]
        if (tempNum > 0) {
            if (tempNum > tempMax) {
                tempMax = tempNum
            }
            while (tempNum > 0) {
                ansArr[index] = i - 4000
                tempNum--
                index++
            }
        }
    }
    val list = ArrayList<Int>()
    val most: Int
    for (i in countArr.indices) {
        if (countArr[i] == tempMax) {
            list.add(i - 4000)
        }
    }
    most = if (list.size > 1) {
        list[1]
    } else {
        list[0]
    }
    sb.append((sum.toDouble() / num).roundToInt() as Int).append('\n');
    sb.append("${ansArr[ansArr.size / 2]}").append('\n');
    sb.append("$most").append('\n')
    sb.append(ansArr[ansArr.size - 1] - ansArr[0] ).append('\n');
    print(sb)
}

