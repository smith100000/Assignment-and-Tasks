def find_missing_letter(chars):
    missingchar=""
    for i in range(0,len(chars)-1):
        if(ord(chars[i+1])-ord(chars[i])>1):
            missingchar=chr(ord(chars[i])+1)
    return missingchar
