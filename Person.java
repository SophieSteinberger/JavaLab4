import java.time.LocalDate;

public class Person {
        
    private String name;
    private String birthdate;

    public Person(String n, String bD) {
        name = n;
        birthdate = bD;
    }

    public String getName() {
        return (name);
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getBirthdate() {
        return (birthdate);
    }

    public void setBirthdate(String newBdate) {
        birthdate = newBdate;
    }

    public String toString() {
        return (name + " (" + birthdate + ")");
    }

    public int getAge(){
        int bYear = Integer.parseInt(birthdate.substring(0, 4));
        int bMonth = Integer.parseInt(birthdate.substring(5, 7));
        int bDay = Integer.parseInt(birthdate.substring(birthdate.length() - 2));
        LocalDate currentDate = LocalDate.now();
        //check if birthday has occured yet this year->return appropriate age
        if ((currentDate.getMonthValue() < bMonth) || ((currentDate.getMonthValue() == bMonth) && (currentDate.getDayOfMonth() < bDay))) {
            return ((currentDate.getYear() - bYear) - 1);
        } else {
            return (currentDate.getYear() - bYear);
        }
    }
}
