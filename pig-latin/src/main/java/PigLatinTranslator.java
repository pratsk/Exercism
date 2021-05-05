import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PigLatinTranslator{
    private static HashSet<Character> vowels = new HashSet(Arrays.asList('a','e','i','o','u'));

    public String translate(String phraseToTranslate){
        String[] words = phraseToTranslate.split(" ");
        List<String> translatedWords = new ArrayList<>();
        for(String word: words){
            String translatedWord = translateWord(word);
            translatedWords.add(translatedWord);
        }
        String translatedSentence = String.join(" ",translatedWords);
        return translatedSentence;
    }

    public String translateWord(String stringToTranslate){
        if(vowels.contains(stringToTranslate.charAt(0)) ||
                stringToTranslate.startsWith("xr") ||
                stringToTranslate.startsWith("yt"))
            return stringToTranslate + "ay";

        return consonantTranslate(stringToTranslate);
    }

    public String consonantTranslate(String stringToTranslate){
        int pos = 1;
        while(!vowels.contains(stringToTranslate.charAt(pos)) && stringToTranslate.charAt(pos) != 'y')
            pos++;
        if (stringToTranslate.charAt(pos) == 'u' && stringToTranslate.charAt(pos-1) == 'q')
            pos++;
        return stringToTranslate.substring(pos) + stringToTranslate.substring(0,pos) + "ay";
    }
}