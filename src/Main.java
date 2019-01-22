import java.util.Scanner;

public class Main {

    private static boolean getMagicValue(String[] squareNumbers) {

        int magicValue;
        int[] magicValueRow = new int[3];
        boolean magicValueCheck;

        for (int i=0, row=0; i<squareNumbers.length;) {
            magicValue=0;
            for (int j=0; j<3; j++) {
                magicValue += Integer.parseInt(squareNumbers[i]);
                magicValueRow[row] = magicValue;
                i++;
            }
            row++;
        }

        if (magicValueRow[0] == magicValueRow[1]) {
            magicValue = magicValueRow[0];
            if (magicValue == magicValueRow[2]) {
                magicValueCheck = true;
            }
            else {
                magicValueCheck = false;
            }
        } else {
            magicValueCheck = false;
        }

        return magicValueCheck;

    }

    private static void checkMagicRows(int magicValue, String[] squareNumbers) {
        
    }

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
                    System.out.println("Sorry, I can't accept that. \n" + "It's not a valid number!!! \n");
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

//        int magicValue = getMagicValue(squareNumbers);
//        System.out.println(magicValue);
//        checkMagicRows(magicValue, squareNumbers);

        System.out.println("\n" + "Is Magic Square: "+ getMagicValue(squareNumbers));
        System.out.println("Is Lo Shu Square: ");

        System.out.println();
        System.out.println("Thank you for playing the game!");

    }
}
