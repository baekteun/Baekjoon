import Foundation

var N = Int(readLine()!)!
var arr = [(Int, Int)]()
for _ in 0 ..< N{
    let s = readLine()!.split(separator: " ").map{Int($0)!}
    arr.append((s[0],s[1]))
}
arr.sort(by: {$0.0 < $1.0})
arr.sort(by: {$0.1 < $1.1})

var temp = -1
var count = 0
for s in arr{
    if s.0 >= temp{
        temp = s.1
        count += 1
    }
}
print(count)