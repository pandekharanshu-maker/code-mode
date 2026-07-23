#Program to check if a number is prime using a function
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

# Get the number from the user
num = int(input("Enter a number to check if it is prime: "))

# Call the function and display the result
if is_prime(num):
    print(f"{num} is a prime number.")
else:
    print(f"{num} is not a prime number.")