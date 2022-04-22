
/**
 * This class sorts two quakes by their title. If the titles of both quakes
 * are equal, then sort the quakes by their depth.
 */
import java.util.*;
public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    @Override
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        if(q1.getInfo().compareTo(q2.getInfo()) == 0) {
            return Double.compare(q1.getDepth(), q2.getDepth());
        }
        return q1.getInfo().compareTo(q2.getInfo());
    }
}