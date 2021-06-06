n = int(input())
count = 0
for _ in range(n):
    word = input()
    for i in range(0, len(word) - 1):
        if word[i] == word[i + 1]:
            pass
        elif word[i] in word[i + 1:]:
            n -= 1
            break
print(n)
