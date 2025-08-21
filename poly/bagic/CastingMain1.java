package poly.bagic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 뱐수가 자식 인스턴스 참조
        Parent poly = new Child(); // x001
        // 자식의 기능은 호출할 수 없다. 컴파일 오류발생
        //poly.childMetohd();

        // 다운 캐스팅 ( 부모 타입 -> 자식타입)
        Child child = (Child) poly; // x001
        child.childMetohd();
    }
}
