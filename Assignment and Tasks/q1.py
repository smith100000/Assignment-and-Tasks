def get_sum(a,b):
    x=min(a,b)
    y=max(a,b)
    sum=0
    for i in range(x,y+1):
        sum=sum+i
    return sum
a=int(input())
b=int(input())
print(get_sum(a,b))