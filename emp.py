# Employee Management System
class Employee:
    emp_list = []   # class variable to store all employees
    def __init__(self, name, designation, gender, doj, salary):
        self.name = name
        self.designation = designation
        self.gender = gender
        self.doj = doj
        self.salary = salary
        Employee.emp_list.append(self)
    # a) Total number of employees
    @classmethod
    def total_employees(cls):
        return len(cls.emp_list)
    # b) Count male and female employees
    @classmethod
    def count_gender(cls):
        male = 0
        female = 0
        for emp in cls.emp_list:
            if emp.gender.lower() == "male":
                male += 1
            elif emp.gender.lower() == "female":
                female += 1
        return male, female
    # c) Employees with salary > 10000
    @classmethod
    def high_salary(cls):
        result = []
        for emp in cls.emp_list:
            if emp.salary > 10000:
                result.append(emp.name)
        return result
    # d) Employees with designation 'Asst Manager'
    @classmethod
    def asst_manager(cls):
        result = []
        for emp in cls.emp_list:
            if emp.designation.lower() == "asst manager":
                result.append(emp.name)
        return result
# Creating objects
e1 = Employee("Amit", "Manager", "Male", "01-01-2020", 15000)
e2 = Employee("Sneha", "Asst Manager", "Female", "05-03-2021", 12000)
e3 = Employee("Rahul", "Clerk", "Male", "10-07-2022", 8000)
e4 = Employee("Pooja", "Asst Manager", "Female", "15-08-2019", 11000)
# a) Total employees
print("Total Employees:", Employee.total_employees())
# b) Male and Female count
male, female = Employee.count_gender()
print("Male Employees:", male)
print("Female Employees:", female)
# c) Employees with salary > 10000
print("Employees with salary > 10000:", Employee.high_salary())
# d) Employees with designation 'Asst Manager'
print("Asst Managers:", Employee.asst_manager())