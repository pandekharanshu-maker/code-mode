#Program to print even and odd numbers in a list
mylist = []
evenlist = []
oddlist = []
n = int(input("Enter the number of elements in the list: "))
for i in range(n):
    num = int(input("Enter a number: "))
    mylist.append(num)
for num in mylist:
    if num % 2 == 0:
        evenlist.append(num)
    else:
        oddlist.append(num)
print("Even numbers in the list: ", evenlist)
print("Odd numbers in the list: ", oddlist)