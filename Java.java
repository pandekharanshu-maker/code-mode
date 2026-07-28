//Programs containing Java and Java only
import java.util.Scanner;

//Example of Interface
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
	System.out.println("Bird is flying");
    }
}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

//Example of Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Woof");
    }
}

//Example of Overriding
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

//Example of Encapsulation
class Private_student {
    private String name;
    private int marks;
    public void setName(String name) {
        this.name = name;
    }    
    public String getName() {
        return name;
    }   
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
                this.marks = marks;
        } else {
                System.out.println("Invalid marks");
        }
    }   
    public int getMarks() {
        return marks;
    }   
}
class Student {
    String name; 
    int marks;  
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("Name: "+this.name);  
        System.out.println("Marks: "+this.marks);
    }
}
class Rectangle {
    int area(int length, int width) {
        return length*width;
    }
}
public class Java {
    //isEven function definition
    static boolean isEven(int q) {
                if (q%2 == 0) {
                        return true;        
                }
                else {
                        return false;
                }
        }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
	System.out.println("Java is Fun");
	String Name = "Kharanshu";
	int Age = 18;
	System.out.println(Name);
	System.out.println(Age);
	System.out.println("Welcome Coding Overlord "+Name);
	System.out.println("Your age is "+Age);

	//Basic Arithmetic Program
	int a=10;
	int b=5;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);

	//Taking input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your favourite programming language:");
	String lang = sc.nextLine();
	System.out.println("Your favourite programming language is "+lang);

	//Finding out if number is positive, negative or zero
	System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 0) {
                System.out.println("Positive");
        }
        else if (n == 0) {
                System.out.println("Zero");
        } 
        else {
                System.out.println("Negative");
        }

	//For loop demonstration
	System.out.println("Enter a number to print using for loop:");
	int x = sc.nextInt();
        for (int i=1; i<=x; i++) {
                System.out.println(i);
        }

	//While loop demonstration
	System.out.println("Printing 1 to 5 using while loop");
	int i = 1;
	while (i <= 5) {
		System.out.println(i);
		i++;
	}

	//Even Odd program using function
        System.out.println("Enter to check if number is odd or even (returns true if even): ");
        int q = sc.nextInt();
        boolean result = isEven(q);
        System.out.println(result);

	//Calculation of area of rectangle using class
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter width:");
        int width = sc.nextInt();
        Rectangle r1 = new Rectangle();
	int res = r1.area(length,width);
        System.out.println(res);

	//Demonstration of this keyword inside class which lets user to use same object name as declared variable
	Student s1 = new Student("Kharanshu",95);
        s1.display();

	//Encapsulation Demonstration
	Private_student p1 = new Private_student();
        p1.setMarks(150);
        System.out.println(p1.getMarks());

	//Inheritance Demonstration
	Dog d = new Dog();
        d.sound();
        d.bark();
	Animal a1 = new Cat();
	a1.sound();

        //Interface Demonstration
	Bird birdie = new Bird();
	birdie.fly();
	sc.close();
    }
}
