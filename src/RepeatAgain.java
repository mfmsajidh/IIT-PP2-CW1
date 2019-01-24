import java.util.Scanner;

class RepeatAgain {

    static boolean repeatAgain(boolean repeat){
        Scanner scanner = new Scanner(System.in);

        //Iterates until user enter a valid input
        boolean isNotValid = true;
        while(isNotValid){
            System.out.print("\n" + "Do you wish to enter a new square? (y/n): ");
            String reply = scanner.nextLine();

            if(reply.equals("y") || reply.equals("Y")) {
                repeat = true;
                isNotValid = false;
            }
            else if (reply.equals("n") || reply.equals("N")) {
                System.out.println("Thank you for playing the game");
                System.out.println("See you again !!!");
                repeat = false;
                isNotValid = false;
            }
            else {
                System.out.println("Sorry, I can't accept that." + "\n" + "It's not a valid input!!!");
            }
        }
        return repeat; //Return the users reply
    }

}
