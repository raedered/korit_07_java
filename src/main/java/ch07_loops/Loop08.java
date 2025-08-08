package ch07_loops;
/*
         *
        **
       ***
      ****
 */
public class Loop08 {
    public static void main(String[] args) {
        // 개행을 책임지는 for문
//        for (int i = 0; i < 6 ; i++) {
//            //공백을 책임지는 for문 -> 공백은 줄어들어야 함
//            for(int j = 5; j > i; i--) {
//                System.out.print(" ");
//            }
//            // 별을 책임지는 for문
//            for(int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 6; i++) {
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
