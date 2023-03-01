public class pattern {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4-i; j++) {

                System.out.print("  ");
                
            }
            int p =0;
            for (int k = 1; k <=(2*i)-1; k++) {
                p++;
                System.out.print(p+" ");
                
            }
            System.out.println();
            
        }


    }
    
}
