public class varargs {
    static void add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        add();
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
        add(1, 2, 3, 4, 5);
    }
}