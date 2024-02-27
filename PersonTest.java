public class PersonTest {
    public static void main(String[] args){
        //create a Person object
        Person p = new Person("Jane Doe", "1990-05-30");

        //change their name
        System.out.println(p.getName());
        p.setName("Bob Smith");
        System.out.println(p.getName());

        // calculate their age
        System.out.println("\n" + p.getAge());

        //change birthdate and make sure prints correct age based on when in year birthdate is
        p.setBirthdate("1990-02-01");
        System.out.println("\n" + p.getAge());

    }
}
