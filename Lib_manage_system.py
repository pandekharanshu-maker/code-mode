#Program to make library system manager which helps librarian
n = int(input("Enter number of books: "))
books = []
IDs = []
Title = []
Author = []
Category = []
Publication_Year = []
found = False
for _ in range (n):
    name = input(f"Enter name of {_} book: ")
    num = int(input(f"Enter how many books of {name}: "))
    id = int(input(f"Enter ID of {name} book: "))
    writer = input(f"Enter writer of {name} book: ")
    cat = input(f"Enter the category of {name} book: ")
    year = int(input(f"Enter year of publication of {name} book: "))
    Title.append(name)
    books.append(num)
    IDs.append(id)
    Author.append(writer)
    Category.append(cat)
    Publication_Year.append(year)
for i in range (n-1):
    flag = 0
    for j in range (n-i-1):
        if IDs[j] > IDs[j+1]:
            IDs[j],IDs[j+1] = IDs[j+1],IDs[j]
            books[j],books[j+1] = books[j+1],books[j]
            Title[j],Title[j+1] = Title[j+1],Title[j]
            Author[j],Author[j+1] = Author[j+1],Author[j]
            Category[j],Category[j+1] = Category[j+1],Category[j]
            Publication_Year[j],Publication_Year[j+1] = Publication_Year[j+1],Publication_Year[j]
            flag = 1
    if flag == 0:
        break        
Targeted_ID = int(input("Enter Book ID: "))
for _ in range (n):
    if Targeted_ID == IDs[_]:
        print(f"Book {books[_]} has been located")
        print(f"Your book is {Title[_]}")
        found = True
        break
if not found:
    print("Invalid book ID")     