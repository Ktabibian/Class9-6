public class Student {
    public static void main(String[] args) {
        int min = 40;
        int max = 100;
        int grade = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(grade);
        if (grade > 90){
            System.out.println("A");
        }else if(grade > 80){
            System.out.println("B");
        }else if(grade > 70){
            System.out.println("C");
        }else if(grade > 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
