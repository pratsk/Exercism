class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ","");
        if(candidate.length()<=1){
            return false;
        }
        int sum = 0;
        int secondDigitCounter = 1;
        for (int i = candidate.length()-1; i >= 0; i--){
            char digit = candidate.charAt(i);
            if (!Character.isDigit(digit)){
                return false;
            }
            if (secondDigitCounter % 2 == 0) {
                int digitDoubled = Character.getNumericValue(digit) * 2;
                sum += (digitDoubled > 9) ? digitDoubled - 9 : digitDoubled;
            } else {
                sum += Character.getNumericValue(digit);
            }
            secondDigitCounter ++;
        }
        return sum % 10 == 0;
    }

}
