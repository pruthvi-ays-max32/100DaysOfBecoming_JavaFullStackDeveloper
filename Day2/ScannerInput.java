import java.util.Scanner;

class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int maths = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();

        double avg = (maths + sci + eng)/3;
        System.out.printf("Name: %s, Age: %d, Average Marks: %.1f", name, age, avg);
    }
}