import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().split(" ").map { it.toInt() }.sorted().forEach { print("${it} ") }
}