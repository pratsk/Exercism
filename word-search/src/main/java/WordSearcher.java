import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

class WordSearcher {

    Map<String, Optional<WordLocation>> search(final Set<String> searchWords, final char[][] letters) {
        int startX;
        int startY;
        int endX;
        int endY;
        Map<String, Optional<WordLocation>> location = new HashMap<>();
        for(int i=0;i<letters.length;i++){
            if(String.valueOf(letters[i]).contains("q"))
                for(int j=0;j<letters[i].length;j++){

                }
            else{
                location.put("clojure", Optional.empty());
            }
        }
        return location;
    }

}