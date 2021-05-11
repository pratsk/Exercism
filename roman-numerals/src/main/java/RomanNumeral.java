import java.util.*;
public class RomanNumeral {
    int number;
    static Map<Integer,String> map = new LinkedHashMap<>();
    static{
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
    }
    public RomanNumeral(int number) {
        this.number=number;
    }
    public String getRomanNumeral() {
        String romanNumber="";
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            int currentKey = entry.getKey();
            if(number/currentKey != 0){
                for(int i=0; i<number/currentKey;i++){
                    romanNumber += entry.getValue();
                }
                number = number%currentKey;
            }
        }
        return romanNumber;
    }
}