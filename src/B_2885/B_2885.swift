let line = readLine()!
var k = Int(line)!
var count = 0
var size = 1
var size1 = 0
while size < k{
	size *= 2
	size1 = size
}
while k>0{
	if k>=size{
		k-=size
	}
	else{
		size/=2
		count+=1
	}
}
print("\(size1) \(count)")