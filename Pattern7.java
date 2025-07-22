public class Pattern7 {
    public static void main(String[] args) {
        int n = 6;
        int total;
        for(int rows = 1 ; rows <= n; rows++){
            for(int cols = 1; cols <= rows-1 ; cols++){
                System.out.print(" ");
            }
            for(int cols2 = 1; cols2 < n-rows+2 ; cols2++){
                System.out.print("*");
            }
            
        System.out.println();
        }
    }
}

