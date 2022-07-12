n=int(input("enter the number:"))
count=0
for i in range(n+1):
    for j in range(2,i):
        if (i%j)!=0:
            count=count+1
            break
        else:
            break
print(count)