//Giving Parameters to methods
class Student {
    void display(String name, int age, double marks) {
        System.out.println("Name: " + name + " | Age: " + age + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display("Kharanshu", 18, 89.9);
    }
}