package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); double을 int에 대입하므로 컴파일 오류
        printNumber((int)number); // int형으로 바꿨으므로 실행됨

    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }

}
