a,b=map(int, input().split())
x = list(map(int, input().split()))
for i in range(0,a):
    if x[i] < b:
        print(x[i],end = " ")