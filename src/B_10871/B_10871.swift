var line = readLine()!.split(separator:" ").map{ Int($0)! }
let arr = readLine()!.split(separator:" ").map{Int($0)!}
for i in 0 ... line[0]-1{
	if(arr[i]<line[1]) {
		print("\(arr[i])", terminator:" ")
	}
}
