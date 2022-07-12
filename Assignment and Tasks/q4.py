def sum_cubes(n):
    sum=0
    for i in range(1,n+1):
        sum=sum+pow(i,3)
    return sum
n=int(input())
print(sum_cubes(n))