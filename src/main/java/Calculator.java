public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int a = 10;
        int b = 5;
        int c = 4;
        int d = 3;
        int e = 2;

        int sum = add(a, b);
        int product = times(sum, c);
        int division = div(product, d);
        return dif(division, e);
    }
}
