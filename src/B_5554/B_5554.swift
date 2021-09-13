import Foundation

var s = 0
for _ in 0..<4{
    s += Int(readLine()!)!
}
print(s/60)
print(s%60)
