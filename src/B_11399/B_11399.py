n = int(input())
arr = list(map(int, input().split()))
arr.sort()
res = 0
for i in range(0, n):
    for k in range(0, i+1):
       res += arr[k]
print(res)