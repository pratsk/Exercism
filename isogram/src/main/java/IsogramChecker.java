import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase  = phrase.replaceAll("[\\s\\-]","").toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<phrase.length();i++){
            if(set.contains(phrase.charAt(i)))
                return false;
            set.add(phrase.charAt(i));
        }
        return true;
    }

}
