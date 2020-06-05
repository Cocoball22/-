import java.util.InputMismatchException;
import java.util.Scanner;

public class chap3_e_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k =0;
        String Array[] = {"일","월","화","수","목","금","토"};
        int f;
        System.out.print("정수를 입력하세요>>");
        while( (f = sc.nextInt()) != -1) {

            try {

                k = f % 7;

                System.out.print(Array[k] + "요일" + "\n");


            } catch (InputMismatchException e) {
                System.out.print("경고! 수를 입력하지 않았습니다." + "\n");

            }
        }
        System.out.print("프로그램 종료합니다." +"\n");

    }
}
