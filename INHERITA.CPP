#include<iostream.h>
class Animal {
	public:
	void sound() {
		cout<<"Animal make different noises...."<<endl;
	}
};
class Dog:public Animal {
	public:
	void bark() {
		cout<<"Dog Barks...."<<endl;
	}
};
class Student {
	public:
	int age;
	int rollno;
	void Display(int age,int rollno) {
		cout<<"Your age is "<<age<<endl;
		cout<<"Your roll number is "<<rollno<<endl;
		}
	};
class Study:public Student {
	public:
	void s1() {
		cout<<"Student is studying"<<endl;
	}
};
int main() {
Dog d;
d.sound();
d.bark();
Study s;
s.Display(18,2160);
s.s1();
return 0;
}