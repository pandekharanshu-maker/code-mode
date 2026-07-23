#Program to calculate the salary of an employee
basicpay = float(input("Enter the basic pay of the employee: "))
float;ta = 0.4*basicpay
float;da = 0.2*basicpay
float;hra = 0.1*basicpay
grosspay = basicpay + ta + da + hra
print("The gross pay of the employee is: ",grosspay)