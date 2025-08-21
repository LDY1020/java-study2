package poly.bagic;



public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent --> Parent");
        Parent parent = new Parent();
        parent.parentMeothd();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child --> Child");
        Child child = new Child();
        child.parentMeothd();
        child.childMetohd();

        // 부모 변수가 자식 인스턴스를 참조
        System.out.println("Parent --> Child");
        Parent poly = new Child(); // 부모 타입은 자식 타입을 참조가능
        poly.parentMeothd();

        //Child child1 = new Parent(); // 자식은 부모를 담을 수 없다

        // poly.childMethod(); // 자식의 기능을 담을 수 없다 -> 컴파일 오류

    }
}
