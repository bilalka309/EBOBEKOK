import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("N1 sayısını giriniz: ");
        int x= in.nextInt();
        System.out.println("N2 sayısını giriniz: ");
        int ebob=1,i=1,y= in.nextInt();
        while(i<=x){
            if(x%i==0 && y%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("EBOB: "+ebob);
        int z=x*y;
        while(i<=z){
            if(i%x==0 && i%y==0){
                System.out.println("EKOK: "+i);
                        break;
            }
            i++;
        }
    }
}