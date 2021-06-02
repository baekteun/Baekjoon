x = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
n = input()
for i in x:
    n = n.replace(i, "*")

print(len(n))
