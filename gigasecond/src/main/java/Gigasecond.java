import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime localDateTime;
    private static final Long gigaSeconds = 1_000_000_000L;
    public Gigasecond(LocalDate moment) {
        this(moment.atTime(0,0,0));
    }

    public Gigasecond(LocalDateTime moment) {
        localDateTime = moment.plusSeconds(gigaSeconds);
    }

    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}
