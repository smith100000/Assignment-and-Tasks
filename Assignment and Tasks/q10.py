def disemvowel(string_):
    s=""
    vowels=['a','A','e','E','i','I','o','O','u','U']
    for j in string_:
        if j in vowels:
            continue
        s=s+j

    string_=s
    return s
string_=input()
print(disemvowel(string_))
