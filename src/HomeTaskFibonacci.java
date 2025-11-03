public class HomeTaskFibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        int a = 0;
        int b = 1;
        for (int i = 0; i <11; i++){
            System.out.println(a);
            int c = a + b;
//            System.out.println("Iteration: " + c);
            a = b;
            b = c;
        }
    }
}
