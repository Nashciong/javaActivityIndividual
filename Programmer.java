public class Programmer implements interFace{
    String name, profile;
    int age;
    String programmerName = "Victor Chiong"; 

    //setter and getter in encapsulation
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getProfile() {
        return profile;
    }

    //Declaring constructors in Java by default
    public Programmer(){
        System.out.println("Hello, this is a simple example of OOP concept based on what I learned!");
    }

    //Declaring constructors in Java with parameters
    public Programmer(String name, int age, String profile){
        this.name=name;
        this.age=age;
        this.profile=profile;
    }
    
    public void show(){
        System.out.println("Inside the method of the parent class");
        System.out.println("This is the Programmer class");
    }
}
