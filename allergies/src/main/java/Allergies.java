import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Allergies {
    private final int allergiesValue;
    public Allergies(int allergiesValue) {
        this.allergiesValue = allergiesValue;
    }
    public boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & allergiesValue) != 0;
    }
    public Collection<Allergen> getList() {
        return Stream.of(Allergen.values())
                .filter(this::isAllergicTo)
                .collect(Collectors.toList());
    }
}