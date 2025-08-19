import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TessClass {
    public static void main(String[] args) {
        Students students = new Students("kien",30,"HT" );
        Students students1 = new Students("Nam",26,"HN" );
        Students students2 = new Students("Anh",38,"HT" );
        Students students3 = new Students("Tung",27,"HT" );

        List<Students> Lists = new ArrayList<Students>();
        Lists.add(students);
        Lists.add(students1);
        Lists.add(students2);
        Lists.add(students3);
        Collections.sort(Lists);

        for(Students st :  Lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(Lists,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Students student :  Lists){
            System.out.println(student.toString());
        }
    }
}
