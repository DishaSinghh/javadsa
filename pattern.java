public class pattern {
    public static void main(String[] args) {

        // rectangle 4x5
//         for(int i=0;i<=3;i++){
//             for(int j=0;j<=4;j++){
//                 System.out.print("*");
//             }
//               System.out.println(" ");
//         }

        // hollow rectangle 4x5
        // for(int i=0;i<=3;i++){
        //     for(int j=0;j<=4;j++){
        //         if ((i==1&&j==1)||(i==1&&j==2)||(i==1&&j==3)||(i==2&&j==1)||(i==2&&j==2)||(i==2&&j==3)) {
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("a");
        //         }
        //     }
        //     System.out.println(" ");
        // }


        //half pyramid
        // for(int i=0;i<=3;i++){
        //     for(int j=0;j<=4;j++){
        //         if(i>=j){
        //             System.out.print("*");
        //         }                                           //can use i>=j or j<=i in loop
        //         else{
        //             System.out.print("");
        //         }
        //     }
        //     System.out.println("");


            //inverted half
        //     for(int i=0;i<=2;i++){
        //          for(int j=3;j>=i;j--){
        //             System.out.print("*");                     //?????????????but worked
        //     }
        //     System.out.println("");
        // }
        // System.out.print("*");


        for(int i=0;i<=3;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println(" ");  
        }

    }
}


