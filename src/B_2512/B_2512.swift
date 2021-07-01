
import Foundation

var N:Int = Int(readLine()!)!
var arr = [Int](repeating: 0, count: N)

arr = readLine()!.split(separator: " ").map{Int($0)!}

var M:Int = Int(readLine()!)!
arr.sort()
var start: Int = arr[0]
var end: Int = arr[N-1]
var res: Int = 0
while start <= end{
    var sum:Int = 0
    var mid:Int = (start+end)/2
    for i in 0 ..< N{
        if arr[i] > mid{
            sum += mid
        }else{
            sum += arr[i]
        }
    }
    if sum < M{
        start = mid  + 1
        res = mid
    }else{
        end = mid - 1

    }
}
print(res)
