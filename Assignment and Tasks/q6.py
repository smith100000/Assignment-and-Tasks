string=input()
l1=list(map(int,string))
for i in l1:
    if i>5:
        l1.replace(i,0)
    elif i<=9:
        l1.replace(i,1)
l1-list(map(str,l1))
print("".join(l1))