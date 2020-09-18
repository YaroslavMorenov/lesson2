package lesson3;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant( double averageMark,String firstName,String lastName,String group,String scienceWork ) {
        super(averageMark,firstName,lastName,group);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        }
        return 180;
    }
}
