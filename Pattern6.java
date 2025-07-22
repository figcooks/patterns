public class Pattern6 {
    public static void main(String[] args) {
        int n = 6;
        for(int rows = 1 ; rows <= n; rows++){
            for(int cols = 1 ; cols <= n-rows ; cols++){
                System.out.print(" ");
            }
            for(int cols2 = 1 ; cols2 <= rows ; cols2++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

