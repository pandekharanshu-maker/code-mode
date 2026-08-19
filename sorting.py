#Program to manage examination hall seat allocation
Name = []
RoomNo = []
RollNo = []
SeatNo = []
n = int(input("Enter number of students: "))
for _ in range(n):
    name = input(f"Enter {_+1} student's name: ")
    roomNo = int(input(f"Enter {_+1} student's room number: "))
    rollNo = int(input(f"Enter {_+1} student's roll number: "))
    seatNo = int(input(f"Enter {_+1} student's seat number: "))
    Name.append(name)
    RoomNo.append(roomNo)
    RollNo.append(rollNo)
    SeatNo.append(seatNo)
#Merge Sort
def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    result = []
    i = 0
    j = 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    result.extend(left[i:])
    result.extend(right[j:])
    return result
MergeSeatNo = merge_sort(SeatNo)
print("\nSeat Numbers after Merge Sort:")
print(MergeSeatNo)    
#Quick Sort
def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = []
    middle = []
    right = []
    for x in arr:
        if x < pivot:
            left.append(x)
        elif x == pivot:
            middle.append(x)
        else:
            right.append(x)
    return quick_sort(left) + middle + quick_sort(right)
QuickSeatNo = quick_sort(SeatNo)
print("\nSeat Numbers after Quick Sort:")
print(QuickSeatNo)
#Selection Sort
for i in range(n-1):
    si = i
    for j in range(i+1,n):
        if RollNo[j] < RollNo[si]:
            si = j    
    RollNo[i],RollNo[si] = RollNo[si],RollNo[i]
    Name[i],Name[si] = Name[si],Name[i]
    RoomNo[i],RoomNo[si] = RoomNo[si],RoomNo[i]
    SeatNo[i],SeatNo[si] = SeatNo[si],SeatNo[i]
print("\nSeat Numbers after Selction Sort:")
print(SeatNo)    
#Bubble Sort
flag = 0
for y in range(n-1):
    for z in range(n-y-1):
        if RollNo[z] > RollNo[z+1]:
            RollNo[z],RollNo[z+1] = RollNo[z+1],RollNo[z]
            Name[z],Name[z+1] = Name[z+1],Name[z]
            RoomNo[z],RoomNo[z+1] = RoomNo[z+1],RoomNo[z]
            SeatNo[z],SeatNo[z+1] = SeatNo[z+1],SeatNo[z]
            flag = 1
if flag == 1:
    print("Swapping Took Place")
print("\nSeat Numbers after Bubble Sort:")
print(SeatNo)                    
#Binary Search
SeatNo.sort()
locate = False
Target = int(input("Enter Your Seat Number: "))
low = 0
high = len(SeatNo) - 1
while low <= high:
    mid = (low + high) // 2 
    if SeatNo[mid] == Target:
        print("Your Seat Number is Loacted Using Binary Search")
        locate = True
        break
    elif SeatNo[mid] > Target:
        high = mid - 1
    else:
        low = mid + 1
if not locate:
    print("Invalid Seat Number")        
#Linear Search 
found = False
for x in range(n):
    if SeatNo[x] == Target:
        print("Your Seat Number is Located Using Linear Search")                 
        found = True
        break
if not found:
    print("Invalid Seat Number")    