public class Pattern5 {
    public static void main(String[] args) {
        int n = 6;
        int total ;
        for(int rows = 1 ; rows <= 2*n-1 ; rows++){
            if(rows <= n){
                total = rows;
            }
            else{
                total = 2*n-rows;
            }
            for(int cols = 1; cols <= total; cols++){
                System.out.print("*");
            }
        System.out.println();
        }
  }
}

