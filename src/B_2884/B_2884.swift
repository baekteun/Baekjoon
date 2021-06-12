let time = readLine()!.split(separator:" ").map{ Int($0)!}
if time[0]==0 && time[1]<45{
	print("23 \(60-(45-time[1]))")
}
else if time[1]>=45{
	print("\(time[0]) \(time[1]-45)")
}
else{
	print("\(time[0]-1) \(60-(45-time[1]))")
}