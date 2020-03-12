import java.io.FileNotFoundException;
import java.util.List;

public interface CardDao {

    List<Card> getCardFromFile() throws FileNotFoundException;
}