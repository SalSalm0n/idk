import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        int num1 = getInt();
        System.out.println("Enter second number: ");
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result: " + result);

    }

    public static int getInt(){
        Scanner scan = new Scanner(System.in);

        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Error!");
            scan.next();
            num = getInt();
        }
        return num;

    }
    public static char getOperation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter operation: ");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Error!");
            scan.next();
            operation = getOperation();
        }
        return operation;


    }

    public static int calc(int num1,int num2,char operation){
        int result;
        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error. Try again: ");
                result = calc(num1,num2,getOperation());
        }
        return result;
    }

}