n1=int(input("enter the first number:"))
n2=int(input("enter the second number:"))
n3=int(input("enter the thrid number:"))
n4=int(input("enter the fourth number:"))
x=(n1,n2)[n1<n2]
y=(n3,n4)[n3<n4]
print((x,y)[x<y])
