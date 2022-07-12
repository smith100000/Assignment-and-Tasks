n1=int(input("enter the lower number:"))
n2=int(input("enter the higher number:"))
for i in range(n1,n2+1):
    temp=i
    x=len(str(i))
    sum=0
    while(temp>0):
        rem=temp%10
        sum=sum+pow(rem,x)
        temp=temp//10
    if sum==i:
        print(i, end=" ")
    