
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); 
            
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wpisz polecenie\n dodac\n pomnozyc");
        String readed = reader.nextLine();
        if(readed.equals("pomnozyc")){
            return true;
        } else {
        }
        return false; 
    }

    private double getArgument() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        return reader.nextInt();
    }
    
    private static class Multiplication implements Computation {

        @Override
        public double compute(double argument1, double argument2) {
            return argument1 * argument2;
        }
    }
    
    private static class Addition implements Computation {

        @Override
        public double compute(double argument1, double argument2) {
            return argument1 + argument2;
        }
        
    }
}
