
/**
 *This class sorts two quakes depeding on the 
 *alphabetical order of their last word. If
 *both words are the same, then sort the quakes
 *by their magnitude.
 */
import java.util.*;
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    @Override
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String title1 = q1.getInfo();
        String title2 = q2.getInfo();
        String title1LastWord = title1.substring(title1.lastIndexOf(" ") + 1);
        String title2LastWord = title2.substring(title2.lastIndexOf(" ") + 1);
        
        if (title1LastWord.compareTo(title2LastWord) == 0) {
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        
        return title1LastWord.compareTo(title2LastWord);
    }
}