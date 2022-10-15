import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ded dednames = new ded("Антон", 60);
        ded sunnames = new otec("Игорь", 40);
        ded vnuknames = new sun("Алексей", 15);
        
        
        List<ded> drevo = Arrays.asList(dednames, sunnames, vnuknames);
        for (ded d : drevo) {
            d.Person();
        }
    }
}
