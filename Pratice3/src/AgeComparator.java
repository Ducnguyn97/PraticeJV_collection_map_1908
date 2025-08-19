import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2){
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
