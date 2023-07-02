public class If {
    public static void main(String[] args) {
        int myInt = 5;
        if(myInt < 10){
            System.out.println("Yes, the number is < 10: "+ myInt);
        } else if(myInt < 20){
            System.out.println("Yes, the number is < 20: "+ myInt);
        } else{
            System.out.println("None of the previous cases");
        }
    }
}
