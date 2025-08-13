package ss5_static_ac;

import java.util.Comparator;

public class ScoreCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore()>o2.getScore()){
            return 1;
        }else if (o1.getScore()<o2.getScore()){
            return -1;
        }else {
            return 0;
        }
    }
}
