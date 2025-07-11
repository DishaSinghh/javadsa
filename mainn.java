import java.util.Scanner;
public class mainn {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num");
        i=sc.nextInt();
        while (i<5){
            
            System.out.println(i);
            i++;
            if (i==3) {
                i++;
                continue;
            }
            
        }
        sc.close();
    //     Scanner sc= new Scanner(System.in);
    //     int num=0;
    //     do{
    //         num= sc.nextInt();
    //         System.out.print("num");
    //         System.out.println(num);
    //     }while(num>=0);
    // }
}
}