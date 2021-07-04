
import Foundation

var T = Int(readLine()!)!
var res:Int = 0
for _ in 0 ..< T{
    var arr = [Int]()
    var str = readLine()!.split(separator: " ").map{Int($0)!}
    for i in 0..<3{
        arr.append(str[i])
    }
    res = max(res, comp(a: arr[0], b: arr[1], c: arr[2]))
    arr.removeAll()

}
print(res)
func comp(a:Int, b:Int, c:Int) -> Int{
    if a == b && b == c{
        return 10_000 + a * 1000
    }
    else if a == b{
        return 1_000 + a * 100
    }
    else if a == c{
        return 1_000 + a * 100
    }
    else if c == b{
        return 1_000 + c * 100
    }
    else{
        return max(a,b,c) * 100
    }
}
