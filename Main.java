import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner listener  = new Scanner(System.in);
        
        System.out.println("What operator will you use\nYou can choose between +, -, x and :");
        String opr = listener.nextLine();
        
        switch (opr) {
            case "+":
                System.out.println("Insert a number.\n<...> + ...");
                int num1plus = listener.nextInt();
                System.out.println("Insert another number.\n" + num1plus + " + <...>");
                int num2plus = listener.nextInt();
                
                int answerAddplus = num1plus + num2plus;
                
                System.out.println("Here's your answer.\n" + num1plus + " + " + num2plus + " = " + answerAddplus);
                break;
                    
            case "-":
                System.out.println("Insert a number.\n<...> - ...");
                int num1min = listener.nextInt();
                System.out.println("Insert another number.\n" + num1min + " - <...>");
                int num2min = listener.nextInt();

                int answerMin = num1min - num2min;

                System.out.println("Here's your answer.\n" + num1min + " - " + num2min + " = " + answerMin);
                break;

            case "x":
                System.out.println("Insert a number.\n<...> x ...");
                int num1mul = listener.nextInt();
                System.out.println("Insert another number.\n" + num1mul + " x <...>");
                int num2mul = listener.nextInt();
                
                int answerMul = num1mul * num2mul;

                System.out.println("Here's your answer.\n" + num1mul + " x " + num2mul + " = " + answerMul);
                break;


            case ":":
                System.out.println("Insert a number.\n<...> : ...");
                int num1def = listener.nextInt();
                System.out.println("Insert another number.\n" + num1def + " : <...>");
                int num2def = listener.nextInt();
                
                long answerDef = num1def / num2def;

                System.out.println("Here's your answer.\n" + num1def + " : " + num2def + " = " + answerDef);
                break;

            default:
                System.out.println("That is not an supported operator");
                break;

        }
    }
}