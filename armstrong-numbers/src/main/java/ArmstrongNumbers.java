class ArmstrongNumbers {
    boolean isArmstrongNumber(int number) {
        int noOfdigit= (int) Math.log10(number)+1;
        int sum=0;
        int temp=number;
        while (temp!=0){
            sum+=Math.pow(temp%10,noOfdigit);
            temp=temp/10;
        }
        return number==sum;
    }
}