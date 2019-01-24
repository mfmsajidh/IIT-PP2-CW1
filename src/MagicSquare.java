class MagicSquare {

    static boolean magicSquare(Integer valueRow, Integer valueColumn, Integer valueDiagonal) {
        boolean isValid; //Sends the message to Lo Shu Square

        //Checks if the values of the rows, columns and diagonals are equal and not null
        if(valueRow!=null && valueColumn!=null & valueDiagonal!=null){
            if((valueRow.equals(valueColumn)) && (valueColumn.equals(valueDiagonal))){
                System.out.println("YEAH!!!! It is a Magic Square");
                isValid = true;
            }
            else {
                System.out.println("Oops!!!! Not a Magic Square");
                isValid = false;
            }
        }
        else {
            System.out.println("Oops!!!! Not a Magic Square");
            isValid = false;
        }
        return isValid;
    }

}
