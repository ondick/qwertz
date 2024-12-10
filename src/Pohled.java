import java.util.Scanner;
public class Pohled {
    static Scanner sc = new Scanner(System.in);
    int min;
    int max;

    public void vetsi(){
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        if (c1>c2 && c1>c3){
            if (c2>c3){
                min=c3;
            }
            else {
                min=c2;
            }
            max = c1;
        }
        if (c2>c1 && c2>c3){
            if (c1>c3){
                min=c3;
            }
            else {
                min=c1;
            }
            max = c2;
        }
        if (c3>c1 && c3>c2){
            if (c1>c2){
                min=c2;
            }
            else {
                min=c1;
            }
            max = c3;
        }
        System.out.println("nejmensí je: "+min+" a nejvetsi je: "+max);
    }
}
