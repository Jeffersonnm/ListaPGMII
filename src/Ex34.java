
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;



public final class Ex34 {

    public Ex34() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        TemporalAccessor ta = formatter.parse("01/01/2000");
        LocalDate ld = LocalDate.from(ta);
        TemporalAccessor ta1 = formatter.parse("01/01/2001");
        LocalDate ld1 = LocalDate.from(ta1);
        System.out.println(ChronoUnit.DAYS.between(ld, ld1));
    }

}
