package main
import "fmt"
func add(a int, b int) int {
	return a + b
}
func divide(c,d int) (int, int) {
	return c / d,c % d
}
func main() {
	fmt.Println("HELLO WORLD")
	name := "Rohan"
	age := 0
	fmt.Println(name)
	fmt.Println(age)
	if age >= 18 {
		fmt.Println("Adult")
	}else {
		fmt.Println("Minor")
	}
	for i:=0;i<=10;i++ {
		fmt.Println(i)
	}
	i:=0
	for i<=5 {
		fmt.Println(i)
		i++
	}
	//infinte for loop
	//for {fmt.Println("Hello")}
	sum := add(5,3)
	fmt.Println("Addition is ",sum)
	divide,modulo := divide(10,2)
	fmt.Println("Division is ",divide)
	fmt.Println("Modulo is ",modulo) 
}
