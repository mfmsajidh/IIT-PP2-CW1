class CheckDuplicates {

    static boolean checkDuplicates(String[] singleSquareNumbers) {
        int countDuplicate = 0;

        //Iterates through singleSquareNumbers[] to find any duplicate numbers
        for (int i=0; i<singleSquareNumbers.length; i++) {
            for (int j=i+1; j<singleSquareNumbers.length; j++) {
                if(singleSquareNumbers[i].equals(singleSquareNumbers[j])) {
                    countDuplicate++;
                }
            }
        }

        if(countDuplicate>0){
            return false; //Returns false if at-least a number is duplicated
        }
        else{
            return true; //Returns true if no duplicates are found
        }
    }

}
