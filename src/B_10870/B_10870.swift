import Foundation
var fibo = [Int](repeating:0, count:21)
fibo[0]=0
fibo[1]=1
print(fib(x: Int(readLine()!)!))
func fib(x: Int) -> Int{
    if x==0 {
        return 0
    }
    if fibo[x] != 0 {
        return fibo[x]
    }
    fibo[x] = fib(x: x-1)+fib(x: x-2)
    return fibo[x]
}