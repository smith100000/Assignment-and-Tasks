n=int(input("enter the number:"))
for i in range(2,n+1):
    if n%i==0:
        break
if n==i:
    print(n,"is prime number")
else:
    print(n,"is not prime number")