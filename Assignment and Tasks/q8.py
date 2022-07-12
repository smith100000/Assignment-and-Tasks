def validate_pin(pin):
    if len(pin)==4 or len(pin)==6:
        return pin.isdigit()
    else:
        return 0
pin=input()
print(validate_pin(pin))