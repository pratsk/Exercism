import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    private static final char START_CHAR = 'A';
    List<String> printToList(char a) {
        List<String> result = new ArrayList<>();
        for(char c = START_CHAR; c< a; c++){
            result.add(getLine(c,a));
        }
        for(char c = a; c>= START_CHAR; c--){
            result.add(getLine(c,a));
        }
        return result;
    }

    private String getLine(char c,char endChar){
        int lineLength = (endChar - START_CHAR) * 2 + 1;
        char[] line = new char[lineLength];
        for (int i = 0; i < lineLength; i++) {
            line[i] = ' ';
        }
        line[endChar - c] = c;
        line[endChar + c - 2 * START_CHAR] = c;
        return String.valueOf(line);
    }

}
