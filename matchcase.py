#Program to perform operations using match case
a = float(input("Enter value of a:"))
b = float(input("Enter value of b:"))
op = input("Enter the operator (+, -, *, /,%): ")
match op:
    case "+":
        print("a+b=",a+b)
    case "-":
        print("a-b=",a-b)
    case "*":
        print("a*b=",a*b)
    case "/":
        if (b!=0):
            print("a/b=",a/b)
        else:
            print("Division by zero is not allowed.")
    case "%":
        if (b!=0):
            print("a%b=",a%b)
        else:
            print("Division by zero is not allowed.")
    case _:
        print("Invalid operator")