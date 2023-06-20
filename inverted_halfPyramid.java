public class inverted_halfPyramid {
    public static void main(String[] args) {

        /*
         * //rows
         * for(int i=0;i<4;i++){
         * 
         * //colmns
         * for(int j=4;j>i;j--){
         * 
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * 
         * _,_,*
         * _,*,*
         * ,*,*
         * 
         * 
         */

        // inverted half pyramid for 180% rotate

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < (3 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
                
            System.out.println();
        }
        System.out.println();
    }
}
