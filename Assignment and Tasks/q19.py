n=int(input("enter the number:"))
temp=n
x=len(str(n))
sum=0
while(n>0):
    rem=n%10
    sum=sum+pow(rem,x)
    n=n//10
if temp==sum:
    print("is amstrong number")
else:
    print("is not amstrong number")