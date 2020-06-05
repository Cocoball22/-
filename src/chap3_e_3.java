import java.util.InputMismatchException;
import java.util.Scanner;

public class chap3_e_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");
        int num;
        try{
            num = sc.nextInt();
            if(num % 2 == 0){
                System.out.print("짝수");
            }
            if(num % 2 == 1){
                System.out.print("홀수");
            }

        }
        catch(InputMismatchException e){
            System.out.print("수를 입력하지 않아 프로그램 종료합니다.");
        }
        finally{
            sc.close();
        }


    }
}
