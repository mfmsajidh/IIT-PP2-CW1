class CheckRange {

    static boolean checkRange(String[] singleSquareNumbers) {
        int countRange = 0;

        //Iterates through singleSquareNumbers[] to find any numbers out of the specified range
        for(int i=0; i<singleSquareNumbers.length; i++) {
            if(!((Integer.parseInt(singleSquareNumbers[i])>0) && (Integer.parseInt(singleSquareNumbers[i])<10))){
                countRange++; //Increases if the number is out of the specified range
            }
        }

        if(countRange>0){
            return false; //Returns false if at-least a number is out of the specified range
        }
        else{
            return true; //Returns true if all the numbers are within the specified range
        }
    }

}
