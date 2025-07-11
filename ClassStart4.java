package Class;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //학생을 실제 메모리에 만든다
        student1.name = "학생1";
        student1.age = 15;
        student1.Grade = 90;

        Student student2 = new Student(); //객체 또는 인스턴스라한다 , x002
        student2.name = "학생2";
        student2.age = 18;
        student2.Grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].Grade);
        System.out.println("이름: " + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].Grade);
    }
}
