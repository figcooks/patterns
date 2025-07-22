public class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        for(int rows = 1 ; rows <= n ; rows++){
            for(int cols = 1 ; cols <= n-rows+1 ; cols++){
                System.out.print("*");
            }
        System.out.println();
    }
  }
}
