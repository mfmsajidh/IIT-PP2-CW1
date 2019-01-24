class LoShuSquare {

    static void loShuSquare(boolean isValid, boolean inRange, boolean noDuplicates){
        //Checks if magicSquare is valid with no duplicates and all the numbers are within the specified range
        if(isValid && inRange && noDuplicates){
            System.out.println("YEAH!!!! It is a Lo Shu Square also");
        }
        else {
            System.out.println("Oops!!!! Not a Lo Shu Square");
        }
    }

}
