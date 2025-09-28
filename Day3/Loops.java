
/* Takes marks of 5 subjects as input.
Calculates average.
Uses if-else to print Grade:
90+ → A
75–89 → B
50–74 → C
below 50 → Fail
Use a for loop to read the 5 marks
*/

import java.util.Scanner;
class Loops {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int subjects = 5;
            for (int i = 0; i < subjects; i++) {
                int marks = sc.nextInt();
                sum += marks;
            }
            double avg = sum / (double) subjects;
    
            if (avg >= 90) {
                System.out.println('A');
            } else if (avg >= 75 && avg < 90) {
                System.out.println('B');
            } else if (avg >= 50 && avg < 75) {
                System.out.println('C');
            } else {
                System.out.println("Fail");
            }
        }
}