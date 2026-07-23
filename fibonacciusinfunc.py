# Fibonacci sequence using a function
def fibonacci(n):
    a = 0 
    b = 1
    count = 0
    while count < n:
        print(a, end=' ')
        a, b = b, a + b
        count += 1
# Get the number of terms from the user
num_terms = int(input("Enter the number of terms in the Fibonacci sequence: "))
# Call the function to display the Fibonacci sequence
fibonacci(num_terms)     