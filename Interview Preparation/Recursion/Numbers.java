
// print 1 to 100 numbers without using any loops.

class Numbers {
    public static void main(String args []){
        int i=1;
        number(i);
    }
    
    public static void number(int i){
        System.out.println(i);
        i++;
        if(i<=100){
            number(i);
        }
    }
}