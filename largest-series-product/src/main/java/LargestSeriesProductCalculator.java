class LargestSeriesProductCalculator {
    private String number;

    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber.matches("^[0-9]*$")) {
            this.number = inputNumber;
        } else {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        validateInput(numberOfDigits);
        return getProduct(numberOfDigits);
    }

    private Long getProduct(int numberOfDigits) {
        Long product = 0L;
        for (int i=0;i<number.length()-numberOfDigits+1;i++){
            String subString = number.substring(i,i+numberOfDigits);
            long tempProduct = 1L;
            for (int j=0;j<subString.length();j++){
                tempProduct = tempProduct * (Character.getNumericValue(subString.charAt(j)));
            }
            if(tempProduct > product)
                product = tempProduct;
        }
        return product;
    }

    private void validateInput(int numberOfDigits) {
        if(number.length() < numberOfDigits){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        else if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
    }
}
