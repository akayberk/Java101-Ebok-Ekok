import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ebob=0, ekok;
        System.out.println("Please enter two number consecutively SMALL to BIG");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        //To calculate the ebob with for loop
        /*for (int i=n2; i>0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
        }*/
        //how to find ebob with while loop.
        //if n2 is bigger than n1. it is not, you can simply sort them with a temporary var.
        int i=1;
        while(i<=n2){
            if (n1%i==0&&n2%i==0){
                ebob=i;
            }
            i++;
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Sayilarin ebobu = " +ebob + "\nSayilarin ekoku = "+ ekok);
    }
}
