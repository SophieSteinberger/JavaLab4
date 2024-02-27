public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Jane Doe", "1990-06-01", "Math", 3.88);
        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getBirthdate());
        System.out.println(s.getMajor());
        System.out.println(s.getGPA());
        System.out.println(s.getName() + "'s age is: " + s.getAge() + "\n");

        s.setName("Bob Smith");
        s.setBirthdate("1990-02-01");
        s.setGPA(2.22);
        s.setMajor("Computer Science");
        

        System.out.println(s);
        System.out.println(s.getName() + "'s age is: " + s.getAge() + "\n");

    }

}
