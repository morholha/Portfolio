public class Constructors {
    public static void main(String[] args) {
    Humans humans1 = new Humans();
    }
}
class Humans{
    private String names;
    private int ages;
    public Humans(){
        this.names = "Name by default";
        this.ages = 0;
        System.out.println("Hello from first constructor!");
    }
    public Humans(String names){
        this.names = names;
        System.out.println("Hello from second constructor!!");
    }
    public Humans(String names, int ages){
        System.out.println("Hello from third constructor!!!");
        this.names = names;
        this.ages = ages;
    }
    public void setName(String name){this.names = name;}
    public void setAge(int age){this.ages = age;}
}
