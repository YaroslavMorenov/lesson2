package lesson3Student;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup( String group ) {
        this.group = group;
    }

    public Student( double averageMark,String firstName,String lastName,String group ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark( double averageMark ) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 100;
        }
        return 80;
    }
}


