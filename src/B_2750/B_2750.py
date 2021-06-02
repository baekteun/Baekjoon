n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
list = sorted(a)
for i in range(0, len(a)):
    print(list[i])