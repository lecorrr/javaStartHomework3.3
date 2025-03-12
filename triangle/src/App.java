import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers to triangle sides");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] arr = {a, b, c};

        double max = 0;
        for(double i : arr){
            if(max < i){
                max = i;
            }
        }

        double result = max - (a + b + c);
        
        if (Math.abs(result) < max){

            System.out.println("Triangle with given params can NOT exist");

        }else{

            System.out.println("Triangle with given params can exist");

        }
    }
}
