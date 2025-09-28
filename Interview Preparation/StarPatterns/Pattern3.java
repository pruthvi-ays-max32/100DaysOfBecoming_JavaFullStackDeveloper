
/*
Pattern 3 : 
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
*/

class Pattern3 {
    public static void main(String[] args) {
            int x = 5;
            
            // first half
            for(int i=1; i<=x; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            // second half
            for(int i=5; i<=x; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}