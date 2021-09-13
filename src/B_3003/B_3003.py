s = list(map(int, input().split()))
chess = [1,1,2,2,2,8]
for i,k in enumerate(chess):
    print(k-s[i],end=" ")