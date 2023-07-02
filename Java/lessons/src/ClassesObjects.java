public class ClassesObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Olha");
    person1.setAge(26);
    person1.getAge();
        System.out.println("Person name is: "+person1.getName());
        System.out.println("Person age is: "+person1.getAge());
    person1.speak();
    }
}
class Person {
    private String name;
    private int age;
    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("You entered an empty name!");
        } else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age should be more than 0!");
        } else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }

    void speak() {
            System.out.println("My name is " + name + ", " + "I'm " + age + " years old.");
        }
    }

