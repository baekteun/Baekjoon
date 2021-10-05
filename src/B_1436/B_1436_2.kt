package B_1436

import java.io.BufferedReader
import java.io.InputStreamReader

//fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
//    val n = readLine().toInt()
//    when(n){
//        1 -> print("666")
//        else -> func(n)
//    }
//}
//fun func(n: Int): Int {
//    var count = 1
//    var prev_digit = 0 // 선수 자릿수
//    var num = 0 // 선수 자릿수를 제외한 나머지 뒷 자릿수
//
//   while (true) {
//
//        if (prev_digit % 10000 / 10 == 666 && prev_digit % 10 != 6) {
//            for (i in 0..999) {
//                if (count == n) {
//                    return prev_digit * 1000 + num
//
//                }
//                num++
//                count++
//            }
//            prev_digit++
//        } else if (prev_digit % 1000 == 666) {
//            num = 0
//            for (i in 0..999) {
//                if (count == n) {
//                    return prev_digit * 1000 + num
//
//                }
//                count++
//                num++
//            }
//            prev_digit++
//        } else if (prev_digit % 100 == 66) {
//            num = 600
//            for (i in 0..99) {
//                if (count == n) {
//                    return prev_digit * 1000 + num
//
//                }
//                count++
//                num++
//            }
//            prev_digit++
//        } else if (prev_digit % 10 == 6) {
//            num = 660
//            for (i in 0..9) {
//                if (count == n) {
//                    return prev_digit * 1000 + num
//
//                }
//                num++
//                count++
//            }
//            prev_digit++
//        } else {
//            num = 666
//            if (count == n) {
//                return prev_digit * 1000 + num
//            }
//            count++
//            prev_digit++
//        }
//    }
//}