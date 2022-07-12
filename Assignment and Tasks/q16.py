n=int(input("enter the number:"))
c=2
while(n>0):
    if n%c==0:
        print(c,end=" ")
        n=n/c
    else:
        c=c+1
