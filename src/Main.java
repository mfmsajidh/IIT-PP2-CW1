import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] squareNumbers = new String[9];

        for (int i=0; i<9 ; i++) {

            boolean notValid;

            do {

                System.out.print("Enter number " + (i+1) + ": ");
                String squareNumber = scanner.nextLine();

                try{
                    Integer.parseInt(squareNumber);
                    notValid = false;
                    squareNumbers[i] = squareNumber;

                }
                catch(NumberFormatException ex){
                    System.out.println("Sorry, I can't accept that. \n" + "It's not a valid number!!! \n" );
                    notValid = true;
                }
            } while (notValid);

        }

        System.out.println();

        for (int i=0; i<squareNumbers.length;) {
            for (int j=0; j<3; j++) {
                System.out.print(squareNumbers[i] + "\t");
                i++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Thank you for playing the game!");

    }
}
