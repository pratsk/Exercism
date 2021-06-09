class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        validateInputs(leftStrand, rightStrand);
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    private void validateInputs(String leftStrand, String rightStrand) {
        if(leftStrand.isEmpty() && !rightStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
        if(rightStrand.isEmpty() && !leftStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
        if(rightStrand.length() != leftStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance() {
        int hammingDistance = 0;
        for(int i = 0; i < leftStrand.length() ; i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
        }
        return hammingDistance;
    }

}
