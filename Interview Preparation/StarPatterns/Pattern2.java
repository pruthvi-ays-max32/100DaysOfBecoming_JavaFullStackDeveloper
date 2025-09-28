
/*
Pattern 2 : 
    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
*/

class Pattern2 {
    public static void main(String[] args) {
            int x = 5;

            for(int i=5; i<=x; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}