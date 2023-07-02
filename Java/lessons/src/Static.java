public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Olha", 18);
        Student s2 = new Student("Tom", 16);
        s1.printNumberOfPeople();
        s2.printNumberOfPeople();
        Student s3 = new Student("Julia", 48);
        s1.printNumberOfPeople();
        s2.printNumberOfPeople();
        s3.printNumberOfPeople();
    }
}
class Student{
    private String name;
    private int age;
    private static int countPeople;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}