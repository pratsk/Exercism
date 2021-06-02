import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram{
    private String word;

    Anagram(String word){
        this.word = word;
    }

    public List<String> match(List<String> anagramList){
        List<String> foundAnagrams = new ArrayList<>();
        String sortWord = sortWordAlhabetically(word);

        for(String str : anagramList){
            if(!str.toLowerCase().equals(this.word.toLowerCase()) && sortWordAlhabetically(str).equalsIgnoreCase(sortWord)){
                foundAnagrams.add(str);
            }
        }
        return foundAnagrams;
    }

    public String sortWordAlhabetically(String stringToSort){
        char charArray[] = stringToSort.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}