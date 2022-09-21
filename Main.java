public class Main{
    public static void main(String[] aguyyy){

        //instantiating the Programmer class
        Programmer a = new Programmer(); 
        Programmer constructor = new Programmer("Ignacio Yurag" , 23, "Future Web Developer");


        //setting the values of the variable  through Setter methods
        a.setName("Ignacio Rosales Yurag");
        a.setAge(23);
        a.setProfile("Future Java Web Developer");

        //Displating the values of the variables through the Getter methods
        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Profile: " + a.getProfile() );

        //Calling the Constructor with parameter
        System.out.println("Constructor in java with parameter");
        System.out.println("Name: " + constructor.name);
        System.out.println("Age: " + constructor.age);
        System.out.println("Profile: " + constructor.profile);

        //instantiation of inheritance
        student s = new student();
        System.out.println("Student learned JAVA programming language from: " + s.programmerName);

        //overriding parent class
        Programmer p = new Programmer();
        p.show();
        //overriding child class
        Programmer p2 = new student();
        p2.show();

    }
}