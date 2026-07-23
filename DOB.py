#Program to subtract date of birth from current date to find out whether the person is eligible to vote or not
from datetime import datetime

def is_eligible_to_vote(dob):
    current_date = datetime.now()
    age = current_date.year - dob.year - ((current_date.month, current_date.day) < (dob.month, dob.day))
    return age >= 18

# Example usage
dob = input("Enter your date of birth (YYYY-MM-DD): ")
dob = datetime.strptime(dob, "%Y-%m-%d")
if is_eligible_to_vote(dob):
    print("The person is eligible to vote.")
else:
    print("The person is not eligible to vote.")