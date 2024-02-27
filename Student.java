public class Student extends Person {
    private String major;
    private double gpa;

    public Student(String n, String bD, String m, double g) {
        super(n, bD);
        major = m;
        gpa = g;
    }
    
    public String getMajor() {
        return (major);
    }

    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public String getGPA() {
        return (Double.toString(gpa));
    }

    public void setGPA(double newGPA) {
        gpa = newGPA;
    }

    public String gpaToLetter() {
        if (gpa >  3.67) {
            return ("A");
        } else if ( gpa > 3.33) {
            return ("A-");
        } else if (gpa > 3.0) {
            return ("B+");
        } else if (gpa > 2.67) {
            return ("B");
        } else if (gpa > 2.33) {
            return ("B-");
        } else if (gpa > 2.0) {
            return ("C+");
        } else if (gpa > 1.67) {
            return ("C");
        } else if (gpa > 1.33) {
            return ("C-");
        } else if (gpa > 1.0) {
            return ("D+");
        } else if (gpa > 0.67) {
            return ("D");
        } else if (gpa > 0.0) {
            return ("D-");
        } else {
            return ("F");
        }
    }

    public String toString() {
        return (super.toString() + ": " + major + ", " + gpa + " (" + gpaToLetter() + ")");
    }

}
