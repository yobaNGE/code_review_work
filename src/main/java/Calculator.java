public class Calculator {

    // Сложение
    public int add(int a, int b) {
        return a + b;
    }

    // Вычитание
    public int dif(int a, int b) {
        return a - b;
    }

    // Деление
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Умножение
    public int times(int a, int b) {
        return a * b;
    }

    // Решатель уравнения
    public int solver() {
        // Пример уравнения: (5 + 3) * (10 - 4) / 2
        int step1 = add(5, 3); // 5 + 3 = 8
        int step2 = dif(10, 4); // 10 - 4 = 6
        int step3 = times(step1, step2); // 8 * 6 = 48
        return div(step3, 2); // 48 / 2 = 24
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Демонстрация работы solver
        int result = calculator.solver();
        System.out.println("Результат решения уравнения: " + result);
    }
}
