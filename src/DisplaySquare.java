class DisplaySquare {

    static void displaySquare(String[][] squareNumbers) {
        System.out.println();

        //Displays the user input by looping through the multidimensional array
        for (int i=0; i<squareNumbers.length;i++) {
            for (int j=0; j<3; j++) {
                System.out.print(squareNumbers[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }

}
