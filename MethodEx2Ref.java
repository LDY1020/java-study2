package method;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessaage("Hello , world" , 3);
        printMessaage("java" , 5);
        printMessaage("hi" , 10);


    }
        public static void printMessaage (String message , int times){
            for (int i = 0; i < times; i++) {
                System.out.println(message);
            }
        }
    }




