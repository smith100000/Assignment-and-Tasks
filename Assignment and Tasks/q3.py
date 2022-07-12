def digital_root(n):
    return((n-1)%9+1)
n=int(input())
print(digital_root(n))