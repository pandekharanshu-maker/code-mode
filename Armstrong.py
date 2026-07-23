#Program to check if a number is an Armstrong number
num = int(input("Enter a number: "))
sum = 0
n = num
while n > 0:
    digit = n % 10
    sum += digit ** 3
    n //= 10
if num == sum:
    print(num, "is an Armstrong number")
else:
    print(num, "is not an Armstrong number")